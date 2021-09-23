/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.PromosModel;
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
    
}
