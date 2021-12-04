/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.SalesModel;
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
 * @author ChelseaTorres
 */
public class SalesControllers {
                 
    ArrayList<SalesModel> salesList = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgSales = "SELECT * FROM sales";
    
    public SalesControllers(){
        try {
            salesList();
        } catch (SQLException ex) {
            Logger.getLogger(SalesControllers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<SalesModel> salesList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgSales);
        SalesModel sales;
        
        while(rs.next()){
            sales = new SalesModel(rs.getInt("Id"),rs.getString("Sales_Date"),rs.getInt("Amount"),rs.getInt("User_Id"));
            salesList.add(sales);
        }
        return salesList;   
    }
    
    public void showSales(JTable SalesTable){

         DefaultTableModel model = (DefaultTableModel)SalesTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < salesList.size(); i++) {
            row[0] = salesList.get(i).getId();
            row[1] = salesList.get(i).getSales_Date();
            row[2] = salesList.get(i).getAmount();
            row[3] = salesList.get(i).getUser_Id();
//            row[7] = test;
            model.addRow(row);
         }
    }
    // public static void main(String[] args) {
      //  SalesControllers test = new SalesControllers();
        //test.showSales();
    //}
}
