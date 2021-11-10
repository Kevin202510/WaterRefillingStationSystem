/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.BorrowAndReturnGallons;
import Views.BuyGallonAndWater;
import Views.Deliveries;
import Views.Transaction;
import Views.WalkIn;
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
    public void BarrowReturnButton(JButton barrowreturn){
        new ContainerController(lalagyananpospanel,new BorrowAndReturnGallons(lalagyananpospanel));
    }
   
   public void WalkInButton(JButton walkin){
        new ContainerController(lalagyananpospanel,new WalkIn(lalagyananpospanel));
    }
   
   public void BuyButton(JButton buy){
        new ContainerController(lalagyananpospanel,new BuyGallonAndWater(lalagyananpospanel));
    }
   
   public void TransactionButton(JLabel transaction){
        new ContainerController(lalagyananpospanel,new Transaction(lalagyananpospanel));
    }
}
