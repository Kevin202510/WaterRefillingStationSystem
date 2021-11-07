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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jroundborder.JLabelRound;

/**
 *
 * @author Kevin Felix Caluag
 */
public class UsersController {
    
    String path = System.getProperty("user.dir");
    ArrayList<UserModel> userList = new ArrayList<>();
    AuthenticationController authControll = new AuthenticationController();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgUser = "SELECT * FROM users";
    String magdagdagNgUser = "INSERT INTO users(Role_id,Profile,Fname,Mname,Lname,DOB,Address,Contact,Username,Password) VALUES (?,?,?,?,?,?,?,?,?,?)";
    String tanggalinAngUser = "DELETE FROM users WHERE Id = ?";
    
    public UsersController(){
        try {
            userList();
        } catch (SQLException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void getUserLoginInfo(int role_id,String profile,int userId){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users where Id = '" + userId + "'");
            
            while(rs.next()){
                role_id = rs.getInt("Role_id");
                profile = rs.getString("Profile");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    

     public void showUsers(JTable jTable1){
        
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         Object[] newIdentifiers = new Object[8];
         jTable1.setFillsViewportHeight(true);
         jTable1.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer(jTable1));
         for (int i = 0; i < userList.size(); i++) {
            JLabel imageLabel = new JLabel();
            newIdentifiers[0] = userList.get(i).getId();
            newIdentifiers[1] = userList.get(i).getrole_displayname();
            ImageIcon imageicon = new ImageIcon(path + "/Images/Profile/"+userList.get(i).getProfile()+".jpg");
            Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(img));
            newIdentifiers[2] = imageLabel;
            newIdentifiers[3] = "<html>"+userList.get(i).getFullname()+"</html> ";
            newIdentifiers[4] = userList.get(i).getDOB();
            newIdentifiers[5] = userList.get(i).getAddress();
            newIdentifiers[6] = userList.get(i).getContact();
            newIdentifiers[7] = userList.get(i).getUsername();
            model.addRow(newIdentifiers);
         }
    }
     
     public boolean addUser(UserModel usermodel,JTable userTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgUser);
            st.setInt(1, usermodel.getRole_id());
            JOptionPane.showMessageDialog(null,usermodel.getProfile());
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
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
    public void clearUserForm(int id,JComboBox Role_id,JTextField ProfileName, JLabelRound Profile,JTextField Fname,JTextField Mname,JTextField Lname,JDateChooser DOB,
                                JTextField Address,JTextField Contact,JTextField Username,JPasswordField Password){
        Role_id.setSelectedIndex(0);
        ProfileName.setText("");
        ImageIcon imageicon = new ImageIcon(path + "/Images/Profile/sampleuser.jpg");
        Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        Profile.setIcon(new ImageIcon(img));
        Fname.setText("");
        Mname.setText("");
        Lname.setText("");
        DOB.setDate(null);
        Address.setText("");
        Contact.setText("");
        Username.setText("");
        Password.setText("");
        
    }
     public void getUserInfo(int id,JComboBox Role_id,JTextField ProfileName, JLabelRound Profile,JTextField Fname,JTextField Mname,JTextField Lname,JDateChooser DOB,
                                JTextField Address,JTextField Contact,JTextField Username,JPasswordField Password){
        String kuninAngUser = "SELECT * FROM users where Id = '" + id + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(kuninAngUser);
            ImageIcon vin = null;
            while(rs.next()){
                String prof = rs.getString("Profile");
                if (prof==null) {
                    ImageIcon vins = new ImageIcon(path + "/Images/Profile/sampleuser.jpg");
                    Image kev = vins.getImage().getScaledInstance(210, 120, Image.SCALE_SMOOTH);
                    ImageIcon shit = new ImageIcon(kev);
                    Profile.setIcon(shit);
                }else{
                    ImageIcon vins = new ImageIcon(path + "/Images/Profile/"+prof+".jpg");
                    JOptionPane.showMessageDialog(null,vins);
                    Profile.setIcon(vins);
                }
                ProfileName.setText(prof);
                Role_id.setSelectedIndex(rs.getInt("role_id")-1);
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
            JOptionPane.showMessageDialog(null,ex);
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
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
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
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
     
     public void showRoles(JComboBox roles){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `roles`");
            
            while(rs.next()){
                roles.addItem(rs.getString("Display_name"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
     }
}
