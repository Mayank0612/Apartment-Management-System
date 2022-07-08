
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import project.InsertUpdateDelete;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin <your.name at your.org>
 */
public class complainBox extends javax.swing.JFrame {

    /**
     * Creates new form complainBox
     */
    
    public void UserandEmail(String userc){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
        PreparedStatement pst = conn.prepareStatement("Select * from signup where username = ?" );
        pst.setString(1,userc);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            String name = rs.getString("username");
            String email = rs.getString("email");
            
            usernameLabel.setText(name);
            emailLabel.setText(email);
            
        }
    }
    catch(Exception e){
        e.printStackTrace();
        
    }
    }
    public complainBox() {
        initComponents();
        this.setLocationRelativeTo(null); 
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
        subject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        complaint = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        to = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 200, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Subject");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 140, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Complaint");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("To");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, 100, 50));

        subject.setBackground(new java.awt.Color(255, 204, 255));
        subject.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 430, 30));

        complaint.setBackground(new java.awt.Color(255, 204, 255));
        complaint.setColumns(20);
        complaint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        complaint.setRows(5);
        jScrollPane1.setViewportView(complaint);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 430, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\complaint.png")); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 440, 510));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 80, 30));

        to.setBackground(new java.awt.Color(255, 204, 255));
        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "president@gmail.com", "vicepresident@gmail.com", "treasurer@gmail.com", "member1@gmail.com", "member2@gmail.com" }));
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 190, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 120, 40));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\ApartmentManagementSystem\\src\\main\\java\\images\\complainBg.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String user = usernameLabel.getText();
        String mail = emailLabel.getText();
        String sub = subject.getText();
        String comp = complaint.getText();
        String Send_to = (String)to.getSelectedItem();
        
        if(user.equals("") || sub.equals("") || comp.equals("") || Send_to.equals("") || mail.equals("")){
            JOptionPane.showMessageDialog(null,"Every field is required");
        }
        
        
        else{
            String Query;
            Query = "insert into complaint values('"+user+"', '"+mail+"', '"+Send_to+"', '"+comp+"')";
            InsertUpdateDelete.setData(Query, "Complaint submitted successfully");
            setVisible(false);
            new Login().setVisible(true); 
        
        
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(complainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(complainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(complainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(complainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new complainBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea complaint;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField subject;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> to;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}