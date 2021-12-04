/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Forms.BarrowGallonsFormModal;
import Forms.CustomersFormModal;
import Forms.DeliveriesModal;
import Forms.GallonsFormModal;
import Forms.SuppliersFormModal;
import Forms.PromoFormModal;
import Forms.ReturnGallonsFormModal;
import Forms.SalesFofrmModal;
import Forms.UserFormModal;
import Forms.WaterTypeFormModal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author KevinCaluag
 */
public class FormsControllers {
    int containernum;
    int btn_id;
    String btn_ids;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    JTable jtablename;
    JPanel lalagyanan,lalagyananForms;
    JFrame out;
    
    public FormsControllers(int containernum,int btn_id,JTable jtablename,JPanel lalagyanan,JPanel lalagyananForms,JFrame out) {
        this.containernum = containernum;
        this.btn_id = btn_id;
        this.jtablename = jtablename;
        this.lalagyanan = lalagyanan;
        this.lalagyananForms = lalagyananForms;
        this.out = out;
        checkPanelNum();
    }
     public FormsControllers(int containernum,String btn_ids,JTable jtablename,JPanel lalagyanan,JPanel lalagyananForms,JFrame out) {
        this.containernum = containernum;
        this.btn_ids = btn_ids;
        this.jtablename = jtablename;
        this.lalagyanan = lalagyanan;
        this.lalagyananForms = lalagyananForms;
        this.out = out;
        checkPanelNum();
    }
    
    private void checkPanelNum(){
        if (containernum==2) {
            new ContainerController(lalagyananForms,new UserFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==3) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_ids,jtablename,lalagyanan));
        }else if (containernum==4) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_ids,jtablename,lalagyanan));
        }else if (containernum==5) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_ids,jtablename,lalagyanan));
        }else if (containernum==6) {
           new ContainerController(lalagyananForms,new SuppliersFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==7) {
            new ContainerController(lalagyananForms,new PromoFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==8) {
            new ContainerController(lalagyananForms,new CustomersFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==9) {
            new ContainerController(lalagyananForms,new DeliveriesModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==10) {
//            JOptionPane.showMessageDialog(null,"asdas");
            new ContainerController(lalagyananForms,new WaterTypeFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==12) {
//            JOptionPane.showMessageDialog(null,"asdas");
            new ContainerController(lalagyananForms,new ReturnGallonsFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==13) {
//            JOptionPane.showMessageDialog(null,"asdas");
            new ContainerController(lalagyananForms,new SalesFofrmModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==14) {
//            JOptionPane.showMessageDialog(null,"asdas");
            new ContainerController(lalagyananForms,new BarrowGallonsFormModal(out,btn_id,jtablename,lalagyanan));
        }
    }
}
