/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.GallonsController;
import static Forms.GallonsFormModal.lalagyanan;
import static Forms.GallonsFormModal.out;
import static Forms.GallonsFormModal.gallonTable;
import Models.GallonsModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;


/**
 *
 * @author KevinCaluag
 */
public class GallonsFormModal extends javax.swing.JPanel {

    /**
     * Creates new form GallonsFormModal
     */
    static int btn_id;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    GallonsModel gallonsmodel;
    GallonsController gallonsControll = new GallonsController();
    static JTable gallonTable;
    static JFrame out;
    static JPanel lalagyanan;
    
    public GallonsFormModal(JFrame out,int btn_id,JTable gallonsTable,JPanel lalagyanan) {
        initComponents();
        this.btn_id = btn_id;
        this.gallonTable = gallonsTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
        checkBtn(btn_id);
    }
    private void checkBtn(int btn_id){
        if (btn_id==0) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
        }else{
            gallonsControll.getGallonInfo(btn_id, Name, Size, Color, Gallon_Type,Supplier_Id, Date_delivered, Price, Stocks);
            addbtn.setVisible(false);
            updatebtn.setVisible(true);
            deletebtn.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Date_delivered = new javax.swing.JTextField();
        Size = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Color = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Gallon_Type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Stocks = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Supplier_Id = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GALLONS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 22, 177, 37));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 546, 100, 43));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 100, 43));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 546, 100, 43));

        jLabel2.setText("Date Delivered");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 30));
        add(Date_delivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 180, 30));
        add(Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 180, 30));

        jLabel3.setText("Size");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 30));
        add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, 30));

        jLabel4.setText("Color");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 30));
        add(Gallon_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, 30));

        jLabel5.setText("Gallon Type");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, 30));
        add(Stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 180, 30));

        jLabel6.setText("Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, 30));
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, 30));

        jLabel7.setText("Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 30));
        add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 180, 30));

        jLabel8.setText("Supplier");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 30));

        jLabel9.setText("Stocks");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 80, 30));

        Supplier_Id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(Supplier_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
         gallonsmodel = new GallonsModel(0,Name.getText(),Size.getText(),Color.getText(),Gallon_Type.getText(),1,Date_delivered.getText(),Integer.parseInt(Price.getText()),Integer.parseInt(Stocks.getText()));
        if (gallonsControll.addGallons(gallonsmodel,gallonTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Gallons(lalagyanan));
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
         if(gallonsControll.deleteGallon(btn_id,gallonTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.Gallons(lalagyanan));
        }
                                           
        
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

            gallonsmodel = new GallonsModel(btn_id,Name.getText(),Size.getText(),Color.getText(),Gallon_Type.getText(),1,Date_delivered.getText(),Integer.parseInt(Price.getText()),Integer.parseInt(Stocks.getText()));
        if (gallonsControll.updateGallon(gallonsmodel,gallonTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Gallons(lalagyanan));
        
        }
    }//GEN-LAST:event_updatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Color;
    private javax.swing.JTextField Date_delivered;
    private javax.swing.JTextField Gallon_Type;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Size;
    private javax.swing.JTextField Stocks;
    private javax.swing.JComboBox<String> Supplier_Id;
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}