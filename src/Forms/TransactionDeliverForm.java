/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.DeliveriesController;
import Controllers.SQLController;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCaluag
 */
public class TransactionDeliverForm extends javax.swing.JFrame {

    /**
     * Creates new form TransactionDeliverForm
     */
    static int transactionlogsId;
    static JTable deliveriesTable;
    static JPanel lalagyanan;
    static JFrame out;
    SQLController sql = new SQLController();
    java.sql.Connection con = sql.getConnection();
    
    public TransactionDeliverForm(int transactionlogsId,JTable deliveriesTable,JFrame out,JPanel lalagyanan) {
        initComponents();
        this.deliveriesTable = deliveriesTable;
        this.transactionlogsId = transactionlogsId;
        this.out = out;
        this.lalagyanan = lalagyanan;
       getDeliveriesInfo(transactionlogsId);
    }

    
    double totalamount;
    int quant;
    double uprice,pprice;
    int tl;
    
    public void getDeliveriesInfo(int id){
          try {
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("SELECT * FROM `transactions` LEFT JOIN customers ON customers.ID = transactions.Customer_Id LEFT JOIN gallons ON gallons.Code = transactions.Gallon_Id LEFT JOIN promos ON promos.Id = transactions.Promo_Id LEFT JOIN users ON users.Id = transactions.User_Id WHERE transactions.ID = '"+id+"' AND transactions.ServiceType = 1");
              
              while(rs.next()){
                  Customer_Id.setText(rs.getString("customers.Fname") + " " + rs.getString("customers.Mname") + " " + rs.getString("customers.Lname"));
                  Date_Delivered.setDate(rs.getDate("transactions.DDorDP"));
                  gallonType.setText(rs.getString("gallons.Gallon_Type"));
                  Date_Order.setDate(rs.getDate("transactions.DOorDR"));
                  uprice = rs.getDouble("unitPrice");
                  tl = rs.getInt("Transaction_Id");
//                  Quantity.setModel(new SpinnerNumberModel(rs.getInt("transactions.Quantity"), rs.getInt("transactions.Quantity"), 1000, 1));
//                  Quantity.setValue(rs.getInt("transactions.Quantity"));
                  quant = rs.getInt("transactions.Quantity");
                  Promo_Id.setText(rs.getString("promos.Description"));
              } } catch (SQLException ex) {
              Logger.getLogger(DeliveriesController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    void updatedeliveriesGallonQuant(){
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
            String updates = "UPDATE transactions SET Quantity = ?, DOorDR = ?, DDorDP = ? WHERE ID = '" + transactionlogsId +"'";
            PreparedStatement st = con.prepareStatement(updates);
            pprice = uprice * (quant + Integer.parseInt(Quantity.getValue().toString()));
            st.setInt(1, quant + Integer.parseInt(Quantity.getValue().toString()));
            st.setString(2, dateFormat.format(Date_Order.getDate()));
            st.setString(3, dateFormat.format(Date_Delivered.getDate()));
            int i = st.executeUpdate();
            if (i > 0) {
                getTLData();
                DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
                model.setRowCount(0);
                this.dispose();
                out.dispose();
                new ContainerController(lalagyanan,new Views.PointOfSale.Deliveries(lalagyanan));
            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDeliverForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    void getTLData(){
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `transactions_logs`WHERE Transaction_Id = '"+tl+"'");
            
                JOptionPane.showMessageDialog(null, "0 : " + tl);
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null,"1 : " + tl);
                JOptionPane.showMessageDialog(null,"1 : " + pprice);
                
                
                String updates = "UPDATE `transactions_logs` SET Total_Amount = ? , balance = ? WHERE Transaction_Id = '" + tl +"'";
                PreparedStatement sts = con.prepareStatement(updates);
                sts.setDouble(1, pprice);
                sts.setDouble(2, pprice);
                int i = sts.executeUpdate();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDeliverForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void updateTransactions_logs(){
        try {
            String updates = "UPDATE transactions SET Quantity = ?, DOorDR = ?, DDorDP = ? WHERE ID = '" + transactionlogsId +"'";
            PreparedStatement st = con.prepareStatement(updates);
            st.setInt(1, Integer.parseInt(Quantity.getValue().toString()));
//            st.setString(2, dateFormat.format(Date_Order.getDate()));
//            st.setString(3, dateFormat.format(Date_Delivered.getDate()));
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)deliveriesTable.getModel();
                model.setRowCount(0);
                this.dispose();
                out.dispose();
                new ContainerController(lalagyanan,new Views.PointOfSale.Deliveries(lalagyanan));
            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDeliverForm.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Date_Delivered = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Quantity = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Date_Order = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        Promo_Id = new javax.swing.JTextField();
        Customer_Id = new javax.swing.JTextField();
        gallonType = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 172, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deliveries Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 230, 40));

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Quantity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 40));
        jPanel1.add(Date_Delivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 40));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html><center>Date to Delivered</center></html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 40));

        Quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 40));

        jLabel5.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Promo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 50, 40));

        updatebtn.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 180, 60));

        jButton2.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 30));

        jLabel6.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Order");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 40));
        jPanel1.add(Date_Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, 40));

        jLabel7.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gallon Type");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 40));

        Promo_Id.setEditable(false);
        Promo_Id.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jPanel1.add(Promo_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 40));

        Customer_Id.setEditable(false);
        Customer_Id.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jPanel1.add(Customer_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 170, 40));

        gallonType.setEditable(false);
        gallonType.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jPanel1.add(gallonType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
       updatedeliveriesGallonQuant();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionDeliverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionDeliverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionDeliverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionDeliverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionDeliverForm(transactionlogsId,deliveriesTable,out,lalagyanan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Customer_Id;
    private com.toedter.calendar.JDateChooser Date_Delivered;
    private com.toedter.calendar.JDateChooser Date_Order;
    private javax.swing.JTextField Promo_Id;
    private javax.swing.JSpinner Quantity;
    private javax.swing.JTextField gallonType;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
