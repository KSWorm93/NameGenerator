/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namegenerator.Boundary;

import namegenerator.Controller.Controller;

/**
 *
 * @author kasper
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private Controller control;

    public MainFrame() {
        initComponents();

        control = new Controller();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getNewFirstName = new javax.swing.JButton();
        showName = new javax.swing.JTextField();
        getNewLastName = new javax.swing.JButton();
        getNewFullName = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getNewFirstName.setText("First Name");
        getNewFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNewFirstNameActionPerformed(evt);
            }
        });

        showName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNameActionPerformed(evt);
            }
        });

        getNewLastName.setText("Last Name");
        getNewLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNewLastNameActionPerformed(evt);
            }
        });

        getNewFullName.setText("Full Name");
        getNewFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNewFullNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jLabel1.setText("Worms Random Name Generator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getNewFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(getNewLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(getNewFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showName)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(showName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getNewFirstName)
                    .addComponent(getNewLastName))
                .addGap(18, 18, 18)
                .addComponent(getNewFullName)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showNameActionPerformed

    private void getNewFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNewFirstNameActionPerformed
        
        //Changes the textfield to what the getFirstName method returns
        showName.setText(control.getFirstName(""));
    }//GEN-LAST:event_getNewFirstNameActionPerformed

    private void getNewFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNewFullNameActionPerformed
        
        //Changes the textfield to what the getLastName method returns
        showName.setText(control.getFullName(""));
    }//GEN-LAST:event_getNewFullNameActionPerformed

    private void getNewLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNewLastNameActionPerformed
        
        //Changes the textfield to what the getFullName method returns
        showName.setText(control.getLastName(""));
    }//GEN-LAST:event_getNewLastNameActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getNewFirstName;
    private javax.swing.JButton getNewFullName;
    private javax.swing.JButton getNewLastName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField showName;
    // End of variables declaration//GEN-END:variables
}
