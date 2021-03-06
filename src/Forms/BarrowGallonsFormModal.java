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
import static Forms.ReturnGallonsFormModal.btn_id;
import Models.Borrow_GallonsModel;
import Models.Return_GallonsModel;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author ChelseaTorres
 */
public class BarrowGallonsFormModal extends javax.swing.JPanel {

    /**
     * Creates new form BarrowGallonsFormModal
     */
    public BarrowGallonsFormModal() {
        initComponents();
    }

     static JTable barrowgallonTable;
    static JFrame out;
    static JPanel lalagyanan;
    static int btn_id;
    Borrow_GallonsModel barrowngallonModel;
    BorrowAndReturnGallonsController borrowandreturngallonsControll = new BorrowAndReturnGallonsController();
    CustomerController customerControll = new CustomerController();
    GallonsController gallonControll = new GallonsController();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    
    public BarrowGallonsFormModal(JFrame out,int btn_id,JTable borrowgallontbl,JPanel lalagyanan) {
        initComponents();
        this.btn_id = btn_id;
        this.barrowgallonTable = borrowgallontbl;
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
            borrowandreturngallonsControll.getBarrowGallonsInfo(btn_id,Customer_Id,gallonType_Id,gallonQuantity,DateBarrow);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Customer_Id = new javax.swing.JComboBox<>();
        gallonType_Id = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        gallonQuantity = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        DateBarrow = new com.toedter.calendar.JDateChooser();
        updatebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(40, 172, 234));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 50, 40));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gallon Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        Customer_Id.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        add(Customer_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 190, 30));

        gallonType_Id.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        add(gallonType_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 30));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        gallonQuantity.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        gallonQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        gallonQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gallonQuantityStateChanged(evt);
            }
        });
        add(gallonQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, 30));

        jLabel10.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date Return");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 30));

        DateBarrow.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateBarrowPropertyChange(evt);
            }
        });
        add(DateBarrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 190, 30));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 100, 43));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 100, 43));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 100, 43));
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

    private void DateBarrowPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateBarrowPropertyChange
        //        setMinimumDate();
    }//GEN-LAST:event_DateBarrowPropertyChange

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
//        try {
//            barrowngallonModel = new Borrow_GallonsModel(btn_id,customerControll.customerlist().get(Customer_Id.getSelectedIndex()).getID(),gallonControll.gallonList().get(gallonType_Id.getSelectedIndex()).getCode(),Integer.parseInt(gallonQuantity.getValue().toString()),df.format(DateBarrow.getDate()));
//            if (borrowandreturngallonsControll.updateBorrowGallon(barrowngallonModel,barrowgallonTable)) {
//                out.dispose();
//                new ContainerController(lalagyanan,new Views.BorrowAndReturnGallons.BorrowAndReturnGallons(lalagyanan));
//
//            }
//        } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(ReturnGallonsFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed

//        try {
//            barrowngallonModel = new Borrow_GallonsModel(0,customerControll.customerlist().get(Customer_Id.getSelectedIndex()).getID(),gallonControll.gallonList().get(gallonType_Id.getSelectedIndex()).getCode(),Integer.parseInt(gallonQuantity.getValue().toString()),df.format(DateBarrow.getDate()));
//            if (borrowandreturngallonsControll.addBorrowGallon(barrowngallonModel,barrowgallonTable)) {
//                out.dispose();
//                new ContainerController(lalagyanan,new Views.BorrowAndReturnGallons.BorrowAndReturnGallons(lalagyanan));
//            }
//        } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(ReturnGallonsFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(borrowandreturngallonsControll.deleteBarrowGallons(btn_id,barrowgallonTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.Gallons.Gallons(lalagyanan));        }
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Customer_Id;
    private com.toedter.calendar.JDateChooser DateBarrow;
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JSpinner gallonQuantity;
    private javax.swing.JComboBox<String> gallonType_Id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
