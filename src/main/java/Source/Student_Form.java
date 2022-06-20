/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Source;


import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Tanuj & Shravan
 */
public class Student_Form extends javax.swing.JFrame {
    
    static final String DB_URL="jdbc:mysql://localhost:3306/student";
    static final String User="root";
    static final String Pass="";
    static Connection con;
    static PreparedStatement ps;
        
    /**
     * Creates new form Student_Form
     */
    public Student_Form() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Addhar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Class = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        PPhone = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel13 = new javax.swing.JLabel();
        Father = new javax.swing.JTextField();
        Mother = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Blood = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        F_Name = new javax.swing.JTextField();
        M_Name = new javax.swing.JTextField();
        L_Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Student Creation Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 27, -1, -1));

        jLabel2.setText("Please fill the form very carefully");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 65, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 87, 400, 10));

        jLabel3.setText("Aadhar Card Number");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 150, -1));

        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 163, -1, -1));

        jLabel5.setText("Middle Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 163, -1, -1));

        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 163, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Student Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 109, -1, -1));

        jLabel8.setText("Gender");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 197, 100, -1));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        Gender.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GenderItemStateChanged(evt);
            }
        });
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 223, 100, -1));

        jLabel9.setText("Father's Name");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, 170, -1));

        Address.setColumns(20);
        Address.setRows(5);
        Address.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Address);
        Address.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 330, 60));

        jLabel10.setText("Class");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 70, -1));
        jPanel1.add(Addhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 400, 95, -1));
        jLabel11.getAccessibleContext().setAccessibleName("");

        Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 8", "Class 9", "Class 10", " " }));
        jPanel1.add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 100, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Birth Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 197, 95, -1));
        jPanel1.add(PPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 530, 160, -1));
        PPhone.getAccessibleContext().setAccessibleName("");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        Exit.setText("Close");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 223, 210, -1));

        jLabel13.setText("Parent's Phone Number");
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 500, 170, -1));
        jLabel13.getAccessibleContext().setAccessibleName("");

        jPanel1.add(Father, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 290, 210, -1));
        jPanel1.add(Mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 360, 210, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Mother's Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 330, 170, -1));

        Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A (A+)", "A (A-)", "B (B+)", "B (B-)", "O (O+)", "O (O-)", "AB (AB+)", "AB (AB-)" }));
        Blood.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BloodItemStateChanged(evt);
            }
        });
        Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodActionPerformed(evt);
            }
        });
        jPanel1.add(Blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Blood Group");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 100, -1));
        jPanel1.add(F_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 140, 90, -1));
        jPanel1.add(M_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 140, 90, -1));
        jPanel1.add(L_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 450, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
    }//GEN-LAST:event_GenderActionPerformed

    private void GenderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderItemStateChanged
    }//GEN-LAST:event_GenderItemStateChanged

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

        private boolean validateNumber(String Phone) {
         //(0/91): number starts with (0/91)  
         //[7-9]: starting of the number may contain a digit between 0 to 9  
         //[0-9]: then contains digits 0 to 9  
         Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
         //the matcher() method creates a matcher that will match the given input against this pattern  
         Matcher match = ptrn.matcher(Phone);  
        //returns a boolean value
        return match.find() && match.group().equals(Phone);
    }

    private boolean validateAadhar(String Addh) {
        // Regex to check valid Aadhaar number.
        String regex
            = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
 
        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(Addh);
 
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
    
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // Textbox inputs transferred to variables    
            String Name = F_Name.getText() +" "+M_Name.getText()+" "+L_Name.getText();
            LocalDate date = datePicker1.getDate();
            String Gen = Gender.getSelectedItem().toString();
            String Phone = PPhone.getText();
            String Dad = Father.getText();
            String Mom = Mother.getText();
            String Addh = Addhar.getText();
            String Addr = Address.getText();
            String Clas = Class.getSelectedItem().toString();
            String BloodG = Blood.getSelectedItem().toString();
                                System.out.println(Name);
                                System.out.println(F_Name.getText());
                                System.out.println(M_Name.getText());
                                System.out.println(L_Name.getText());
        // Checks if any value is empty   
            if(F_Name.equals("") || M_Name.equals("") || L_Name.equals("") || date == null  || Gen.equals("") || Phone.equals("") || 
                    Dad.equals("") || Mom.equals("") || Addh.equals("") || Addr.equals("") || Clas.equals("") || BloodG.equals("")){
                // Shows a error message 
                JOptionPane.showMessageDialog(null,"Some informations are missing","Error",JOptionPane.ERROR_MESSAGE);
            }else{// IF all values are entered
                    String dob = date.toString();
                    switch (Clas) {
                        case "Class 8":
                            try {
                                
                                con = DriverManager.getConnection(DB_URL,User,Pass);
                                //Inserting into table
                                ps = con.prepareStatement("insert into class_8(Name, Dob, Gender, Father, Mother, Phone, Aadhar, Address, BloodGroup)" + "values (?,?,?,?,?,?,?,?,?)");
                                ps.setString(1, Name); //Name
                                ps.setString(2, dob);// Date-of-Birth
                                ps.setString(3, Gen);// Gender
                                ps.setString(4, Dad);// Father's Name
                                ps.setString(5, Mom);// Mother's Name
                                ps.setString(6, Phone);// Parent's Phone Number
                                ps.setString(7, Addh);// Aadhar Number
                                ps.setString(8, Addr);// Address
                                ps.setString(9, BloodG);// Blood Group
                                //Executing the statement
                                ps.executeUpdate(); // Update the table
                                JOptionPane.showMessageDialog(null,"Student successfully Added");
                                dispose();
                            } catch (SQLException ex) {
                                Logger.getLogger(Student_Form.class.getName()).log(Level.SEVERE, null, ex);
                            }   break;
                        case "Class 9":
                            try {
                                con = DriverManager.getConnection(DB_URL,User,Pass);
                                //Inserting into table
                                ps = con.prepareStatement("insert into class_9(Name, Dob, Gender, Father, Mother, Phone, Aadhar, Address, BloodGroup)" + "values (?,?,?,?,?,?,?,?,?)");
                                ps.setString(1,Name); //Name
                                ps.setString(2, dob);// Date-of-Birth
                                ps.setString(3, Gen);// Gender
                                ps.setString(4, Dad);// Father's Name
                                ps.setString(5, Mom);// Mother's Name
                                ps.setString(6, Phone);// Parent's Phone Number
                                ps.setString(7, Addh);// Aadhar Number
                                ps.setString(8, Addr);// Address
                                ps.setString(9, BloodG);// Blood Group
                                //Executing the statement
                                ps.executeUpdate(); // Update the table
                                JOptionPane.showMessageDialog(null,"Student successfully Added");
                                dispose();
                            } catch (SQLException ex) {
                                Logger.getLogger(Student_Form.class.getName()).log(Level.SEVERE, null, ex);
                            }   break;
                        case "Class 10":
                            try {
                                con = DriverManager.getConnection(DB_URL,User,Pass);
                                //Inserting into table
                                ps = con.prepareStatement("insert into class_10(Name, Dob, Gender, Father, Mother, Phone, Aadhar, Address, BloodGroup)" + "values (?,?,?,?,?,?,?,?,?)");
                                ps.setString(1,Name); //Name
                                ps.setString(2, dob);// Date-of-Birth
                                ps.setString(3, Gen);// Gender
                                ps.setString(4, Dad);// Father's Name
                                ps.setString(5, Mom);// Mother's Name
                                ps.setString(6, Phone);// Parent's Phone Number
                                ps.setString(7, Addh);// Aadhar Number
                                ps.setString(8, Addr);// Address
                                ps.setString(9, BloodG);// Blood Group
                                //Executing the statement
                                ps.executeUpdate(); // Update the table
                                JOptionPane.showMessageDialog(null,"Student successfully Added");
                                dispose();
                            } catch (SQLException ex) {
                                Logger.getLogger(Student_Form.class.getName()).log(Level.SEVERE, null, ex);
                            }   break;
                        default:
                            JOptionPane.showMessageDialog(null,"Phone Number or Aadhar Number isn't valid","Error",JOptionPane.ERROR_MESSAGE);
                            break;
                    }
            }
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void BloodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BloodItemStateChanged

    }//GEN-LAST:event_BloodItemStateChanged

    private void BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodActionPerformed

    }//GEN-LAST:event_BloodActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Form().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addhar;
    private javax.swing.JTextArea Address;
    private javax.swing.JComboBox<String> Blood;
    private javax.swing.JComboBox<String> Class;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField F_Name;
    private javax.swing.JTextField Father;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField L_Name;
    private javax.swing.JTextField M_Name;
    private javax.swing.JTextField Mother;
    private javax.swing.JTextField PPhone;
    private javax.swing.JButton Submit;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


}
