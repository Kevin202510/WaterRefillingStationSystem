/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Borrow_GallonsModel;
import Models.CustomerModel;
import Models.GallonsModel;
import Models.Return_GallonsModel;
import Models.SupplierModel;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CALUAG FAMILY
 */
public class BorrowAndReturnGallonsController {
    
    ArrayList<Borrow_GallonsModel> borrowgallonlist = new ArrayList<>();
    ArrayList<Borrow_GallonsModel> borrowgallonlistjointable = new ArrayList<>();
    ArrayList<Return_GallonsModel> returngallonlist = new ArrayList<>();
    ArrayList<Return_GallonsModel> returnallonlistjointable = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();

    String kuninLahatNgBorrowGallon = "SELECT * FROM barrow_gallons WHERE Status = 0";
    String kuninborrowWithJoinTable = "SELECT * FROM `barrow_gallons`LEFT JOIN customers ON customers.ID = barrow_gallons.Customer_Id LEFT JOIN gallons ON gallons.Code = barrow_gallons.Gallon_Id where barrow_gallons.Status = 0";
    String kuninreturnWithJoinTable = "SELECT * FROM `return_gallon` LEFT JOIN barrow_gallons ON barrow_gallons.ID = return_gallon.Borrowed_Gallons_Id " +
                                        "LEFT JOIN customers ON customers.ID = barrow_gallons.Customer_Id LEFT JOIN gallons ON gallons.Code = barrow_gallons.Gallon_Id";
    String magdagdagNgCustomer = "INSERT INTO customers(Fname,Mname,Lname,Address,Contact,isSuki) VALUES (?,?,?,?,?,?)";
    String baguhinAngCustomer = "UPDATE customers SET Fname = ?, Mname = ?,Lname = ?,Address = ?,Contact = ?,isSuki = ? WHERE ID = ?";
    String tanggalinAngCustomer = "DELETE FROM customers WHERE ID = ?";
    String addReturnGallon = "INSERT INTO `return_gallon`( `Borrowed_Gallons_Id`, `Gallon_Return_Quantity`, `Date_Return`) VALUES (?,?,?)";
    String addBarrowGallon = "INSERT INTO `barrow_gallons`(`Customer_Id`, `Gallon_Id`, `Gallon_Quantity`, `Date_Borrowed`) VALUES(?,?,?,?)";
    String baguhinAngReturnGallon = "UPDATE return_gallon SET Customer_Id = ? , Gallon_Id = ? ,Gallon_Quantity = ?, Date_Return = ? WHERE Id = ?";
    String baguhinAngBarrowGallon = "UPDATE barrow_gallons SET Customer_Id = ? , Gallon_Id = ? ,Gallon_Quantity = ?, Date_Borrowed = ? WHERE Id = ?";
    String tanggalinAngReturnGallon = "DELETE FROM return_gallon WHERE Id = ?";
    String tanggalinAngBarrowGallon = "DELETE FROM barrow_gallons WHERE Id = ?";
    public BorrowAndReturnGallonsController(){
        try {
            borrowGallonlist();
            borrowGallonJoinTablelist();
            returnGallonlist();
            returnGallonJoinTablelist();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fetchComboBoxValue(JComboBox customerName,JComboBox gallonType_Id){
        
          try {
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("SELECT * FROM `customers`");
              
              while(rs.next()){
                  customerName.addItem(rs.getString("Fname") + " " + rs.getString("Mname") + " " + rs.getString("Lname"));
              }
              
              Statement st1 = con.createStatement();
              ResultSet rs1 = st1.executeQuery("SELECT * FROM `gallons`");
              
              while(rs1.next()){
                  gallonType_Id.addItem(rs1.getString("Gallon_Type"));
              }
              
            } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public ArrayList<Borrow_GallonsModel> borrowGallonlist() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgBorrowGallon);
        Borrow_GallonsModel borrowgallonmodel;
        
        while(rs.next()){
                borrowgallonmodel = new Borrow_GallonsModel(rs.getInt("ID"),rs.getInt("Customer_Id"),rs.getString("Gallon_Id"),rs.getInt("Gallon_Quantity"),rs.getString("Date_Borrowed"),rs.getInt("Status"));
            borrowgallonlist.add(borrowgallonmodel);    
        }
        return borrowgallonlist;   
    }
    
    public ArrayList<Return_GallonsModel> returnGallonlist() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninreturnWithJoinTable);
        Return_GallonsModel returnwgallonmodel;
        
        while(rs.next()){
                returnwgallonmodel = new Return_GallonsModel(rs.getInt("ID"),rs.getInt("Borrowed_Gallons_Id"),rs.getInt("Gallon_Return_Quantity"),rs.getString("Date_Return"));
            returngallonlist.add(returnwgallonmodel);    
        }
        return returngallonlist;   
    
    }
    public ArrayList<Borrow_GallonsModel> borrowGallonJoinTablelist() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninborrowWithJoinTable);
        Borrow_GallonsModel borrowgallonmodel;
        
        while(rs.next()){
                borrowgallonmodel = new Borrow_GallonsModel(rs.getString("customers.Fname"),rs.getString("customers.Mname"),rs.getString("customers.Lname"),rs.getString("gallons.Gallon_Type"));
            borrowgallonlistjointable.add(borrowgallonmodel);    
        }
        return borrowgallonlistjointable;   
    }
    
     public ArrayList<Return_GallonsModel> returnGallonJoinTablelist() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninreturnWithJoinTable);
        Return_GallonsModel returngallonmodel;
        
        while(rs.next()){
                returngallonmodel = new Return_GallonsModel(rs.getString("customers.Fname"),rs.getString("customers.Mname"),rs.getString("customers.Lname"),rs.getString("gallons.Gallon_Type"));
            returnallonlistjointable.add(returngallonmodel);    
        }
        return returnallonlistjointable;   
    }
    
     
     public void showBorrowGallon(JTable customerTable){
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[8];
         if(borrowgallonlist.size()!=0){
            for (int i = 0; i < borrowgallonlist.size(); i++) {
            row[0] = borrowgallonlist.get(i).getID();
            row[1] = borrowgallonlistjointable.get(i).getCustomer_Fullname();
            row[2] = borrowgallonlistjointable.get(i).getGallon_Type();
            row[3] = borrowgallonlist.get(i).getGallon_Quantity();
            row[4] = borrowgallonlist.get(i).getDate_Borrowed();
            model.addRow(row);      
         }
         }
    }
     
     
       public void showReturnGallon(JTable customerTable){
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < returngallonlist.size(); i++) {
            row[0] = returngallonlist.get(i).getID();
            row[1] = returnallonlistjointable.get(i).getCustomer_Fullname();
            row[2] = returnallonlistjointable.get(i).getGallon_Type();
            row[3] = returngallonlist.get(i).getGallon_Return_Quantity();
            row[4] = returngallonlist.get(i).getDate_Return();
            model.addRow(row);
         }
       }
       
       public boolean addReturnGallon(Return_GallonsModel returngallonModel,JTable returngallonTable,JTable borrowgallonTable){
        try {
            PreparedStatement st = con.prepareStatement(addReturnGallon);
            st.setInt(1, returngallonModel.getCostumer_Id());
            st.setString(2, returngallonModel.getGallon_Code());
            st.setInt(3, returngallonModel.getGallon_Return_Quantity());
            st.setString(4, returngallonModel.getDate_Return());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)returngallonTable.getModel();
                model.setRowCount(0);
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
       
      public boolean addBorrowGallon(Borrow_GallonsModel barrowgallonModel,JTable borrowgallontbl){
        try {
            PreparedStatement st = con.prepareStatement(addBarrowGallon);
            st.setInt(1, barrowgallonModel.getCostumer_Id());
            st.setString(2, barrowgallonModel.getGallon_Code());
            st.setInt(3, barrowgallonModel.getGallon_Quantity());
            st.setString(4, barrowgallonModel.getDate_Borrowed());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)borrowgallontbl.getModel();
                model.setRowCount(0);
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }  
      
      public void getReturnGallonsInfo(int Id,JTextField Customer_Id,JTextField gallonType_Id,JSpinner gallonQuantity,JDateChooser DateReturn){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `return_gallon` LEFT JOIN barrow_gallons ON barrow_gallons.ID = return_gallon.Borrowed_Gallons_Id LEFT JOIN customers ON customers.ID = barrow_gallons.Customer_Id LEFT JOIN gallons ON gallons.Code = barrow_gallons.Gallon_Id where barrow_gallons.Id = " + Id);

            if(rs.next()){
                JOptionPane.showMessageDialog(null,rs.getString("customers.Fname") + " " + rs.getString("customers.Mname") + " " + rs.getString("customers.Lname"));
                Customer_Id.setText(rs.getString("customers.Fname") + " " + rs.getString("customers.Mname") + " " + rs.getString("customers.Lname"));
                gallonType_Id.setText(rs.getString("gallons.Gallon_Type"));
                gallonQuantity.setValue(rs.getInt("barrow_gallons.Gallon_Quantity"));
                DateReturn.setDate(rs.getDate("Date_Return"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowAndReturnGallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
      
       public void getBarrowGallonsInfo(int Id,JComboBox Customer_Id,JComboBox gallonType_Id,JSpinner gallonQuantity,JDateChooser DateBarrow){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM barrow_gallons LEFT JOIN customers on customers.ID = barrow_gallons.Customer_Id LEFT JOIN gallons ON gallons.Code = barrow_gallons.Gallon_Id where barrow_gallons.Id = " + Id);

            while(rs.next()){
                Customer_Id.setSelectedItem(rs.getString("customers.Fname") + " " + rs.getString("customers.Mname") + " " + rs.getString("customers.Lname"));
                gallonType_Id.setSelectedItem(rs.getString("gallons.Gallon_Type"));
                gallonQuantity.setValue(rs.getInt("Gallon_Quantity"));
                DateBarrow.setDate(rs.getDate("Date_Borrowed"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowAndReturnGallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
      }       
      
      public boolean updateReturnGallon(Return_GallonsModel returngallonModel,JTable returngallonTable){
      try {
            PreparedStatement st = con.prepareStatement(baguhinAngReturnGallon);
            st.setInt(1, returngallonModel.getCostumer_Id());
            st.setString(2, returngallonModel.getGallon_Code());
            st.setInt(3, returngallonModel.getGallon_Return_Quantity());
            st.setString(4, returngallonModel.getDate_Return());
            st.setInt(5, returngallonModel.getID());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)returngallonTable.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
      return true;
    } 
      
       public boolean updateBorrowGallon(Borrow_GallonsModel barrowgallonModel,JTable borrowgallontbl){
      try {
            PreparedStatement st = con.prepareStatement(baguhinAngBarrowGallon);
            st.setInt(1, barrowgallonModel.getCostumer_Id());
            st.setString(2, barrowgallonModel.getGallon_Code());
            st.setInt(3, barrowgallonModel.getGallon_Quantity());
            st.setString(4, barrowgallonModel.getDate_Borrowed ());
            st.setInt(5, barrowgallonModel.getID());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)borrowgallontbl.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
      return true;
    }     public boolean deleteBarrowGallons(int id,JTable borrowgallontbl){
        try {
            PreparedStatement st = con.prepareStatement(tanggalinAngBarrowGallon);
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)borrowgallontbl.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
 
       public boolean deleteReturnGallons(int id,JTable returngallonTable){
        try {
            PreparedStatement st = con.prepareStatement(tanggalinAngReturnGallon);
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)returngallonTable.getModel();
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
