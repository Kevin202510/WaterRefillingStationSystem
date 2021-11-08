/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CustomerModel;
import Models.DeliveriesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public class TransactionController {
    
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    
    String magdagdagNgDeliveries = "INSERT INTO `deliveries`(`Customer_Id`, `Date_Order`, `Date_Delivered`, `Gallon_Id`, `Quantity`, `Promo_Id`, `Status`, `User_Id`) VALUES (?,?,?,?,?,?,?,?)";
    
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
              ResultSet rs3 = st3.executeQuery("SELECT * FROM `gallons` ORDER BY Date_Delivered");
              
              while(rs3.next()){
                  gallonType_Id.addItem(rs3.getString("Gallon_Type"));
              }
              
            } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public void addToCart(JTable transactiontable,Object[]row){
        DefaultTableModel model = (DefaultTableModel)transactiontable.getModel();
        Object[] rows = new Object[15];
            rows[0] = row[0].toString();
            rows[1] = row[1].toString();
            rows[2] = row[2].toString();
            rows[3] = row[3].toString();
            rows[4] = row[4].toString();
            rows[5] = row[5].toString();
            rows[6] = row[6].toString();
            rows[7] = row[7].toString();
            rows[8] = row[8].toString();
        model.addRow(rows);
    }
    
     public boolean addDeliveries(Object[]row,JTable deliveriesTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgDeliveries);
            st.setInt(1, Integer.parseInt(row[1].toString()));
            st.setString(2, row[2].toString());
            st.setString(3, row[3].toString());
            st.setString(4, row[4].toString());
            st.setInt(5, Integer.parseInt(row[5].toString()));
            st.setInt(6, Integer.parseInt(row[6].toString()));
            st.setInt(7, Integer.parseInt(row[7].toString()));
            st.setInt(8, Integer.parseInt(row[8].toString()));
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
                model.setRowCount(0);
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
}
