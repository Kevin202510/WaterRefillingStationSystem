/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author ChelseaTorres
 */
public class SalesFofrmModal extends javax.swing.JPanel {
    static JTable SalesTable;
    static JPanel lalagyanan;
    static JFrame out;
    static int btn_id;
    /**
     * Creates new form SalesFofrmModal
     */
    public SalesFofrmModal(JFrame out,int btn_id,JTable SalesTable,JPanel lalagyanan) {
        this.out = out;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Date_From = new com.toedter.calendar.JDateChooser();
        Date_To = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(85, 64, 118));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sales");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 240, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, 30));
        add(Date_From, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 30));
        add(Date_To, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, 30));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date From");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 81, 30));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date To");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 81, 30));

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        add(OKButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 80, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       out.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        // TODO add your handling code here:
        //Id Sales_Date Amount User_id
    }//GEN-LAST:event_OKButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_From;
    private com.toedter.calendar.JDateChooser Date_To;
    private javax.swing.JButton OKButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
