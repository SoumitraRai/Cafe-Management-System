/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;
import javax.swing.JOptionPane;
import model.User;
import dao.UserDao;
/**
 *
 * @author ASUS
 */
public class Signup extends javax.swing.JFrame {
    public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String phonePattern="^[0-9]*$";
    /**
     * Creates new form signup
     */
    public Signup() {
        initComponents();
        btnsignup.setEnabled(false);
    }
    public void validateFields(){
        String name=txtName.getText();
        String email=txtemail.getText();
        String phone=txtphone.getText();
        String password=txtpassword.getText();
        String securityquestion=txtsecurity_question.getText();
        String securityanswer=txtsecurity_answer.getText();
        if(!name.equals("") && email.matches(emailPattern) && phone.matches(phonePattern) && phone.length()==10 && !password.equals("") && !securityquestion.equals("")&& !securityanswer.equals(""))
            btnsignup.setEnabled(true); 
        else
            btnsignup.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtsecurity_question = new javax.swing.JTextField();
        txtsecurity_answer = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnsignup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Signup");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 122, -1));

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 74, 28));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 357, 37, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 91, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Security Question");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 156, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Securty Answer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 156, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 330, -1));

        txtsecurity_question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsecurity_questionActionPerformed(evt);
            }
        });
        txtsecurity_question.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsecurity_questionKeyReleased(evt);
            }
        });
        getContentPane().add(txtsecurity_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 330, -1));

        txtsecurity_answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsecurity_answerKeyReleased(evt);
            }
        });
        getContentPane().add(txtsecurity_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 330, -1));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 330, -1));

        btnsignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(153, 0, 0));
        btnsignup.setText("SIGNUP");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 108, 22));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 70, -1));

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 330, -1));

        txtphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtphoneKeyReleased(evt);
            }
        });
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 330, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -390, -1, -1));

        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(153, 0, 51));
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, 40));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -410, -1, -1));

        btnexit.setBackground(new java.awt.Color(255, 0, 51));
        btnexit.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 255, 255));
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -460, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backg.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsecurity_questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsecurity_questionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsecurity_questionActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        User user= new User();
        user.setName(txtName.getText());
        user.setEmail(txtemail.getText());
        user.setPhone(txtphone.getText());
        user.setPassword(txtpassword.getText());
        user.setSecurityquestion(txtsecurity_question.getText());
        user.setSecurityanswer(txtsecurity_answer.getText());
        user.setStatus("true");
        UserDao.save(user);
        
        
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
         User_Login loginForm = new User_Login();
                loginForm.setVisible(true);
                dispose(); 
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do you really want to close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphoneKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtphoneKeyReleased

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtsecurity_questionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecurity_questionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtsecurity_questionKeyReleased

    private void txtsecurity_answerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecurity_answerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtsecurity_answerKeyReleased

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel name;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsecurity_answer;
    private javax.swing.JTextField txtsecurity_question;
    // End of variables declaration//GEN-END:variables
}
