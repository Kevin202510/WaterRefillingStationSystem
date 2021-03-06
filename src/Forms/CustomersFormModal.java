/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.CustomerController;
import Controllers.GallonsController;
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
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

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
    GallonsController gallonsControll = new GallonsController();
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
    
    private void checkBtn(int btn_id){
        if (btn_id==0) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
        }else{
            customersControll. getCustomerInfo(btn_id,customerFname, customerMname, customerLname, customerAddress, customerContact,customerSuki);
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
        jLabel1 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        customerMname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        customerLname = new javax.swing.JTextField();
        customerSuki = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(40, 172, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 40, 160, 40));

        updatebtn.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 200, 43));

        deletebtn.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 200, 43));

        addbtn.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        addbtn.setText("ADD");
        addbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 200, 43));

        customerFname.setBackground(new Color(0,0,0,1));
        customerFname.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        customerFname.setForeground(new java.awt.Color(255, 255, 255));
        customerFname.setAutoscrolls(false);
        customerFname.setBorder(null);
        customerFname.setOpaque(false);
        customerFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerFnameKeyTyped(evt);
            }
        });
        jPanel1.add(customerFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 30));

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Last Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        customerAddress.setBackground(new Color(0,0,0,1));
        customerAddress.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        customerAddress.setForeground(new java.awt.Color(255, 255, 255));
        customerAddress.setBorder(null);
        customerAddress.setOpaque(false);
        customerAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerAddressKeyTyped(evt);
            }
        });
        jPanel1.add(customerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 200, 30));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 30));

        jLabel5.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact  No. :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 30));

        customerContact.setBackground(new Color(0,0,0,1));
        customerContact.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        customerContact.setForeground(new java.awt.Color(255, 255, 255));
        customerContact.setBorder(null);
        customerContact.setOpaque(false);
        customerContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerContactKeyTyped(evt);
            }
        });
        jPanel1.add(customerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, 30));

        jLabel7.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Suki :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 70, 40));

        customerMname.setBackground(new Color(0,0,0,1));
        customerMname.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        customerMname.setForeground(new java.awt.Color(255, 255, 255));
        customerMname.setBorder(null);
        customerMname.setOpaque(false);
        customerMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerMnameKeyTyped(evt);
            }
        });
        jPanel1.add(customerMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, 30));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Middle Name :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));

        jButton1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setNextFocusableComponent(customerFname);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 30));

        customerLname.setBackground(new Color(0,0,0,1));
        customerLname.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        customerLname.setForeground(new java.awt.Color(255, 255, 255));
        customerLname.setBorder(null);
        customerLname.setOpaque(false);
        customerLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerLnameKeyTyped(evt);
            }
        });
        jPanel1.add(customerLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 200, 30));

        customerSuki.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        customerSuki.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suki", "Not Suki" }));
        jPanel1.add(customerSuki, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 200, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 200, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, 10));

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
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        customermodel = new CustomerModel(0,customerFname.getText(),customerMname.getText(),customerLname.getText(),
            customerAddress.getText(),customerContact.getText(),customerSuki.getSelectedIndex()+1);
        if (customersControll.addCustomer(customermodel,customersTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Customer.Customers(lalagyanan));
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(customersControll.deleteCustomer(btn_id,customersTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.Customer.Customers(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

        customermodel = new CustomerModel(btn_id,customerFname.getText(),
            customerMname.getText(),customerLname.getText(),customerAddress.getText(),customerContact.getText(),customerSuki.getSelectedIndex()+1);
        if (customersControll.updateCustomer(customermodel, customersTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Customer.Customers(lalagyanan));
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void customerFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerFnameKeyTyped
        // TODO add your handling code here:
        
            char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE)||
             (c == KeyEvent.VK_SPACE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_customerFnameKeyTyped

    private void customerMnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerMnameKeyTyped
        // TODO add your handling code here:
        
            char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE)||
             (c == KeyEvent.VK_SPACE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_customerMnameKeyTyped

    private void customerLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerLnameKeyTyped
        // TODO add your handling code here:
        
            char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE)||
             (c == KeyEvent.VK_SPACE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_customerLnameKeyTyped

    private void customerAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerAddressKeyTyped

    }//GEN-LAST:event_customerAddressKeyTyped

    private void customerContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerContactKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_customerContactKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addbtn;
    private javax.swing.JTextField customerAddress;
    private javax.swing.JTextField customerContact;
    private javax.swing.JTextField customerFname;
    private javax.swing.JTextField customerLname;
    private javax.swing.JTextField customerMname;
    private javax.swing.JComboBox<String> customerSuki;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
