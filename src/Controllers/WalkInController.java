/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.DeliveriesModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public class WalkInController {
    
    ArrayList<DeliveriesModel> deliveriesList = new ArrayList<>();
    ArrayList<DeliveriesModel> deliveriesListwithjointable = new ArrayList<>();
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    String kuninLahatNgWalkInWithJoinTable = "SELECT * FROM `transactions` LEFT JOIN customers ON customers.ID = transactions.Customer_Id " +
                                            "LEFT JOIN gallons ON gallons.Code = transactions.Gallon_Id LEFT JOIN promos ON promos.Id = transactions.Promo_Id " +
                                            "LEFT JOIN users ON users.Id = transactions.User_Id " +
                                            "WHERE transactions.Status = 0 AND transactions.ServiceType = 0";
    
    public WalkInController(){
        try {
            deliveriesList();
            deliveriesListWithJoinTable();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<DeliveriesModel> deliveriesList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgWalkInWithJoinTable);
        DeliveriesModel deliveries;
        
        while(rs.next()){
            deliveries = new DeliveriesModel(rs.getInt("Id"),rs.getInt("transactions.Customer_Id"),rs.getString("transactions.DOorDR"),rs.getString("transactions.DDorDP"),rs.getString("transactions.Gallon_Id"),rs.getInt("transactions.Quantity"),rs.getInt("transactions.Promo_Id"),rs.getInt("transactions.Status"),rs.getInt("transactions.User_Id"));
            deliveriesList.add(deliveries);
        }
        return deliveriesList;   
    }
      
    public ArrayList<DeliveriesModel> deliveriesListWithJoinTable() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgWalkInWithJoinTable);
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
    
}
