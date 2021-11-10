/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BorandretGallon_LogsModel;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public class BorandretGallons_LogsController {
     ArrayList<BorandretGallon_LogsModel> borandretgallonlist = new ArrayList<>();
     SQLController sql = new SQLController();
     Connection con = sql.getConnection();
    

    
    public void showBorandretGallons_Logs(JTable customerTable){
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < borandretgallonlist.size(); i++) {
            row[0] = borandretgallonlist.get(i).getID();
            row[1] = borandretgallonlist.get(i).getCustomer_Id();
            row[2] = borandretgallonlist.get(i).getGallon_Id();
            row[3] = borandretgallonlist.get(i).getGallon_Quantity();
            row[4] = borandretgallonlist.get(i).getTransaction_Time();
            row[5] = borandretgallonlist.get(i).getTransaction_Date();
            model.addRow(row);
         }
    }
}
