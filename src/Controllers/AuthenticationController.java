/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.DashboardsAndButtons.MainDashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Felix Caluag
 */
public class AuthenticationController {
    
    JFrame frametoClose = new JFrame(); 
    SQLController sql = new SQLController();
        
    public String decrypt(String str){
	String storen2 = "";
		
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
		
            int asci = (int)c - 5;
	    storen2 += (char) asci;
        }
        return storen2;
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
    
    public void authenticationLogin(String authUsername,String authPassword){
        try {
            Connection con = sql.getConnection();
            String tanong = "Select * from users INNER JOIN roles ON users.Role_id = roles.Role_id where Username= ? AND Password= ?";
            PreparedStatement st = con.prepareStatement(tanong);
            st.setString(1,authUsername);
            st.setString(2,encrypt(authPassword));
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                frametoClose.dispose();
                new MainDashboard(rs.getInt("users.Id")).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(frametoClose,"Username And Password is Incorrect ! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthenticationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void checkField(JFrame frame,JTextField authUsername,JPasswordField authPassword){
        String alertMessage = "You Cannot Leave The Field Empty";
        if (authUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,alertMessage);
            authUsername.requestFocusInWindow();
        }else if (authPassword.getPassword().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null,alertMessage);
            authPassword.requestFocusInWindow();
        }else{
            this.frametoClose = frame;
            authenticationLogin(authUsername.getText(),String.valueOf(authPassword.getPassword()));
        }
    }
}
