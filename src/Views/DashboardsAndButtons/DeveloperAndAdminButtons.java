/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.DashboardsAndButtons;

import Controllers.ButtonsController;
import Forms.FrameFormModal;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    JPanel lalagyanan,lalagyananbut;
    String path = System.getProperty("user.dir");
    int userID;
    
    public DeveloperAndAdminButtons(JFrame maindash,JPanel lalagyanan,JPanel lalagyananbut,String Profile,int userID) {
        initComponents();
        this.lalagyanan = lalagyanan;
        this.lalagyananbut = lalagyananbut;
        buttonControll = new ButtonsController(lalagyanan);
        buttonControll.DashboardButton(dashboard);
        ImageIcon imageicon = new ImageIcon(path + "/Images/Profile/" + Profile + ".jpg");
        Image img = imageicon.getImage().getScaledInstance(250, 110, Image.SCALE_SMOOTH);
        profile.setIcon(new ImageIcon(img));
        userId.setText(String.valueOf(userID));
        this.userID = userID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile = new jroundborder.JLabelRound();
        jSeparator1 = new javax.swing.JSeparator();
        hovDashboard = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hovBorrowAndReturnGallon = new javax.swing.JPanel();
        borrowandreturngallons = new javax.swing.JLabel();
        hovReports = new javax.swing.JPanel();
        reports = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hovGallons = new javax.swing.JPanel();
        gallons = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hovCustomer = new javax.swing.JPanel();
        customer = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hovSupplier = new javax.swing.JPanel();
        supplier = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hovUsers = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hovPos = new javax.swing.JPanel();
        pos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hovPromos = new javax.swing.JPanel();
        promos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hovProfileSetting = new javax.swing.JPanel();
        profilesetting = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 180, 216));
        setPreferredSize(new java.awt.Dimension(250, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setBackground(new java.awt.Color(153, 0, 153));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 100));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 10));

        hovDashboard.setBackground(new java.awt.Color(0, 180, 216));
        hovDashboard.setPreferredSize(new java.awt.Dimension(250, 40));

        dashboard.setBackground(new java.awt.Color(0, 180, 216));
        dashboard.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("Dashboard");
        dashboard.setIconTextGap(10);
        dashboard.setPreferredSize(new java.awt.Dimension(250, 40));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/ss-removebg-preview-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout hovDashboardLayout = new javax.swing.GroupLayout(hovDashboard);
        hovDashboard.setLayout(hovDashboardLayout);
        hovDashboardLayout.setHorizontalGroup(
            hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovDashboardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hovDashboardLayout.setVerticalGroup(
            hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        add(hovDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 50));

        hovBorrowAndReturnGallon.setBackground(new java.awt.Color(0, 180, 216));
        hovBorrowAndReturnGallon.setPreferredSize(new java.awt.Dimension(250, 40));

        borrowandreturngallons.setBackground(new java.awt.Color(0, 180, 216));
        borrowandreturngallons.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        borrowandreturngallons.setForeground(new java.awt.Color(255, 255, 255));
        borrowandreturngallons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrowandreturngallons.setText("<html><center>Borrow and Return  Gallons</center></html>");
        borrowandreturngallons.setIconTextGap(10);
        borrowandreturngallons.setPreferredSize(new java.awt.Dimension(250, 50));
        borrowandreturngallons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowandreturngallonsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hovBorrowAndReturnGallonLayout = new javax.swing.GroupLayout(hovBorrowAndReturnGallon);
        hovBorrowAndReturnGallon.setLayout(hovBorrowAndReturnGallonLayout);
        hovBorrowAndReturnGallonLayout.setHorizontalGroup(
            hovBorrowAndReturnGallonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrowandreturngallons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovBorrowAndReturnGallonLayout.setVerticalGroup(
            hovBorrowAndReturnGallonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrowandreturngallons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(hovBorrowAndReturnGallon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 50));

        hovReports.setBackground(new java.awt.Color(0, 180, 216));
        hovReports.setPreferredSize(new java.awt.Dimension(250, 40));
        hovReports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reports.setBackground(new java.awt.Color(0, 180, 216));
        reports.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        reports.setForeground(new java.awt.Color(255, 255, 255));
        reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reports.setText("Reports");
        reports.setIconTextGap(10);
        reports.setPreferredSize(new java.awt.Dimension(250, 50));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
        });
        hovReports.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 250, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/report.png"))); // NOI18N
        hovReports.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        add(hovReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, -1, 50));

        hovGallons.setBackground(new java.awt.Color(0, 180, 216));
        hovGallons.setPreferredSize(new java.awt.Dimension(250, 40));
        hovGallons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gallons.setBackground(new java.awt.Color(0, 180, 216));
        gallons.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        gallons.setForeground(new java.awt.Color(255, 255, 255));
        gallons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gallons.setText("Gallons");
        gallons.setIconTextGap(10);
        gallons.setPreferredSize(new java.awt.Dimension(250, 50));
        gallons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gallonsMouseClicked(evt);
            }
        });
        hovGallons.add(gallons, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 250, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/gallons.png"))); // NOI18N
        hovGallons.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        add(hovGallons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        hovCustomer.setBackground(new java.awt.Color(0, 180, 216));
        hovCustomer.setPreferredSize(new java.awt.Dimension(250, 40));
        hovCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customer.setBackground(new java.awt.Color(0, 180, 216));
        customer.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        customer.setForeground(new java.awt.Color(255, 255, 255));
        customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customer.setText("Customer");
        customer.setIconTextGap(10);
        customer.setPreferredSize(new java.awt.Dimension(250, 50));
        customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMouseClicked(evt);
            }
        });
        hovCustomer.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 51));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/cust.png"))); // NOI18N
        hovCustomer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        add(hovCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, 50));

        hovSupplier.setBackground(new java.awt.Color(0, 180, 216));
        hovSupplier.setPreferredSize(new java.awt.Dimension(250, 40));

        supplier.setBackground(new java.awt.Color(0, 180, 216));
        supplier.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        supplier.setForeground(new java.awt.Color(255, 255, 255));
        supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplier.setText("Supplier");
        supplier.setIconTextGap(10);
        supplier.setPreferredSize(new java.awt.Dimension(250, 50));
        supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/supplier.png"))); // NOI18N

        javax.swing.GroupLayout hovSupplierLayout = new javax.swing.GroupLayout(hovSupplier);
        hovSupplier.setLayout(hovSupplierLayout);
        hovSupplierLayout.setHorizontalGroup(
            hovSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(hovSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hovSupplierLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );
        hovSupplierLayout.setVerticalGroup(
            hovSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovSupplierLayout.createSequentialGroup()
                .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(hovSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hovSupplierLayout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(hovSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, 50));

        hovUsers.setBackground(new java.awt.Color(0, 180, 216));
        hovUsers.setPreferredSize(new java.awt.Dimension(250, 40));
        hovUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setBackground(new java.awt.Color(0, 180, 216));
        users.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setText("Users");
        users.setIconTextGap(10);
        users.setPreferredSize(new java.awt.Dimension(250, 50));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });
        hovUsers.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/user.png"))); // NOI18N
        hovUsers.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        add(hovUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 250, 50));

        hovPos.setBackground(new java.awt.Color(0, 180, 216));
        hovPos.setPreferredSize(new java.awt.Dimension(250, 40));
        hovPos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pos.setBackground(new java.awt.Color(0, 180, 216));
        pos.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        pos.setForeground(new java.awt.Color(255, 255, 255));
        pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos.setText("POS");
        pos.setIconTextGap(10);
        pos.setPreferredSize(new java.awt.Dimension(250, 50));
        pos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posMouseClicked(evt);
            }
        });
        hovPos.add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/pos.png"))); // NOI18N
        hovPos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        add(hovPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 50));

        hovPromos.setBackground(new java.awt.Color(0, 180, 216));
        hovPromos.setPreferredSize(new java.awt.Dimension(250, 40));

        promos.setBackground(new java.awt.Color(0, 180, 216));
        promos.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        promos.setForeground(new java.awt.Color(255, 255, 255));
        promos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        promos.setText("Promos");
        promos.setIconTextGap(10);
        promos.setPreferredSize(new java.awt.Dimension(250, 50));
        promos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                promosMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/promo.png"))); // NOI18N

        javax.swing.GroupLayout hovPromosLayout = new javax.swing.GroupLayout(hovPromos);
        hovPromos.setLayout(hovPromosLayout);
        hovPromosLayout.setHorizontalGroup(
            hovPromosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(promos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(hovPromosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hovPromosLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
        hovPromosLayout.setVerticalGroup(
            hovPromosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovPromosLayout.createSequentialGroup()
                .addComponent(promos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(hovPromosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        add(hovPromos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 50));

        hovProfileSetting.setBackground(new java.awt.Color(0, 180, 216));
        hovProfileSetting.setPreferredSize(new java.awt.Dimension(250, 40));
        hovProfileSetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilesetting.setBackground(new java.awt.Color(0, 180, 216));
        profilesetting.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        profilesetting.setForeground(new java.awt.Color(255, 255, 255));
        profilesetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilesetting.setText("       Profile Setting");
        profilesetting.setIconTextGap(10);
        profilesetting.setPreferredSize(new java.awt.Dimension(250, 50));
        profilesetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilesettingMouseClicked(evt);
            }
        });
        hovProfileSetting.add(profilesetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/settings1.png"))); // NOI18N
        hovProfileSetting.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        add(hovProfileSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, 50));

        userId.setEnabled(false);
        add(userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        buttonControll.DashboardButton(dashboard);
        buttonControll.setC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_dashboardMouseClicked

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseClicked
        buttonControll.CustomerButton(customer);
        buttonControll.setC(hovCustomer);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPos);
    }//GEN-LAST:event_customerMouseClicked

    private void posMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posMouseClicked
        buttonControll.PosButton(pos);
        buttonControll.setC(hovPos);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_posMouseClicked

    private void promosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promosMouseClicked
        buttonControll.PromosButton(promos);
        buttonControll.setC(hovPromos);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_promosMouseClicked

    private void supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierMouseClicked
        buttonControll.SupplierButton(supplier);
        buttonControll.setC(hovSupplier);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_supplierMouseClicked

    private void borrowandreturngallonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowandreturngallonsMouseClicked
        buttonControll.BorrowAndReturnGallonsButton(borrowandreturngallons);
        buttonControll.setC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_borrowandreturngallonsMouseClicked

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        buttonControll.ReportsButton(reports);
        buttonControll.setC(hovReports);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_reportsMouseClicked

    private void gallonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallonsMouseClicked
        buttonControll.GallonsButton(gallons);
        buttonControll.setC(hovGallons);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_gallonsMouseClicked

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        buttonControll.UsersButton(users);
        buttonControll.setC(hovUsers);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovReports);
        buttonControll.resetC(hovBorrowAndReturnGallon);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_usersMouseClicked

    private void profilesettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilesettingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profilesettingMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
//        new ProfileSettingModal(lalagyanan,lalagyananbut,userID).setVisible(true);
    }//GEN-LAST:event_profileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel borrowandreturngallons;
    private javax.swing.JLabel customer;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel gallons;
    private javax.swing.JPanel hovBorrowAndReturnGallon;
    private javax.swing.JPanel hovCustomer;
    private javax.swing.JPanel hovDashboard;
    private javax.swing.JPanel hovGallons;
    private javax.swing.JPanel hovPos;
    private javax.swing.JPanel hovProfileSetting;
    private javax.swing.JPanel hovPromos;
    private javax.swing.JPanel hovReports;
    private javax.swing.JPanel hovSupplier;
    private javax.swing.JPanel hovUsers;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pos;
    private jroundborder.JLabelRound profile;
    private javax.swing.JLabel profilesetting;
    private javax.swing.JLabel promos;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel supplier;
    private javax.swing.JLabel userId;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}