/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.PromosController;
import Forms.PromosModal;
import Forms.FrameFormModal;
import javax.swing.JPanel;

/**
 *
 * @author ChelseaTorres
 */
public class Promos extends javax.swing.JPanel {

    /**
     * Creates new form Promos
     */
    PromosController promoControll = new PromosController();
    JPanel lalagyanan;
    
    public Promos(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        InitRun();
    }
    
     private void InitRun(){
        promoControll.showPromos(promosTable);
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
        promosTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1090, 589));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        promosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Description", "Date Started", "Date End"
            }
        ));
        promosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                promosTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(promosTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, 1080, 480));

        jPanel1.setBackground(new java.awt.Color(64, 43, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Users");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 40));

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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
//        new PromosModal(0,promosTable,lalagyanan).setVisible(true);
        new FrameFormModal(7,0,promosTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void promosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promosTableMouseClicked
        int id = (int) promosTable.getValueAt(promosTable.getSelectedRow(),0);
        new FrameFormModal(7,id,promosTable,lalagyanan).setVisible(true);
    }//GEN-LAST:event_promosTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable promosTable;
    // End of variables declaration//GEN-END:variables
}
