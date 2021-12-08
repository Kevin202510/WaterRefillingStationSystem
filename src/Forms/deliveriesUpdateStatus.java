/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.DeliveriesController;
import static Forms.DeliveriesModal.btn_id;
import static Forms.DeliveriesModal.deliveriestable;
import static Forms.DeliveriesModal.lalagyanan;
import static Forms.DeliveriesModal.out;
import Models.DeliveriesModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author KevinCaluag
 */
public class deliveriesUpdateStatus extends javax.swing.JFrame {

    /**
     * Creates new form deliveriesUpdateStatus
     */
    static JTable deliveriestable;
    static JPanel lalagyanan;
    static JFrame out;
    static int btn_id;
    DeliveriesModel deliveriesModel;
    DeliveriesController deliveriesControll = new DeliveriesController();
    
    public deliveriesUpdateStatus(int btn_id,JTable deliveriestable,JPanel lalagyanan) {
        this.btn_id = btn_id;
        this.deliveriestable = deliveriestable;
        this.lalagyanan = lalagyanan;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        statval = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 172, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Status");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        statval.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        statval.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                statvalKeyPressed(evt);
            }
        });
        jPanel1.add(statval, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 40));

        jButton1.setText("Delete");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 40));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statvalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statvalKeyPressed
        if (evt.getKeyCode()==10) {
            deliveriesModel = new DeliveriesModel(btn_id,Integer.parseInt(statval.getText()));
            if (deliveriesControll.updateDeliveries(deliveriesModel, deliveriestable)) {
                this.dispose();
                new ContainerController(lalagyanan,new Views.PointOfSale.Deliveries(lalagyanan));
            }
        }
    }//GEN-LAST:event_statvalKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FrameFormModal(9,btn_id,deliveriestable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(deliveriesUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deliveriesUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deliveriesUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deliveriesUpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deliveriesUpdateStatus(btn_id,deliveriestable,lalagyanan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField statval;
    // End of variables declaration//GEN-END:variables
}
