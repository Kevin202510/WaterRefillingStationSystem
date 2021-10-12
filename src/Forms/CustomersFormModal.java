/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.CustomerController;
import static Forms.CustomersFormModal.btn_id;
import static Forms.CustomersFormModal.customersTable;
import static Forms.CustomersFormModal.lalagyanan;
import static Forms.CustomersFormModal.out;
import Models.CustomerModel;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author ChelseaTorres
 */
public class CustomersFormModal extends javax.swing.JPanel {

    /**
     * Creates new form CustomersFormModal
     */
     static int btn_id;
    CustomerModel customermodel;
    CustomerController customersControll = new CustomerController();
    static JTable customersTable;
    static JPanel lalagyanan;
    static JFrame out;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
   
    public CustomersFormModal(JFrame out,int btn_id,JTable customersTable,JPanel lalagyanan) {
      this.btn_id = btn_id;
        this.customersTable = customersTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
        initComponents();
       checkBtn(btn_id);
   }

    //public CustomersFormModal(int btn_id,JTable customersTable,JPanel lalagyanan) {
      //  this.btn_id = btn_id;
      //  this.customersTable = customersTable;
      //  this.lalagyanan = lalagyanan;
      //  initComponents();
      //  checkBtn(btn_id);
    //}
    private void checkBtn(int btn_id){
        if (btn_id==0) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
        }else{
            customersControll. getCustomerInfo(btn_id,customerFname, customerMname, customerLname, customerAddress, customerContact,customerIsBorrowed,customerGallonId, customerGallonQuantity, customerSuki);
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

        jPanel1 = new javax.swing.JPanel();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        customerFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        customerIsBorrowed = new javax.swing.JTextField();
        customerGallonId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        customerGallonQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        customerMname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        customerSuki = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        profilename = new javax.swing.JTextField();
        customerLname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(310, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 100, 43));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 100, 43));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 100, 43));
        jPanel1.add(customerFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, 30));

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 30));
        jPanel1.add(customerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, 30));

        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        jLabel5.setText("Contact");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 30));
        jPanel1.add(customerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, 30));

        jLabel6.setText("isBorrowed");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, 30));
        jPanel1.add(customerIsBorrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, 30));
        jPanel1.add(customerGallonId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 190, 30));

        jLabel7.setText("isSuki");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 30));
        jPanel1.add(customerGallonQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 190, 30));

        jLabel8.setText("Gallon Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 30));
        jPanel1.add(customerMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 30));

        jLabel9.setText("Middle Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));
        jPanel1.add(customerSuki, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 190, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 30));

        profilename.setEditable(false);
        profilename.setBorder(null);
        profilename.setEnabled(false);
        profilename.setOpaque(false);
        jPanel1.add(profilename, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));
        jPanel1.add(customerLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, 30));

        jLabel10.setText("Gallon Id");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

            customermodel = new CustomerModel(btn_id,customerFname.getText(),
            customerMname.getText(),customerLname.getText(),customerAddress.getText(),customerContact.getText(),Integer.parseInt(customerIsBorrowed.getText())
            ,Integer.parseInt(customerGallonId.getText()),Integer.parseInt(customerGallonQuantity.getText()),Integer.parseInt(customerSuki.getText()));
        if (customersControll.updateCustomer(customermodel, customersTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Customers(lalagyanan));
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
          if(customersControll.deleteCustomer(btn_id,customersTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.Customers(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        customermodel = new CustomerModel(0,customerFname.getText(),customerMname.getText(),customerLname.getText(),
            customerAddress.getText(),customerContact.getText(),Integer.parseInt(customerIsBorrowed.getText()),Integer.parseInt(customerGallonId.getText()),Integer.parseInt(customerGallonQuantity.getText()),Integer.parseInt(customerSuki.getText()));
        if (customersControll.addCustomer(customermodel,customersTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Customers(lalagyanan));
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addbtn;
    private javax.swing.JTextField customerAddress;
    private javax.swing.JTextField customerContact;
    private javax.swing.JTextField customerFname;
    private javax.swing.JTextField customerGallonId;
    private javax.swing.JTextField customerGallonQuantity;
    private javax.swing.JTextField customerIsBorrowed;
    private javax.swing.JTextField customerLname;
    private javax.swing.JTextField customerMname;
    private javax.swing.JTextField customerSuki;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField profilename;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}