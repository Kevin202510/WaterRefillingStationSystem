/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.PointOfSale;

import Controllers.Transaction_LogsController;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author KevinCaluag
 */
public class TransactionLogs extends javax.swing.JPanel {

    /**
     * Creates new form TransactionLogs
     */
    Transaction_LogsController transactionlogsControll = new Transaction_LogsController();
    JPanel lalagyanan;
    
    public TransactionLogs(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        transactionlogsControll.showTransaction_Logs(transaction_logstable);    
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
        jtxt_room_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        transaction_logstable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(990, 480));

        jPanel1.setBackground(new java.awt.Color(64, 43, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transaction Logs");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 40));

        jtxt_room_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_room_searchKeyPressed(evt);
            }
        });
        jPanel1.add(jtxt_room_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 190, 30));

        transaction_logstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Fullname", "Gallon Type", "Quantity", "Promo", "Service Type", "Status", "Total Amount", "Transaction Date", "Transaction Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transaction_logstable);
        if (transaction_logstable.getColumnModel().getColumnCount() > 0) {
            transaction_logstable.getColumnModel().getColumn(0).setMinWidth(20);
            transaction_logstable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_room_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_room_searchKeyPressed
        search();

    }//GEN-LAST:event_jtxt_room_searchKeyPressed

    private void search() {                                            
        // ROOMS SEARCH
        DefaultTableModel model = (DefaultTableModel)transaction_logstable.getModel();
//        model.setRowCount(0);
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(model);
        transaction_logstable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxt_room_search.getText().trim()));
           
    }                 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxt_room_search;
    private javax.swing.JTable transaction_logstable;
    // End of variables declaration//GEN-END:variables
}