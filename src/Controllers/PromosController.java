/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.PromosModel;
import com.toedter.calendar.JDateChooser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author KevinCaluag
 */
public final class PromosController {
     ArrayList<PromosModel> promosList = new ArrayList<>();
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    

    
    String kuninLahatNgSupplier = "SELECT * FROM promos";
   
    public PromosController(){
        try {
            promosList();
        } catch (SQLException ex) {
            Logger.getLogger(PromosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public ArrayList<PromosModel> promosList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgSupplier);
        PromosModel promos;
        
        while(rs.next()){
            promos = new PromosModel(rs.getInt("Id"),rs.getString("Name"),rs.getString("Description"),rs.getString("Date_Started"),rs.getString("Date_End"));
            promosList.add(promos);
        }
        return promosList;   
    }
     public void showPromos(JTable promosTable){

         DefaultTableModel model = (DefaultTableModel)promosTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < promosList.size(); i++) {
            row[0] = promosList.get(i).getId();
            row[1] = promosList.get(i).getName();
            row[2] = promosList.get(i).getDescription();
            row[3] = promosList.get(i).getDate_Started();
            row[4] = promosList.get(i).getDate_End();
//            row[7] = test;
            model.addRow(row);
         }
    }
     
     public void getPromosInfo(int id,JTextField Name,JTextArea Description,JDateChooser Date_Started,JDateChooser Date_End){
         try {
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM promos where Id = '" + id + "' ");
          
             while(rs.next()){
                 Name.setText(rs.getString("Name"));
                 Description.setText(rs.getString("Description"));
                 Date_Started.setDate(rs.getDate("Date_Started"));
                 Date_End.setDate(rs.getDate("Date_End"));
             }} catch (SQLException ex) {
             Logger.getLogger(PromosController.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
    public boolean addPromos(PromosModel promosModel,JTable promosTable){
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO `promos`(`Name`, `Description`, `Date_Started`, `Date_End`) VALUES (?,?,?,?)");
            st.setString(1,promosModel.getName());
            st.setString(2,promosModel.getDescription());
            st.setString(3,promosModel.getDate_Started());
            st.setString(4,promosModel.getDate_End());
            
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)promosTable.getModel();
                model.setRowCount(0);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PromosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean updatePromos(PromosModel promosModel,JTable promosTable){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE promos SET `Name` = ? , `Description` = ?, `Date_Started` = ?, `Date_End` = ? where Id = ?");
            st.setString(1,promosModel.getName());
            st.setString(2,promosModel.getDescription());
            st.setString(3,promosModel.getDate_Started());
            st.setString(4,promosModel.getDate_End());
            st.setInt(5,promosModel.getId());
            
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)promosTable.getModel();
                model.setRowCount(0);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PromosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
    public boolean deletePromos(int id,JTable promosTable){
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM promos where Id = ?");
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)promosTable.getModel();
                model.setRowCount(0);
//            new Alerts("delete").setVisible(true);
            }else{
//            new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PromosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
    
}
