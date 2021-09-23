/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.GallonsModel;     
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
 * @author Kevin Felix Caluag
 */
public class GallonsController {
    
    ArrayList<GallonsModel> gallonList = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgUser = "SELECT * FROM gallons";
    
    public GallonsController(){
        try {
            gallonList();
        } catch (SQLException ex) {
            Logger.getLogger(GallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<GallonsModel> gallonList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgUser);
        GallonsModel gallons;
        
        while(rs.next()){
            gallons=new GallonsModel(rs.getInt("Gallon_Code"),rs.getString("Name"),rs.getString("Size"),rs.getString("Color"),rs.getString("Gallon_Type"),rs.getInt("Supplier_id"),rs.getString("Date_delivered"),rs.getInt("Price"),rs.getInt("Stocks"));
            gallonList.add(gallons);
        }
        return gallonList;   
    }
    
//    JTable jTable1
     public void showGallons(JTable gallonsTable){
         DefaultTableModel model = (DefaultTableModel)gallonsTable.getModel();
         Object[] row = new Object[9];
         for (int i = 0; i < gallonList.size(); i++) {
//             JOptionPane.showMessageDialog(null,gallonList.get(i).getColor());
            row[0] = gallonList.get(i).getId();
            row[1] = gallonList.get(i).getName();
            row[2] = gallonList.get(i).getSize();
            row[3] = gallonList.get(i).getColor();
            row[4] = gallonList.get(i).getGallon_Type();
            row[5] = gallonList.get(i).getSupplier_id();
            row[6] = gallonList.get(i).getDate_delivered();
            row[7] = gallonList.get(i).getPrice();
            row[8] = gallonList.get(i).getStocks();
            model.addRow(row);
         }
    }
}

