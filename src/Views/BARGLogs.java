/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JPanel;

/**
 *
 * @author KevinCaluag
 */
public class BARGLogs extends javax.swing.JPanel {

    /**
     * Creates new form BARGLogs
     */
    JPanel lalagyanan;
    
    public BARGLogs(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
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

        setBackground(new java.awt.Color(252, 244, 221));
        setPreferredSize(new java.awt.Dimension(1080, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 59, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><center>Borrow and Return  Gallons Logs</center></html>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 80));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
