/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Reports;

import Controllers.SalesControllers;
import Forms.FrameFormModal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Felix Caluag
 */
public class SalesReport extends javax.swing.JPanel {

    /**
     * Creates new form Sales
     */
    SalesControllers saleControll = new SalesControllers();
    JPanel lalagyanan;

    
    public SalesReport(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        InitRun();
        SalesTable.getTableHeader().setFont(new Font("MS Gothic",Font.BOLD,15));
        Color theadcolor = Color.decode("#90E0EF");
        SalesTable.getTableHeader().setBackground(theadcolor);
        SalesTable.getTableHeader().setPreferredSize(new Dimension(100, 40));
    }
     private void InitRun(){
        saleControll.showSales(SalesTable);
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
        SalesTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 180, 216));
        setMinimumSize(new java.awt.Dimension(1080, 480));
        setPreferredSize(new java.awt.Dimension(1080, 500));

        SalesTable.setAutoCreateRowSorter(true);
        SalesTable.setFont(new java.awt.Font("MS Gothic", 0, 15)); // NOI18N
        SalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Sales Date", "Amount", "User Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SalesTable.setGridColor(new java.awt.Color(255, 0, 102));
        SalesTable.setRowHeight(25);
        SalesTable.setShowGrid(true);
        SalesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(SalesTable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Sales Report");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 260, 40));

        addBtn.setBackground(new java.awt.Color(0, 180, 216));
        addBtn.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        addBtn.setText("+");
        addBtn.setBorderPainted(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        new FrameFormModal(13,0,SalesTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SalesTable;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
