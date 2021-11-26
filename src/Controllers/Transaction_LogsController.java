/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.PromosModel;
import Models.Transactions_LogsModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public class Transaction_LogsController {
   
     ArrayList<Transactions_LogsModel> transactionslogslist = new ArrayList<>();
     ArrayList<Transactions_LogsModel> transactionslogsListwithjointable = new ArrayList<>();
     SQLController sql = new SQLController();
     Connection con = sql.getConnection();
    

    String kuninLahatNgTransactions_logs= "SELECT * FROM transactions_logs";
    String kuninLahatNgTransactions_logsWithJoinTable = "SELECT * FROM `transactions_logs` LEFT JOIN transactions ON transactions_logs.Transaction_Id = transactions.ID " +
                                                        "LEFT JOIN customers ON transactions.Customer_Id = customers.ID LEFT JOIN gallons ON transactions.Gallon_Id = gallons.Code " +
                                                        "LEFT JOIN promos ON transactions.Promo_Id = promos.Id LEFT JOIN users ON transactions.User_Id = users.Id;";
    
    public Transaction_LogsController(){
         try {
             transactionslogsList();
             transactions_logsListWithJoinTable();
         } catch (SQLException ex) {
             Logger.getLogger(Transaction_LogsController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
     public ArrayList<Transactions_LogsModel> transactionslogsList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgTransactions_logs);
        Transactions_LogsModel transactionlog;
        
        while(rs.next()){
            transactionlog = new Transactions_LogsModel(rs.getInt("ID"),rs.getInt("Total_Amount"),rs.getString("Transaction_Date"),rs.getString("Transaction_Time"));
            transactionslogslist.add(transactionlog);
        }
        return transactionslogslist;   
    }
      public ArrayList<Transactions_LogsModel> transactions_logsListWithJoinTable() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgTransactions_logsWithJoinTable);
        Transactions_LogsModel transactionlog;
        
        while(rs.next()){
            transactionlog = new Transactions_LogsModel(rs.getString("customers.Fname"),rs.getString("customers.Mname"),rs.getString("customers.Lname"),rs.getString("Gallon_Type"),rs.getInt("Quantity"),rs.getInt("transactions.Status"),rs.getString("promos.Name"),rs.getInt("ServiceType"),rs.getString("users.Fname"),rs.getString("users.Mname"),rs.getString("users.Lname"));
            transactionslogsListwithjointable.add(transactionlog);
        }
        return transactionslogsListwithjointable;   
    } 
      
    public void showTransaction_Logs(JTable customerTable){
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[10];
         for (int i = 0; i < transactionslogslist.size(); i++) {
            row[0] = transactionslogslist.get(i).getID();
            row[1] = transactionslogsListwithjointable.get(i).getCustomer_Fullname();
            row[2] = transactionslogsListwithjointable.get(i).getGallon_Name();
            row[3] = transactionslogsListwithjointable.get(i).getGallon_Quantity();
            row[4] = transactionslogsListwithjointable.get(i).getPromoName();
            row[5] = transactionslogsListwithjointable.get(i).getServiceType();
            row[6] = transactionslogsListwithjointable.get(i).getStatus();
            row[7] = transactionslogslist.get(i).getTotal_Amount();
            row[8] = transactionslogslist.get(i).getTransaction_Date();
            row[9] = transactionslogslist.get(i).getTransaction_Time();
            model.addRow(row);
         }
    }
}