/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.GallonsModel;     
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
 * @author Kevin Felix Caluag
 */
public class GallonsController {
    
    ArrayList<GallonsModel> gallonList = new ArrayList<>();
    SQLController sql = new SQLController();
    Connection con = sql.getConnection();
    
    String kuninLahatNgUser = "SELECT * FROM gallons";
    
    public GallonsController(){
        try {
            gallonList();
        } catch (SQLException ex) {
            Logger.getLogger(GallonsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<GallonsModel> gallonList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgUser);
        GallonsModel gallons;
        
        while(rs.next()){
            gallons=new GallonsModel(rs.getInt("Id"),rs.getString("Name"),rs.getString("Size"),rs.getString("Color"),rs.getString("Gallon_Type"),rs.getInt("Supplier_id"),rs.getString("Date_delivered"),rs.getInt("Price"),rs.getInt("Stocks"));
            gallonList.add(gallons);
        }
        return gallonList;   
    }
    
//    JTable jTable1
     public void showGallons(){
//         ArrayList<Users> list = userList();
//         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
//         Object[] row = new Object[8];
         for (int i = 0; i < gallonList.size(); i++) {
             JOptionPane.showMessageDialog(null,gallonList.get(i).getColor());
//            row[0] = list.get(i).getuser_id();
//            row[1] = list.get(i).getrole_displayname();
//            row[2] = "<html>"+list.get(i).getuser_fullname()+"</html> ";
//            row[3] = list.get(i).getuser_address();
//            row[4] = list.get(i).getuser_DOB();
//            row[5] = list.get(i).getuser_contactnum();
//            row[6] = list.get(i).getuser_username();
//            row[7] = list.get(i).getuser_password();
//            model.addRow(row);
         }
    }
     
    public static void main(String[] args) {
        GallonsController test = new GallonsController();
        test.showGallons();
    }
}

