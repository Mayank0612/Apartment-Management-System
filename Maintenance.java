
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin <your.name at your.org>
 */
public class Maintenance extends javax.swing.JFrame {

    /**
     * Creates new form Maintenance
     */
    public Maintenance() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
    
    public void ShowMaintenance(String usern){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
        PreparedStatement pst = conn.prepareStatement("Select name , username , maintenance from signup where username = ?" );
        pst.setString(1,usern);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            String name = rs.getString("name");
            String userna = rs.getString("username");
            String maintenance = rs.getString("maintenance");
            
            nameLabel.setText(name);
            usernaLabel.setText(userna);
            MaintenanceLabel.setText(maintenance);    
        }    
    }
    catch(Exception e){
        e.printStackTrace();
        
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        usernaLabel = new javax.swing.JLabel();
        MaintenanceLabel = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("MAINTENANCE INFORMATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\mainImg.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Maintenance Due");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 310, 50));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLabel.setText("name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, -1, -1));

        usernaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernaLabel.setText("username");
        getContentPane().add(usernaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, -1, -1));

        MaintenanceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MaintenanceLabel.setText("maintenance");
        getContentPane().add(MaintenanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 440, -1, -1));

        pay.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\payImg.png")); // NOI18N
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        getContentPane().add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 640, 100, 40));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\printImg.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 640, 100, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Monthly Maintenance - 3400???");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("------------------------------------");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("------------------------------------");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        Status.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 520, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\Backgrnd.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
        String user1 = usernaLabel.getText();
        if ("3400".equals(MaintenanceLabel.getText())){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
                PreparedStatement pst = conn.prepareStatement("update signup SET maintenance = ? where username = ?");
                pst.setString(1,"0");
                pst.setString(2,user1);
                
                if(pst.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null,"Your Payment has been \nupdated Successfully");
                    ShowMaintenance(user1);
                    pay.setEnabled(false);
                }
                
                else{
                    JOptionPane.showMessageDialog(null,"It is an error Please report to the administrator");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if("0".equals(MaintenanceLabel.getText())){
            pay.setEnabled(false);
            Status.setText("Please update your Manitenance.");
                }
            
        
        
        
        
        
        
    }//GEN-LAST:event_payActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MaintenanceReceipt().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maintenance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel MaintenanceLabel;
    public javax.swing.JLabel Status;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nameLabel;
    public javax.swing.JButton pay;
    private javax.swing.JLabel usernaLabel;
    // End of variables declaration//GEN-END:variables
}
