/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import dao.UserDao;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class UpdatePassword extends javax.swing.JFrame {

    /**
     * Creates new form Reset_Password
     */
    private String email="user@gmail.com";
    
    public UpdatePassword() {
        initComponents();
        btnsave.setEnabled(false);
    }
    public UpdatePassword(String email) {
        initComponents();
        this.email=email;
        btnsave.setEnabled(false);
    }
    
    public void validatefield(){
        char[] cnp = txtnewpass.getPassword();
        char[] ccp = txtcnfpass.getPassword();
        char[] cop = txtpass.getPassword();
        
        String snp="";
        String scp="";
        String sop="";
        
        for(char c:cop){
            sop+=c;
        }
        for(char c:cnp){
            snp+=c;
        }
        for(char c:ccp){
            scp+=c;
        }
        
        if(snp.equals(scp) && !sop.equals("") && !snp.equals("")  ){
            btnsave.setEnabled(true);
        }
        else{
            btnsave.setEnabled(false);
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtnewpass = new javax.swing.JPasswordField();
        txtcnfpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Update Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 223, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("new password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 329, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("confirm password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 374, -1, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 0, 51));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 494, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Old Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 285, 140, -1));

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 289, 331, -1));

        txtnewpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnewpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtnewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 333, 331, -1));

        txtcnfpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcnfpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcnfpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtcnfpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 378, 331, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backg.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("\\/");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setText("Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setText("Home");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Profile(email).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new HomePage(email).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        // TODO add your handling code here:
        char[] cp = txtpass.getPassword();
        String password = "";
        for(char c:cp){
            password+=c;
        }
        char[] np = txtnewpass.getPassword();
        String newpassword ="";
        for(char c:np){
            newpassword+=c;
        }
        if(UserDao.validateUserPass(email, password)){
            UserDao.update(email, newpassword);
        }
        else{
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:red\">Incorrect Password</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        // TODO add your handling code here:
        validatefield();
    }//GEN-LAST:event_txtpassKeyReleased

    private void txtnewpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpassKeyReleased
        // TODO add your handling code here:
        validatefield();
    }//GEN-LAST:event_txtnewpassKeyReleased

    private void txtcnfpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnfpassKeyReleased
        // TODO add your handling code here:
        validatefield();
    }//GEN-LAST:event_txtcnfpassKeyReleased

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        // TODO add your handling code here:
         validatefield();
    }//GEN-LAST:event_txtpassKeyPressed

    private void txtnewpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpassKeyPressed
        // TODO add your handling code here:
         validatefield();
    }//GEN-LAST:event_txtnewpassKeyPressed

    private void txtcnfpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnfpassKeyPressed
        // TODO add your handling code here:
         validatefield();
    }//GEN-LAST:event_txtcnfpassKeyPressed

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
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField txtcnfpass;
    private javax.swing.JPasswordField txtnewpass;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
