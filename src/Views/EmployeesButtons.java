package Views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controllers.ButtonsController;
import javax.swing.JPanel;
/**
 *
 * @author Maria Crystaline
 */
public class EmployeesButtons extends javax.swing.JPanel {

    /**
     * Creates new form EmployeesButtons
     */
    ButtonsController buttonControll;
    JPanel lalagyanan;
    
    public EmployeesButtons(JPanel lalagyanan,String Profile) {
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
        hovCustomers = new javax.swing.JPanel();
        customers = new javax.swing.JLabel();
        hovSales = new javax.swing.JPanel();
        sales = new javax.swing.JLabel();
        hovRefilled = new javax.swing.JPanel();
        refilled = new javax.swing.JLabel();
        hovPos = new javax.swing.JPanel();
        pos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 204, 255));
        setMinimumSize(new java.awt.Dimension(250, 230));
        setPreferredSize(new java.awt.Dimension(250, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>EMLOYEES <br> <center>BUTTONS</center></html>");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 2, 1, new java.awt.Color(0, 0, 255)));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 100));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 100));

        hovDashboard.setBackground(new java.awt.Color(85, 65, 118));
        hovDashboard.setPreferredSize(new java.awt.Dimension(250, 50));

        dashboard.setBackground(new java.awt.Color(85, 65, 118));
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

        hovCustomers.setBackground(new java.awt.Color(85, 65, 118));
        hovCustomers.setPreferredSize(new java.awt.Dimension(250, 50));

        customers.setBackground(new java.awt.Color(85, 65, 118));
        customers.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        customers.setForeground(new java.awt.Color(255, 255, 255));
        customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customers.setText("Customers");
        customers.setIconTextGap(10);
        customers.setPreferredSize(new java.awt.Dimension(250, 50));
        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hovCustomersLayout = new javax.swing.GroupLayout(hovCustomers);
        hovCustomers.setLayout(hovCustomersLayout);
        hovCustomersLayout.setHorizontalGroup(
            hovCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hovCustomersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        hovCustomersLayout.setVerticalGroup(
            hovCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hovCustomersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(hovCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 50));

        hovSales.setBackground(new java.awt.Color(64, 43, 100));
        hovSales.setPreferredSize(new java.awt.Dimension(250, 50));

        sales.setBackground(new java.awt.Color(85, 65, 118));
        sales.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sales.setText("Sales");
        sales.setIconTextGap(10);
        sales.setPreferredSize(new java.awt.Dimension(250, 50));
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hovSalesLayout = new javax.swing.GroupLayout(hovSales);
        hovSales.setLayout(hovSalesLayout);
        hovSalesLayout.setHorizontalGroup(
            hovSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hovSalesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
        );
        hovSalesLayout.setVerticalGroup(
            hovSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hovSalesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(hovSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 265, -1, -1));

        hovRefilled.setBackground(new java.awt.Color(64, 43, 100));
        hovRefilled.setPreferredSize(new java.awt.Dimension(250, 50));

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
            .addComponent(refilled, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hovRefilledLayout.setVerticalGroup(
            hovRefilledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hovRefilledLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refilled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(hovRefilled, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        hovPos.setBackground(new java.awt.Color(64, 43, 100));
        hovPos.setPreferredSize(new java.awt.Dimension(250, 50));

        pos.setBackground(new java.awt.Color(85, 65, 118));
        pos.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        pos.setForeground(new java.awt.Color(255, 255, 255));
        pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos.setText("Transaction");
        pos.setIconTextGap(10);
        pos.setPreferredSize(new java.awt.Dimension(250, 50));
        pos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hovPosLayout = new javax.swing.GroupLayout(hovPos);
        hovPos.setLayout(hovPosLayout);
        hovPosLayout.setHorizontalGroup(
            hovPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hovPosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        hovPosLayout.setVerticalGroup(
            hovPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hovPosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(hovPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
   buttonControll.DashboardButton(dashboard);
        buttonControll.setC(hovDashboard);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomers);
        buttonControll.resetC(hovRefilled);
    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered

    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
  
    }//GEN-LAST:event_dashboardMouseExited

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        buttonControll.CustomerButton(customers);
        buttonControll.setC(hovCustomers);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovRefilled);
    }//GEN-LAST:event_customersMouseClicked

    private void customersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseEntered

    }//GEN-LAST:event_customersMouseEntered

    private void customersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseExited

    }//GEN-LAST:event_customersMouseExited

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        buttonControll.SalesButton(sales);
        buttonControll.setC(hovSales);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovCustomers);
        buttonControll.resetC(hovRefilled);
//        buttonControll.resetC(hovSupplier);
//        buttonControll.resetC(hovPromos);
//        buttonControll.resetC(hovDeliveries);
//        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_salesMouseClicked

    private void refilledMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refilledMouseClicked
        buttonControll.RefilledGallonsButton(refilled);
        buttonControll.setC(hovRefilled);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovPos);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovCustomers);
//        buttonControll.resetC(hovSupplier);
//        buttonControll.resetC(hovPromos);
//        buttonControll.resetC(hovDeliveries);
//        buttonControll.resetC(hovCustomer);
    }//GEN-LAST:event_refilledMouseClicked

    private void posMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posMouseClicked
        buttonControll.PosButton(pos);
        buttonControll.setC(hovPos);
        buttonControll.resetC(hovDashboard);
        buttonControll.resetC(hovRefilled);
        buttonControll.resetC(hovSales);
        buttonControll.resetC(hovCustomers);
    }//GEN-LAST:event_posMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customers;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel hovCustomers;
    private javax.swing.JPanel hovDashboard;
    private javax.swing.JPanel hovPos;
    private javax.swing.JPanel hovRefilled;
    private javax.swing.JPanel hovSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pos;
    private javax.swing.JLabel refilled;
    private javax.swing.JLabel sales;
    // End of variables declaration//GEN-END:variables
}
