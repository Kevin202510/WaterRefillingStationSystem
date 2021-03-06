/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.PointOfSale;

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
        waterTypes = new javax.swing.JButton();
        btnwalkin = new javax.swing.JButton();
        transactions = new javax.swing.JLabel();
        btnPos = new javax.swing.JButton();
        btntransactionlogs = new javax.swing.JButton();
        lalagyananpospanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 180, 216));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(995, 111));

        jLabel2.setBackground(new java.awt.Color(255, 232, 182));
        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Point Of Sales");

        btndeliver.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btndeliver.setForeground(new java.awt.Color(51, 51, 51));
        btndeliver.setText("Deliveries");
        btndeliver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        btndeliver.setContentAreaFilled(false);
        btndeliver.setPreferredSize(new java.awt.Dimension(35, 25));
        btndeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliverActionPerformed(evt);
            }
        });

        waterTypes.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        waterTypes.setForeground(new java.awt.Color(51, 51, 51));
        waterTypes.setText("Water Types");
        waterTypes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        waterTypes.setContentAreaFilled(false);
        waterTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterTypesActionPerformed(evt);
            }
        });

        btnwalkin.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btnwalkin.setForeground(new java.awt.Color(51, 51, 51));
        btnwalkin.setText("Walk In");
        btnwalkin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        btnwalkin.setContentAreaFilled(false);
        btnwalkin.setPreferredSize(new java.awt.Dimension(35, 25));
        btnwalkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwalkinActionPerformed(evt);
            }
        });

        btnPos.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btnPos.setForeground(new java.awt.Color(51, 51, 51));
        btnPos.setText("Pos");
        btnPos.setAlignmentX(0.5F);
        btnPos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        btnPos.setContentAreaFilled(false);
        btnPos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPos.setMargin(new java.awt.Insets(5, 14, 2, 14));
        btnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosActionPerformed(evt);
            }
        });

        btntransactionlogs.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btntransactionlogs.setForeground(new java.awt.Color(51, 51, 51));
        btntransactionlogs.setText("<html><center>Transaction Logs</center></html>");
        btntransactionlogs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        btntransactionlogs.setContentAreaFilled(false);
        btntransactionlogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransactionlogsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btndeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnwalkin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btntransactionlogs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(waterTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(transactions)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwalkin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntransactionlogs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                    .addComponent(lalagyananpospanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void waterTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterTypesActionPerformed
        buttonControll.WaterTypeButton(waterTypes);
    }//GEN-LAST:event_waterTypesActionPerformed

    private void btnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosActionPerformed
        buttonControll.PosButton(btnPos);
    }//GEN-LAST:event_btnPosActionPerformed

    private void btntransactionlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactionlogsActionPerformed
        buttonControll.TransactionLogsButton(btntransactionlogs);
    }//GEN-LAST:event_btntransactionlogsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPos;
    private javax.swing.JButton btndeliver;
    private javax.swing.JButton btntransactionlogs;
    private javax.swing.JButton btnwalkin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lalagyananpospanel;
    private javax.swing.JLabel transactions;
    private javax.swing.JButton waterTypes;
    // End of variables declaration//GEN-END:variables
}