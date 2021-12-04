/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.PromosModel;
import Models.Transactions_LogsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    String magdagdagngTransactions_Logs = "INSERT INTO `transactions_logs`(`Transaction_Id`, `Total_Amount`,balance, `paymentStatus`, `Transaction_Date`, `Transaction_Time`) VALUES (?,?,?,?,?,?)";
    String kuninLahatNgTransactions_logsWithJoinTable = "SELECT * FROM transactions_logs LEFT JOIN transactions ON transactions_logs.Transaction_Id = transactions.Transaction_Id " +
                                                        "LEFT JOIN customers ON transactions.Customer_Id = customers.ID LEFT JOIN water_types on transactions.watertype_Id = water_types.Id " +
                                                        "LEFT JOIN gallons ON transactions.Gallon_Id = gallons.Code LEFT JOIN promos ON transactions.Promo_Id = promos.Id " +
                                                        "LEFT JOIN users ON transactions.User_Id = users.Id";
    
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
            transactionlog = new Transactions_LogsModel(rs.getInt("ID"),rs.getInt("Transaction_Id"),rs.getDouble("Total_Amount"),rs.getDouble("balance"),rs.getInt("paymentStatus"),rs.getString("Transaction_Date"),rs.getString("Transaction_Time"));
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
         Object[] row = new Object[11];
         for (int i = 0; i < transactionslogslist.size(); i++) {
            row[0] = transactionslogslist.get(i).getID();
            row[1] = transactionslogsListwithjointable.get(i).getCustomer_Fullname();
            row[2] = transactionslogsListwithjointable.get(i).getGallon_Name();
            row[3] = transactionslogsListwithjointable.get(i).getGallon_Quantity();
            row[4] = transactionslogsListwithjointable.get(i).getPromoName();
            row[5] = transactionslogsListwithjointable.get(i).getServiceTypeVal();
            row[6] = transactionslogslist.get(i).getTotalAmount();
            row[7] = transactionslogslist.get(i).getBalance();
            row[8] = transactionslogslist.get(i).getTransaction_Date();
            row[9] = transactionslogslist.get(i).getTransaction_Time();
            row[10] = transactionslogslist.get(i).getpaymentStatVal();
            model.addRow(row);
         }
    }
    
    public void addTransactionLogs(Transactions_LogsModel transactionlogsModel){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagngTransactions_Logs);
            st.setInt(1,transactionlogsModel.getTransactions_Id());
            st.setDouble(2,transactionlogsModel.getTotalAmount());
            st.setDouble(3,transactionlogsModel.getBalance());
            st.setInt(4,transactionlogsModel.getPaymentStatus());
            st.setString(5,transactionlogsModel.getTransaction_Date());
            st.setString(6,transactionlogsModel.getTransaction_Time()); 
            
            int i = st.executeUpdate();
//            if (i > 0) {
//                DefaultTableModel model = (DefaultTableModel)watertypeTable.getModel();
//                model.setRowCount(0);
//            } else {
////                new Alerts("error").setVisible(true);
////                return false;
//            }
        } catch (SQLException ex) {
            Logger.getLogger(WaterTypeController.class.getName()).log(Level.SEVERE, null, ex);
        }
//        return true;
    }
}