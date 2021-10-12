/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.DeliveriesController;
import Forms.FrameFormModal;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        deliveriesTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deliveriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Customer Name", "Date Delivered", "Quantity", "Promo", "Status", "Delivered By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deliveriesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveriesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(deliveriesTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 1080, 490));

        jPanel1.setBackground(new java.awt.Color(64, 43, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(64, 43, 100));
        addBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addBtn.setText("+");
        addBtn.setBorderPainted(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 61, 40));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deliveries");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //        new UserModal(0,userTable,lalagyanan).setVisible(true);
        new FrameFormModal(9,0,deliveriesTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void deliveriesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveriesTableMouseClicked
        int id = (int) deliveriesTable.getValueAt(deliveriesTable.getSelectedRow(),0);
        new FrameFormModal(9,id,deliveriesTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_deliveriesTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTable deliveriesTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
