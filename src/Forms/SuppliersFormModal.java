/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.SupplierController;
import Controllers.PromosController;
import static Forms.GallonsFormModal.gallonTable;
import static Forms.GallonsFormModal.lalagyanan;
import static Forms.GallonsFormModal.out;
import Models.GallonsModel;
import Models.SupplierModel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author CALUAG FAMILY
 */
public class SuppliersFormModal extends javax.swing.JPanel {
    static int btn_id;
    SupplierController suliersControll = new SupplierController();  
    SupplierModel suppliermodel;
    static JTable suppliersTable;
    static JPanel lalagyanan;
    static JFrame out;
    /**
     * Creates new form SuppliersFormModal
     */
    public SuppliersFormModal(JFrame out,int btn_id,JTable suppliersTable,JPanel lalagyanan) {
        this.btn_id = btn_id;
        this.suppliersTable = suppliersTable;
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
           suliersControll.getSpplierInfo(btn_id, Fname,Mname, Lname, Company_name, Company_Address, Contact);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Mname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        Company_name = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Company_Address = new javax.swing.JTextField();
        Contact = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(85, 64, 118));
        setNextFocusableComponent(Fname);
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Suppliers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 177, 37));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 43));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 100, 43));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 100, 43));

        jLabel7.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 30));

        jLabel8.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 30));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Middle Name");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 30));

        jLabel10.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Company Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 30));

        Fname.setBackground(new Color(0,0,0,1));
        Fname.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Fname.setForeground(new java.awt.Color(255, 255, 255));
        Fname.setBorder(null);
        Fname.setOpaque(false);
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        Mname.setBackground(new Color(0,0,0,1));
        Mname.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Mname.setForeground(new java.awt.Color(255, 255, 255));
        Mname.setBorder(null);
        Mname.setOpaque(false);
        add(Mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 30));

        Lname.setBackground(new Color(0,0,0,1));
        Lname.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Lname.setForeground(new java.awt.Color(255, 255, 255));
        Lname.setBorder(null);
        Lname.setOpaque(false);
        add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, 30));

        Company_name.setBackground(new Color(0,0,0,1));
        Company_name.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Company_name.setForeground(new java.awt.Color(255, 255, 255));
        Company_name.setBorder(null);
        Company_name.setOpaque(false);
        add(Company_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("X");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setNextFocusableComponent(Fname);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, 30));

        jLabel11.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Company Address");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 30));

        Company_Address.setBackground(new Color(0,0,0,1));
        Company_Address.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Company_Address.setForeground(new java.awt.Color(255, 255, 255));
        Company_Address.setBorder(null);
        Company_Address.setOpaque(false);
        add(Company_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, 30));

        Contact.setBackground(new Color(0,0,0,1));
        Contact.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Contact.setForeground(new java.awt.Color(255, 255, 255));
        Contact.setBorder(null);
        Contact.setOpaque(false);
        add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 200, 30));

        jLabel12.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contact");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 10));

        getAccessibleContext().setAccessibleParent(Fname);
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
suppliermodel = new SupplierModel(btn_id,Fname.getText(),Lname.getText(),Mname.getText(),Company_name.getText(),Company_Address.getText(),Contact.getText());
        if (suliersControll.updateSupplier(suppliermodel,suppliersTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Supplier(lalagyanan));
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
      suppliermodel = new SupplierModel(0,Fname.getText(),Lname.getText(),Mname.getText(),Company_name.getText(),Company_Address.getText(),Contact.getText());
        if (suliersControll.addSupplier(suppliermodel,suppliersTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Supplier(lalagyanan));
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(suliersControll.deleteSupplier(btn_id,suppliersTable)){
            out.dispose();
          new ContainerController(lalagyanan,new Views.Supplier(lalagyanan));
       }

    }//GEN-LAST:event_deletebtnActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Company_Address;
    private javax.swing.JTextField Company_name;
    private javax.swing.JTextField Contact;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Mname;
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
