/**
 * SudokuSolver.java
 * Authors: Lucas Chavarria, Cole Vikupitz, Ron Guo, James Xu
 * -----------------------------------------------------------------------------
 * Class that takes a Sudoku puzzle, copies and solves it. Contains a method for
 * getting the solution and another for checking its solvavility.
 *
 * Resources that helped:
 * http://www.programcreek.com/2014/05/leetcode-sudoku-solver-java/
 * http://www.heimetli.ch/ffh/simplifiedsudoku.html
 */


public class SudokuSolver {

    /* Declare private members */
    private final SudokuPuzzle puzzle;
    private final int[][] board;
    private boolean solvable;


    /* Default constructor */
    public SudokuSolver(SudokuPuzzle p) {
        this.puzzle = new SudokuPuzzle(p.initialPuzzleState());
        this.board = this.puzzle.toArray();
        this.solvable = this.puzzle.isPossible();
        if (this.solvable)
            this.solvable = this.solve();
    }


    /**
     * Returns true if the Sudoku puzzle was able to be solved, or false if not.
     *
     * @return True if the puzzle can be solved, false if not.
     */
    public boolean isSolvable() {
        return this.solvable;
    }


    /**
     * Returns the solved Sudoku puzzle, or null if th puzzle couldn't be solved.
     * The puzzle returned is a copy of the Sudoku puzzle passed into the constructor,
     * but in a solved state.
     *
     * @return A copy of the Sudoku puzzle in a solved state, or null if not solvable.
     */
    public SudokuPuzzle getSolution() {
        if (!this.solvable)
            return null;
        this.puzzle.setArray(this.board);
        return this.puzzle;
    }


    /**
     * Method that solves the puzzle, using the 2-d integer array representing the
     * board.
     */
    private boolean solve() {

        /* Loops through the board, skipping non-empty tiles */
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (this.board[i][j] != 0)
                    continue;

                /* Try each number in the tile; if illegal, backtrack for correction(s) */
                for (int k = 1; k <= 9; k++) {
                    this.board[i][j] = k;
                    if (this.puzzle.insert(k, i, j) && solve())
                        return true;
                    this.board[i][j] = 0;
                }
                return false;
            }
        }

        return this.puzzle.isComplete();
    }

} // End SudokuSolver class