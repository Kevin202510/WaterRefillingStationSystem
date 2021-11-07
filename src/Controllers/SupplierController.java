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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
    String magdagdagNgSupplier = "INSERT INTO suppliers(Id,Fname,Mname,Lname,Company_Name,Company_Address,Contact) VALUES (?,?,?,?,?,?,?)";
    String kuninAngSupplierInfo = "SELECT * FROM suppliers where Id = ?";
    String baguhinAngSupplier = "UPDATE suppliers SET Id = ? , Fname = ? ,Mname = ?, Lname = ?,Company_Name = ?,Company_Address = ?,Contact = ? WHERE Id = ?";
    String tanggalinAngSupplier = "DELETE FROM suppliers WHERE Id = ?";
    
 
    
    public SupplierController(){
        try {
            supplierList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
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
        Object[] row = new Object[5];
        for (int i = 0; i < supplierlist.size(); i++) {
            row[0] = supplierlist.get(i).getID();
            row[1] = "<html>"+supplierlist.get(i).getFullname()+"</html> ";
            row[2] = supplierlist.get(i).getCompany_name();
            row[3] = supplierlist.get(i).getCompany_Address();
            row[4] = supplierlist.get(i).getContact();
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
            st.setString(6, suppliermodel.getCompany_Address());
            st.setString(7, suppliermodel.getContact());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)suppliersTable.getModel();
                model.setRowCount(0);
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
     
      public void getSpplierInfo(int Id,JTextField Fname,JTextField Mname,JTextField Lname,JTextField Company_name,JTextField Company_Address,JTextField Contact){
        try {
                PreparedStatement st = con.prepareStatement(kuninAngSupplierInfo);
                st.setInt(1, Id);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    Fname.setText(rs.getString("Fname"));
                    Mname.setText(rs.getString("Mname"));
                    Lname.setText(rs.getString("Lname"));
                    Company_name.setText(rs.getString("Company_name"));
                    Company_Address.setText(rs.getString("Company_Address"));
                    Contact.setText(rs.getString("Contact"));    
                }
        }   
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
         
     }
      
      
       public void clearSuppliertForm(JTextField Fname,JTextField Mname,JTextField Lname,JTextField Company_name,JTextField Company_Address,JTextField Contact){
        Fname.setText("");
        Mname.setText("");
        Lname.setText("");
        Company_name.setText("");
        Company_Address.setText("");
        Contact.setText("");
    }
        
    public boolean updateSupplier(SupplierModel suppliermodel,JTable suppliersTable){
      try {
            PreparedStatement st = con.prepareStatement(baguhinAngSupplier);
            st.setInt(1, suppliermodel.getID());
            st.setString(2, suppliermodel.getFname());
            st.setString(3, suppliermodel.getMname());
            st.setString(4, suppliermodel.getLname());
            st.setString(5, suppliermodel.getCompany_name());
            st.setString(6, suppliermodel.getCompany_Address());
            st.setString(7, suppliermodel.getContact());
            st.setInt(8, suppliermodel.getID());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)suppliersTable.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
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
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
}
