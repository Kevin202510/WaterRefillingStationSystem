/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ButtonsController;
import Forms.FrameFormModal;
import java.awt.Image;
import javax.swing.ImageIcon;
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
    
    public DeveloperAndAdminButtons(JPanel lalagyanan,JPanel lalagyananbut,String Profile,int userID) {
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
        hovRefilled = new javax.swing.JPanel();
        refilled = new javax.swing.JLabel();
        hovSales = new javax.swing.JPanel();
        sale = new javax.swing.JLabel();
        hovGallons = new javax.swing.JPanel();
        gallons = new javax.swing.JLabel();
        hovCustomer = new javax.swing.JPanel();
        customer = new javax.swing.JLabel();
        hovSupplier = new javax.swing.JPanel();
        supplier = new javax.swing.JLabel();
        hovUsers = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hovDeliveries = new javax.swing.JPanel();
        deliveries = new javax.swing.JLabel();
        hovPromos = new javax.swing.JPanel();
        promos = new javax.swing.JLabel();
        hovProfileSetting = new javax.swing.JPanel();
        profilesetting = new javax.swing.JLabel();
        userId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(64, 43, 100));
        setPreferredSize(new java.awt.Dimension(250, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setBackground(new java.awt.Color(85, 65, 118));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 100));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 10));

        hovDashboard.setBackground(new java.awt.Color(85, 65, 118));
        hovDashboard.setPreferredSize(new java.awt.Dimension(250, 40));

        dashboard.setBackground(new java.awt.Color(85, 65, 118));
        dashboard.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
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
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hovDashboardLayout.setVerticalGroup(
            hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(hovDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hovDashboardLayout.createSequentialGroup()
                    .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        add(hovDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 40));

        hovRefilled.setBackground(new java.awt.Color(64, 43, 100));
        hovRefilled.setPreferredSize(new java.awt.Dimension(250, 40));

        refilled.setBackground(new java.awt.Color(85, 65, 118));
        refilled.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        refilled.setForeground(new java.awt.Color(255, 255, 255));
        refilled.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refilled.setText("Refilled Gallons");
        refilled.setIconTextGap(10);
        refilled.setPreferredSize(new java.awt.Dimension(250, 50));
        refilled.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refilledMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hovRefilledLayout = new javax.swing.GroupLayout(hovRefilled);
        hovRefilled.setLayout(hovRefilledLayout);
        hovRefilledLayout.setHorizontalGroup(
            hovRefilledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refilled, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovRefilledLayout.setVerticalGroup(
            hovRefilledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refilled, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(hovRefilled, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        hovSales.setBackground(new java.awt.Color(64, 43, 100));
        hovSales.setPreferredSize(new java.awt.Dimension(250, 40));

        sale.setBackground(new java.awt.Color(85, 65, 118));
        sale.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        sale.setForeground(new java.awt.Color(255, 255, 255));
        sale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale.setText("Sales");
        sale.setIconTextGap(10);
        sale.setPreferredSize(new java.awt.Dimension(250, 50));
        sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hovSalesLayout = new javax.swing.GroupLayout(hovSales);
        hovSales.setLayout(hovSalesLayout);
        hovSalesLayout.setHorizontalGroup(
            hovSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovSalesLayout.setVerticalGroup(
            hovSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovSalesLayout.createSequentialGroup()
                .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(hovSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        hovGallons.setBackground(new java.awt.Color(64, 43, 100));
        hovGallons.setPreferredSize(new java.awt.Dimension(250, 40));

        gallons.setBackground(new java.awt.Color(85, 65, 118));
        gallons.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout hovGallonsLayout = new javax.swing.GroupLayout(hovGallons);
        hovGallons.setLayout(hovGallonsLayout);
        hovGallonsLayout.setHorizontalGroup(
            hovGallonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gallons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovGallonsLayout.setVerticalGroup(
            hovGallonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovGallonsLayout.createSequentialGroup()
                .addComponent(gallons, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(hovGallons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        hovCustomer.setBackground(new java.awt.Color(64, 43, 100));
        hovCustomer.setPreferredSize(new java.awt.Dimension(250, 40));

        customer.setBackground(new java.awt.Color(85, 65, 118));
        customer.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout hovCustomerLayout = new javax.swing.GroupLayout(hovCustomer);
        hovCustomer.setLayout(hovCustomerLayout);
        hovCustomerLayout.setHorizontalGroup(
            hovCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovCustomerLayout.setVerticalGroup(
            hovCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovCustomerLayout.createSequentialGroup()
                .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(hovCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        hovSupplier.setBackground(new java.awt.Color(64, 43, 100));
        hovSupplier.setPreferredSize(new java.awt.Dimension(250, 40));

        supplier.setBackground(new java.awt.Color(85, 65, 118));
        supplier.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout hovSupplierLayout = new javax.swing.GroupLayout(hovSupplier);
        hovSupplier.setLayout(hovSupplierLayout);
        hovSupplierLayout.setHorizontalGroup(
            hovSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovSupplierLayout.createSequentialGroup()
                .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        hovSupplierLayout.setVerticalGroup(
            hovSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovSupplierLayout.createSequentialGroup()
                .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(hovSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        hovUsers.setBackground(new java.awt.Color(64, 43, 100));
        hovUsers.setPreferredSize(new java.awt.Dimension(250, 40));
        hovUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setBackground(new java.awt.Color(64, 43, 100));
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
        });
        hovUsers.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/56-removebg-preview.png"))); // NOI18N
        hovUsers.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        add(hovUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, -1));

        hovDeliveries.setBackground(new java.awt.Color(64, 43, 100));
        hovDeliveries.setPreferredSize(new java.awt.Dimension(250, 40));

        deliveries.setBackground(new java.awt.Color(85, 65, 118));
        deliveries.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        deliveries.setForeground(new java.awt.Color(255, 255, 255));
        deliveries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deliveries.setText("Deliveries");
        deliveries.setIconTextGap(10);
        deliveries.setPreferredSize(new java.awt.Dimension(250, 50));
        deliveries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveriesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hovDeliveriesLayout = new javax.swing.GroupLayout(hovDeliveries);
        hovDeliveries.setLayout(hovDeliveriesLayout);
        hovDeliveriesLayout.setHorizontalGroup(
            hovDeliveriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deliveries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovDeliveriesLayout.setVerticalGroup(
            hovDeliveriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovDeliveriesLayout.createSequentialGroup()
                .addComponent(deliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(hovDeliveries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 250, -1));

        hovPromos.setBackground(new java.awt.Color(64, 43, 100));
        hovPromos.setPreferredSize(new java.awt.Dimension(250, 40));

        promos.setBackground(new java.awt.Color(85, 65, 118));
        promos.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout hovPromosLayout = new javax.swing.GroupLayout(hovPromos);
        hovPromos.setLayout(hovPromosLayout);
        hovPromosLayout.setHorizontalGroup(
            hovPromosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(promos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovPromosLayout.setVerticalGroup(
            hovPromosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovPromosLayout.createSequentialGroup()
                .addComponent(promos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(hovPromos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        hovProfileSetting.setBackground(new java.awt.Color(64, 43, 100));
        hovProfileSetting.setPreferredSize(new java.awt.Dimension(250, 40));

        profilesetting.setBackground(new java.awt.Color(85, 65, 118));
        profilesetting.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        profilesetting.setForeground(new java.awt.Color(255, 255, 255));
        profilesetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilesetting.setText("Profile Setting");
        profilesetting.setIconTextGap(10);
        profilesetting.setPreferredSize(new java.awt.Dimension(250, 50));
        profilesetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilesettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hovProfileSettingLayout = new javax.swing.GroupLayout(hovProfileSetting);
        hovProfileSetting.setLayout(hovProfileSettingLayout);
        hovProfileSettingLayout.setHorizontalGroup(
            hovProfileSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilesetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovProfileSettingLayout.setVerticalGroup(
            hovProfileSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hovProfileSettingLayout.createSequentialGroup()
                .addComponent(profilesetting, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(hovProfileSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, -1));

        userId.setEnabled(false);
        add(userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        buttonControll.DashboardButton(dashboard);
        buttonControll.setC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovDeliveries);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_dashboardMouseClicked

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseClicked
        buttonControll.CustomerButton(customer);
        buttonControll.setC(hovCustomer);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovDeliveries);
    }//GEN-LAST:event_customerMouseClicked

    private void deliveriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveriesMouseClicked
        buttonControll.DeliveriesButton(deliveries);
        buttonControll.setC(hovDeliveries);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_deliveriesMouseClicked

    private void promosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promosMouseClicked
        buttonControll.PromosButton(promos);
        buttonControll.setC(hovPromos);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovDeliveries);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_promosMouseClicked

    private void supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierMouseClicked
        buttonControll.SupplierButton(supplier);
        buttonControll.setC(hovSupplier);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovDeliveries);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_supplierMouseClicked

    private void refilledMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refilledMouseClicked
        buttonControll.RefilledGallonsButton(refilled);
        buttonControll.setC(hovRefilled);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovDeliveries);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_refilledMouseClicked

    private void saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMouseClicked
        buttonControll.SalesButton(sale);
        buttonControll.setC(hovSales);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovDeliveries);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_saleMouseClicked

    private void gallonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallonsMouseClicked
        buttonControll.GallonsButton(gallons);
        buttonControll.setC(hovGallons);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovUsers);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovDeliveries);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_gallonsMouseClicked

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        buttonControll.UsersButton(users);
        buttonControll.setC(hovUsers);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovGallons);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSupplier);
        buttonControll.resetC(hovPromos);
        buttonControll.resetC(hovDeliveries);
        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_usersMouseClicked

    private void profilesettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilesettingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profilesettingMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
//        new ProfileSettingModal(lalagyanan,lalagyananbut,userID).setVisible(true);
    }//GEN-LAST:event_profileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customer;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel deliveries;
    private javax.swing.JLabel gallons;
    private javax.swing.JPanel hovCustomer;
    private javax.swing.JPanel hovDashboard;
    private javax.swing.JPanel hovDeliveries;
    private javax.swing.JPanel hovGallons;
    private javax.swing.JPanel hovProfileSetting;
    private javax.swing.JPanel hovPromos;
    private javax.swing.JPanel hovRefilled;
    private javax.swing.JPanel hovSales;
    private javax.swing.JPanel hovSupplier;
    private javax.swing.JPanel hovUsers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private jroundborder.JLabelRound profile;
    private javax.swing.JLabel profilesetting;
    private javax.swing.JLabel promos;
    private javax.swing.JLabel refilled;
    private javax.swing.JLabel sale;
    private javax.swing.JLabel supplier;
    private javax.swing.JLabel userId;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
