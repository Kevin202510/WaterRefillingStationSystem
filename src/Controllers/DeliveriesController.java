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
import javax.swing.JOptionPane;

/**
 *
 * @author KevinCaluag
 */
public final class DeliveriesController {
      ArrayList<DeliveriesModel> deliveriesList = new ArrayList<>();
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    

    
    String kuninLahatNgSupplier = "SELECT * FROM deliveries";
   
    public DeliveriesController(){
        try {
            deliveriesList();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public ArrayList<DeliveriesModel> deliveriesList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgSupplier);
        DeliveriesModel deliveries;
        
        while(rs.next()){
            deliveries = new DeliveriesModel(rs.getInt("Id"),rs.getInt("Customer_Id"),rs.getString("Date_Delivered"),rs.getInt("Quantity"),rs.getInt("Promo_Id"),rs.getInt("Status"),rs.getInt("User_Id"));
            deliveriesList.add(deliveries);
        }
        return deliveriesList;   
    }
       public void showDeliveries(){

         for (int i = 0; i < deliveriesList.size(); i++) {
             JOptionPane.showMessageDialog(null,deliveriesList.get(i).getDate_Delivered());

         }
    }
       public static void main(String[] args) {
        DeliveriesController test = new DeliveriesController();
        test.showDeliveries();
    }
    
}
