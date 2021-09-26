/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Forms.DeliveriesModal;
import Forms.GallonsFormModal;
import Forms.PromoFormModal;
import Forms.UserFormModal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author KevinCaluag
 */
public class FormsControllers {
    int containernum;
    int btn_id;
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
    
    private void checkPanelNum(){
        if (containernum==2) {
            new ContainerController(lalagyananForms,new UserFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==3) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==4) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==5) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==6) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==7) {
            new ContainerController(lalagyananForms,new PromoFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==8) {
            new ContainerController(lalagyananForms,new GallonsFormModal(out,btn_id,jtablename,lalagyanan));
        }else if (containernum==9) {
            new ContainerController(lalagyananForms,new DeliveriesModal(out,btn_id,jtablename,lalagyanan));
        }
    }
}
