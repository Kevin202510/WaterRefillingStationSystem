/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CustomerModel;
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
 * @author ChelseaTorres
 */
public class CustomerController {
           
    
            ArrayList<CustomerModel> customerlist = new ArrayList<>();
            SQLController sql = new SQLController();
            Connection con = sql.getConnection();
    
             String kuninLahatNgCustomer = "SELECT * FROM customers";
    
    public CustomerController(){
        try {
            customerlist();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public ArrayList<CustomerModel> customerlist() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgCustomer);
        CustomerModel customers;
        
        while(rs.next()){
            customers = new CustomerModel(rs.getInt("Id"),rs.getString("Fname"),rs.getString("Lname"),rs.getString("Mname"),rs.getString("Address"),rs.getString("Contact_num"),rs.getInt("Suki"));
            customerlist.add(customers);
        }
        return customerlist;   
    }
     
     public void showCustomers(){

         for (int i = 0; i < customerlist.size(); i++) {
             JOptionPane.showMessageDialog(null,customerlist.get(i).getSuki());

         }
    }
     
     public static void main(String[] args) {
        CustomerController test = new CustomerController();
        test.showCustomers();
    }
}

