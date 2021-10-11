/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ButtonsController;
import Controllers.ContainerController;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Felix Caluag
 */
public class MainDashboard extends javax.swing.JFrame {

    
    static int Role_id;
    
    public MainDashboard(int Role_id) {
        initComponents();
        this.Role_id = Role_id;
        checkRole(Role_id);
//        new ContainerController(jpnl_container,new Dashboard());
    }
    
    private void checkRole(int Role_id){
        if (Role_id==1 || Role_id==2) {
            new ContainerController(jpnl_userButtons,new DeveloperAndAdminButtons(jpnl_container));
        }else if(Role_id==3) {
            new ContainerController(jpnl_userButtons,new EmployeesButtons(jpnl_container));
        }
    }
/**
     * Creates new form Dashboard
     */
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
        btn_close2 = new javax.swing.JButton();
        jpnl_userButtons = new javax.swing.JPanel();
        jpnl_container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Water Refilling Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 40));

        btn_close2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_close2.setText("X");
        btn_close2.setBorder(null);
        btn_close2.setBorderPainted(false);
        btn_close2.setContentAreaFilled(false);
        btn_close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1100, -1));

        jpnl_userButtons.setBackground(new java.awt.Color(255, 255, 255));
        jpnl_userButtons.setPreferredSize(new java.awt.Dimension(250, 700));
        jpnl_userButtons.setLayout(new javax.swing.BoxLayout(jpnl_userButtons, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jpnl_userButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

        jpnl_container.setBackground(new java.awt.Color(255, 255, 255));
        jpnl_container.setPreferredSize(new java.awt.Dimension(1100, 600));
        jpnl_container.setLayout(new javax.swing.BoxLayout(jpnl_container, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jpnl_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1100, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close2ActionPerformed
        this.dispose();
        new Authentication().setVisible(true);
    }//GEN-LAST:event_btn_close2ActionPerformed

    Color btn_hov_enter_color = new Color(255,0,255);
    Color btn_hov_exit_color = new Color(102,102,255);
    
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
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDashboard(Role_id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_close1;
    private javax.swing.JButton btn_close2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jpnl_container;
    private javax.swing.JPanel jpnl_userButtons;
    // End of variables declaration//GEN-END:variables
}
