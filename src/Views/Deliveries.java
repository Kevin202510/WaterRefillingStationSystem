/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.DeliveriesController;
import javax.swing.JPanel;

/**
 *
 * @author ChelseaTorres
 */
public class Deliveries extends javax.swing.JPanel {

    /**
     * Creates new form Deliveries
     */
    JPanel lalagyanan;
    DeliveriesController deliveriesControll = new DeliveriesController();
    
    public Deliveries(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        InitRun();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deliveriesTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Deliveries");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        deliveriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Customer Id", "Date Delivered", "Quantity", "Promo Id", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deliveriesTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 1080, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable deliveriesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
