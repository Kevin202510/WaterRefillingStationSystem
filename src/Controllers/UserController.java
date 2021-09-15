/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.UserModel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    

     public void showUsers(JTable jTable1){
         JButton test = new JButton();
         test.setBackground(new java.awt.Color(0, 204, 51));
        test.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        test.setText("+");
        test.setBorderPainted(false);
        
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < userList.size(); i++) {
            row[0] = userList.get(i).getId();
            row[1] = userList.get(i).getRole_id();
            row[2] = userList.get(i).getProfile();
            row[3] = "<html>"+userList.get(i).getFullname()+"</html> ";
            row[4] = userList.get(i).getDOB();
            row[5] = userList.get(i).getAddress();
            row[6] = userList.get(i).getContact();
            row[7] = userList.get(i).getUsername();
            row[7] = test;
            model.addRow(row);
         }
    }
     
    private ImageIcon checkProfile(String prof){
//       JLabel profile = new JLabel();
        ImageIcon vins=null;
       if (prof==null) {
//        ImageIcon vins = new ImageIcon(getClass().getResource("/Images/Profile/sampleuser.jpg"));
//        Image kev = vins.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH);
//        ImageIcon shit = new ImageIcon(kev);
//        profile.setIcon(shit);
        }else{
            vins = new ImageIcon(getClass().getResource("/Images/Profile/kevin.jpg"));
//            profile.setIcon(vins);
        }   
       
       return vins;
    }
}
