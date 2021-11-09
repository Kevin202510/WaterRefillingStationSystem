/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.GallonsModel;     
import Models.UserModel;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
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
 * @author Kevin Felix Caluag
 */
public class GallonsController {
    
    ArrayList<GallonsModel> gallonList = new ArrayList<>();
    ArrayList<GallonsModel> gallonsupplierList = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgGallon = "SELECT * FROM `gallons` ORDER BY Date_Delivered";
    String kuninLahatNgGallonwithjointable = "SELECT * FROM `gallons` LEFT JOIN suppliers ON suppliers.Id = gallons.Supplier_Id ORDER BY Date_Delivered";
    String magdagdagNgGallons = "INSERT INTO `gallons`(`Code`, `Size`, `Color`, `Gallon_Type`, `Supplier_Id`, `Date_Delivered`, `PurchasePrice`, `Stocks`) VALUES (?,?,?,?,?,?,?,?)";
    String kuninAnggallon = "SELECT * FROM gallons where Code = ?";
    String baguhinAngGallon = "UPDATE gallons SET Size = ? ,Color = ?, Gallon_Type = ?,Supplier_Id = ?,Date_Delivered = ?,PurchasePrice = ?,Stocks = ? WHERE Code = ?";
    String tanggalinAngGallons = "DELETE FROM `gallons` WHERE Code = ?";
    
    public GallonsController(){
        try {
            gallonSupplierList();
            gallonList();
        } catch (SQLException ex) {
            Logger.getLogger(GallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public ArrayList<GallonsModel> gallonList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgGallon);
        GallonsModel gallons;
        
        while(rs.next()){
            gallons=new GallonsModel(rs.getString("Code"),rs.getString("Size"),rs.getString("Color"),rs.getString("Gallon_Type"),rs.getInt("Supplier_id"),rs.getString("Date_delivered"),rs.getDouble("PurchasePrice"),rs.getInt("Stocks"));
            gallonList.add(gallons);
        }
        return gallonList;   
    }
    
    public ArrayList<GallonsModel> gallonSupplierList() throws SQLException{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgGallonwithjointable);
        GallonsModel gallons;
        
        while(rs.next()){
            String supplierFullname = rs.getString("Fname") + " " + rs.getString("Lname") + " " +rs.getString("Mname");
            gallons=new GallonsModel(supplierFullname);
            gallonsupplierList.add(gallons);
        }
        return gallonsupplierList;   
    }
    
//    JTable jTable1
     public void showGallons(JTable gallonsTable){
         DefaultTableModel model = (DefaultTableModel)gallonsTable.getModel();
         Object[] row = new Object[9];
         for (int i = 0; i < gallonList.size(); i++) {
            row[0] = gallonList.get(i).getCode();
            row[1] = gallonList.get(i).getSize();
            row[2] = gallonList.get(i).getColor();
            row[3] = gallonList.get(i).getGallon_Type();
            row[4] = gallonsupplierList.get(i).getSupplierFullname();
            row[5] = gallonList.get(i).getDate_delivered();
            row[6] = gallonList.get(i).getPurchasePrice();
            row[7] = gallonList.get(i).getStocks();
            model.addRow(row);
         }
    }
     
       public boolean addGallons(GallonsModel gallonsmodel,JTable gallonTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgGallons);
            st.setString(1, gallonsmodel.getCode());
            st.setString(2, gallonsmodel.getSize());
            st.setString(3, gallonsmodel.getColor());
            st.setString(4, gallonsmodel.getGallon_Type());
            st.setInt(5, gallonsmodel.getSupplier_id());
            st.setString(6, gallonsmodel.getDate_delivered());
            st.setDouble(7, gallonsmodel.getPurchasePrice());
            st.setInt(8, gallonsmodel.getStocks());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)gallonTable.getModel();
                model.setRowCount(0);
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
     
    public void getGallonInfo(String id,JTextField Code,JTextField Size,JTextField Color,JTextField Gallon_Type,JComboBox<String> Supplier_Id,
                       JDateChooser Date_delivered ,JTextField Price , JSpinner Stocks){

       try {
               PreparedStatement st = con.prepareStatement(kuninAnggallon);
               st.setString(1, id);
               ResultSet rs = st.executeQuery();
              while(rs.next()){
                Code.setText(rs.getString("Code"));
                Size.setText(rs.getString("Size"));
                Color.setText(rs.getString("Color"));
                Gallon_Type.setText(rs.getString("Gallon_Type"));
                Date_delivered.setDate(rs.getDate("Date_delivered"));
                Price.setText(String.valueOf(rs.getDouble("PurchasePrice")));
                Stocks.setValue(rs.getInt("Stocks"));
            }
       }   
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
       }
    }
         
    public void clearGallonForm(JTextField Name,JTextField Size,JTextField Color,JTextField Gallon_Type,JComboBox Supplier_Id,
                            JDateChooser Date_delivered ,JTextField Price , JSpinner Stocks){
        Name.setText("");
        Size.setText("");
        Color.setText("");
        Gallon_Type.setText("");
        Supplier_Id.setSelectedIndex(0);
        Date_delivered.setDate(null);
        Price.setText("");
        Stocks.setValue(0);
    }
     
     public boolean updateGallon(GallonsModel gallonsmodel,JTable gallontable){
        try {
            PreparedStatement st = con.prepareStatement(baguhinAngGallon);
            st.setString(1, gallonsmodel.getSize());
            st.setString(2, gallonsmodel.getColor());
            st.setString(3, gallonsmodel.getGallon_Type());
            st.setInt(4, gallonsmodel.getSupplier_id());
            st.setString(5, gallonsmodel.getDate_delivered());
            st.setDouble(6, gallonsmodel.getPurchasePrice());
            st.setInt(7, gallonsmodel.getStocks());
            st.setString(8,gallonsmodel.getCode());
           

            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)gallontable.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
     
       public boolean deleteGallon(String id,JTable gallontable){
        try {
            PreparedStatement st = con.prepareStatement(tanggalinAngGallons);
            st.setString(1,id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)gallontable.getModel();
                model.setRowCount(0);
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return true;
     }
       
     public String generateGallonCode(){
        Random random = new Random();
        String Code="";
        for (int i = 1; i <= 10; i++) {
            int value = random.nextInt(5);
            Code += String.valueOf(value);
        }
        return Code;
    }  
     
        public void fetchComboBoxSupplierValue(JComboBox<String> Supplier_Id){
        
       
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `suppliers`");
            
            while(rs.next()){
                Supplier_Id.addItem(rs.getString("Fname") + " " + rs.getString("Mname") + " " + rs.getString("Lname"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }  
}

