/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ReportsButtonsController;
import javax.swing.JPanel;

/**
 *
 * @author KevinCaluag
 */
public class Reports extends javax.swing.JPanel {

    /**
     * Creates new form Reports
     */
    ReportsButtonsController reportsbuttonControll;
    JPanel lalagyanan;
            
    public Reports(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        reportsbuttonControll = new ReportsButtonsController(lalagyananreportspanel);
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
        jLabel2 = new javax.swing.JLabel();
        brReportbtn = new javax.swing.JButton();
        salesReportbtn = new javax.swing.JButton();
        tlReportbtn = new javax.swing.JButton();
        lalagyananreportspanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1100, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(64, 43, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reports");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        brReportbtn.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        brReportbtn.setForeground(new java.awt.Color(255, 255, 255));
        brReportbtn.setText("<html><center>Borrow and Return  Gallons Logs</center></html>");
        brReportbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        brReportbtn.setContentAreaFilled(false);
        brReportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brReportbtnActionPerformed(evt);
            }
        });
        jPanel1.add(brReportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 170, 40));

        salesReportbtn.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        salesReportbtn.setForeground(new java.awt.Color(255, 255, 255));
        salesReportbtn.setText("Sales");
        salesReportbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        salesReportbtn.setContentAreaFilled(false);
        salesReportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReportbtnActionPerformed(evt);
            }
        });
        jPanel1.add(salesReportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 170, 40));

        tlReportbtn.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        tlReportbtn.setForeground(new java.awt.Color(255, 255, 255));
        tlReportbtn.setText("Transaction Logs");
        tlReportbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tlReportbtn.setContentAreaFilled(false);
        tlReportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlReportbtnActionPerformed(evt);
            }
        });
        jPanel1.add(tlReportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 170, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, 90));

        lalagyananreportspanel.setBackground(new java.awt.Color(255, 255, 255));
        lalagyananreportspanel.setPreferredSize(new java.awt.Dimension(1100, 520));
        lalagyananreportspanel.setLayout(new javax.swing.BoxLayout(lalagyananreportspanel, javax.swing.BoxLayout.LINE_AXIS));
        add(lalagyananreportspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1080, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void salesReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReportbtnActionPerformed
        reportsbuttonControll.SalesReport(salesReportbtn);
    }//GEN-LAST:event_salesReportbtnActionPerformed

    private void tlReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlReportbtnActionPerformed
        reportsbuttonControll.TransactionLogsReport(tlReportbtn);
    }//GEN-LAST:event_tlReportbtnActionPerformed

    private void brReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brReportbtnActionPerformed
        reportsbuttonControll.BorrowAndReturnGallonLogsReport(brReportbtn);
    }//GEN-LAST:event_brReportbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brReportbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lalagyananreportspanel;
    private javax.swing.JButton salesReportbtn;
    private javax.swing.JButton tlReportbtn;
    // End of variables declaration//GEN-END:variables
}
