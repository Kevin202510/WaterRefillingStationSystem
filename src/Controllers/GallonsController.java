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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Felix Caluag
 */
public class GallonsController {
    
    ArrayList<GallonsModel> gallonList = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgGallon = "SELECT * FROM gallons";
    String tanggalinAngGallons = "DELETE FROM  gallons WHERE Gallon_Code = ?";
    String magdagdagNgGallons = "INSERT INTO gallons(Gallon_Code,Name,Size,Color,Gallon_Type,Supplier_Id,Date_delivered,Price,Stocks) VALUES (?,?,?,?,?,?,?,?,?)";
    
    
    public GallonsController(){
        try {
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
            gallons=new GallonsModel(rs.getInt("Gallon_Code"),rs.getString("Name"),rs.getString("Size"),rs.getString("Color"),rs.getString("Gallon_Type"),rs.getInt("Supplier_id"),rs.getString("Date_delivered"),rs.getInt("Price"),rs.getInt("Stocks"));
            gallonList.add(gallons);
        }
        return gallonList;   
    }
    
//    JTable jTable1
     public void showGallons(JTable gallonsTable){
         DefaultTableModel model = (DefaultTableModel)gallonsTable.getModel();
         Object[] row = new Object[9];
         for (int i = 0; i < gallonList.size(); i++) {
//             JOptionPane.showMessageDialog(null,gallonList.get(i).getColor());
            row[0] = gallonList.get(i).getGallon_Code();
            row[1] = gallonList.get(i).getName();
            row[2] = gallonList.get(i).getSize();
            row[3] = gallonList.get(i).getColor();
            row[4] = gallonList.get(i).getGallon_Type();
            row[5] = gallonList.get(i).getSupplier_id();
            row[6] = gallonList.get(i).getDate_delivered();
            row[7] = gallonList.get(i).getPrice();
            row[8] = gallonList.get(i).getStocks();
            model.addRow(row);
         }
    }
     
     //Gallon_Code,Name,Size,Color,Gallon_Type,Supplier_Id,Date_delivered,Price,Stocks
       public boolean addGallons(GallonsModel gallonsmodel,JTable gallonTable){
        try {
            PreparedStatement st = con.prepareStatement(magdagdagNgGallons);
            st.setInt(1, gallonsmodel.getGallon_Code());
            st.setString(2, gallonsmodel.getName());
            st.setString(3, gallonsmodel.getSize());
            st.setString(4, gallonsmodel.getColor());
            st.setString(5, gallonsmodel.getGallon_Type());
            st.setInt(6, gallonsmodel.getSupplier_id());
            st.setString(7, gallonsmodel.getDate_delivered());
            st.setInt(8, gallonsmodel.getPrice());
            st.setInt(9, gallonsmodel.getStocks());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)gallonTable.getModel();
                model.setRowCount(0);
//                userList();
//                showUsers(userTable);
            } else {
//                new Alerts("error").setVisible(true);
//                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
         public void getGallonInfo(int id,JTextField Name,JTextField Size,JTextField Color,JTextField Gallon_Type,JComboBox<String> Supplier_Id,
                            JTextField Date_delivered ,JTextField Price , JTextField Stocks){
        String kuninAnggallon = "SELECT * FROM gallons where Gallon_Code = '" + id + "'";
        
        try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(kuninAnggallon);
        
               // Role_id.setText(String.valueOf(rs.getInt("role_id")));
               while(rs.next()){
                Name.setText(rs.getString("Name"));
                Size.setText(rs.getString("Size"));
                Color.setText(rs.getString("Color"));
                Gallon_Type.setText(rs.getString("Gallon_Type"));
//                Supplier_id.setText(String.valueOf(rs.getInt("Supplier_id")));
                Date_delivered.setText(rs.getString("Date_delivered"));
              Price.setText(String.valueOf(rs.getInt("Price")));
              Stocks.setText(String.valueOf(rs.getInt("Stocks")));
               }
        }   
         catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public boolean updateGallon(GallonsModel gallonsmodel,JTable gallontable){
        try {
            String updates = "UPDATE gallons SET Gallon_Code = ? , Name = ? ,Size = ?, Color = ?,Gallon_Type = ?,Supplier_id = ?,Date_delivered = ?,Price = ?,Stocks = ? WHERE Gallon_Code = '" + gallonsmodel.getGallon_Code() + "'";
            PreparedStatement st = con.prepareStatement(updates);
            st.setInt(1, gallonsmodel.getGallon_Code());
            st.setString(2, gallonsmodel.getName());
            st.setString(3, gallonsmodel.getColor());
            st.setString(4, gallonsmodel.getSize());
            st.setString(5, gallonsmodel.getGallon_Type());
            st.setInt(6, gallonsmodel.getSupplier_id());
            st.setString(7, gallonsmodel.getDate_delivered());
            st.setInt(8, gallonsmodel.getPrice());
            st.setInt(9, gallonsmodel.getStocks());
           

            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)gallontable.getModel();
                model.setRowCount(0);
            //            new Alerts("update").setVisible(true);
            }else{
//                new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
       public boolean deleteGallon(int id,JTable gallontable){
        try {
            PreparedStatement st = con.prepareStatement(tanggalinAngGallons);
            st.setInt(1, id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)gallontable.getModel();
                model.setRowCount(0);
//            new Alerts("delete").setVisible(true);
            }else{
//            new Alerts("error").setVisible(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
  
     
}

