/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.UserController;
import Models.UserModel;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author ChelseaTorres
 */
public class UserModal extends javax.swing.JFrame {

    /**
     * Creates new form UserModal
     */
    static int btn_id;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    UserModel usermodel;
    UserController userControll = new UserController();
    static JTable userTable;
    static JPanel lalagyanan;
    
    public UserModal(int btn_id,JTable userTable,JPanel lalagyanan) {
        this.btn_id = btn_id;
        this.userTable = userTable;
        this.lalagyanan = lalagyanan;
        initComponents();
        checkBtn(btn_id);
    }
    private void checkBtn(int btn_id){
        if (btn_id==0) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
            ImageIcon vins = new ImageIcon(getClass().getResource("/Images/Profile/sampleuser.jpg"));
            Image kev = vins.getImage().getScaledInstance(210, 120, Image.SCALE_SMOOTH);
            userProfile.setIcon(new ImageIcon(kev));
        }else{
            userControll.getUserInfo(btn_id, userRole_id, userProfile, userFname, userMname, userLname, userDOB, userAddress, userContact, userUsername, userPassword);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        userFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userContact = new javax.swing.JTextField();
        userUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        userProfile = new jroundborder.JLabelRound();
        userMname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userDOB = new com.toedter.calendar.JDateChooser();
        userRole_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        profilename = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 306, 20));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 546, 100, 43));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 546, 100, 43));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 100, 43));
        jPanel1.add(userFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 30));

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, 30));

        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, 30));
        jPanel1.add(userLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 190, 30));

        jLabel4.setText("Date of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 30));

        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 80, 30));
        jPanel1.add(userAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 190, 30));

        jLabel6.setText("Contact");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 80, 30));
        jPanel1.add(userContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 190, 30));
        jPanel1.add(userUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 190, 30));

        jLabel7.setText("Username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 80, 30));
        jPanel1.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 190, 30));

        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 80, 30));
        jPanel1.add(userProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 210, 110));
        jPanel1.add(userMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 190, 30));

        jLabel9.setText("Middle Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));
        jPanel1.add(userDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 190, 30));
        jPanel1.add(userRole_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 190, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 10, 40, 30));

        profilename.setEditable(false);
        profilename.setBorder(null);
        profilename.setEnabled(false);
        profilename.setOpaque(false);
        jPanel1.add(profilename, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        usermodel = new UserModel(0,Integer.parseInt(userRole_id.getText()),null,userFname.getText(),userMname.getText(),
                    userLname.getText(),df.format(userDOB.getDate()),userAddress.getText(),userContact.getText(),userUsername.getText(),userPassword.getText());
        if (userControll.addUser(usermodel,userTable)) {
            this.dispose();
            new ContainerController(lalagyanan,new Views.Users(lalagyanan));
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        String profile;
        if (profilename.getText().isEmpty()) {
            profile = null;
        }else{
            profile = profilename.getText();
        }
        usermodel = new UserModel(btn_id,Integer.parseInt(userRole_id.getText()),profile,userFname.getText(),userMname.getText(),
                    userLname.getText(),df.format(userDOB.getDate()),userAddress.getText(),userContact.getText(),userUsername.getText(),userPassword.getText());
        if (userControll.updateUser(usermodel, userTable)) {
            this.dispose();
            new ContainerController(lalagyanan,new Views.Users(lalagyanan));
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(userControll.deleteUser(btn_id,userTable)){
            this.dispose();
            new ContainerController(lalagyanan,new Views.Users(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserModal(btn_id,userTable,lalagyanan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField profilename;
    public javax.swing.JButton updatebtn;
    private javax.swing.JTextField userAddress;
    private javax.swing.JTextField userContact;
    private com.toedter.calendar.JDateChooser userDOB;
    private javax.swing.JTextField userFname;
    private javax.swing.JTextField userLname;
    private javax.swing.JTextField userMname;
    private javax.swing.JTextField userPassword;
    private jroundborder.JLabelRound userProfile;
    private javax.swing.JTextField userRole_id;
    private javax.swing.JTextField userUsername;
    // End of variables declaration//GEN-END:variables
}
