/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin <your.name at your.org>
 */
public class workerDetails extends javax.swing.JFrame {

    /**
     * Creates new form workerDetails
     */
    public workerDetails() {
        initComponents();
        this.setLocationRelativeTo(null);       //center form in the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        electricianComboBox = new javax.swing.JComboBox<>();
        selectButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        plumberComboBox = new javax.swing.JComboBox<>();
        carpenterComboBox = new javax.swing.JComboBox<>();
        selectButton2 = new javax.swing.JButton();
        selectButton3 = new javax.swing.JButton();
        maidComboBox = new javax.swing.JComboBox<>();
        selectButton4 = new javax.swing.JButton();
        watchmanComboBox = new javax.swing.JComboBox<>();
        selectButton5 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("ELECTRICIAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        electricianComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        electricianComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrician 1", "Electrician 2", "Electrician 3" }));
        electricianComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electricianComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electricianComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(electricianComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 230, -1));

        selectButton1.setBackground(new java.awt.Color(255, 204, 255));
        selectButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectButton1.setText("Select");
        selectButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(selectButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("PLUMBER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("CARPENTER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("MAID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("WATCHMAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, -1, -1));

        plumberComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plumberComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plumber 1", "Plumber 2", "Plumber 3" }));
        plumberComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(plumberComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 230, -1));

        carpenterComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        carpenterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carpenter 1", "Carpenter 2", "Carpenter 3" }));
        carpenterComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(carpenterComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 230, -1));

        selectButton2.setBackground(new java.awt.Color(255, 204, 255));
        selectButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectButton2.setText("Select");
        selectButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(selectButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 100, 30));

        selectButton3.setBackground(new java.awt.Color(255, 204, 255));
        selectButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectButton3.setText("Select");
        selectButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(selectButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 100, 30));

        maidComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        maidComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maid 1", "Maid 2", "Maid 3" }));
        maidComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(maidComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 230, -1));

        selectButton4.setBackground(new java.awt.Color(255, 204, 255));
        selectButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectButton4.setText("Select");
        selectButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(selectButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 100, 30));

        watchmanComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        watchmanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Watchman 1", "Watchman 2", "Watchman 3" }));
        watchmanComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(watchmanComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 230, -1));

        selectButton5.setBackground(new java.awt.Color(255, 204, 255));
        selectButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectButton5.setText("Select");
        selectButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(selectButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 700, 100, 30));

        backButton.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\back.png")); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 690, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\workerBg.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButton1ActionPerformed
        // TODO add your handling code here:
        if((electricianComboBox.getSelectedItem().toString()).equals("Electrician 1")){
            new electrician1().setVisible(true);
            
        }
        else if((electricianComboBox.getSelectedItem().toString()).equals("Electrician 2")){
            new electrician2().setVisible(true);
            
        }
        else if((electricianComboBox.getSelectedItem().toString()).equals("Electrician 3")){
            new electrician3().setVisible(true);
        }
    }//GEN-LAST:event_selectButton1ActionPerformed

    private void selectButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButton2ActionPerformed
        // TODO add your handling code here:
        if((plumberComboBox.getSelectedItem().toString()).equals("Plumber 1")){
            new plumber1().setVisible(true);
        }
        else if((plumberComboBox.getSelectedItem().toString()).equals("Plumber 2")){
            new plumber2().setVisible(true);
        }
        else if((plumberComboBox.getSelectedItem().toString()).equals("Plumber 3")){
            new plumber3().setVisible(true);
        }
    }//GEN-LAST:event_selectButton2ActionPerformed

    private void selectButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButton3ActionPerformed
        // TODO add your handling code here:
        if((carpenterComboBox.getSelectedItem().toString()).equals("Carpenter 1")){
            new carpenter1().setVisible(true);
        }
        else if((carpenterComboBox.getSelectedItem().toString()).equals("Carpenter 2")){
            new carpenter2().setVisible(true);
        }
        else if((carpenterComboBox.getSelectedItem().toString()).equals("Carpenter 3")){
            new carpenter3().setVisible(true);
        }
    }//GEN-LAST:event_selectButton3ActionPerformed

    private void selectButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButton4ActionPerformed
        // TODO add your handling code here:
        if((maidComboBox.getSelectedItem().toString()).equals("Maid 1")){
            new maid1().setVisible(true);
        }
        else if((maidComboBox.getSelectedItem().toString()).equals("Maid 2")){
            new maid2().setVisible(true);
        }
        else if((maidComboBox.getSelectedItem().toString()).equals("Maid 3")){
            new maid3().setVisible(true);
        }
    }//GEN-LAST:event_selectButton4ActionPerformed

    private void selectButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButton5ActionPerformed
        // TODO add your handling code here:
        if((watchmanComboBox.getSelectedItem().toString()).equals("Watchman 1")){
            new watchman1().setVisible(true);
        }
        else if((watchmanComboBox.getSelectedItem().toString()).equals("Watchman 2")){
            new watchman2().setVisible(true);
        }
        else if((watchmanComboBox.getSelectedItem().toString()).equals("Watchman 3")){
            new watchman3().setVisible(true);
        }
    }//GEN-LAST:event_selectButton5ActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        // TODO add your handling code here:
        backButton.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\back_1.png"));
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        // TODO add your handling code here:
        backButton.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\back.png"));
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        new electrician1().setVisible(false);
        new electrician2().setVisible(false);
        new electrician3().setVisible(false);
        new plumber1().setVisible(false);
        new plumber2().setVisible(false);
        new plumber3().setVisible(false);
        new carpenter1().setVisible(false);
        new carpenter2().setVisible(false);
        new carpenter3().setVisible(false);
        new maid1().setVisible(false);
        new maid2().setVisible(false);
        new maid3().setVisible(false);
        new watchman1().setVisible(false);
        new watchman2().setVisible(false);
        new watchman3().setVisible(false);
        
        setVisible(false);
        new userDashboard().setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void electricianComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electricianComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_electricianComboBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new userDashboard().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(workerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new workerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> carpenterComboBox;
    private javax.swing.JComboBox<String> electricianComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> maidComboBox;
    private javax.swing.JComboBox<String> plumberComboBox;
    private javax.swing.JButton selectButton1;
    private javax.swing.JButton selectButton2;
    private javax.swing.JButton selectButton3;
    private javax.swing.JButton selectButton4;
    private javax.swing.JButton selectButton5;
    private javax.swing.JComboBox<String> watchmanComboBox;
    // End of variables declaration//GEN-END:variables
}
