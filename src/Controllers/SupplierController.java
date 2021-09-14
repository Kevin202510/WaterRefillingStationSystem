/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Models.SupplierModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ChelseaTorres
 */
public class SupplierController {
    
    ArrayList<SupplierModel> supplierlist = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgSupplier = "SELECT * FROM suppliers";
    
    public SupplierController(){
        try {
            supplierList();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<SupplierModel> supplierList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgSupplier);
        SupplierModel suppliers;
        
        while(rs.next()){
            suppliers = new SupplierModel(rs.getInt("Id"),rs.getString("Fname"),rs.getString("Lname"),rs.getString("Mname"),rs.getString("Company_name"));
            supplierlist.add(suppliers);
        }
        return supplierlist;   
    }
    

     public void showSuppliers(){

         for (int i = 0; i < supplierlist.size(); i++) {
             JOptionPane.showMessageDialog(null,supplierlist.get(i).getCompany_name());

         }
    }
     
     public static void main(String[] args) {
        SupplierController test = new SupplierController();
        test.showSuppliers();
    }
}
