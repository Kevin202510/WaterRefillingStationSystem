/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ChelseaTorres
 */
public class UserModal extends javax.swing.JFrame {

    /**
     * Creates new form UserModal
     */
    static int btn_id;
    
    public UserModal(int btn_id) {
        this.btn_id = btn_id;
        initComponents();
        checkBtn(btn_id);
    }
    private void checkBtn(int btn_id){
        if (btn_id==1) {
            updatebtn.setVisible(false);
            deletebtn.setVisible(false);
            ImageIcon vins = new ImageIcon(getClass().getResource("/Images/Profile/sampleuser.jpg"));
            Image kev = vins.getImage().getScaledInstance(210, 120, Image.SCALE_SMOOTH);
            profileimg.setIcon(new ImageIcon(kev));
        }else{
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        profileimg = new jroundborder.JLabelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 306, 41));

        updatebtn.setText("UPDATE");
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 546, 100, 43));

        deletebtn.setText("DELETE");
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 546, 100, 43));

        addbtn.setText("ADD");
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 100, 43));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 190, 30));

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 30));

        jLabel3.setText("Middle Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 30));

        jLabel4.setText("Date of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 190, 30));

        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 190, 30));

        jLabel6.setText("Contact");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, 30));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 190, 30));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 190, 30));

        jLabel7.setText("Username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 80, 30));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 190, 30));

        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 80, 30));
        jPanel1.add(profileimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 210, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                new UserModal(btn_id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addbtn;
    public javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private jroundborder.JLabelRound profileimg;
    public javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}