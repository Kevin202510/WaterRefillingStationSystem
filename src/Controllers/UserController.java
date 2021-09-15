/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.UserModel;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jroundborder.JLabelRound;

/**
 *
 * @author Kevin Felix Caluag
 */
public class UserController {
    
    ArrayList<UserModel> userList = new ArrayList<>();
    AuthenticationController authControll = new AuthenticationController();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgUser = "SELECT * FROM users";
    String tanggalinAngUser = "DELETE FROM users WHERE Id = ?";
    String magdagdagNgUser = "INSERT INTO users(Role_id,Profile,Fname,Mname,Lname,DOB,Address,Contact,Username,Password) VALUES (?,?,?,?,?,?,?,?,?,?)";
    
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
//            row[7] = test;
            model.addRow(row);
         }
    }
     
     public boolean addUser(UserModel usermodel,JTable userTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgUser);
            st.setInt(1, usermodel.getRole_id());
            st.setString(2, usermodel.getProfile());
            st.setString(3, usermodel.getFname());
            st.setString(4, usermodel.getMname());
            st.setString(5, usermodel.getLname());
            st.setString(6, usermodel.getDOB());
            st.setString(7, usermodel.getAddress());
            st.setString(8, usermodel.getContact());
            st.setString(9, usermodel.getUsername());
            st.setString(10, authControll.encrypt(usermodel.getPassword()));
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)userTable.getModel();
                model.setRowCount(0);
//                userList();
//                showUsers(userTable);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
     public void getUserInfo(int id,JTextField Role_id,JLabelRound Profile,JTextField Fname,JTextField Mname,JTextField Lname,JDateChooser DOB,
                                JTextField Address,JTextField Contact,JTextField Username,JTextField Password){
        String kuninAngUser = "SELECT * FROM users where Id = '" + id + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(kuninAngUser);
            ImageIcon vin = null;
            while(rs.next()){
                String prof = rs.getString("Profile");
                if (prof==null) {
                    ImageIcon vins = new ImageIcon(getClass().getResource("/Images/Profile/sampleuser.jpg"));
                    Image kev = vins.getImage().getScaledInstance(210, 120, Image.SCALE_SMOOTH);
                    ImageIcon shit = new ImageIcon(kev);
                    Profile.setIcon(shit);
                }else{
                    ImageIcon vins = new ImageIcon(getClass().getResource("/Images/Profile/"+prof));
                    Profile.setIcon(vins);
                }
                Role_id.setText(String.valueOf(rs.getInt("role_id")));
                Fname.setText(rs.getString("Fname"));
                Mname.setText(rs.getString("Mname"));
                Lname.setText(rs.getString("Lname"));
                DOB.setDate(rs.getDate("DOB"));
                Address.setText(rs.getString("Address"));
                Contact.setText(rs.getString("Contact"));
                Username.setText(rs.getString("Username"));
                Password.setText(authControll.decrypt(rs.getString("Password")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public boolean updateUser(UserModel usermodel,JTable usertable){
        try {
            String updates = "UPDATE users SET Role_id = ? , Profile = ? ,Fname = ?, Mname = ?,Lname = ?,DOB = ?,Address = ?,Contact = ?,Username = ?,Password = ? WHERE Id = '" + usermodel.getId() + "'";
            PreparedStatement st = con.prepareStatement(updates);
            st.setInt(1, usermodel.getRole_id());
            st.setString(2, usermodel.getProfile());
            st.setString(3, usermodel.getFname());
            st.setString(4, usermodel.getMname());
            st.setString(5, usermodel.getLname());
            st.setString(6, usermodel.getDOB());
            st.setString(7, usermodel.getAddress());
            st.setString(8, usermodel.getContact());
            st.setString(9, usermodel.getUsername());
            st.setString(10, authControll.encrypt(usermodel.getPassword()));

            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)usertable.getModel();
                model.setRowCount(0);
            //            new Alerts("update").setVisible(true);
            }else{
//                new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
     public boolean deleteUser(int id,JTable usertable){
        try {
            PreparedStatement st = con.prepareStatement(tanggalinAngUser);
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)usertable.getModel();
                model.setRowCount(0);
//            new Alerts("delete").setVisible(true);
            }else{
//            new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
     public void formatDate(){
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     }
     
//    private ImageIcon checkProfile(String prof){
////       JLabel profile = new JLabel();
//        ImageIcon vins=null;
//       if (prof==null) {
////        ImageIcon vins = new ImageIcon(getClass().getResource("/Images/Profile/sampleusermodel.jpg"));
////        Image kev = vins.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH);
////        ImageIcon shit = new ImageIcon(kev);
////        profile.setIcon(shit);
//        }else{
//            vins = new ImageIcon(getClass().getResource("/Images/Profile/kevin.jpg"));
////            profile.setIcon(vins);
//        }   
//       
//       return vins;
//    }
}
