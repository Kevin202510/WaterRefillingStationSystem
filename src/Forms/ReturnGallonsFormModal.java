/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.BorrowAndReturnGallonsController;
import Controllers.ContainerController;
import Controllers.CustomerController;
import Controllers.GallonsController;
import Models.Return_GallonsModel;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author KevinCaluag
 */
public class ReturnGallonsFormModal extends javax.swing.JPanel {

    /**
     * Creates new form ReturnGallonsFormModal
     */
    static JTable returngallonTable;
    static JFrame out;
    static JPanel lalagyanan;
    static int btn_id;
    Return_GallonsModel returngallonModel;
    BorrowAndReturnGallonsController borrowandreturngallonsControll = new BorrowAndReturnGallonsController();
    CustomerController customerControll = new CustomerController();
    GallonsController gallonControll = new GallonsController();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    
    public ReturnGallonsFormModal(JFrame out,int btn_id,JTable gallonsTable,JPanel lalagyanan) {
        initComponents();
        this.btn_id = btn_id;
        this.returngallonTable = gallonsTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
        borrowandreturngallonsControll.fetchComboBoxValue(Customer_Id,gallonType_Id);
        checkBtn(btn_id);
    }
    
    private void checkBtn(int btn_id){
        if (btn_id==0) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
//            Code.setText(gallonsControll.generateGallonCode());
        }else{
//            borrowandreturngallonsControll.getReturnGallonsInfo(btn_id,Customer_Id,gallonType_Id,gallonQuantity,DateReturn);
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

        jButton2 = new javax.swing.JButton();
        Customer_Id = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gallonType_Id = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        gallonQuantity = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        DateReturn = new com.toedter.calendar.JDateChooser();
        updatebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setBackground(new java.awt.Color(102, 153, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jButton2.setText("X");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 50, 40));

        Customer_Id.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        add(Customer_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, 30));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Customer Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Gallon Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, 30));

        gallonType_Id.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        add(gallonType_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, 30));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Quantity");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 30));

        gallonQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        gallonQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gallonQuantityStateChanged(evt);
            }
        });
        add(gallonQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 190, 30));

        jLabel10.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Date Barrowed");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 30));

        DateReturn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateReturnPropertyChange(evt);
            }
        });
        add(DateReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 190, 30));

        updatebtn.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 190, 30));

        addbtn.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        addbtn.setText("ADD");
        addbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 190, 30));

        deletebtn.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 190, 30));

        label1.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 51));
        label1.setName("Returned Gallons"); // NOI18N
        label1.setText("Returned Gallons");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void gallonQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gallonQuantityStateChanged
//        if(Integer.parseInt(gallonQuantity.getValue().toString())>=5){
//            Promo_Id.setEnabled(true);
//            promothis = Promo_Id.getSelectedItem().toString();
//        }else{
//            Promo_Id.setEnabled(false);
//            promothis = "Not Applicable";
//        }
    }//GEN-LAST:event_gallonQuantityStateChanged

    private void DateReturnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateReturnPropertyChange
//        setMinimumDate();
    }//GEN-LAST:event_DateReturnPropertyChange

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
//       try {
//             returngallonModel = new Return_GallonsModel(btn_id,customerControll.customerlist().get(Customer_Id.getSelectedIndex()).getID(),gallonControll.gallonList().get(gallonType_Id.getSelectedIndex()).getCode(),Integer.parseInt(gallonQuantity.getValue().toString()),df.format(DateReturn.getDate()));
//         if (borrowandreturngallonsControll.updateReturnGallon(returngallonModel,returngallonTable)) {
//                out.dispose();
//               new ContainerController(lalagyanan,new Views.PointOfSale.ReturnGallons(lalagyanan));
//
//            }
//         } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(ReturnGallonsFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
//
//        try {
//            returngallonModel = new Return_GallonsModel(0,customerControll.customerlist().get(Customer_Id.getSelectedIndex()).getID(),gallonControll.gallonList().get(gallonType_Id.getSelectedIndex()).getCode(),Integer.parseInt(gallonQuantity.getValue().toString()),df.format(DateReturn.getDate()));
////            if (borrowandreturngallonsControll.addReturnGallon(returngallonModel,returngallonTable)) {
////                out.dispose();
////                new ContainerController(lalagyanan,new Views.PointOfSale.ReturnGallons(lalagyanan));
////            }
//        } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(ReturnGallonsFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(borrowandreturngallonsControll.deleteReturnGallons(btn_id,returngallonTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.Gallons.Gallons(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Customer_Id;
    private com.toedter.calendar.JDateChooser DateReturn;
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JSpinner gallonQuantity;
    private javax.swing.JComboBox<String> gallonType_Id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label1;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
