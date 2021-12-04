/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CustomerModel;
import Models.DeliveriesModel;
import Models.TransactionsModel;
import Models.Transactions_LogsModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
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
    public ArrayList<TransactionsModel> transactionslist = new ArrayList<>();
    public ArrayList<TransactionsModel> transactionslists = new ArrayList<>();
    public ArrayList<Transactions_LogsModel> transactionslistss = new ArrayList<>();
    
    String magdagdagNgTransactions = "INSERT INTO `transactions`(`Transaction_Id`,`Customer_Id`, `DOorDR`, `DDorDP`, `watertype_Id`, `Gallon_Id`, `Quantity`,`isBorrowed_Gallons`, `Promo_Id`, `ServiceType`, `Status`, `User_Id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    
//    public TransactionController(){
//        try {
//            transactionsListDataId();
//        } catch (SQLException ex) {
//            Logger.getLogger(TransactionController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public void fetchComboBoxValue(JComboBox customerName,JComboBox Promo_Id,JComboBox waterType_Id,JComboBox gallonType_Id){
        
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
              ResultSet rs2 = st2.executeQuery("SELECT * FROM `water_types`");
              
              while(rs2.next()){
                  waterType_Id.addItem(rs2.getString("Name"));
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
            rows[9] = row[9].toString();
            rows[10] = row[10].toString();
        model.addRow(rows);
    }
    
    
    public ArrayList<TransactionsModel> supplierList(int transactionId,int Customer_Id, String DOorDR, String DDorDP,double salePrice,int waterType,String Gallon_Id, int Quantity, int Promo_Id, int ServiceType, int Status, int User_Id){
        TransactionsModel transactionmodel;
            transactionmodel = new TransactionsModel(transactionId,Customer_Id,DOorDR,DDorDP,salePrice,waterType,Gallon_Id,Quantity,Promo_Id,ServiceType,Status,User_Id);
//            JOptionPane.showMessageDialog(null,ID);
            transactionslist.add(transactionmodel);
        return transactionslist;   
    }
    
    public ArrayList<TransactionsModel> trasactionList(int isBorrowedGallons){
        TransactionsModel transacmod;
        transacmod = new TransactionsModel(isBorrowedGallons);
        transactionslists.add(transacmod);
        
        return transactionslists;
    }
    
//     public ArrayList<TransactionsModel> trasactionLisst(double totalAmount,int paymentOption){
//        TransactionsModel transacmod;
//        transacmod = new TransactionsModel(totalAmount,paymentOption);
//        
//        transactionslistss.add(transacmod);
//        
//        return transactionslistss;
//    }
    
    
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
    
    public String getDateFormat(String datetoFormat){
        DateFormat  formatter = new SimpleDateFormat("yyyy-MM-dd");
        String  date = null;
        Date ddate = new Date(datetoFormat);
        date = formatter.format(ddate);
        return date;
    }
    
     public void addDeliveries(JTable cartTable){
         try {
             PreparedStatement st = con.prepareStatement(magdagdagNgTransactions);
             for (int i = 0; i < transactionslist.size(); i++) {
                st.setInt(1, transactionslist.get(i).gettransactionId());
                st.setInt(2, transactionslist.get(i).getCustomer_Id());
                st.setString(3, getDateFormat(transactionslist.get(i).getDDorDR()));
                st.setString(4, getDateFormat(transactionslist.get(i).getDDorDP()));
                st.setInt(5, transactionslist.get(i).getwaterType());
                st.setString(6, transactionslist.get(i).getGallonCode());
                st.setInt(7, transactionslist.get(i).getQuantity());
                st.setInt(8, transactionslists.get(i).isBorrowed_Gallons());
                 if (transactionslists.get(i).isBorrowed_Gallons()==1) {
                     minusGallonStocks(transactionslist.get(i).getGallonCode(),transactionslist.get(i).getQuantity());
                 }
                if(transactionslist.get(i).getPromo_Id()==0){
                    st.setNull(9, java.sql.Types.INTEGER);
                }else{
                    st.setInt(9, transactionslist.get(i).getPromo_Id());
                }
                st.setInt(10, transactionslist.get(i).getServiceType());
                st.setInt(11, transactionslist.get(i).getStatus());
                st.setInt(12, transactionslist.get(i).getUser_Id());
                st.executeUpdate();
                if (i == transactionslist.size()-1) {
                    DefaultTableModel model = (DefaultTableModel)cartTable.getModel();
                    model.setRowCount(0);
                }
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
//        return true;
        
     }
     
     public void minusGallonStocks(String gallonCode,int quant){
        try {
            int stocks=0;
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from gallons where Code = " + gallonCode);
                
                while(rs.next()){
                    stocks = rs.getInt("Stocks");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TransactionController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            PreparedStatement sts = con.prepareStatement("UPDATE gallons SET Stocks = ? where Code = ?");
            sts.setInt(1, stocks - quant);
            sts.setString(2, gallonCode);
            
            int i = sts.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TransactionController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     
     public void insertTLModel(double totalAmount,int PaymentStatus,double balance){
//         for (int i = 0; i < transactionslist.size(); i++) {
            Transactions_LogsModel transactionlogsModel = new Transactions_LogsModel(0,transactionslist.get(transactionslist.size()-1).gettransactionId(),totalAmount,balance,PaymentStatus,getDateNow(),getTimeNow());
            Transaction_LogsController tlc = new Transaction_LogsController();
            tlc.addTransactionLogs(transactionlogsModel);
//         }
        transactionslist.clear();
        transactionslists.clear();
    }
}
