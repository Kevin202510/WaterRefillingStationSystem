/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;



import Models.WaterTypeModel;
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
 * @author Tricia Gadiaza
 */
public class WaterTypeController {
     ArrayList<WaterTypeModel> watertypelist = new ArrayList<>();
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    
    String kuninLahatNgWaterType = "SELECT * FROM water_types";
    
     public WaterTypeController(){
        try {
            watertypeList();
        } catch (SQLException ex) {
            Logger.getLogger(PromosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
     public ArrayList<WaterTypeModel> watertypeList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgWaterType);
        WaterTypeModel watertype;
        
        while(rs.next()){
            watertype = new WaterTypeModel(rs.getInt("Id"),rs.getString("Name"),rs.getDouble("PricePerGallon"),rs.getDouble("PricePerBottle"));
            watertypelist.add(watertype);
        }
        return watertypelist;   
    }
     public void showWaterType(JTable watertypeTable){

         DefaultTableModel model = (DefaultTableModel)watertypeTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < watertypelist.size(); i++) {
            row[0] = watertypelist.get(i).getId();
            row[1] = watertypelist.get(i).getName();
            row[2] = watertypelist.get(i).getPricePerGallon();
            row[3] = watertypelist.get(i).getPricePerBottle();
//            row[7] = test;
            model.addRow(row);
         }
    }    
    
}
