/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ButtonsController;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Felix Caluag
 */
public class DeveloperAndAdminButtons extends javax.swing.JPanel {

    /**
     * Creates new form DeveloperAndAdminButtons
     */
    
    ButtonsController buttonControll;
    JPanel lalagyanan;
    
    public DeveloperAndAdminButtons(JPanel lalagyanan) {
        initComponents();
        buttonControll = new ButtonsController(lalagyanan);
        buttonControll.DashboardButton(dashboard);
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
        hovDashboard = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        hovUsers = new javax.swing.JPanel();
        users = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 204, 255));
        setPreferredSize(new java.awt.Dimension(250, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>DEVELOPER AND ADMINISTRATOR <br> <center>BUTTONS</center></html>");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 2, 1, new java.awt.Color(0, 0, 255)));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 100));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 100));

        hovDashboard.setBackground(new java.awt.Color(83, 140, 198));
        hovDashboard.setPreferredSize(new java.awt.Dimension(250, 50));

        dashboard.setBackground(new java.awt.Color(51, 51, 255));
        dashboard.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("Dashboard");
        dashboard.setIconTextGap(10);
        dashboard.setPreferredSize(new java.awt.Dimension(250, 50));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hovDashboardLayout = new javax.swing.GroupLayout(hovDashboard);
        hovDashboard.setLayout(hovDashboardLayout);
        hovDashboardLayout.setHorizontalGroup(
            hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovDashboardLayout.setVerticalGroup(
            hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(hovDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 50));

        hovUsers.setBackground(new java.awt.Color(83, 140, 198));
        hovUsers.setPreferredSize(new java.awt.Dimension(250, 50));

        users.setBackground(new java.awt.Color(51, 51, 255));
        users.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setText("Users");
        users.setIconTextGap(10);
        users.setPreferredSize(new java.awt.Dimension(250, 50));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hovUsersLayout = new javax.swing.GroupLayout(hovUsers);
        hovUsers.setLayout(hovUsersLayout);
        hovUsersLayout.setHorizontalGroup(
            hovUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovUsersLayout.setVerticalGroup(
            hovUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(hovUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        buttonControll.DashboardButton(dashboard);
    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        buttonControll.setC(hovDashboard);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        buttonControll.resetC(hovDashboard);
    }//GEN-LAST:event_dashboardMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        buttonControll.SalesButton(users);
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        buttonControll.setC(hovUsers);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        buttonControll.resetC(hovUsers);
    }//GEN-LAST:event_usersMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel hovDashboard;
    private javax.swing.JPanel hovUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
