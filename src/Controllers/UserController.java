/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.UserModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Felix Caluag
 */
public class UserController {
    
    ArrayList<UserModel> userList = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgUser = "SELECT * FROM users";
    
    public UserController(){
        try {
            userList();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<UserModel> userList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgUser);
        UserModel users;
        
        while(rs.next()){
            users=new UserModel(rs.getInt("Id"),rs.getInt("Role_id"),rs.getString("Profile"),rs.getString("Fname"),rs.getString("Mname"),
                  rs.getString("Lname"),rs.getString("DOB"),rs.getString("Address"),rs.getString("Contact"),rs.getString("Username"),rs.getString("Password"));
            userList.add(users);
        }
        return userList;   
    }
    
//    JTable jTable1
     public void showUsers(){
//         ArrayList<Users> list = userList();
//         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
//         Object[] row = new Object[8];
         for (int i = 0; i < userList.size(); i++) {
             JOptionPane.showMessageDialog(null,userList.get(i).getFname());
//            row[0] = list.get(i).getuser_id();
//            row[1] = list.get(i).getrole_displayname();
//            row[2] = "<html>"+list.get(i).getuser_fullname()+"</html> ";
//            row[3] = list.get(i).getuser_address();
//            row[4] = list.get(i).getuser_DOB();
//            row[5] = list.get(i).getuser_contactnum();
//            row[6] = list.get(i).getuser_username();
//            row[7] = list.get(i).getuser_password();
//            model.addRow(row);
         }
    }
     public String encrypt(String str){
	String storen = "";
		
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
		
            int asci = (int)c + 5;
	    storen += (char) asci;
        }
        return storen;
    }
}
