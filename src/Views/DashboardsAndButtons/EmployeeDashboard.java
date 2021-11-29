/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.DashboardsAndButtons;

import Controllers.PosActionButtonController;
import Controllers.SystemInformationSetupController;
import Views.Authentication.Authentication;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author KevinCaluag
 */
public class EmployeeDashboard extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDashboard
     */
    
    JPanel lalagyanan;
    PosActionButtonController buttonControll;
    static int user_Id;
    SystemInformationSetupController sisc = new SystemInformationSetupController();
    
    public EmployeeDashboard(int user_Id) {
        initComponents();
        setJframeSize();
        this.user_Id = user_Id;
        systemName.setText(sisc.readFileContent());
        buttonControll = new PosActionButtonController(lalagyananpospanel);
        buttonControll.TransactionButton(transactions);
    }
    
    public void setJframeSize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int swidth = (int)screenSize.getWidth();
        int sheigth = (int)screenSize.getHeight();
        this.setSize(swidth-30,sheigth-30);
        this.setLocationRelativeTo(this);
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
        jPanel2 = new javax.swing.JPanel();
        systemName = new javax.swing.JLabel();
        btndeliver = new javax.swing.JButton();
        btntransactionlogs = new javax.swing.JButton();
        btnwalkin = new javax.swing.JButton();
        barrowandreturn = new javax.swing.JButton();
        transactions = new javax.swing.JLabel();
        btnPos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lalagyananpospanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 620));

        jPanel2.setBackground(new java.awt.Color(64, 43, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(995, 111));

        systemName.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        systemName.setForeground(new java.awt.Color(255, 255, 255));
        systemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        btntransactionlogs.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btntransactionlogs.setForeground(new java.awt.Color(255, 255, 255));
        btntransactionlogs.setText("<html><center>Transaction Logs</center></html>");
        btntransactionlogs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btntransactionlogs.setContentAreaFilled(false);
        btntransactionlogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransactionlogsActionPerformed(evt);
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

        jButton1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btndeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnwalkin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btntransactionlogs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(barrowandreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(systemName, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                        .addGap(71, 71, 71)))
                .addGap(162, 162, 162)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(systemName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(transactions))
                    .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwalkin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(barrowandreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btntransactionlogs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        lalagyananpospanel.setBackground(new java.awt.Color(255, 255, 255));
        lalagyananpospanel.setPreferredSize(new java.awt.Dimension(990, 480));
        lalagyananpospanel.setLayout(new javax.swing.BoxLayout(lalagyananpospanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1459, Short.MAX_VALUE)
                    .addComponent(lalagyananpospanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lalagyananpospanel, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliverActionPerformed
        buttonControll.DeliveriesButton(btndeliver);
    }//GEN-LAST:event_btndeliverActionPerformed

    private void btntransactionlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactionlogsActionPerformed
        buttonControll.TransactionLogsButton(btntransactionlogs);
    }//GEN-LAST:event_btntransactionlogsActionPerformed

    private void btnwalkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwalkinActionPerformed
        buttonControll.WalkInButton(btnwalkin);
    }//GEN-LAST:event_btnwalkinActionPerformed

    private void barrowandreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barrowandreturnActionPerformed
        buttonControll.ReturnGallonButton(barrowandreturn);
    }//GEN-LAST:event_barrowandreturnActionPerformed

    private void btnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosActionPerformed
        buttonControll.PosButton(btnPos);
    }//GEN-LAST:event_btnPosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Authentication().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDashboard(user_Id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barrowandreturn;
    private javax.swing.JButton btnPos;
    private javax.swing.JButton btndeliver;
    private javax.swing.JButton btntransactionlogs;
    private javax.swing.JButton btnwalkin;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lalagyananpospanel;
    private javax.swing.JLabel systemName;
    private javax.swing.JLabel transactions;
    // End of variables declaration//GEN-END:variables
}
