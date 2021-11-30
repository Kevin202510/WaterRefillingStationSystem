/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.WaterTypeController;
import Models.PromosModel;
import Models.WaterTypeModel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Tricia Gadiaza
 */
public class WaterTypeFormModal extends javax.swing.JPanel {
 static JTable watertypeTable;
    static JPanel lalagyanan;
    static JFrame out;
    static int btn_id; 
    WaterTypeController watertypeControll = new WaterTypeController();
    WaterTypeModel watertypeModel;
   
    /**
     * Creates new form WaterTypeFormModal
     */
    public WaterTypeFormModal(JFrame out,int btn_id,JTable watertypeTable,JPanel lalagyanan) {
        initComponents();
        this.btn_id = btn_id;
        this.watertypeTable = watertypeTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
//        JOptionPane.showMessageDialog(null,"asdas");
        checkBtn(btn_id);
    }
     private void checkBtn(int btn_id){
        if (btn_id==0) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
        }else{
            watertypeControll.getWaterTypesInfo(btn_id, Name, PricePerGallon, PricePerBottle);
            addbtn.setVisible(false);
            updatebtn.setVisible(true);
            deletebtn.setVisible(true);
        }
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
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        PricePerGallon = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        PricePerBottle = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(85, 64, 118));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Water Types");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 20));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 100, 43));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 100, 43));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 100, 43));

        jLabel2.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Water Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 30));

        Name.setBackground(new Color(0,0,0,1));
        Name.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setAutoscrolls(false);
        Name.setBorder(null);
        Name.setOpaque(false);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameKeyTyped(evt);
            }
        });
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, 10));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price PerGallon");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 30));

        PricePerGallon.setBackground(new Color(0,0,0,1));
        PricePerGallon.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        PricePerGallon.setForeground(new java.awt.Color(255, 255, 255));
        PricePerGallon.setBorder(null);
        PricePerGallon.setOpaque(false);
        PricePerGallon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PricePerGallonKeyTyped(evt);
            }
        });
        add(PricePerGallon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 10));

        jLabel10.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price PerButtle");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, 30));

        PricePerBottle.setBackground(new Color(0,0,0,1));
        PricePerBottle.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        PricePerBottle.setForeground(new java.awt.Color(255, 255, 255));
        PricePerBottle.setBorder(null);
        PricePerBottle.setOpaque(false);
        PricePerBottle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricePerBottleActionPerformed(evt);
            }
        });
        PricePerBottle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PricePerBottleKeyTyped(evt);
            }
        });
        add(PricePerBottle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 200, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, 10));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

       watertypeModel = new WaterTypeModel(btn_id,Name.getText(),Double.parseDouble(PricePerGallon.getText()),Double.parseDouble(PricePerBottle.getText()));
        if(watertypeControll.updateWaterTypes(watertypeModel, watertypeTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.WaterType.WaterTypes(lalagyanan));
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(watertypeControll.deleteWaterTypes(btn_id,watertypeTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.WaterType.WaterTypes(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        watertypeModel = new WaterTypeModel(0,Name.getText(),Double.parseDouble(PricePerGallon.getText()),Double.parseDouble(PricePerBottle.getText()));
        if (watertypeControll.addWaterTypes(watertypeModel,watertypeTable)) {
           out.dispose();
            new ContainerController(lalagyanan,new Views.WaterType.WaterTypes(lalagyanan));
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void PricePerBottleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PricePerBottleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PricePerBottleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        out.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyTyped
        // TODO add your handling code here:
        
            char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
          else if ((c == '.')){
          Name.getText();
          Name.setText("");
           getToolkit().beep();
           evt.consume();
          } 
    }//GEN-LAST:event_NameKeyTyped

    private void PricePerGallonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PricePerGallonKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_PricePerGallonKeyTyped

    private void PricePerBottleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PricePerBottleKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_PricePerBottleKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PricePerBottle;
    private javax.swing.JTextField PricePerGallon;
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
