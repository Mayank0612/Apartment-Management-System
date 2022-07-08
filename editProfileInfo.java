
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.regex.*;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin <your.name at your.org>
 */
public class editProfileInfo extends javax.swing.JFrame {

    /**
     * Creates new form editProfileInfo
     */
    int flag;
   
    
    public void profile(String usern){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
        PreparedStatement pst = conn.prepareStatement("Select * from signup where username = ?" );
        pst.setString(1,usern);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            String name = rs.getString("name");
            String email = rs.getString("email");
            String phone = rs.getString("phone");
            String address = rs.getString("address");
            String user = rs.getString("username");
            String pass = rs.getString("password");
            
            nameField.setText(name);
            emailField.setText(email);
            phoneField.setText(phone);
            addressField.setText(address);
            userField.setText(user);
            passwordField.setText(pass);
        }
    }
    catch(Exception e){
        e.printStackTrace();
        
    }
        
        
        
    
    }
    public editProfileInfo() {
        initComponents();
    }
    static boolean isValid(String email){
        String regex = "[a-zA-Z][\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$";
        return email.matches(regex);
    }
    static boolean phoneisValid(String phone){
        String regex = "^\\d{10}$";
        return phone.matches(regex);
    }
    
    static boolean checkUsername(String usern){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
            PreparedStatement pst = conn.prepareStatement("Select * from signup where username = ?");
            pst.setString(1,usern);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
            
            
            
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public void checker(){
        String user = ValueExtractor.getText();
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();
        String username = userField.getText();
        String password = String.valueOf(passwordField.getPassword());
        
        if(name.equals("") || email.equals("") || phone.equals("") || address.equals("") || username.equals("") || password.equals("")){ 
            JOptionPane.showMessageDialog(null,"Updated value can not be blank");
            
        }
        else if (isValid(email) == false){
            JOptionPane.showMessageDialog(null,"Enter a valid email");
            
        
        }
        else if (phoneisValid(phone) == false){
            JOptionPane.showMessageDialog(null,"Enter a valid Phone no");
            
            
 
        }
        else if(!user.equals(username)){
            if(checkUsername(username)){
                JOptionPane.showMessageDialog(null,"Username already taken");
            }
        
        }
        else{
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
                PreparedStatement pst = conn.prepareStatement("update signup SET name = ? ,email = ? , phone = ? , address = ? , username = ? , password = ? where username = ? ");
                pst.setString(1,name);
                pst.setString(2,email);
                pst.setString(3,phone);
                pst.setString(4,address);
                pst.setString(5,username);
                pst.setString(6,password);
                pst.setString(7,user);
                
                if(pst.executeUpdate() != 0 ){
                    JOptionPane.showMessageDialog(null,"Values updated successfully");
                    setVisible(false);
                    new Login().setVisible(true);
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"It is an error Please report to the administrator");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ValueExtractor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 141, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Email Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 210, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Phone No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 210, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 210, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 210, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 210, 40));

        nameField.setBackground(new java.awt.Color(255, 204, 255));
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 250, 30));

        emailField.setBackground(new java.awt.Color(255, 204, 255));
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 250, 30));

        phoneField.setBackground(new java.awt.Color(255, 204, 255));
        phoneField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 250, 30));

        addressField.setBackground(new java.awt.Color(255, 204, 255));
        addressField.setColumns(20);
        addressField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressField.setRows(5);
        jScrollPane1.setViewportView(addressField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 250, -1));

        userField.setBackground(new java.awt.Color(255, 204, 255));
        userField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, 250, 30));

        passwordField.setBackground(new java.awt.Color(255, 204, 255));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 250, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\update.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 696, 100, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\pro2.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\profileBg2.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ValueExtractor.setText("jLabel2");
        getContentPane().add(ValueExtractor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        checker();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(editProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editProfileInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ValueExtractor;
    public javax.swing.JTextArea addressField;
    public javax.swing.JTextField emailField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nameField;
    public javax.swing.JPasswordField passwordField;
    public javax.swing.JTextField phoneField;
    public javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables

    boolean isValid(JTextField email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
