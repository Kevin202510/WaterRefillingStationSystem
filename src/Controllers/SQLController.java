/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Felix Caluag
 */
public class SQLController {
    
    public Connection getConnection(){
       
       String Dbname,username,password;
       Dbname = "newwrs";
       username = "root";
       password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,username,password);
            return con;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
       }
    

    
    
    
}
