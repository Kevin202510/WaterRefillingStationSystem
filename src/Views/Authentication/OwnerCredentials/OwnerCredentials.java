/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Authentication.OwnerCredentials;

import Controllers.SystemInformationSetupController;
import javax.swing.JOptionPane;

/**
 *
 * @author KevinCaluag
 */
public class OwnerCredentials extends javax.swing.JFrame {

    /**
     * Creates new form OwnerCredentials
     */
    
    SystemInformationSetupController sisc = new SystemInformationSetupController();
    public OwnerCredentials() {
        initComponents();
        systemName.requestFocusInWindow();
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
        authenticationPanel = new keeptoo.KGradientPanel();
        btn_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        systemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Mname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setNextFocusableComponent(systemName);

        authenticationPanel.setBackground(new java.awt.Color(19, 0, 19));
        authenticationPanel.setkEndColor(new java.awt.Color(144, 224, 239));
        authenticationPanel.setkStartColor(new java.awt.Color(26, 59, 160));
        authenticationPanel.setNextFocusableComponent(systemName);
        authenticationPanel.setPreferredSize(new java.awt.Dimension(680, 420));
        authenticationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_close.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.setBorder(null);
        btn_close.setBorderPainted(false);
        btn_close.setContentAreaFilled(false);
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        authenticationPanel.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 50, 40));

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System Information Setup");
        authenticationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 350, 50));

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("System Name");
        authenticationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 40));

        systemName.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        systemName.setForeground(new java.awt.Color(255, 255, 255));
        systemName.setBorder(null);
        systemName.setOpaque(false);
        authenticationPanel.add(systemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 420, 40));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contact");
        authenticationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 110, 40));

        address.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(null);
        address.setOpaque(false);
        authenticationPanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 420, 40));

        Lname.setForeground(new java.awt.Color(255, 255, 255));
        Lname.setBorder(null);
        Lname.setOpaque(false);
        authenticationPanel.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 100, 40));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Owner Fullname");
        authenticationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 30));

        contact.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setBorder(null);
        contact.setOpaque(false);
        authenticationPanel.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 420, 40));

        jLabel5.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");
        authenticationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, 40));

        jLabel6.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Middle Name");
        authenticationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 80, 40));

        jLabel7.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name");
        authenticationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 70, 40));

        Fname.setForeground(new java.awt.Color(255, 255, 255));
        Fname.setBorder(null);
        Fname.setOpaque(false);
        authenticationPanel.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 100, 40));

        Mname.setForeground(new java.awt.Color(255, 255, 255));
        Mname.setBorder(null);
        Mname.setOpaque(false);
        authenticationPanel.add(Mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 100, 40));

        jLabel8.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Address");
        authenticationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, 40));

        submit.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setBorderPainted(false);
        submit.setContentAreaFilled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        authenticationPanel.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 240, 50));
        authenticationPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 420, -1));
        authenticationPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 420, 10));
        authenticationPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 420, 10));
        authenticationPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 100, 10));
        authenticationPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 100, 10));
        authenticationPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 100, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(authenticationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(authenticationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
//        btn_close.setBackground(btn_hov_enter_color);
//        btn_close.setOpaque(true);
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
//        btn_close.setBackground(btn_hov_exit_color);
//        btn_close.setOpaque(true);
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(systemName.getText().isEmpty() || address.getText().isEmpty() || contact.getText().isEmpty() || Fname.getText().isEmpty() || Lname.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"You cannot Leave Fields Empty Execept Middle Name");
        }else{
            sisc.insertSystemInformationSetup(this,systemName.getText(), address.getText(), contact.getText(), Fname.getText() + " " + Mname.getText() + " " + Lname.getText());
        }
    }//GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OwnerCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerCredentials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Mname;
    private javax.swing.JTextField address;
    private keeptoo.KGradientPanel authenticationPanel;
    private javax.swing.JButton btn_close;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton submit;
    private javax.swing.JTextField systemName;
    // End of variables declaration//GEN-END:variables
}