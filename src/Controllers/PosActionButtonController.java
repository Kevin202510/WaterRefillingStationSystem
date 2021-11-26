/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.BorrowAndReturnGallons.BorrowAndReturnGallons;
import Views.Void.BuyGallonAndWater;
import Views.PointOfSale.Deliveries;
import Views.PointOfSale.ReturnGallons;
import Views.PointOfSale.Transaction;
import Views.PointOfSale.TransactionLogs;
import Views.PointOfSale.WalkIn;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KevinCaluag
 */
public class PosActionButtonController {
    
    JPanel lalagyananpospanel;
    
    public PosActionButtonController(JPanel lalagyananpospanel){
        this.lalagyananpospanel = lalagyananpospanel;
    }
    
   public void DeliveriesButton(JButton deliveries){
        new ContainerController(lalagyananpospanel,new Deliveries(lalagyananpospanel));
    }
    public void ReturnGallonButton(JButton barrowreturn){
        new ContainerController(lalagyananpospanel,new ReturnGallons(lalagyananpospanel));
    }
   
   public void WalkInButton(JButton walkin){
        new ContainerController(lalagyananpospanel,new WalkIn(lalagyananpospanel));
    }
   
   public void TransactionLogsButton(JButton buy){
        new ContainerController(lalagyananpospanel,new TransactionLogs(lalagyananpospanel));
    }
   
   public void TransactionButton(JLabel transaction){
        new ContainerController(lalagyananpospanel,new Transaction(lalagyananpospanel));
    }
   
   public void PosButton(JButton pos){
        new ContainerController(lalagyananpospanel,new Transaction(lalagyananpospanel));
    }
}