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
    String kuninLahatNgTransactions_logsWithJoinTable = "SELECT * FROM `transactions_logs` LEFT JOIN customers ON customers.ID = transactions_logs.Customer_Id LEFT JOIN gallons ON gallons.Code = transactions_logs.Gallon_Id\n" +
                                                  "LEFT JOIN promos on promos.Id = transactions_logs.Promo_Id LEFT JOIN users on users.Id = transactions_logs.User_Id";
    
     public ArrayList<Transactions_LogsModel> transactionslogsList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgTransactions_logs);
        Transactions_LogsModel transactionlog;
        
        while(rs.next()){
            transactionlog = new Transactions_LogsModel(rs.getInt("ID"),rs.getInt("Customer_Id"),rs.getInt("Gallon_Id"),rs.getInt("Gallon_Quantity"),rs.getInt("Total_Amount"),rs.getInt("Status"),rs.getInt("User_Id"),rs.getString("Transaction_Date"),rs.getString("Transaction_Time"));
            transactionslogslist.add(transactionlog);
        }
        return transactionslogslist;   
    }
      public ArrayList<Transactions_LogsModel> transactions_logsListWithJoinTable() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgTransactions_logsWithJoinTable);
        Transactions_LogsModel transactionlog;
        
        while(rs.next()){
            transactionlog = new Transactions_LogsModel(rs.getString("customers.Fname"),rs.getString("customers.Mname"),rs.getString("customers.Lname"),rs.getString("Gallon_Type"),rs.getString("users.Fname"),rs.getString("users.Mname"),rs.getString("users.Lname"));
            transactionslogsListwithjointable.add(transactionlog);
        }
        return transactionslogsListwithjointable;   
    } 
      
    public void showTransaction_Logs(JTable customerTable){
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < transactionslogslist.size(); i++) {
            row[0] = transactionslogslist.get(i).getID();
            row[1] = transactionslogslist.get(i).getCustomer_Id();
            row[2] = transactionslogslist.get(i).getGallon_Id();
            row[3] = transactionslogslist.get(i).getGallon_Quantity();
            row[4] = transactionslogslist.get(i).getTotal_Amount();
            row[5] = transactionslogslist.get(i).getStatus();
            row[6] = transactionslogslist.get(i).getUser_Id();
            row[7] = transactionslogslist.get(i).getTransaction_Date();
            row[8] = transactionslogslist.get(i).getTransaction_Time();
       
            model.addRow(row);
         }
    }
}
