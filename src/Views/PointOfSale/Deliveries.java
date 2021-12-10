/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.PointOfSale;

import Controllers.DeliveriesController;
import Forms.FrameFormModal;
import Forms.deliveriesUpdateStatus;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;

/**
 *
 * @author KevinCaluag
 */
public class Deliveries extends javax.swing.JPanel {

    /**
     * Creates new form Deliveries
     */
    DeliveriesController deliveriesControll = new DeliveriesController();
    JPanel lalagyanan;
    
    public Deliveries(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
       InitRun();
        deliveriesTable.getTableHeader().setFont(new Font("MS Gothic",Font.BOLD,12));
        Color theadcolor = Color.decode("#90E0EF");
        deliveriesTable.getTableHeader().setBackground(theadcolor);
        deliveriesTable.getTableHeader().setPreferredSize(new Dimension(100, 40));
    }
    
    private void InitRun(){
        deliveriesControll.showDeliveries(deliveriesTable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        deliveriesTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 180, 216));
        setPreferredSize(new java.awt.Dimension(990, 480));

        deliveriesTable.setAutoCreateRowSorter(true);
        deliveriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Customer Name", "Date_Order", "Date Delivered", "Gallon Name", "Quantity", "Promo", "Status", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deliveriesTable.setGridColor(new java.awt.Color(102, 102, 102));
        deliveriesTable.setRowHeight(35);
        deliveriesTable.setShowGrid(true);
        deliveriesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveriesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(deliveriesTable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 232, 182));
        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Deliveries");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deliveriesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveriesTableMouseClicked
        int id = (int) deliveriesTable.getValueAt(deliveriesTable.getSelectedRow(),0);
        new deliveriesUpdateStatus(id,deliveriesTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_deliveriesTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable deliveriesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
