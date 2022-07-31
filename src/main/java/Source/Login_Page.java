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
        Register = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Upass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(347, 550));
        setPreferredSize(new java.awt.Dimension(4, 4));

        jPanel1.setBackground(new java.awt.Color(122, 166, 151));
        jPanel1.setMaximumSize(new java.awt.Dimension(334, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(334, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(334, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sign in");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        Uname.setBackground(new java.awt.Color(122, 166, 151));
        Uname.setForeground(new java.awt.Color(255, 255, 255));
        Uname.setToolTipText("Enter a valid username");
        Uname.setBorder(null);
        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });
        jPanel1.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 220, 25));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 20));

        Register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Register.setText("Register");
        Register.setMaximumSize(new java.awt.Dimension(75, 25));
        Register.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 470, -1, -1));

        Login.setBackground(new java.awt.Color(218, 0, 55));
        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 220, 40));

        Upass.setBackground(new java.awt.Color(122, 166, 151));
        Upass.setForeground(new java.awt.Color(255, 255, 255));
        Upass.setToolTipText("Enter a valid password");
        Upass.setBorder(null);
        Upass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpassActionPerformed(evt);
            }
        });
        jPanel1.add(Upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 220, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Don't have an account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 220, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 220, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Use your Account");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        Register_Page obj1 = new Register_Page();
        dispose();
        obj1.setVisible(true); // Opens the register window
    }//GEN-LAST:event_RegisterActionPerformed

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
    private javax.swing.JButton Register;
    private javax.swing.JTextField Uname;
    private javax.swing.JPasswordField Upass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
