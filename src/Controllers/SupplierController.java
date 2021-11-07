/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Models.GallonsModel;
import Models.SupplierModel;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;import javax.swing.JComboBox;
import javax.swing.JSpinner;
;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ChelseaTorres
 */
public class SupplierController {
    
    ArrayList<SupplierModel> supplierlist = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
      String kuninLahatNgSupplier = "SELECT * FROM suppliers";
    String tanggalinAngSupplier = "DELETE FROM suppliers WHERE Id = ?";
    String magdagdagNgSupplier = "INSERT INTO suppliers(Id,Fname,Lname,Mname,Company_name) VALUES (?,?,?,?,?)";
    
 
    
    public SupplierController(){
        try {
            supplierList();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<SupplierModel> supplierList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgSupplier);
        SupplierModel suppliers;
        
        while(rs.next()){
            suppliers = new SupplierModel(rs.getInt("Id"),rs.getString("Fname"),rs.getString("Lname"),rs.getString("Mname"),rs.getString("Company_Name"),rs.getString("Company_Address"),rs.getString("Contact"));
            supplierlist.add(suppliers);
        }
        return supplierlist;   
    }
    

     public void showSuppliers(JTable suppliersTable){
          DefaultTableModel model = (DefaultTableModel)suppliersTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < supplierlist.size(); i++) {
             row[0] = supplierlist.get(i).getID();
             row[1] = "<html>"+supplierlist.get(i).getFullname()+"</html> ";
             row[2] = supplierlist.get(i).getCompany_name();
             model.addRow(row);
         }
    }
     public boolean addSupplier(SupplierModel suppliermodel,JTable suppliersTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgSupplier);
            st.setInt(1, suppliermodel.getID());
            st.setString(2, suppliermodel.getFname());
            st.setString(3, suppliermodel.getMname());
            st.setString(4, suppliermodel.getLname());
            st.setString(5, suppliermodel.getCompany_name());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)suppliersTable.getModel();
                model.setRowCount(0);
//                userList();
//                showUsers(userTable);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
      public void getSpplierInfo(int Id,JTextField Fname,JTextField Mname,JTextField Lname,JTextField Company_name){
        String kuninAnggallon = "SELECT * FROM suppliers where Id = '" + Id + "'";
        
        try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(kuninAnggallon);
        
               // Role_id.setText(String.valueOf(rs.getInt("role_id")));
               while(rs.next()){
                Fname.setText(rs.getString("Fname"));
                Mname.setText(rs.getString("Mname"));
                Lname.setText(rs.getString("Lname"));
                Company_name.setText(rs.getString("Company_name"));
//              
               }
        }   
         catch (SQLException ex) {
            Logger.getLogger(SupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     }
      
      
       public void clearSuppliertForm(JTextField Fname,JTextField Mname,JTextField Lname,JTextField Company_name){
                Fname.setText("");
                Mname.setText("");
                Lname.setText("");
                Company_name.setText("");;
    }
       
       
      public boolean updateSupplier(SupplierModel suppliermodel,JTable suppliersTable){
        try {
            String updates = "UPDATE suppliers SET Id = ? , Fname = ? ,Mname = ?, Lname = ?,Company_name = ? WHERE Id = '" +suppliermodel.getID()+ "'";
            PreparedStatement st = con.prepareStatement(updates);
            st.setInt(1, suppliermodel.getID());
            st.setString(2, suppliermodel.getFname());
            st.setString(3, suppliermodel.getMname());
            st.setString(4, suppliermodel.getLname());
            st.setString(5, suppliermodel.getCompany_name());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)suppliersTable.getModel();
                model.setRowCount(0);
            //            new Alerts("update").setVisible(true);
            }else{
//                new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
     public boolean deleteSupplier(int id,JTable suppliersTable){
        try {
            PreparedStatement st = con.prepareStatement(tanggalinAngSupplier);
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)suppliersTable.getModel();
                model.setRowCount(0);
//            new Alerts("delete").setVisible(true);
            }else{
//            new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
}
