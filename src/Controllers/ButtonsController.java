/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.BorrowAndReturnGallons.BorrowAndReturnGallons;
import Views.Customer.Customers;
import Views.DashboardsAndButtons.Dashboard;
import Views.PointOfSale.Deliveries;
import Views.PointOfSale.Pos;
import Views.Gallons.Gallons;
import Views.Promos.Promos;
import Views.Reports.Reports;
import Views.Reports.SalesReport;
import Views.Supplier.Supplier;
import Views.Users.Users;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Felix Caluag
 */
public class ButtonsController {
    JPanel lalagyanan;
    
    public ButtonsController(JPanel lalagyanan){
        this.lalagyanan=lalagyanan;
    }
    
    public void DashboardButton(JLabel dashboard){
        new ContainerController(lalagyanan,new Dashboard(lalagyanan));
    }
    
    public void ReportsButton(JLabel sales){
        new ContainerController(lalagyanan,new Reports(lalagyanan));
    }
    
    public void GallonsButton(JLabel gallon){
        new ContainerController(lalagyanan,new Gallons(lalagyanan));
    }
    
    public void UsersButton(JLabel users){
        new ContainerController(lalagyanan,new Users(lalagyanan));
    }
    
//    public void EmployeesButton(JLabel employees){
//        new ContainerController(lalagyanan,new EmployeesButton());
//    }
    public void SupplierButton(JLabel supplier){
        new ContainerController(lalagyanan,new Supplier(lalagyanan));
    }
     
     public void PromosButton(JLabel promos){
        new ContainerController(lalagyanan,new Promos(lalagyanan));
    }
     
     public void CustomerButton(JLabel customer){
        new ContainerController(lalagyanan,new Customers(lalagyanan));
    }
     
     public void PosButton(JLabel deliveries){
        new ContainerController(lalagyanan,new Pos(lalagyanan));
    }
     
     public void BorrowAndReturnGallonsButton(JLabel refilled){
        new ContainerController(lalagyanan,new BorrowAndReturnGallons(lalagyanan));
    }
     
    public void setC(JPanel kev){
       kev.setBackground(new Color(85,65,118));
    }
    
    public void resetC(JPanel kev1){
           kev1.setBackground(new Color(64,43,100));
    }

    
    
    
}
