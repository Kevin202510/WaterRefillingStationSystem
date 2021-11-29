/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.PointOfSale;

import Controllers.CustomerController;
import Controllers.GallonsController;
import Controllers.PromosController;
import Controllers.TransactionController;
import Controllers.UsersController;
import Models.SupplierModel;
import Models.TransactionsModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public class Transaction extends javax.swing.JPanel {

    /**
     * Creates new form Transaction
     */
    CustomerController customerControll = new CustomerController();
    PromosController promoControll = new PromosController();
    UsersController userControll = new UsersController();
    TransactionController transactionControll = new TransactionController();
    GallonsController gallonsControll = new GallonsController();
    
    JPanel lalagyanan;
    
    double salePrice;
    
    public Transaction(JPanel lalagyanan) {
        initComponents();
        this.lalagyanan = lalagyanan;
        transactionControll.fetchComboBoxValue(Customer_Id, Promo_Id,waterType_Id,gallonType_Id);
        Promo_Id.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isborrowgallons = new javax.swing.ButtonGroup();
        price = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Customer_Id = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        gallonType_Id = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        serviceOffered = new javax.swing.JComboBox<>();
        Promo_Id = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        notborrowgallon = new javax.swing.JRadioButton();
        isborrowgallon = new javax.swing.JRadioButton();
        addToCartBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DateToBeDeliver = new com.toedter.calendar.JDateChooser();
        DateOrder = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        gallonQuantity = new javax.swing.JSpinner();
        payBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        waterType_Id = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        pindicate = new javax.swing.JButton();
        p25 = new javax.swing.JButton();
        p30 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(990, 480));

        cartTable.setAutoCreateRowSorter(true);
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Fullname", "Gallon Type", "Price", "Gallon Quantity", "Promo", "Borrowed Gallon", "Service", "Date Order", "Date To Deliver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setGridColor(new java.awt.Color(255, 0, 153));
        cartTable.setRowHeight(25);
        cartTable.setShowGrid(true);
        cartTable.getTableHeader().setReorderingAllowed(false);
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cartTable);
        if (cartTable.getColumnModel().getColumnCount() > 0) {
            cartTable.getColumnModel().getColumn(6).setMinWidth(45);
            cartTable.getColumnModel().getColumn(6).setPreferredWidth(45);
            cartTable.getColumnModel().getColumn(6).setMaxWidth(45);
        }

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.add(Customer_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 30));

        jLabel3.setText("Customer Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        jPanel2.add(gallonType_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 160, 30));

        jLabel4.setText("Gallon Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 30));

        jLabel5.setText("Service Option");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 30));

        serviceOffered.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Walk IN", "Pick Up", "Deliver" }));
        jPanel2.add(serviceOffered, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, 30));

        jPanel2.add(Promo_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 30));

        jLabel6.setText("Date To Be Deliver");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 30));

        jLabel7.setText("Is Borrowed Gallon");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 30));

        isborrowgallons.add(notborrowgallon);
        notborrowgallon.setText("no");
        jPanel2.add(notborrowgallon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        isborrowgallons.add(isborrowgallon);
        isborrowgallon.setText("yes");
        jPanel2.add(isborrowgallon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        addToCartBtn.setText("ADD");
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addToCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        jLabel9.setText("Quantity");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));

        jLabel10.setText("Date Order");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 30));
        jPanel2.add(DateToBeDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, 30));

        DateOrder.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateOrderPropertyChange(evt);
            }
        });
        jPanel2.add(DateOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 30));

        jLabel11.setText("Promo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 30));

        gallonQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        gallonQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gallonQuantityStateChanged(evt);
            }
        });
        jPanel2.add(gallonQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 30));

        payBtn.setText("Pay");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        jPanel2.add(payBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 100, 40));

        jLabel8.setText("Price");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 60, 30));

        jPanel2.add(waterType_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 160, 30));

        jLabel12.setText("Water Type");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, 30));

        pindicate.setText("Indicate");
        price.add(pindicate);
        pindicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pindicateActionPerformed(evt);
            }
        });
        jPanel2.add(pindicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 80, 40));

        p25.setText("25");
        price.add(p25);
        p25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p25ActionPerformed(evt);
            }
        });
        jPanel2.add(p25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 70, 40));

        p30.setText("30");
        price.add(p30);
        p30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p30ActionPerformed(evt);
            }
        });
        jPanel2.add(p30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

     String strDates;
     String strDates1;
     
    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        //            String name = customerControll.customerlist().get(Customer_Id.getS).getFullname().
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
        strDates = dateFormat.format(DateOrder.getDate());
        strDates1 = dateFormat.format(DateToBeDeliver.getDate());
        String isborrow="";
        if(isborrowgallon.isSelected()){
            isborrow = "Yes";
        }if(notborrowgallon.isSelected()){
            isborrow = "No";
        }
        
        Object[] row = { cartTable.getRowCount()+1,Customer_Id.getSelectedItem() ,gallonType_Id.getSelectedItem(),salePrice, gallonQuantity.getValue(),promothis , isborrow , serviceOffered.getSelectedItem(),strDates,strDates1};
        
        String code, code1, rw0, rw1, custname, msf=null;
          int x;
          for(x = 0; x<cartTable.getRowCount();x++){
            code = gallonType_Id.getSelectedItem().toString();
            custname = Customer_Id.getSelectedItem().toString();
            code1 = serviceOffered.getSelectedItem().toString();
            rw0 = String.valueOf(cartTable.getValueAt(x, 2));
            rw1 = String.valueOf(cartTable.getValueAt(x, 7));
            if (code.equals(rw0) && code1.equals(rw1) && custname.equals(cartTable.getValueAt(x, 1).toString())){
                msf = String.valueOf(x);
                break;
            }
          }
          
          if (msf != null){
            int quant = Integer.parseInt(cartTable.getValueAt(x,4).toString());
            cartTable.setValueAt(Integer.parseInt(gallonQuantity.getValue().toString()) + quant, x, 4);
          }else{
              transactionControll.addToCart(cartTable, row);
          }
    }//GEN-LAST:event_addToCartBtnActionPerformed

    
    private void trylang(){
        DefaultTableModel model = (DefaultTableModel)cartTable.getModel();

        double totalAmount=0;
          String code1,code2,code3, rw0,DDorDR,DDorDP, msf=null;
          int custid=0;
          int servicetype=0;
          int waterType=0;
          int promoid=0;
          int status=0;
          String gallonid = "";
          int x;
            for(x = 0; x<cartTable.getRowCount();x++){
                for(int i=0;i<=Customer_Id.getItemCount();i++){
                if (cartTable.getValueAt(x, 1).toString().equals(Customer_Id.getItemAt(i))) {
                    try {
                        custid = customerControll.customerlist().get(i).getID();
                    } catch (SQLException ex) {
                        Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
                
                for(int k=0; k<=gallonType_Id.getItemCount();k++){
                    if (cartTable.getValueAt(x, 2).toString().equals(gallonType_Id.getItemAt(k))) {
                        try {
                            gallonid = gallonsControll.gallonList().get(k).getCode();
                        } catch (SQLException ex) {
                            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                
                for(int k=0; k<=Promo_Id.getItemCount();k++){
                    if (cartTable.getValueAt(x, 5).toString().equals(Promo_Id.getItemAt(k))) {
                        try {
                            promoid = promoControll.promosList().get(k).getId();
                        } catch (SQLException ex) {
                            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                
                for(int k=0; k<=serviceOffered.getItemCount();k++){
                    if (cartTable.getValueAt(x, 7).toString().equals(serviceOffered.getItemAt(k))) {
                            servicetype = k;   
                    }
                }
                
//                for(int k=0; k<=serviceOffered.getItemCount();k++){
//                    if (cartTable.getValueAt(x, 7).toString().equals(serviceOffered.getItemAt(k))) {
//                            waterType = k;   
//                    }
//                }

            double rowAmount = Double.parseDouble(cartTable.getValueAt(x,3).toString())*Integer.parseInt(cartTable.getValueAt(x,4).toString());
            totalAmount += rowAmount;
                
                transactionControll.supplierList(custid, cartTable.getValueAt(x,8).toString(), cartTable.getValueAt(x,9).toString(),Double.parseDouble(cartTable.getValueAt(x,3).toString()),1, gallonid, Integer.parseInt(cartTable.getValueAt(x,4).toString()), promoid, servicetype, 0, 1);         
        }
        int option = JOptionPane.showConfirmDialog(null,"You Total Amount :" + totalAmount +" Pay Now", "Select an Option",JOptionPane.YES_NO_OPTION);
        if(option==0){
            double payment = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Amount")); 
            transactionControll.addDeliveries(cartTable);
        }else{
            transactionControll.transactionslist.clear();
        }
    }
    
    private void DateOrderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateOrderPropertyChange
        setMinimumDate();
    }//GEN-LAST:event_DateOrderPropertyChange

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        trylang();
    }//GEN-LAST:event_payBtnActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        JOptionPane.showMessageDialog(null,cartTable.getValueAt(0,9).toString());
        transactionControll.deleteDataFromCart(cartTable.getSelectedRow(), cartTable);
        
    }//GEN-LAST:event_cartTableMouseClicked

    private void p25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p25ActionPerformed
           salePrice = 25D;
    }//GEN-LAST:event_p25ActionPerformed

    private void p30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p30ActionPerformed
        salePrice = 30D;
    }//GEN-LAST:event_p30ActionPerformed

    private void pindicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pindicateActionPerformed
        double sp = Double.parseDouble(JOptionPane.showInputDialog(null,"Sale Price"));
        if(sp>0){
            salePrice = sp;
        }
    }//GEN-LAST:event_pindicateActionPerformed
    String promothis;
    private void gallonQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gallonQuantityStateChanged
        if(Integer.parseInt(gallonQuantity.getValue().toString())>=5){
            Promo_Id.setEnabled(true);
            promothis = Promo_Id.getSelectedItem().toString();
        }else{
            Promo_Id.setEnabled(false);
            promothis = "Not Applicable";
        }
    }//GEN-LAST:event_gallonQuantityStateChanged
    private void setMinimumDate(){
        DateToBeDeliver.setMinSelectableDate(DateOrder.getDate());
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Customer_Id;
    private com.toedter.calendar.JDateChooser DateOrder;
    private com.toedter.calendar.JDateChooser DateToBeDeliver;
    private javax.swing.JComboBox<String> Promo_Id;
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JTable cartTable;
    private javax.swing.JSpinner gallonQuantity;
    private javax.swing.JComboBox<String> gallonType_Id;
    private javax.swing.JRadioButton isborrowgallon;
    private javax.swing.ButtonGroup isborrowgallons;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton notborrowgallon;
    private javax.swing.JButton p25;
    private javax.swing.JButton p30;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton pindicate;
    private javax.swing.ButtonGroup price;
    private javax.swing.JComboBox<String> serviceOffered;
    private javax.swing.JComboBox<String> waterType_Id;
    // End of variables declaration//GEN-END:variables
}
