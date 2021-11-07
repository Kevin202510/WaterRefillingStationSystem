/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public class TransactionController {
    
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    
    public void fetchComboBoxValue(JComboBox customerName,JComboBox Promo_Id,JComboBox User_Id,JComboBox gallonType_Id){
        
          try {
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("SELECT * FROM `customers`");
              
              while(rs.next()){
                  customerName.addItem(rs.getString("Fname") + " " + rs.getString("Mname") + " " + rs.getString("Lname"));
              }
              
              Statement st1 = con.createStatement();
              ResultSet rs1 = st1.executeQuery("SELECT * FROM `promos`");
              
              while(rs1.next()){
                  Promo_Id.addItem(rs1.getString("Description"));
              }
              
              Statement st2 = con.createStatement();
              ResultSet rs2 = st2.executeQuery("SELECT * FROM `users`");
              
              while(rs2.next()){
                  User_Id.addItem(rs2.getString("Fname") + " " + rs2.getString("Mname") + " " + rs2.getString("Lname"));
              }
              
              Statement st3 = con.createStatement();
              ResultSet rs3 = st3.executeQuery("SELECT * FROM `gallons`");
              
              while(rs3.next()){
                  gallonType_Id.addItem(rs3.getString("Gallon_Type"));
              }
              
            } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public void addToCart(JTable transactiontable,Object[]row){
        DefaultTableModel model = (DefaultTableModel)transactiontable.getModel();
//        Object[] row = new Object[8];
//        row[0] = transactiontable.getV;
//        row[1] = "<html>"+customerlist.get(i).getFullname()+"</html> ";
//        row[2] = customerlist.get(i).getAddress();
//        row[3] = customerlist.get(i).getContact();
//        row[4] = customerlist.get(i).getisBorrowed_Gallons();
//        row[5] = customerlist.get(i).getGallon_Id();
//        row[6] = customerlist.get(i).getGallon_Quantity();
//        row[7] = customerlist.get(i).getisSuki();
////            row[7] = test;
        model.addRow(row);
    }
}
