/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ButtonsController;
import Controllers.DeliveriesController;
import Controllers.PosActionButtonController;
import Forms.FrameFormModal;
import javax.swing.JPanel;

/**
 *
 * @author ChelseaTorres
 */
public class Pos extends javax.swing.JPanel {

    /**
     * Creates new form Pos
     */
    JPanel lalagyanan;
    PosActionButtonController buttonControll;
    
    public Pos(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        buttonControll = new PosActionButtonController(lalagyananpospanel);
        buttonControll.TransactionButton(transactions);
//        InitRun();
    }
//    
//    private void InitRun(){
//        deliveriesControll.showDeliveries(deliveriesTable);
//    }

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
        btndeliver = new javax.swing.JButton();
        btnbuy = new javax.swing.JButton();
        btnwalkin = new javax.swing.JButton();
        pickup = new javax.swing.JButton();
        barrowandreturn = new javax.swing.JButton();
        transactions = new javax.swing.JLabel();
        btnPos = new javax.swing.JButton();
        lalagyananpospanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        jPanel1.setBackground(new java.awt.Color(64, 43, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(995, 111));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Point Of Sales");

        btndeliver.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btndeliver.setForeground(new java.awt.Color(255, 255, 255));
        btndeliver.setText("Deliveries");
        btndeliver.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btndeliver.setContentAreaFilled(false);
        btndeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliverActionPerformed(evt);
            }
        });

        btnbuy.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btnbuy.setForeground(new java.awt.Color(255, 255, 255));
        btnbuy.setText("Buy");
        btnbuy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnbuy.setContentAreaFilled(false);
        btnbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyActionPerformed(evt);
            }
        });

        btnwalkin.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btnwalkin.setForeground(new java.awt.Color(255, 255, 255));
        btnwalkin.setText("Walk In");
        btnwalkin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnwalkin.setContentAreaFilled(false);
        btnwalkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwalkinActionPerformed(evt);
            }
        });

        pickup.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        pickup.setForeground(new java.awt.Color(255, 255, 255));
        pickup.setText("Pick Up");
        pickup.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pickup.setContentAreaFilled(false);
        pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupActionPerformed(evt);
            }
        });

        barrowandreturn.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        barrowandreturn.setForeground(new java.awt.Color(255, 255, 255));
        barrowandreturn.setText("<html><center>Return  Gallons</center></html>");
        barrowandreturn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        barrowandreturn.setContentAreaFilled(false);
        barrowandreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barrowandreturnActionPerformed(evt);
            }
        });

        btnPos.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btnPos.setForeground(new java.awt.Color(255, 255, 255));
        btnPos.setText("Pos");
        btnPos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPos.setContentAreaFilled(false);
        btnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btndeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnwalkin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(barrowandreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(transactions))
                    .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwalkin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barrowandreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lalagyananpospanel.setBackground(new java.awt.Color(255, 255, 255));
        lalagyananpospanel.setPreferredSize(new java.awt.Dimension(990, 480));
        lalagyananpospanel.setLayout(new javax.swing.BoxLayout(lalagyananpospanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, Short.MAX_VALUE)
                    .addComponent(lalagyananpospanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lalagyananpospanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliverActionPerformed
        buttonControll.DeliveriesButton(btndeliver);
    }//GEN-LAST:event_btndeliverActionPerformed

    private void btnwalkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwalkinActionPerformed
        buttonControll.WalkInButton(btnwalkin);
    }//GEN-LAST:event_btnwalkinActionPerformed

    private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
        buttonControll.BuyButton(btnbuy);
    }//GEN-LAST:event_btnbuyActionPerformed

    private void pickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickupActionPerformed

    private void barrowandreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barrowandreturnActionPerformed
        buttonControll.ReturnGallonButton(barrowandreturn);
    }//GEN-LAST:event_barrowandreturnActionPerformed

    private void btnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosActionPerformed
        buttonControll.PosButton(btnPos);
    }//GEN-LAST:event_btnPosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barrowandreturn;
    private javax.swing.JButton btnPos;
    private javax.swing.JButton btnbuy;
    private javax.swing.JButton btndeliver;
    private javax.swing.JButton btnwalkin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lalagyananpospanel;
    private javax.swing.JButton pickup;
    private javax.swing.JLabel transactions;
    // End of variables declaration//GEN-END:variables
}
