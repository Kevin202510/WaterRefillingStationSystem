/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.FormsControllers;
import Controllers.PromosController;
import Models.PromosModel;
import Views.DashboardsAndButtons.DeveloperAndAdminButtons;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author KevinCaluag
 */
public class FrameFormModal extends javax.swing.JFrame {

    /**
     * Creates new form FrameFormModal
     */
    static int containernum;
    static int btn_id;
    static String btn_ids;
    static JTable jtablename;
    static JPanel lalagyanan;
    FormsControllers formControll;
    
    public FrameFormModal(int containernum,int btn_id,JTable jtablename,JPanel lalagyanan) {
        initComponents();
        this.setLocationRelativeTo(null);
//        this.setOpacity(0.9f);
        this.containernum = containernum;
        this.btn_id = btn_id;
        this.jtablename = jtablename;
        this.lalagyanan = lalagyanan;
        this.formControll =  new FormsControllers(containernum,btn_id,jtablename,lalagyanan,formContainer,this);
    }
     public FrameFormModal(int containernum,String btn_ids,JTable jtablename,JPanel lalagyanan) {
        initComponents();
        this.setLocationRelativeTo(null);
//        this.setOpacity(0.9f);
        this.containernum = containernum;
        this.btn_ids = btn_ids;
        this.jtablename = jtablename;
        this.lalagyanan = lalagyanan;
//        JOptionPane.showMessageDialog(null,"asdas");
        this.formControll =  new FormsControllers(containernum,btn_ids,jtablename,lalagyanan,formContainer,this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formContainer.setNextFocusableComponent(formContainer);
        formContainer.setPreferredSize(new java.awt.Dimension(350, 600));
        formContainer.setLayout(new javax.swing.BoxLayout(formContainer, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(formContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus

//        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       this.toFront();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FrameFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFormModal(containernum,btn_id,jtablename,lalagyanan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel formContainer;
    // End of variables declaration//GEN-END:variables
}
