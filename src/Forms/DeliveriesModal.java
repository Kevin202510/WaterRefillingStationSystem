/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.CustomerController;
import Controllers.DeliveriesController;
import Controllers.GallonsController;
import Controllers.PromosController;
import Controllers.UsersController;
import Models.DeliveriesModel;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author KevinCaluag
 */
public class DeliveriesModal extends javax.swing.JPanel {

    /**
     * Creates new form DeliveriesModal
     */
    static int btn_id;
    DeliveriesModel deliveriesModel;
    DeliveriesController deliveriesControll = new DeliveriesController();
    CustomerController customerControll = new CustomerController();
    PromosController promoControll = new PromosController();
    UsersController userControll = new UsersController();
    GallonsController gallonsControll = new GallonsController();
    
    static JTable promoTable;
    static JPanel lalagyanan;
    static JFrame out;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
    
    public DeliveriesModal(JFrame out,int btn_id,JTable promoTable,JPanel lalagyanan) {
        this.btn_id = btn_id;
        this.promoTable = promoTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
        initComponents();
        checkBtn(btn_id);
    }
    private void checkBtn(int btn_id){
        if (btn_id==0) {   
            deliveriesControll.fetchComboBoxValue(Customer_Id, Promo_Id, User_Id,Gallon_Id);
            Date_Delivered.setDate(deliveriesControll.getDateNow());
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
        }else{
            deliveriesControll.fetchComboBoxValue(Customer_Id, Promo_Id, User_Id, Gallon_Id);
            deliveriesControll.getDeliveriesInfo(btn_id, Customer_Id,Date_Order,Date_Delivered, Quantity, Promo_Id, Status, User_Id);
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
        Customer_Id = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Date_Delivered = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Quantity = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        Promo_Id = new javax.swing.JComboBox<>();
        lbls = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        lbls1 = new javax.swing.JLabel();
        User_Id = new javax.swing.JComboBox<>();
        updatebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Date_Order = new com.toedter.calendar.JDateChooser();
        Gallon_Id = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deliveries Form");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 230, 40));

        Customer_Id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customer_IdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Customer_IdMousePressed(evt);
            }
        });
        Customer_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_IdActionPerformed(evt);
            }
        });
        add(Customer_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, 40));

        jLabel2.setText("Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 40));

        jLabel3.setText("Customer Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 40));
        add(Date_Delivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 200, 40));

        jLabel4.setText("Date Delivered");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 80, 40));
        add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 90, 40));

        jLabel5.setText("Promo");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, 40));

        add(Promo_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 190, 40));

        lbls.setText("Status");
        add(lbls, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 80, 40));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Delivered" }));
        add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 190, 40));

        lbls1.setText("Delivered By");
        add(lbls1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 40));

        add(User_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 190, 40));

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

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("X");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, 30));

        jLabel6.setText("Date Order");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 80, 40));
        add(Date_Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 200, 40));

        Gallon_Id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gallon_IdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Gallon_IdMousePressed(evt);
            }
        });
        Gallon_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gallon_IdActionPerformed(evt);
            }
        });
        add(Gallon_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 190, 40));

        jLabel7.setText("Gallon Type");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
            deliveriesModel = new DeliveriesModel(btn_id,customerControll.customerlist().get(Customer_Id.getSelectedIndex()).getID(),dateFormat.format(Date_Order.getDate()),dateFormat.format(Date_Delivered.getDate()),gallonsControll.gallonList().get(Gallon_Id.getSelectedIndex()).getCode(),(int) Quantity.getValue(),promoControll.promosList().get(Promo_Id.getSelectedIndex()).getId(),Status.getSelectedIndex(),userControll.userList().get(User_Id.getSelectedIndex()).getId());
            if (deliveriesControll.updateDeliveries(deliveriesModel, promoTable)) {
                out.dispose();
                new ContainerController(lalagyanan,new Views.PointOfSale.Deliveries(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeliveriesModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try {
            deliveriesModel = new DeliveriesModel(btn_id,customerControll.customerlist().get(Customer_Id.getSelectedIndex()).getID(),dateFormat.format(Date_Order.getDate()),dateFormat.format(Date_Delivered.getDate()),gallonsControll.gallonList().get(Gallon_Id.getSelectedIndex()).getCode(),(int) Quantity.getValue(),promoControll.promosList().get(Promo_Id.getSelectedIndex()).getId(),Status.getSelectedIndex(),userControll.userList().get(User_Id.getSelectedIndex()).getId());
            if (deliveriesControll.addDeliveries(deliveriesModel, promoTable)) {
                out.dispose();
                new ContainerController(lalagyanan,new Views.PointOfSale.Deliveries(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeliveriesModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if (deliveriesControll.deleteUser(btn_id, promoTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.PointOfSale.Deliveries(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Customer_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_IdActionPerformed
//        JOptionPane.showMessageDialog(null,"ge");
    }//GEN-LAST:event_Customer_IdActionPerformed

    private void Customer_IdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customer_IdMouseClicked

    }//GEN-LAST:event_Customer_IdMouseClicked

    private void Customer_IdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customer_IdMousePressed

    }//GEN-LAST:event_Customer_IdMousePressed

    private void Gallon_IdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gallon_IdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Gallon_IdMouseClicked

    private void Gallon_IdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gallon_IdMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gallon_IdMousePressed

    private void Gallon_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gallon_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gallon_IdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Customer_Id;
    private com.toedter.calendar.JDateChooser Date_Delivered;
    private com.toedter.calendar.JDateChooser Date_Order;
    private javax.swing.JComboBox<String> Gallon_Id;
    private javax.swing.JComboBox<String> Promo_Id;
    private javax.swing.JSpinner Quantity;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JComboBox<String> User_Id;
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbls;
    private javax.swing.JLabel lbls1;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
