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
import Source.Window;

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
        Gen_other.setEnabled(false);
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
        TemporaryAdd = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Addhar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Class = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        FPhone = new javax.swing.JTextField();
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
        jLabel16 = new javax.swing.JLabel();
        MPhone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        F_Occu = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        M_Occu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Gen_other = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Caste = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PermanentAdd = new javax.swing.JTextArea();
        same = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        Religion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Prev_School = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Prev_Percent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Student Application Form");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setText("Please fill the form very carefully");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 87, 770, 10));

        jLabel3.setText("Aadhar Card Number");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 150, -1));

        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 163, -1, -1));

        jLabel5.setText("Middle Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 163, -1, -1));

        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 163, -1, -1));

        jLabel7.setText("Student Name");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 109, -1, -1));

        jLabel8.setText("Gender");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 197, 100, -1));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));
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
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 340, 170, -1));

        TemporaryAdd.setColumns(20);
        TemporaryAdd.setRows(5);
        TemporaryAdd.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TemporaryAdd);
        TemporaryAdd.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 330, 60));

        jLabel10.setText("Class");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 70, -1));
        jPanel1.add(Addhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 223, 190, -1));

        jLabel11.setText("Temporary Address");
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 140, -1));
        jLabel11.getAccessibleContext().setAccessibleName("");

        Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Class 8", "Class 9", "Class 10", " " }));
        jPanel1.add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 100, -1));

        jLabel12.setText("Date of Birth");
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 197, 95, -1));
        jPanel1.add(FPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 230, -1));
        FPhone.getAccessibleContext().setAccessibleName("");

        Submit.setText("Add");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, -1, -1));

        Exit.setText("Close");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, -1, -1));
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 223, 210, -1));

        jLabel13.setText("Father's Phone Number");
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 170, -1));
        jLabel13.getAccessibleContext().setAccessibleName("");

        jPanel1.add(Father, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 370, 210, -1));
        jPanel1.add(Mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 440, 210, -1));

        jLabel14.setText("Mother's Name");
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 410, 170, -1));

        Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A (A+)", "A (A-)", "B (B+)", "B (B-)", "O (O+)", "O (O-)", "AB (AB+)", "AB (AB-)" }));
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
        jPanel1.add(Blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 290, 100, -1));

        jLabel15.setText("Blood Group");
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, 100, -1));
        jPanel1.add(F_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 140, 90, -1));
        jPanel1.add(M_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 140, 90, -1));
        jPanel1.add(L_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 90, -1));

        jLabel16.setText("Mother's Phone Number");
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 170, -1));
        jPanel1.add(MPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 230, -1));

        jLabel17.setText("Father's Occupation");
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 170, -1));
        jPanel1.add(F_Occu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 280, -1));

        jLabel18.setText("Mother's Occupation");
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 170, -1));
        jPanel1.add(M_Occu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 280, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Temporary Address");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 400, 140, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Religion");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 109, 150, -1));
        jPanel1.add(Gen_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 223, 190, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Caste");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 109, 150, -1));
        jPanel1.add(Caste, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 190, -1));

        jLabel22.setText("Permanent Address");
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 480, 140, -1));

        PermanentAdd.setColumns(20);
        PermanentAdd.setRows(5);
        PermanentAdd.setWrapStyleWord(true);
        jScrollPane2.setViewportView(PermanentAdd);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 510, 330, 60));

        same.setText("Permanent and Temporary address are same");
        same.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sameItemStateChanged(evt);
            }
        });
        jPanel1.add(same, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("If Other, specify");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 197, -1, -1));
        jPanel1.add(Religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 190, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Previous School Name");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));
        jPanel1.add(Prev_School, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 280, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Percentage");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));
        jPanel1.add(Prev_Percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 820, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // Textbox inputs transferred to variables
        String Name = F_Name.getText() +" "+M_Name.getText()+" "+L_Name.getText();
        String religion = Religion.getText();
        String caste = Caste.getText();
        LocalDate date = datePicker1.getDate();
        String Gen = (String) Gender.getSelectedItem();
        if(Gen.equals("Other")){
           Gen = Gen_other.getText();
        }
        //String comp_date = "2009-08-19";
        //LocalDate d1 = LocalDate.parse(comp_date);
        String Prev_school = Prev_School.getText();
        String Prev_percent = Prev_Percent.getText();
        String fPhone = FPhone.getText();
        String mPhone = MPhone.getText();
        String Dad = Father.getText();
        String Mom = Mother.getText();
        String Addh = Addhar.getText();
        String f_Occu = F_Occu.getText();
        String m_Occu = M_Occu.getText();
        String PermAddr = PermanentAdd.getText();
        String TempAddr = TemporaryAdd.getText();
        String Clas = Class.getSelectedItem().toString();
        String BloodG = Blood.getSelectedItem().toString();
        Window a = new Window();
        if(!validateAadhar(Addh)){
        JOptionPane.showMessageDialog(null,"Invalid Aadhar Card Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!validateNumber(mPhone)){
        JOptionPane.showMessageDialog(null,"Invalid Phone Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!validateNumber(fPhone)){
        JOptionPane.showMessageDialog(null,"Invalid Phone Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        // Checks if any value is empty
        else if(     Name.equals("") || 
                religion.equals("")||
                caste.equals("") ||
                //date.isBefore(d1)  || 
                Gen.equals("Select") ||
                Prev_school.equals("")||
                Prev_percent.equals("") ||
                fPhone.equals("") ||
                mPhone.equals("") ||
                Dad.equals("") || 
                f_Occu.equals("")||
                m_Occu.equals("")||
                Mom.equals("") || 
                Addh.equals("") || 
                PermAddr.equals("") ||
                TempAddr.equals("") || 
                Clas.equals("Select") || 
                BloodG.equals("Select")){
            // Shows a error message
            JOptionPane.showMessageDialog(null,"Some informations are missing","Error",JOptionPane.ERROR_MESSAGE);
        }else{// IF all values are entered
            String dob = date.toString();
            switch (Clas) {
                case "Class 8":
                try {

                    con = DriverManager.getConnection(DB_URL,User,Pass);
                    //Inserting into table
                    ps = con.prepareStatement("insert into class_8(Name, Religion, Caste, Dob, Gender, Aadhar, BloodGroup, FatherName, FatherOccupation, FatherNumber, MotherName, MotherOccupation,MotherNumber, PermanentAddress, TemporaryAddress, PreviousSchoolName, Percentage)" + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, Name); //Name
                    ps.setString(2, religion);// Religion
                    ps.setString(3, caste);// Caste
                    ps.setString(4, dob);// Date-of-birth
                    ps.setString(5, Gen);// Gender
                    ps.setString(6, Addh);// Aadhar Number
                    ps.setString(7, BloodG);// Blood Group
                    ps.setString(8, Dad);// Father's Name
                    ps.setString(9, f_Occu);// Father's Occupation
                    ps.setString(10, fPhone);// Father's Number
                    ps.setString(11, Mom);// Mother's Name
                    ps.setString(12, m_Occu);// Mother's Occupation
                    ps.setString(13, mPhone);// Mother's Number
                    ps.setString(14, PermAddr);// Permanent Address
                    ps.setString(15, TempAddr);// Temporary Address
                    ps.setString(16, Prev_school);// Previous School Name
                    ps.setString(17, Prev_percent);// Percentage
                    //Executing the statement
                    ps.executeUpdate(); // Update the table
                    JOptionPane.showMessageDialog(null,"Student successfully Added");
                    a.Refresh();
                    dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Form.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
                case "Class 9":
                try {
                    con = DriverManager.getConnection(DB_URL,User,Pass);
                    //Inserting into table
                    ps = con.prepareStatement("insert into class_9(Name, Religion, Caste, Dob, Gender, Aadhar, BloodGroup, FatherName, FatherOccupation, FatherNumber, MotherName, MotherOccupation,MotherNumber, PermanentAddress, TemporaryAddress, PreviousSchoolName, Percentage)" + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");;
                    ps.setString(1, Name); //Name
                    ps.setString(2, religion);// Religion
                    ps.setString(3, caste);// Caste
                    ps.setString(4, dob);// Date-of-birth
                    ps.setString(5, Gen);// Gender
                    ps.setString(6, Addh);// Aadhar Number
                    ps.setString(7, BloodG);// Blood Group
                    ps.setString(8, Dad);// Father's Name
                    ps.setString(9, f_Occu);// Father's Occupation
                    ps.setString(10, fPhone);// Father's Number
                    ps.setString(11, Mom);// Mother's Name
                    ps.setString(12, m_Occu);// Mother's Occupation
                    ps.setString(13, mPhone);// Mother's Number
                    ps.setString(14, PermAddr);// Permanent Address
                    ps.setString(15, TempAddr);// Temporary Address
                    ps.setString(16, Prev_school);// Previous School Name
                    ps.setString(17, Prev_percent);// Percentage
                    //Executing the statement
                    ps.executeUpdate(); // Update the table
                    JOptionPane.showMessageDialog(null,"Student successfully Added");
                    a.Refresh();
                    dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Form.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
                case "Class 10":
                try {
                    con = DriverManager.getConnection(DB_URL,User,Pass);
                    //Inserting into table
                   ps = con.prepareStatement("insert into class_10(Name, Religion, Caste, Dob, Gender, Aadhar, BloodGroup, FatherName, FatherOccupation, FatherNumber, MotherName, MotherOccupation,MotherNumber, PermanentAddress, TemporaryAddress, PreviousSchoolName, Percentage)" + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, Name); //Name
                    ps.setString(2, religion);// Religion
                    ps.setString(3, caste);// Caste
                    ps.setString(4, dob);// Date-of-birth
                    ps.setString(5, Gen);// Gender
                    ps.setString(6, Addh);// Aadhar Number
                    ps.setString(7, BloodG);// Blood Group
                    ps.setString(8, Dad);// Father's Name
                    ps.setString(9, f_Occu);// Father's Occupation
                    ps.setString(10, fPhone);// Father's Number
                    ps.setString(11, Mom);// Mother's Name
                    ps.setString(12, m_Occu);// Mother's Occupation
                    ps.setString(13, mPhone);// Mother's Number
                    ps.setString(14, PermAddr);// Permanent Address
                    ps.setString(15, TempAddr);// Temporary Address
                    ps.setString(16, Prev_school);// Previous School Name
                    ps.setString(17, Prev_percent);// Percentage
                    //Executing the statement
                    ps.executeUpdate(); // Update the table
                    JOptionPane.showMessageDialog(null,"Student successfully Added");
                    a.Refresh();
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

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodActionPerformed

    }//GEN-LAST:event_BloodActionPerformed

    private void BloodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BloodItemStateChanged

    }//GEN-LAST:event_BloodItemStateChanged

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        String gen = (String) Gender.getSelectedItem();
        if(gen.equals("Other")){
            Gen_other.setEnabled((true));
        }else{
            Gen_other.setEnabled(false);
        }
    }//GEN-LAST:event_GenderActionPerformed

    private void GenderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderItemStateChanged

    }//GEN-LAST:event_GenderItemStateChanged

    private void sameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sameItemStateChanged
        if(same.isSelected()){
        TemporaryAdd.setEnabled(false);
        TemporaryAdd.setText(PermanentAdd.getText());
        }else{
        TemporaryAdd.setEnabled(true);
        TemporaryAdd.setText("");
        }
    }//GEN-LAST:event_sameItemStateChanged

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
    private javax.swing.JComboBox<String> Blood;
    private javax.swing.JTextField Caste;
    private javax.swing.JComboBox<String> Class;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField FPhone;
    private javax.swing.JTextField F_Name;
    private javax.swing.JTextField F_Occu;
    private javax.swing.JTextField Father;
    private javax.swing.JTextField Gen_other;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField L_Name;
    private javax.swing.JTextField MPhone;
    private javax.swing.JTextField M_Name;
    private javax.swing.JTextField M_Occu;
    private javax.swing.JTextField Mother;
    private javax.swing.JTextArea PermanentAdd;
    private javax.swing.JTextField Prev_Percent;
    private javax.swing.JTextField Prev_School;
    private javax.swing.JTextField Religion;
    private javax.swing.JButton Submit;
    private javax.swing.JTextArea TemporaryAdd;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox same;
    // End of variables declaration//GEN-END:variables


}
