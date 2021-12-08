/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.DeliveriesModel;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public final class DeliveriesController {
    ArrayList<DeliveriesModel> deliveriesList = new ArrayList<>();
    ArrayList<DeliveriesModel> deliveriesListwithjointable = new ArrayList<>();
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    

    
    String kuninLahatNgDeliveries = "SELECT * FROM deliveries";
    String kuninLahatNgDeliveriesWithJoinTable = "SELECT * FROM `transactions` LEFT JOIN customers ON customers.ID = transactions.Customer_Id " +
                                                "LEFT JOIN gallons ON gallons.Code = transactions.Gallon_Id LEFT JOIN promos ON promos.Id = transactions.Promo_Id " +
                                                "LEFT JOIN users ON users.Id = transactions.User_Id " +
                                                "WHERE transactions.Status = 0 AND transactions.ServiceType = 1";
    String magdagdagNgDeliveries = "INSERT INTO `deliveries`(`Customer_Id`, `Date_Delivered`, `Quantity`, `Promo_Id`, `Status`, `User_Id`) VALUES (?,?,?,?,?,?)";
   
    public DeliveriesController(){
        try {
            deliveriesList();
            deliveriesListWithJoinTable();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean updateDeliveries(DeliveriesModel deliveriesModel,JTable deliveriesTable){
          try {
              String updates = "UPDATE transactions SET Status = ? WHERE ID = " + deliveriesModel.getId();
              PreparedStatement st = con.prepareStatement(updates);
              st.setInt(1, deliveriesModel.getStatus());
              JOptionPane.showMessageDialog(null,deliveriesModel.getStatus());
              int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
              
              
          } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
          return true;
    }
    
    public boolean updateWalkIn(DeliveriesModel deliveriesModel,JTable deliveriesTable){
          try {
              String updates = "UPDATE transactions SET Status = ? WHERE ID = " + deliveriesModel.getId();
              PreparedStatement st = con.prepareStatement(updates);
              st.setInt(1, deliveriesModel.getStatus());
              JOptionPane.showMessageDialog(null,deliveriesModel.getStatus());
              int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
              
              
          } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
          return true;
    }
    
    public Date getDateNow(){
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyy");  
        String strDates = dateFormat.format(date);
        Date strDate = null;
          try {
              strDate = dateFormat.parse(strDates);
          } catch (ParseException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
//        String strDate = dateFormat.format(date);
        return strDate;
     }
    
      public ArrayList<DeliveriesModel> deliveriesList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgDeliveriesWithJoinTable);
        DeliveriesModel deliveries;
        
        while(rs.next()){
            deliveries = new DeliveriesModel(rs.getInt("Id"),rs.getInt("transactions.Customer_Id"),rs.getString("transactions.DOorDR"),rs.getString("transactions.DDorDP"),rs.getString("transactions.Gallon_Id"),rs.getInt("transactions.Quantity"),rs.getInt("transactions.Promo_Id"),rs.getInt("transactions.Status"),rs.getInt("transactions.User_Id"));
            deliveriesList.add(deliveries);
        }
        return deliveriesList;   
    }
      
    public ArrayList<DeliveriesModel> deliveriesListWithJoinTable() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgDeliveriesWithJoinTable);
        DeliveriesModel deliveries;
        
        while(rs.next()){
            deliveries = new DeliveriesModel(rs.getString("customers.Fname"),rs.getString("customers.Mname"),rs.getString("customers.Lname"),rs.getString("Gallon_Type"),rs.getString("promos.Name"),rs.getString("users.Fname"),rs.getString("users.Mname"),rs.getString("users.Lname"));
            deliveriesListwithjointable.add(deliveries);
        }
        return deliveriesListwithjointable;   
    }  
    
    public void showDeliveries(JTable deliveriesTable){
      DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
      Object[] row = new Object[9];
      for (int i = 0; i < deliveriesListwithjointable.size(); i++) {
         row[0] = deliveriesList.get(i).getId();
         row[1] = deliveriesListwithjointable.get(i).getCustomer_Fullname();
         row[2] = deliveriesList.get(i).getDate_Order();
         row[3] = deliveriesList.get(i).getDate_Delivered();
         row[4] = deliveriesListwithjointable.get(i).getGallon_Name();
         row[5] = deliveriesList.get(i).getQuantity();
         row[6] = deliveriesListwithjointable.get(i).getPromo_Description();
         row[7] = deliveriesList.get(i).getStat();
         row[8] = deliveriesListwithjointable.get(i).getUser_Fullname();
         model.addRow(row);
      }
    }
       
    public boolean addDeliveries(DeliveriesModel deliveriesModel,JTable deliveriesTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgDeliveries);
            st.setInt(1, deliveriesModel.getCustomer_Id());
            st.setString(2,deliveriesModel.getDate_Delivered());
            st.setInt(3, deliveriesModel.getQuantity());
            st.setInt(4, deliveriesModel.getPromo_Id());
            st.setInt(5, deliveriesModel.getStatus());
            st.setInt(6, deliveriesModel.getUser_Id());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
                model.setRowCount(0);
//                userList();
//                showUsers(userTable);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
       
    public void getDeliveriesInfo(int id,JComboBox Customer_Id,JDateChooser Date_Order,JDateChooser Date_Delivered,JSpinner Quantity,JComboBox Promo_Id,JComboBox Status,JComboBox User_Id){
          try {
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("SELECT * FROM `transactions` LEFT JOIN customers ON customers.ID = transactions.Customer_Id " +
                                            "LEFT JOIN gallons ON gallons.Code = transactions.Gallon_Id LEFT JOIN promos ON promos.Id = transactions.Promo_Id " +
                                            "LEFT JOIN users ON users.Id = transactions.User_Id " +
                                            "WHERE transactions.Id = '"+id+"'");
              
              while(rs.next()){
                  Customer_Id.setSelectedItem(rs.getString("customers.Fname") + " " + rs.getString("customers.Mname") + " " + rs.getString("customers.Lname"));
                  Date_Delivered.setDate(rs.getDate("transactions.DDorDP"));
                  Date_Order.setDate(rs.getDate("transactions.DOorDR"));
                  Quantity.setValue(rs.getInt("transactions.Quantity"));
                  Promo_Id.setSelectedItem(rs.getString("promos.Description"));
                  Status.setSelectedIndex(rs.getInt("transactions.Status"));
                  User_Id.setSelectedItem(rs.getString("users.Fname") + " " + rs.getString("users.Mname") + " " + rs.getString("users.Lname") );
              } } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
       
    public void fetchComboBoxValue(JComboBox customerName,JComboBox Promo_Id,JComboBox User_Id,JComboBox Gallon_Id){
        
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
                  Gallon_Id.addItem(rs3.getString("Gallon_Type"));
              }
              
            } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    public boolean deleteUser(int id,JTable deliveriesTable){
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM deliveries where Id = ?");
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
                model.setRowCount(0);
//            new Alerts("delete").setVisible(true);
            }else{
//            new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
    
}
