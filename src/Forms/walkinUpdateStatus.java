/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.DeliveriesController;
import Controllers.SQLController;
import Models.DeliveriesModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author KevinCaluag
 */
public class walkinUpdateStatus extends javax.swing.JFrame {

    /**
     * Creates new form walkinUpdateStatus
     */
    static JTable walkinTable;
    static JPanel lalagyanan;
    static JFrame out;
    static int btn_id;
    DeliveriesModel deliveriesModel;
    DeliveriesController deliveriesControll = new DeliveriesController();
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    
    public walkinUpdateStatus(int btn_id,JTable walkinTable,JPanel lalagyanan) {
        this.btn_id = btn_id;
        this.walkinTable = walkinTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
        initComponents();
        getTransactionLogId();
        getTransactionsLogId();
        if (transids==0) {
            statval.setEditable(true);
        }else{
            statval.setEditable(false);
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
        statval = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 172, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WalkIn Status");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 30));

        statval.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        statval.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                statvalKeyPressed(evt);
            }
        });
        jPanel1.add(statval, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 40));

        jButton1.setText("Delete");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 40));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 40));

        jButton3.setText("X");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 0, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statvalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statvalKeyPressed
        if (evt.getKeyCode()==10) {
            deliveriesModel = new DeliveriesModel(btn_id,Integer.parseInt(statval.getText()));
            if (deliveriesControll.updateWalkIn(deliveriesModel, walkinTable)) {
                this.dispose();
                new ContainerController(lalagyanan,new Views.PointOfSale.WalkIn(lalagyanan));
            }
        }
    }//GEN-LAST:event_statvalKeyPressed

    
    int transid;
    int transids;
    public void getTransactionLogId(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transactions WHERE ID = '" +btn_id+"'");
            if (rs.next()) {
                transid = rs.getInt("Transaction_Id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(WalkInTransactionForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getTransactionsLogId(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transactions_logs WHERE Transaction_Id = '" +transid+"'");
            if (rs.next()) {
                transids = rs.getInt("paymentStatus");
            }
        } catch (SQLException ex) {
            Logger.getLogger(WalkInTransactionForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (transids==0) {
            JOptionPane.showMessageDialog(this,"You Cannot Update This Data");
        }else{
            new WalkInTransactionForm(btn_id,walkinTable,this,lalagyanan).setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(walkinUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(walkinUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(walkinUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(walkinUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new walkinUpdateStatus(btn_id,walkinTable,lalagyanan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField statval;
    // End of variables declaration//GEN-END:variables
}
