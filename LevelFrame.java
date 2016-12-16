/**
 * LevelFrame.java
 * Authors: Lucas Chavarria, Cole Vikupitz, Ron Guo, James Xu
 * -----------------------------------------------------------------------------
 * Class that contains a GUI for the difficulty selection screen. Appears when
 * the user clicks the new game option from the home menu. Contains five buttons
 * that the user can click for the corresponding difficulty, and also a back
 * button that brings the user back to the home menu.
 */
package sudoku;


/* Imports */
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;

public class LevelFrame extends JFrame {

    /* Default constructor */
    public LevelFrame(int x, int y) {

        /* Initialize components */
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
                "icons/sudoku_icon.png")));
        this.setTitle("Sudoku");
        this.setLocation(x, y);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        /* Asks user if they're sure when closing the window */
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent we) {
                if (WindowUtility.askYesNo("Are you sure you want to quit?",
                        "Quitting")) {
                    FileUtility.saveBestTimes();
                    System.exit(0);
                }
            }
        });

        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hardButton = new javax.swing.JButton();
        expertButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        noviceButton = new javax.swing.JButton();
        easyButton = new javax.swing.JButton();
        mediumButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Choose a Difficulty");

        hardButton.setBackground(new java.awt.Color(255, 153, 51));
        hardButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hardButton.setText("Hard");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });

        expertButton.setBackground(new java.awt.Color(255, 51, 51));
        expertButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expertButton.setText("Expert");
        expertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(153, 153, 153));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        noviceButton.setBackground(new java.awt.Color(51, 204, 255));
        noviceButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noviceButton.setText("Novice");
        noviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noviceButtonActionPerformed(evt);
            }
        });

        easyButton.setBackground(new java.awt.Color(51, 255, 51));
        easyButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        easyButton.setText("Easy");
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });

        mediumButton.setBackground(new java.awt.Color(204, 255, 0));
        mediumButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mediumButton.setText("Medium");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mediumButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(easyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noviceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(expertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(noviceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(easyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Button Action Event Handling">
    /* Invoked when the user clicks 'Novice'; starts a novice puzzle */
    private void noviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noviceButtonActionPerformed
        try {
            SudokuGenerator gen = new SudokuGenerator(1);
            SudokuPuzzle p = gen.getPuzzle();
            SudokuFrame f = new SudokuFrame(p, true, FileUtility.PATH + "saved.dat",
                    this.getX(), this.getY());
            this.dispose();
        } catch(Exception e) {/* Ignore exceptions */}
    }//GEN-LAST:event_noviceButtonActionPerformed
    /* Invoked when the user clicks 'Easy'; starts an easy puzzle */
    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyButtonActionPerformed
        try {
            SudokuGenerator gen = new SudokuGenerator(2);
            SudokuPuzzle p = gen.getPuzzle();
            SudokuFrame f = new SudokuFrame(p, true, FileUtility.PATH + "saved.dat",
                    this.getX(), this.getY());
            this.dispose();
        } catch(Exception e) {/* Ignore exceptions */}
    }//GEN-LAST:event_easyButtonActionPerformed
    /* Invoked when the user clicks 'Medium'; starts a medium puzzle */
    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumButtonActionPerformed
        try {
            SudokuGenerator gen = new SudokuGenerator(3);
            SudokuPuzzle p = gen.getPuzzle();
            SudokuFrame f = new SudokuFrame(p, true, FileUtility.PATH + "saved.dat",
                    this.getX(), this.getY());
            this.dispose();
        } catch(Exception e) {/* Ignore exceptions */}
    }//GEN-LAST:event_mediumButtonActionPerformed
    /* Invoked when the user clicks 'Hard'; starts a hard puzzle */
    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardButtonActionPerformed
        try {
            SudokuGenerator gen = new SudokuGenerator(4);
            SudokuPuzzle p = gen.getPuzzle();
            SudokuFrame f = new SudokuFrame(p, true, FileUtility.PATH + "saved.dat",
                    this.getX(), this.getY());
            this.dispose();
        } catch(Exception e) {/* Ignore exceptions */}
    }//GEN-LAST:event_hardButtonActionPerformed
    /* Invoked when the user clicks 'Expert'; starts an expert puzzle */
    private void expertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertButtonActionPerformed
        try {
            SudokuGenerator gen = new SudokuGenerator(5);
            SudokuPuzzle p = gen.getPuzzle();
            SudokuFrame f = new SudokuFrame(p, true, FileUtility.PATH + "saved.dat",
                    this.getX(), this.getY());
            this.dispose();
        } catch(Exception e) {/* Ignore exceptions */}
    }//GEN-LAST:event_expertButtonActionPerformed
    /* Invoked when the user clicks the back button, returns to the home menu */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame f = new MainFrame(this.getX(), this.getY());
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Component Declarations">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton easyButton;
    private javax.swing.JButton expertButton;
    private javax.swing.JButton hardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mediumButton;
    private javax.swing.JButton noviceButton;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

} // End LevelFrame class