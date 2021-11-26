/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.ContainerController;
import Controllers.UsersController;
import Models.UserModel;
import Views.Authentication.Authentication;
import Views.DashboardsAndButtons.MainDashboard;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Color;

/**
 *
 * @author KevinCaluag
 */
public class UserFormModal extends javax.swing.JPanel {

    /**
     * Creates new form UserFormModal
     */
    static int btn_id;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    UserModel usermodel;
    UsersController userControll = new UsersController();
    Webcam wc;
    String path = System.getProperty("user.dir");
    static JTable userTable;
    static JFrame out;
    static JPanel lalagyanan;
    
    public UserFormModal(JFrame out,int btn_id,JTable userTable,JPanel lalagyanan) {
        initComponents();
        this.btn_id = btn_id;
        this.userTable = userTable;
        this.lalagyanan = lalagyanan;
        this.out = out;
        userControll.showRoles(userRole_id);
        wc = Webcam.getDefault();
        wc.setViewSize(WebcamResolution.VGA.getSize());
        checkBtn(btn_id);
    }
    private void checkBtn(int btn_id){
        if (btn_id==0) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
            ImageIcon vins = new ImageIcon(path + "/Images/Profile/sampleuser.jpg");
            Image kev = vins.getImage().getScaledInstance(210, 120, Image.SCALE_SMOOTH);
            userProfile.setIcon(new ImageIcon(kev));
        }else{
            userControll.getUserInfo(btn_id, userRole_id, profilename, userProfile, userFname, userMname, userLname, userDOB, userAddress, userContact, userUsername, userPassword);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userProfile = new jroundborder.JLabelRound();
        userLname = new javax.swing.JTextField();
        userMname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userDOB = new com.toedter.calendar.JDateChooser();
        userAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        userContact = new javax.swing.JTextField();
        profilename = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        userUsername = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        userFname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbtn_addpic = new javax.swing.JButton();
        userPassword = new javax.swing.JPasswordField();
        userRole_id = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(350, 610));
        setPreferredSize(new java.awt.Dimension(350, 610));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(64, 43, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 610));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, 30));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 30));
        jPanel2.add(userProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 53, 176, 75));

        userLname.setBackground(new Color(0,0,0,1));
        userLname.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        userLname.setForeground(new java.awt.Color(255, 255, 255));
        userLname.setBorder(null);
        userLname.setOpaque(false);
        jPanel2.add(userLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, 30));

        userMname.setBackground(new Color(0,0,0,1));
        userMname.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        userMname.setForeground(new java.awt.Color(255, 255, 255));
        userMname.setBorder(null);
        userMname.setOpaque(false);
        jPanel2.add(userMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 210, 30));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Birth");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 30));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Middle Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 30));

        jLabel5.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, 30));
        jPanel2.add(userDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 210, 30));

        userAddress.setBackground(new Color(0,0,0,1));
        userAddress.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        userAddress.setForeground(new java.awt.Color(255, 255, 255));
        userAddress.setBorder(null);
        userAddress.setOpaque(false);
        jPanel2.add(userAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 210, 30));

        jLabel6.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, 30));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 100, 43));

        userContact.setBackground(new Color(0,0,0,1));
        userContact.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        userContact.setForeground(new java.awt.Color(255, 255, 255));
        userContact.setBorder(null);
        userContact.setOpaque(false);
        jPanel2.add(userContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 210, 30));

        profilename.setEditable(false);
        profilename.setBorder(null);
        profilename.setEnabled(false);
        profilename.setOpaque(false);
        profilename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilenameActionPerformed(evt);
            }
        });
        jPanel2.add(profilename, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 90, 30));

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel2.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 100, 43));

        userUsername.setBackground(new Color(0,0,0,1));
        userUsername.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        userUsername.setForeground(new java.awt.Color(255, 255, 255));
        userUsername.setBorder(null);
        userUsername.setOpaque(false);
        jPanel2.add(userUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 210, 30));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 100, 43));

        jLabel7.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 30));

        userFname.setBackground(new Color(0,0,0,1));
        userFname.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        userFname.setForeground(new java.awt.Color(255, 255, 255));
        userFname.setBorder(null);
        userFname.setOpaque(false);
        jPanel2.add(userFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, 30));

        jLabel10.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));

        jbtn_addpic.setBackground(new java.awt.Color(0, 204, 204));
        jbtn_addpic.setFont(new java.awt.Font("Arial Narrow", 0, 1)); // NOI18N
        jbtn_addpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/cams.jpg"))); // NOI18N
        jbtn_addpic.setText("1");
        jbtn_addpic.setFocusable(false);
        jbtn_addpic.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jbtn_addpic.setNextFocusableComponent(userFname);
        jbtn_addpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_addpicActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_addpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 91, 40, -1));

        userPassword.setBackground(new Color(0,0,0,1));
        userPassword.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        userPassword.setForeground(new java.awt.Color(255, 255, 255));
        userPassword.setBorder(null);
        userPassword.setOpaque(false);
        jPanel2.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 210, 30));

        jPanel2.add(userRole_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 210, 32));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setNextFocusableComponent(userFname);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 10, 60, 40));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 210, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 210, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 210, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 210, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 210, 10));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 210, 10));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 210, 10));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 350, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        String profile;
        if (profilename.getText().isEmpty() || profilename.getText() == "null") {
            profile = "sampleuser";
        }else{
            profilename.setText(userFname.getText());
            profile = profilename.getText();
        }
        usermodel = new UserModel(btn_id,userRole_id.getSelectedIndex()+1,profile,userFname.getText(),userMname.getText(),
            userLname.getText(),df.format(userDOB.getDate()),userAddress.getText(),userContact.getText(),userUsername.getText(),userPassword.getText());
        if (userControll.updateUser(usermodel, userTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Users.Users(lalagyanan));
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void profilenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilenameActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(userControll.deleteUser(btn_id,userTable)){
            out.dispose();
            new ContainerController(lalagyanan,new Views.Users.Users(lalagyanan));
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        usermodel = new UserModel(0,userRole_id.getSelectedIndex()+1,"sampleuser",userFname.getText(),userMname.getText(),
            userLname.getText(),df.format(userDOB.getDate()),userAddress.getText(),userContact.getText(),userUsername.getText(),String.valueOf(userPassword.getPassword()));
        if (userControll.addUser(usermodel,userTable)) {
            out.dispose();
            new ContainerController(lalagyanan,new Views.Users.Users(lalagyanan));
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void jbtn_addpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_addpicActionPerformed
        if (jbtn_addpic.getText().equals("1")) {
            wc.open();
            jbtn_addpic.setText("0");
            new VideoFeeder().start();
        }else{
            try {
                ImageIO.write(wc.getImage(), "JPG", new File(path + "/Images/Profile/" + userFname.getText() + ".jpg"));
                wc.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(UserFormModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtn_addpicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       out.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    Image img;
    
    class VideoFeeder extends Thread {
    
          public void run(){
          
               while(true){
                   img = wc.getImage();
                   userProfile.setIcon(new ImageIcon(img));
//                       Thread.sleep(5000);
                }
          
          }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbtn_addpic;
    private javax.swing.JTextField profilename;
    public javax.swing.JButton updatebtn;
    private javax.swing.JTextField userAddress;
    private javax.swing.JTextField userContact;
    private com.toedter.calendar.JDateChooser userDOB;
    private javax.swing.JTextField userFname;
    private javax.swing.JTextField userLname;
    private javax.swing.JTextField userMname;
    private javax.swing.JPasswordField userPassword;
    private jroundborder.JLabelRound userProfile;
    private javax.swing.JComboBox<String> userRole_id;
    private javax.swing.JTextField userUsername;
    // End of variables declaration//GEN-END:variables
}
