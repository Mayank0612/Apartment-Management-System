/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author Admin
 */

import java.sql.*;
import javax.swing.*;
import project.select;
import co.yogesh.Captcha;

public class Login extends javax.swing.JFrame {
    
    public static String uname;
    

    
    

    /**
     * Creates new form main
     */
    Captcha cap =new Captcha();
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); 
        cap.setImageCaptcha(captcha);
        
//center form in the screen
    }
    int checkCaptcha = 0;

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
        username = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        captcha = new javax.swing.JLabel();
        Verify = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 220, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 130, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 120, 40));

        username.setBackground(new java.awt.Color(255, 204, 255));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 400, 30));

        login.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\LOGIN.png")); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 90, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\Signup.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 100, 30));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\FORGOT PASSWORD.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 190, 30));

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\LOGIN AS ADMIN.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 400, 30));

        password.setBackground(new java.awt.Color(255, 204, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 400, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\username.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 40, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));
        getContentPane().add(captcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 190, 90));

        Verify.setBackground(new java.awt.Color(255, 204, 255));
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });
        getContentPane().add(Verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 190, 30));

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\verify.png")); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 190, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\password.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\bg_1.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public boolean validate_login(String usern , String pass){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
            PreparedStatement pst = conn.prepareStatement("Select * from signup where username = ? and password = ? " );
            pst.setString(1,usern);
            pst.setString(2,pass);
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
    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new LoginAsAdmin().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SignUp().setVisible(true);
        new SignUp().setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginMouseEntered

    
    
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if(username.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Enter username");
            setVisible(false);
            new Login().setVisible(true);}
        else if(password.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Enter password");
            setVisible(false);
            new Login().setVisible(true);
        }
        else if(Verify.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Enter Captcha");
            setVisible(false);
            new Login().setVisible(true);
        }
        else{
            String user = username.getText();
            String pwd = password.getText();
            if(validate_login(user,pwd)){
                if (checkCaptcha == 1){
                    JOptionPane.showMessageDialog(null, "Login Sucessfull!!");
                    setVisible(false);
                    userDashboard uD=new userDashboard();
                    uD.User.setText("Hi " + user);
                    uD.userExtract.setText(user);
                    uD.setVisible(true);
                    
                }
            }
//                JOptionPane.showMessageDialog(null, "Correct Login Credentials");}
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
                setVisible(false);
                new Login().setVisible(true);
            }
        }
        
    
            
            
        
        
//        int check = 0;
//        
//        String name = username.getText();
//        String pass = password.getText();
//        
//        if(name.equals("") || password.equals("")){
//            check = 1;
//            JOptionPane.showMessageDialog(null, "Every field is required");;
//        }
//        else if (name.equals("mayank06") && password.equals("Mayank_06")){
//            check=1;
//            setVisible(false);
//            new userDashboard().setVisible(true);
//        }
//        else{
//            ResultSet rs = select.getData("select * from signup where username='"+name+"' and password='"+pass+"'");
//            try{
//                if(rs.next()){
//                    check=1;
//                    if(rs.getString(8).equals("true")){
//                        setVisible(false);
//                        new home().setVisible(true);
//                    }
//                    else{
//                        JOptionPane.showMessageDialog(null, "Wait for admin approval");
//                    }
//                }
//            }
//            catch(Exception e){
//                JOptionPane.showMessageDialog(null,e);
//            }
//            if(check==0){
//                JOptionPane.showMessageDialog(null,"User does not exist");
//            }
//        }
    }//GEN-LAST:event_loginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerifyActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if(cap.Validate(captcha,Verify.getText())){
            JOptionPane.showMessageDialog(this,"Captcha Matched");
            checkCaptcha = 1;
            uname = username.getText();
        }
        else{
            JOptionPane.showMessageDialog(this,"Captcha does not match");
            Verify.setText("");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Verify;
    private javax.swing.JLabel captcha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
