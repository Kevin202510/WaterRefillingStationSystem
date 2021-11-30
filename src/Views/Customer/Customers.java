/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Customer;

import Controllers.CustomerController;
import javax.swing.JPanel;
import javax.swing.JPanel;
import Controllers.CustomerController;
import Forms.FrameFormModal;
import java.awt.Font;

/**
 *
 * @author ChelseaTorres
 */
public class Customers extends javax.swing.JPanel {

    /**
     * Creates new form Customers
     */
    CustomerController customerControll = new CustomerController();
    JPanel lalagyanan;
    
    public Customers(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        InitRun();
        customersTable.getTableHeader().setFont(new Font("MS Gothic",Font.BOLD,15));
    }
    
    private void InitRun(){
        customerControll.showCustomers(customersTable);
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
        customersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(144, 224, 239));

        customersTable.setAutoCreateRowSorter(true);
        customersTable.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fullname", "Address", "Contact", "Is Suki"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customersTable.setGridColor(new java.awt.Color(255, 0, 153));
        customersTable.setRowHeight(25);
        customersTable.setShowGrid(true);
        customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customersTable);
        if (customersTable.getColumnModel().getColumnCount() > 0) {
            customersTable.getColumnModel().getColumn(0).setMinWidth(50);
            customersTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            customersTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel1.setBackground(new java.awt.Color(26, 59, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Custumers");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        new FrameFormModal(8,0,customersTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
       int id = (int) customersTable.getValueAt(customersTable.getSelectedRow(),0);
        new FrameFormModal(8,id,customersTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_customersTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTable customersTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
