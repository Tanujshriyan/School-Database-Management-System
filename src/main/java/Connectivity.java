/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tanuj
 */
public class Connectivity {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/student";
    static final String USER = "root";
    static final String PASS = "";
    
         public static void main(String[] args){
         Connection con = null;
         try{
             Class.forName(JDBC_DRIVER);
             System.out.printf("\n Connecting to a selected database");
             con = DriverManager.getConnection(DB_URL,USER,PASS);
             System.out.printf("\n Connected to Database Successfully");
         }
         catch(SQLException se){
             se.printStackTrace();
         }
         catch(Exception e){
             e.printStackTrace();
         }
         finally{
             try{
                    if(con!=null)
                    {
                        con.close();
                    }    
             }
             catch(SQLException se){
                 se.printStackTrace();
             }
         }
         System.out.println("\n Goodbye!");
         }
}
