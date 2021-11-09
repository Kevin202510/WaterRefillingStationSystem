/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Borrow_GallonsModel;
import Models.CustomerModel;
import Models.Return_GallonsModel;
import java.sql.Connection;
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
 * @author CALUAG FAMILY
 */
public class BorrowAndReturnGallonsController {
    
    ArrayList<Borrow_GallonsModel> borrowgallonlist = new ArrayList<>();
    ArrayList<Borrow_GallonsModel> borrowgallonlistjointable = new ArrayList<>();
    ArrayList<Return_GallonsModel> returngallonlist = new ArrayList<>();
    ArrayList<Return_GallonsModel> returnallonlistjointable = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();

    String kuninLahatNgBorrowGallon = "SELECT * FROM barrow_gallons";
    String kuninborrowWithJoinTable = "SELECT * FROM `barrow_gallons`LEFT JOIN customers ON customers.ID = barrow_gallons.Customer_Id LEFT JOIN gallons ON gallons.Code = barrow_gallons.Gallon_Id";
    String kuninLahatNgReturnGallon = "SELECT * FROM return_gallon";
     String kuninreturnWithJoinTable = "SELECT * FROM `return_gallon`LEFT JOIN customers ON customers.ID = return_gallon.Customer_Id LEFT JOIN gallons ON gallons.Code = return_gallon.Gallon_Id";
    String magdagdagNgCustomer = "INSERT INTO customers(Fname,Mname,Lname,Address,Contact,isSuki) VALUES (?,?,?,?,?,?)";
    String baguhinAngCustomer = "UPDATE customers SET Fname = ?, Mname = ?,Lname = ?,Address = ?,Contact = ?,isSuki = ? WHERE ID = ?";
    String tanggalinAngCustomer = "DELETE FROM customers WHERE ID = ?";
    
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
    
    
    public ArrayList<Borrow_GallonsModel> borrowGallonlist() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgBorrowGallon);
        Borrow_GallonsModel borrowgallonmodel;
        
        while(rs.next()){
                borrowgallonmodel = new Borrow_GallonsModel(rs.getInt("ID"),rs.getInt("Customer_Id"),rs.getString("Gallon_Id"),rs.getInt("Gallon_Quantity"),rs.getString("Date_Borrowed"));
            borrowgallonlist.add(borrowgallonmodel);    
        }
        return borrowgallonlist;   
    }
    
    public ArrayList<Return_GallonsModel> returnGallonlist() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgReturnGallon);
        Return_GallonsModel returnwgallonmodel;
        
        while(rs.next()){
                returnwgallonmodel = new Return_GallonsModel(rs.getInt("ID"),rs.getInt("Customer_Id"),rs.getString("Gallon_Id"),rs.getInt("Gallon_Quantity"),rs.getString("Date_Return"));
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
         for (int i = 0; i < borrowgallonlist.size(); i++) {
            row[0] = borrowgallonlist.get(i).getID();
            row[1] = borrowgallonlistjointable.get(i).getCustomer_Fullname();
            row[2] = borrowgallonlistjointable.get(i).getGallon_Type();
            row[3] = borrowgallonlist.get(i).getGallon_Quantity();
            row[4] = borrowgallonlist.get(i).getDate_Borrowed();
            model.addRow(row);
            
         }
    }
     
     
       public void showReturnGallon(JTable customerTable){
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < returngallonlist.size(); i++) {
            row[0] = returngallonlist.get(i).getID();
            row[1] = returnallonlistjointable.get(i).getCustomer_Fullname();
            row[2] = returnallonlistjointable.get(i).getGallon_Type();
            row[3] = returngallonlist.get(i).getGallon_Quantity();
            row[4] = returngallonlist.get(i).getDate_Return();
            model.addRow(row);
         }
       }   
       
}
