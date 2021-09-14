/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Dashboard;
import Views.Gallons;
import Views.Sales;
import java.awt.Color;
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
    
    public void SalesButton(JLabel sales){
        new ContainerController(lalagyanan,new Sales());
    }
    
    public void GallonsButton(JLabel gallon){
        new ContainerController(lalagyanan,new Gallons());
    }
     
    public void setC(JPanel kev){
       kev.setBackground(new Color(102, 140, 255));
    }
    
    public void resetC(JPanel kev1){
           kev1.setBackground(new Color(83,140,198));
    }
}