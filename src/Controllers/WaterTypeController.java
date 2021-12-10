/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;



import Models.PromosModel;
import Models.WaterTypeModel;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    String baguhinAngwatertype = "UPDATE water_types SET Name = ? WHERE Id = ?";
    
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
            watertype = new WaterTypeModel(rs.getInt("Id"),rs.getString("Name"));
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
//            row[7] = test;
            model.addRow(row);
         }
    }    
       public void getWaterTypesInfo(int id,JTextField Name,JTextField PricePerGallon,JTextField PricePerBottle){
         try {
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM water_types where Id = '" + id + "' ");
          
             while(rs.next()){
                 Name.setText(rs.getString("Name"));
             }} catch (SQLException ex) {
             Logger.getLogger(PromosController.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
      public void clearWaterTypes(JTextField Name,JTextField PricePerGallon,JTextField PricePerBottle){
                 Name.setText("");
                 PricePerGallon.setText("");
                 PricePerBottle.setText("");
                 
                }
      
     public boolean addWaterTypes(WaterTypeModel watertypeModel,JTable watertypeTable){
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO `water_types`(`Name`) VALUES (?)");
            st.setString(1,watertypeModel.getName());
            
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)watertypeTable.getModel();
                model.setRowCount(0);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(WaterTypeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    } 
     
     
       public boolean updateWaterTypes(WaterTypeModel watertypeModel,JTable watertypeTable){
        try {
            PreparedStatement st = con.prepareStatement(baguhinAngwatertype);
            st.setString(1,watertypeModel.getName());
            st.setInt(2,watertypeModel.getId());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)watertypeTable.getModel();
                model.setRowCount(0);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(WaterTypeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
  
       
       public boolean deleteWaterTypes(int id,JTable watertypeTable){
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM water_types where Id = ?");
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)watertypeTable.getModel();
                model.setRowCount(0);
//            new Alerts("delete").setVisible(true);
            }else{
//            new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(WaterTypeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
    
}

