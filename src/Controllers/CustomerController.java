/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CustomerModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author ChelseaTorres
 */
public class CustomerController {
           
    
            ArrayList<CustomerModel> customerlist = new ArrayList<>();
            SQLController sql = new SQLController();
            Connection con = sql.getConnection();
    
             String kuninLahatNgCustomer = "SELECT * FROM customers";
             String magdagdagNgCustomer = "INSERT INTO customers(Fname,Mname,Lname,Address,Contact,isBorrowed_Gallons,Gallon_Id,Gallon_Quantity,isSuki) VALUES (?,?,?,?,?,?,?,?,?)";
             String tanggalinAngCustomer = "DELETE FROM customers WHERE ID = ?";
             
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
            customers = new CustomerModel(rs.getInt("ID"),rs.getString("Fname"),rs.getString("Mname"),rs.getString("Lname"),rs.getString("Address"),rs.getString("Contact"),rs.getInt("isSuki"));
            customerlist.add(customers);    
        }
        return customerlist;   
    }
     
     public void showCustomers(JTable customerTable){
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < customerlist.size(); i++) {
            row[0] = customerlist.get(i).getID();
            row[1] = "<html>"+customerlist.get(i).getFullname()+"</html> ";
            row[2] = customerlist.get(i).getAddress();
            row[3] = customerlist.get(i).getContact();
            row[7] = customerlist.get(i).getisSuki();
//            row[7] = test;
            model.addRow(row);
         }
    }
     
      public boolean addCustomer(CustomerModel customermodel,JTable customersTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgCustomer);
            st.setString(1, customermodel.getFname());
            st.setString(2, customermodel.getMname());
            st.setString(3, customermodel.getLname());
            st.setString(4, customermodel.getAddress());
            st.setString(5, customermodel.getContact());
//            JOptionPane.showMessageDialog(null,customermodel.getGallon_Id());
            st.setInt(9, customermodel.getSuki());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)customersTable.getModel();
                model.setRowCount(0);
//                userList();
//                showUsers(userTable);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
      
       public void getCustomerInfo(int id,JTextField Fname,JTextField Mname,JTextField Lname,
                                JTextField Address,JTextField Contact,JComboBox isBorrowed_Gallons,JComboBox Gallon_Id,JTextField Gallon_Quantity,JComboBox isSuki){
        String kuninAngCustomer = "SELECT * FROM customers where ID = '" + id + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(kuninAngCustomer);
            while(rs.next()){
                Fname.setText(rs.getString("Fname"));
                Mname.setText(rs.getString("Mname"));
                Lname.setText(rs.getString("Lname"));
                Address.setText(rs.getString("Address"));
                Contact.setText(rs.getString("Contact"));
                isBorrowed_Gallons.setSelectedIndex(rs.getInt("isBorrowed_Gallons")-1);
                Gallon_Id.setSelectedIndex(rs.getInt("Gallon_Id")-1);
                Gallon_Quantity.setText(String.valueOf(rs.getInt("Gallon_Quantity")));
                isSuki.setSelectedIndex(rs.getInt("isSuki")-1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       
       public boolean updateCustomer(CustomerModel customermodel,JTable customertable){
        try {
            String updates = "UPDATE customers SET Fname = ?, Mname = ?,Lname = ?,Address = ?,Contact = ?,isBorrowed_Gallons = ?,Gallon_Id = ?,Gallon_Quantity = ?,isSuki = ? WHERE ID = '" + customermodel.getID() + "'";
            PreparedStatement st = con.prepareStatement(updates);
            st.setString(1, customermodel.getFname());
            st.setString(2, customermodel.getMname());
            st.setString(3, customermodel.getLname());
            st.setString(4, customermodel.getAddress());
            st.setString(5, customermodel.getContact());
            st.setInt(9, customermodel.getSuki());
           
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)customertable.getModel();
                model.setRowCount(0);
            //            new Alerts("update").setVisible(true);
            }else{
//                new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
        public boolean deleteCustomer(int id,JTable customertable){
        try {
            PreparedStatement st = con.prepareStatement(tanggalinAngCustomer);
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)customertable.getModel();
                model.setRowCount(0);
//            new Alerts("delete").setVisible(true);
            }else{
//            new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
         public void showGallonId(JComboBox gallons){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `gallons`");
            
            while(rs.next()){
                gallons.addItem(rs.getString("Name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     
}

