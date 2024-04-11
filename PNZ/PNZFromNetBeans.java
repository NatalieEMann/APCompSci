package PNZ;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author mysti
 */
public class PNZFromNetBeans extends javax.swing.JFrame {

    String guess = "";
    String actual = randomString();

    /**
     * Creates new form PNZGame
     */
    public PNZFromNetBeans() {
        initComponents();
        startNewGame();
    }

    public static char randomDigit() {
        return (char) ('0' + Math.random() * 10);
    }

    static String randomString() {
        String finalNumber = "\0\0\0";
        char num;
        for (int i = 0; i < 3; i++) {
            do {
                num = randomDigit();
                if ((finalNumber.charAt(0) != num) && (finalNumber.charAt(1) != num)
                        && (finalNumber.charAt(2) != num)) {
                } else {
                    num = '-';
                }
                finalNumber = num + finalNumber;
            } while (num == '-');
        }
        return finalNumber.substring(0, 3);
    }

    static String evaluateGuess(String target, String result) {
        int pNum = 0;
        int nNum = 0;
        String feedback = "";
        for (int i = 0; i < 3; i++) {
            if (target.charAt(i) == result.charAt(i)) {
                pNum++;
            }
            if ((target.charAt(0) == result.charAt(i))
                    || (target.charAt(1) == result.charAt(i))
                    || (target.charAt(2) == result.charAt(i))) {
                nNum++;
            }
        }
        for (int i = 0; i < pNum; i++) {
            feedback += 'P';
        }
        for (int i = pNum; i < nNum; i++) {
            feedback += 'N';
        }
        if (nNum == 0) {
            feedback = "Z";
        }
        return feedback;
    }

    public static void displayResults(String guess, String result) {
        // GUI stuff
        System.out.println("Guess:" + guess + " | Actual:" + result);
    }

    public void startNewGame() {
        // GUI stuff
//        do {
//            if (evaluateButton.isEnabled()) {
//                guess = jGuessText.getText();
//                String feedback = evaluateGuess(guess, actual);
//                putInTable(guess, feedback);
//            }
//        } while (!actual.equals(guess));
//        displayResults(guess, actual);
    }

    public void putInTable(String guess, String feedback) {
        String[][] toPutIn = {{guess, feedback}};
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

//            for (int i = 0; i < toPutIn.length; i++) {
//                String[] row = new String[toPutIn[i].length];
//                for (int j = 0; j < toPutIn[i].length; j++) {
//                    row[j] = toPutIn[i][j];
//                }
//                model.addRow(row);
//            }
        for (String[] row : toPutIn) {
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGuessText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        evaluateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guess", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        evaluateButton.setText("Evaluate");
        evaluateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jGuessText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(evaluateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(evaluateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jGuessText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evaluateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluateButtonActionPerformed
        if (evaluateButton.isEnabled()) {
            if ((jGuessText.getText()).length() == 3) {
                guess = jGuessText.getText();
                String feedback = evaluateGuess(guess, actual);
                putInTable(guess, feedback);
            } else {
                jGuessText.setText("ERROR");
            }
        }
    }//GEN-LAST:event_evaluateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PNZFromNetBeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PNZFromNetBeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PNZFromNetBeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PNZFromNetBeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PNZFromNetBeans().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton evaluateButton;
    private javax.swing.JTextField jGuessText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
