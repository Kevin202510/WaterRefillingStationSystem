/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.DashboardsAndButtons;

import Controllers.ButtonsController;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Felix Caluag
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    
    JPanel lalagyanan;
    ButtonsController buttonControll;
    
    public Dashboard(JPanel lalagyanan) {
        initComponents();
        buttonControll = new ButtonsController(lalagyanan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hovGaloons = new javax.swing.JPanel();
        gallons = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1100, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD TO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 630, 70));

        hovGaloons.setBackground(new java.awt.Color(83, 140, 198));
        hovGaloons.setPreferredSize(new java.awt.Dimension(250, 50));

        gallons.setBackground(new java.awt.Color(51, 51, 255));
        gallons.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        gallons.setForeground(new java.awt.Color(255, 255, 255));
        gallons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gallons.setText("GALLONS");
        gallons.setIconTextGap(10);
        gallons.setPreferredSize(new java.awt.Dimension(250, 50));
        gallons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gallonsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gallonsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gallonsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hovGaloonsLayout = new javax.swing.GroupLayout(hovGaloons);
        hovGaloons.setLayout(hovGaloonsLayout);
        hovGaloonsLayout.setHorizontalGroup(
            hovGaloonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gallons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovGaloonsLayout.setVerticalGroup(
            hovGaloonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gallons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(hovGaloons, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 250, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void gallonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallonsMouseClicked
        buttonControll.GallonsButton(gallons);
    }//GEN-LAST:event_gallonsMouseClicked

    private void gallonsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallonsMouseEntered
        buttonControll.setC(hovGaloons);
    }//GEN-LAST:event_gallonsMouseEntered

    private void gallonsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallonsMouseExited
        buttonControll.resetC(hovGaloons);
    }//GEN-LAST:event_gallonsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gallons;
    private javax.swing.JPanel hovGaloons;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}