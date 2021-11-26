/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CustomerModel;
import Models.DeliveriesModel;
import Models.TransactionsModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
    ArrayList<TransactionsModel> transactionslist = new ArrayList<>();
    
    String magdagdagNgTransactions = "INSERT INTO `transactions`(`Customer_Id`, `DOorDR`, `DDorDP`, `Gallon_Id`, `Quantity`, `Promo_Id`, `ServiceType`, `Status`, `User_Id`) VALUES (?,?,?,?,?,?,?,?,?)";
    
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
    
    
    public ArrayList<TransactionsModel> supplierList(int Customer_Id, String DOorDR, String DDorDP, String Gallon_Id, int Quantity, int Promo_Id, int ServiceType, int Status, int User_Id){
        TransactionsModel transactionmodel;
            transactionmodel = new TransactionsModel(Customer_Id,DOorDR,DDorDP,Gallon_Id,Quantity,Promo_Id,ServiceType,Status,User_Id);
            transactionslist.add(transactionmodel);
        return transactionslist;   
    }
    
    
    public void deleteDataFromCart(int selectedrow,JTable cartTable){
        DefaultTableModel model = (DefaultTableModel)cartTable.getModel();
        int option = JOptionPane.showConfirmDialog(null,"Do You Want To Remove It ?");
        if(option==0){
            model.removeRow(cartTable.getSelectedRow());
        }
    }
    
    public String getDateNow(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();
        String dateNow = dtf.format(now).toString();
        return dateNow;
    }
    
    public String getTimeNow(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String timeNow = dtf.format(now).toString();
        return timeNow;
    }
    
    public static void main(String[] args) {
        TransactionController tt = new TransactionController();
        JOptionPane.showMessageDialog(null,tt.getDateNow());
        JOptionPane.showMessageDialog(null,tt.getTimeNow());
    }
    
     public void addDeliveries(JTable cartTable){
         try {
             PreparedStatement st = con.prepareStatement(magdagdagNgTransactions);
             JOptionPane.showMessageDialog(null,transactionslist.size());
             for (int i = 0; i < transactionslist.size(); i++) {
                st.setInt(1, transactionslist.get(i).getCustomer_Id());
                st.setString(2, "2021-11-26");
                st.setString(3, "2021-11-26");
                st.setString(4, transactionslist.get(i).getGallonCode());
                st.setInt(5, transactionslist.get(i).getQuantity());
                st.setInt(6, transactionslist.get(i).getPromo_Id());
                st.setInt(7, transactionslist.get(i).getServiceType());
                st.setInt(8, transactionslist.get(i).getStatus());
                st.setInt(9, transactionslist.get(i).getUser_Id());
                st.executeUpdate();
                if (i == transactionslist.size()-1) {
                    DefaultTableModel model = (DefaultTableModel)cartTable.getModel();
                    model.setRowCount(0);
                    transactionslist.clear();
                }
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
//        return true;
        
     }
}
