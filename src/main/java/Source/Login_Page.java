package Source;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

        
import com.formdev.flatlaf.FlatDarkLaf;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

        
/**
 *
 * @author Tanuj & Shravan
 */
public class Login_Page extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost:3306/student"; //Database URL
        static final String User = "root"; //Database Username
        static final String Pass = "";  //Database Password
        private static MessageDigest md;
        
    public Login_Page() {
        initComponents();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Upass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(391, 393));
        setMinimumSize(new java.awt.Dimension(391, 393));
        setPreferredSize(new java.awt.Dimension(391, 393));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(43, 45, 45));
        jPanel1.setMaximumSize(new java.awt.Dimension(334, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(334, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(391, 393));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("WELCOME BACK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, -1, -1));

        Uname.setBackground(new java.awt.Color(51, 51, 51));
        Uname.setForeground(new java.awt.Color(255, 255, 255));
        Uname.setText("   Enter your username");
        Uname.setToolTipText("");
        Uname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Uname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });
        jPanel1.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 132, 280, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        Login.setBackground(new java.awt.Color(102, 153, 255));
        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login Now");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 280, 40));

        Upass.setBackground(Uname.getBackground());
        Upass.setForeground(new java.awt.Color(255, 255, 255));
        Upass.setToolTipText("");
        Upass.setBorder(Uname.getBorder());
        Upass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpassActionPerformed(evt);
            }
        });
        jPanel1.add(Upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 192, 280, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Not registered yet? ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Log into your account");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register →");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 295, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UnameActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        Window obj = new Window();
        Connection con;
        PreparedStatement ps;
        String U_name = Uname.getText();
        String U_pass = Upass.getText();
        // JOptionPane.showMessageDialog(null, U_name + U_pass); Displays a message box outputting Username & Password values
       
            if(U_name.equals("")){
                JOptionPane.showMessageDialog(null,"Enter the username please","Error",JOptionPane.INFORMATION_MESSAGE); // Error : Username not entered
            }
            else if(U_pass.equals("")){
                JOptionPane.showMessageDialog(null,"Enter the password please","Error",JOptionPane.INFORMATION_MESSAGE); // Error : Password not entered
            }
            else
            {
                try{
                    String SB = cryptWithMD5(U_pass);
                    con = DriverManager.getConnection(DB_URL,User,Pass); // Connection to database
                    ps = con.prepareStatement("SELECT `Uname`,`Upassword` FROM `login` WHERE `Uname`=? AND `Upassword`=?"); // Checking of username & password
                            System.out.printf("Connection Successfull!"); 
                            ps.setString(1,U_name); //Username
                            ps.setString(2,SB); //Password
                            ResultSet result = ps.executeQuery(); // Query Statement execution
                            if(result.next()){
                                System.out.printf("Statement Executed"); // Prints on Console
                                JOptionPane.showMessageDialog(null,"Login Successfull!","Confirmation",JOptionPane.INFORMATION_MESSAGE); // Confirmation Dialogue Box
                                this.dispose(); // Closes the window
                                con.close(); // // Connection Closed
                                obj.setVisible(true); // Opens the Main window
                            }
                            if(!result.next()){
                                JOptionPane.showMessageDialog(null,"Wrong Username or Password.","Error",JOptionPane.INFORMATION_MESSAGE);
                            }
                }
                catch(SQLException se){
                    JOptionPane.showMessageDialog(null,"Couldn't retrieve the data! Check the connection and try again!","Error",JOptionPane.ERROR_MESSAGE);
                    se.printStackTrace(); // Throws an exception
                }
                
            }
     
    }//GEN-LAST:event_LoginActionPerformed

    private void UpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpassActionPerformed
        // TODO 
    }//GEN-LAST:event_UpassActionPerformed

     public static String cryptWithMD5(String pass){
    try {
        md = MessageDigest.getInstance("MD5");
        byte[] passBytes = pass.getBytes();
        md.reset();
        byte[] digested = md.digest(passBytes);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<digested.length;i++){
            sb.append(Integer.toHexString(0xff & digested[i]));
        }
        return sb.toString();
    } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
    }
        return null;


   }
    
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       Register_Page obj1 = new Register_Page();
        dispose();
        obj1.setVisible(true); // Opens the register window
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            FlatDarkLaf.setup();    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    Login_Page frame = new Login_Page();
                    new Login_Page().setVisible(true);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JTextField Uname;
    private javax.swing.JPasswordField Upass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
