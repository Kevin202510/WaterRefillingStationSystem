/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.DeliveriesModel;
import Models.WalkinModel;
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
    
    ArrayList<WalkinModel> deliveriesList = new ArrayList<>();
    ArrayList<WalkinModel> deliveriesListwithjointable = new ArrayList<>();
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    String kuninLahatNgWalkInWithJoinTable = "SELECT * FROM `transactions` LEFT JOIN customers ON customers.ID = transactions.Customer_Id LEFT JOIN gallons ON gallons.Code= transactions.Gallon_Id LEFT JOIN promos ON promos.Id = transactions.Promo_Id LEFT JOIN users ON users.Id = transactions.User_Id\n" +
                                             "WHERE transactions.ServiceType = 0 AND (transactions.Status = 0 OR transactions.Status = 3);";
    
    public WalkInController(){
        try {
            deliveriesList();
            deliveriesListWithJoinTable();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<WalkinModel> deliveriesList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgWalkInWithJoinTable);
        WalkinModel walkinmodel;
        
        while(rs.next()){
            walkinmodel = new WalkinModel(rs.getInt("Id"),rs.getInt("transactions.Customer_Id"),rs.getString("transactions.DOorDR"),rs.getString("transactions.DDorDP"),rs.getString("transactions.Gallon_Id"),rs.getInt("transactions.Quantity"),rs.getInt("transactions.Promo_Id"),rs.getInt("transactions.Status"),rs.getInt("transactions.User_Id"));
            deliveriesList.add(walkinmodel);
        }
        return deliveriesList;   
    }
      
    public ArrayList<WalkinModel> deliveriesListWithJoinTable() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgWalkInWithJoinTable);
        WalkinModel walkinmodel;
        
        while(rs.next()){
            walkinmodel = new WalkinModel(rs.getString("customers.Fname"),rs.getString("customers.Mname"),rs.getString("customers.Lname"),rs.getString("customers.Address"),rs.getString("Gallon_Type"),rs.getString("promos.Name"),rs.getString("users.Fname"),rs.getString("users.Mname"),rs.getString("users.Lname"));
            deliveriesListwithjointable.add(walkinmodel);
        }
        return deliveriesListwithjointable;   
    }  
    
    public void showWalkin(JTable deliveriesTable){
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
         row[8] = deliveriesListwithjointable.get(i).getCustomerAddress();
         model.addRow(row);
      }
    }
    
}
