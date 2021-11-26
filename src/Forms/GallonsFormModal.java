/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.GallonsController;
import Controllers.SupplierController;
import static Forms.GallonsFormModal.lalagyanan;
import static Forms.GallonsFormModal.out;
import static Forms.GallonsFormModal.gallonTable;
import Models.GallonsModel;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Color;


/**
 *
 * @author KevinCaluag
 */
public class GallonsFormModal extends javax.swing.JPanel {

    /**
     * Creates new form GallonsFormModal
     */
    static String btn_id;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    GallonsModel gallonsmodel;
    GallonsController gallonsControll = new GallonsController();
    SupplierController supplierControll = new SupplierController();
    static JTable gallonTable;
    static JFrame out;
    static JPanel lalagyanan;
    
    public GallonsFormModal(JFrame out,String btn_id,JTable gallonsTable,JPanel lalagyanan) {
        initComponents();
        this.btn_id = btn_id;
        this.gallonTable = gallonsTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
        gallonsControll.fetchComboBoxSupplierValue(Supplier_Id);
        checkBtn(btn_id);
    }
    private void checkBtn(String btn_id){
        if (btn_id==null) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
            Code.setText(gallonsControll.generateGallonCode());
        }else{
            gallonsControll.getGallonInfo(btn_id,Code, Size, Color, Gallon_Type,Supplier_Id, Date_delivered, Price, Stocks);
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
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Size = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Color = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Gallon_Type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Supplier_Id = new javax.swing.JComboBox<>();
        Date_delivered = new com.toedter.calendar.JDateChooser();
        Stocks = new javax.swing.JSpinner();
        Code = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setNextFocusableComponent(Code);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 20, -1));

        jPanel2.setBackground(new java.awt.Color(85, 64, 118));
        jPanel2.setPreferredSize(new java.awt.Dimension(310, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GALLONS");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 177, 37));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, 43));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 43));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel2.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 100, 43));

        jLabel2.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date Delivered");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 30));

        Size.setBackground(new Color(0,0,0,1));
        Size.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Size.setBorder(null);
        Size.setOpaque(false);
        jPanel2.add(Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 200, 30));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Size");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 30));

        Color.setBackground(new Color(0,0,0,1));
        Color.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Color.setBorder(null);
        Color.setOpaque(false);
        jPanel2.add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, 30));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 30));

        Gallon_Type.setBackground(new Color(0,0,0,1));
        Gallon_Type.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Gallon_Type.setBorder(null);
        Gallon_Type.setOpaque(false);
        jPanel2.add(Gallon_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 30));

        jLabel5.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gallon Type");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 30));

        jLabel6.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, 30));

        Price.setBackground(new Color(0,0,0,1));
        Price.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Price.setBorder(null);
        Price.setOpaque(false);
        jPanel2.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 200, 30));

        jLabel8.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Supplier");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 30));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stocks");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 80, 30));

        jPanel2.add(Supplier_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, 30));
        jPanel2.add(Date_delivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 30));
        jPanel2.add(Stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 200, 30));

        Code.setEditable(false);
        Code.setBackground(new Color(0,0,0,1));
        Code.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Code.setBorder(null);
        Code.setEnabled(false);
        Code.setOpaque(false);
        jPanel2.add(Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 30));

        jLabel7.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Code");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 200, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 200, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, 10));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
            gallonsmodel = new GallonsModel(String.valueOf(btn_id),Size.getText(),Color.getText(),Gallon_Type.getText(),supplierControll.supplierList().get(Supplier_Id.getSelectedIndex()).getID(),df.format(Date_delivered.getDate()),Double.parseDouble(Price.getText()),(int) Stocks.getValue());
            if (gallonsControll.updateGallon(gallonsmodel,gallonTable)) {
                out.dispose();
                new ContainerController(lalagyanan,new Views.Gallons.Gallons(lalagyanan));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GallonsFormModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try {
            gallonsmodel = new GallonsModel(Code.getText(),Size.getText(),Color.getText(),Gallon_Type.getText(),supplierControll.supplierList().get(Supplier_Id.getSelectedIndex()).getID(),df.format(Date_delivered.getDate()),Integer.parseInt(Price.getText()),(int) Stocks.getValue());
            if (gallonsControll.addGallons(gallonsmodel,gallonTable)) {
                out.dispose();
                new ContainerController(lalagyanan,new Views.Gallons.Gallons(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GallonsFormModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(gallonsControll.deleteGallon(btn_id,gallonTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.Gallons.Gallons(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Code;
    private javax.swing.JTextField Color;
    private com.toedter.calendar.JDateChooser Date_delivered;
    private javax.swing.JTextField Gallon_Type;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Size;
    private javax.swing.JSpinner Stocks;
    private javax.swing.JComboBox<String> Supplier_Id;
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
