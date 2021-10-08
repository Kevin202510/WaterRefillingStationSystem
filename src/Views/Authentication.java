/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.AuthenticationController;
import java.awt.Color;

/**
 *
 * @author Kevin Felix Caluag
 */
public class Authentication extends javax.swing.JFrame {

    /**
     * Creates new form Authentication
     */
    
    AuthenticationController authControll = new AuthenticationController();
    
    public Authentication() {
        initComponents();
        authUsername.requestFocusInWindow();
        aboutusPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        authenticationPanel = new keeptoo.KGradientPanel();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        authUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        authPassword = new javax.swing.JPasswordField();
        btn_show_pass = new javax.swing.JButton();
        btn_hide_pass = new javax.swing.JButton();
        btn_aboutus = new javax.swing.JButton();
        aboutusPanel = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btn_auth = new javax.swing.JButton();
        btn_close1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authenticationPanel.setBackground(new java.awt.Color(19, 0, 19));
        authenticationPanel.setkEndColor(new java.awt.Color(102, 102, 255));
        authenticationPanel.setNextFocusableComponent(authUsername);
        authenticationPanel.setPreferredSize(new java.awt.Dimension(680, 420));
        authenticationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_login.setText("LOGIN");
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
        btn_login.setContentAreaFilled(false);
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        authenticationPanel.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 190, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password");
        authenticationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 150, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");
        authenticationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 150, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Water Refilling System");
        authenticationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 470, 50));

        btn_close.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
        authenticationPanel.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 50, 40));

        authUsername.setBackground(new Color(0,0,0,1));
        authUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        authUsername.setForeground(new java.awt.Color(255, 255, 255));
        authUsername.setBorder(null);
        authUsername.setOpaque(false);
        authenticationPanel.add(authUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 290, 40));
        authenticationPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 290, 10));
        authenticationPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 192, 290, 10));

        authPassword.setBackground(new Color(0,0,0,1));
        authPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        authPassword.setForeground(new java.awt.Color(255, 255, 255));
        authPassword.setBorder(null);
        authPassword.setOpaque(false);
        authPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                authPasswordKeyPressed(evt);
            }
        });
        authenticationPanel.add(authPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 290, 40));

        btn_show_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/asd-removebg-preview.png"))); // NOI18N
        btn_show_pass.setBorder(null);
        btn_show_pass.setBorderPainted(false);
        btn_show_pass.setContentAreaFilled(false);
        btn_show_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_show_passActionPerformed(evt);
            }
        });
        authenticationPanel.add(btn_show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 30, 30));

        btn_hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/hide.png"))); // NOI18N
        btn_hide_pass.setBorder(null);
        btn_hide_pass.setBorderPainted(false);
        btn_hide_pass.setContentAreaFilled(false);
        btn_hide_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hide_passActionPerformed(evt);
            }
        });
        authenticationPanel.add(btn_hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 30, 30));

        btn_aboutus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_aboutus.setText("About Us");
        btn_aboutus.setBorder(null);
        btn_aboutus.setBorderPainted(false);
        btn_aboutus.setContentAreaFilled(false);
        btn_aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutusActionPerformed(evt);
            }
        });
        authenticationPanel.add(btn_aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, 140, 20));

        getContentPane().add(authenticationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        aboutusPanel.setPreferredSize(new java.awt.Dimension(680, 420));
        aboutusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new Color(0,0,0,1));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(10);
        jTextArea1.setTabSize(10);
        jTextArea1.setText("We are here for purity\n\nChoose Quality in Purity\n\nForget harmfulness, Choose Fresh\n\npurifiying Agent\n\nIt’s your Healthy life..the way you want.\n\nLive grand with Quality surety\n\nA new world is rising. Let’s Choose it\n\nFirst, you Taste ..then you live.\n\nConnect with the life here\n\nPerfect Quality For perfect Living\n\nUrban living redefined, Guaranteed\n\nPurity in Every Drops\n\nExperience the Healthy life\n\nA lifestyle so Desirable\n\nActivate spirit in you\n\nRefresh your self");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        aboutusPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 540, 270));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ABOUT US");
        aboutusPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 340, 40));

        btn_auth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_auth.setText("Login");
        btn_auth.setBorder(null);
        btn_auth.setBorderPainted(false);
        btn_auth.setContentAreaFilled(false);
        btn_auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_authActionPerformed(evt);
            }
        });
        aboutusPanel.add(btn_auth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, 140, 20));

        btn_close1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_close1.setText("X");
        btn_close1.setBorder(null);
        btn_close1.setBorderPainted(false);
        btn_close1.setContentAreaFilled(false);
        btn_close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_close1MouseExited(evt);
            }
        });
        btn_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close1ActionPerformed(evt);
            }
        });
        aboutusPanel.add(btn_close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 50, 40));

        getContentPane().add(aboutusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
       authControll.checkField(this,authUsername, authPassword);
    }//GEN-LAST:event_btn_loginActionPerformed

    Color btn_hov_enter_color = new Color(255,0,255);
    Color btn_hov_exit_color = new Color(102,102,255);
    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        btn_close.setBackground(btn_hov_enter_color);
        btn_close.setOpaque(true);
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        btn_close.setBackground(btn_hov_exit_color);
        btn_close.setOpaque(true);
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        btn_login.setBackground(btn_hov_enter_color);
        btn_login.setOpaque(true);
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
        btn_login.setBackground(btn_hov_exit_color);
        btn_login.setOpaque(true);
    }//GEN-LAST:event_btn_loginMouseExited

    private void authPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authPasswordKeyPressed
        if (evt.getKeyCode()==10) {
            authControll.checkField(this,authUsername, authPassword);
        }
    }//GEN-LAST:event_authPasswordKeyPressed

    private void btn_show_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_show_passActionPerformed
        authPassword.setEchoChar((char)0);
        btn_show_pass.setVisible(false);
        btn_hide_pass.setVisible(true);
    }//GEN-LAST:event_btn_show_passActionPerformed

    private void btn_hide_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hide_passActionPerformed
        authPassword.setEchoChar('*');
        btn_show_pass.setVisible(true);
        btn_hide_pass.setVisible(false);
        
    }//GEN-LAST:event_btn_hide_passActionPerformed

    private void btn_aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutusActionPerformed
            aboutusPanel.setVisible(true);
            authenticationPanel.setVisible(false);
    }//GEN-LAST:event_btn_aboutusActionPerformed

    private void btn_authActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_authActionPerformed
            aboutusPanel.setVisible(false);
            authenticationPanel.setVisible(true);
    }//GEN-LAST:event_btn_authActionPerformed

    private void btn_close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_close1MouseEntered

    private void btn_close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_close1MouseExited

    private void btn_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_close1ActionPerformed

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
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel aboutusPanel;
    private javax.swing.JPasswordField authPassword;
    private javax.swing.JTextField authUsername;
    private keeptoo.KGradientPanel authenticationPanel;
    private javax.swing.JButton btn_aboutus;
    private javax.swing.JButton btn_auth;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_close1;
    private javax.swing.JButton btn_hide_pass;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_show_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
