/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ButtonsController;
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
        hovSales = new javax.swing.JPanel();
        sale = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(1100, 600));
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

        hovSales.setBackground(new java.awt.Color(83, 140, 198));
        hovSales.setPreferredSize(new java.awt.Dimension(250, 50));

        sale.setBackground(new java.awt.Color(51, 51, 255));
        sale.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        sale.setForeground(new java.awt.Color(255, 255, 255));
        sale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale.setText("SALES");
        sale.setIconTextGap(10);
        sale.setPreferredSize(new java.awt.Dimension(250, 50));
        sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hovSalesLayout = new javax.swing.GroupLayout(hovSales);
        hovSales.setLayout(hovSalesLayout);
        hovSalesLayout.setHorizontalGroup(
            hovSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovSalesLayout.setVerticalGroup(
            hovSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sale, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        add(hovSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 250, 150));
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

    private void saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMouseClicked
        buttonControll.SalesButton(sale);
    }//GEN-LAST:event_saleMouseClicked

    private void saleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMouseEntered
        buttonControll.setC(hovSales);
    }//GEN-LAST:event_saleMouseEntered

    private void saleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMouseExited
        buttonControll.resetC(hovSales);
    }//GEN-LAST:event_saleMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gallons;
    private javax.swing.JPanel hovGaloons;
    private javax.swing.JPanel hovSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel sale;
    // End of variables declaration//GEN-END:variables
}
