/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import dao.ItemDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Item;

/**
 *
 * @author apiksha
 */
public class ItemTable extends javax.swing.JFrame {

    /**
     * Creates new form ItemTable
     */
    public String id;
    public ItemTable() {
        initComponents();
    }
      public ItemTable(String id) {
        initComponents();
        this.id=id;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        titem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnnewitem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mback = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titem.setAutoCreateRowSorter(true);
        titem.setBackground(new java.awt.Color(255, 204, 204));
        titem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "Item ID", "Item Name", "Item Price", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        titem.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        titem.getTableHeader().setReorderingAllowed(false);
        titem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                titemKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(titem);
        if (titem.getColumnModel().getColumnCount() > 0) {
            titem.getColumnModel().getColumn(0).setMinWidth(40);
            titem.getColumnModel().getColumn(0).setPreferredWidth(40);
            titem.getColumnModel().getColumn(0).setMaxWidth(40);
            titem.getColumnModel().getColumn(1).setMinWidth(250);
            titem.getColumnModel().getColumn(1).setPreferredWidth(250);
            titem.getColumnModel().getColumn(1).setMaxWidth(250);
            titem.getColumnModel().getColumn(2).setMinWidth(350);
            titem.getColumnModel().getColumn(2).setPreferredWidth(350);
            titem.getColumnModel().getColumn(2).setMaxWidth(350);
            titem.getColumnModel().getColumn(3).setMinWidth(150);
            titem.getColumnModel().getColumn(3).setPreferredWidth(150);
            titem.getColumnModel().getColumn(3).setMaxWidth(150);
            titem.getColumnModel().getColumn(4).setMinWidth(150);
            titem.getColumnModel().getColumn(4).setPreferredWidth(150);
            titem.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 930, 310));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ITEMS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 160, -1));

        btnnewitem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnnewitem.setForeground(new java.awt.Color(255, 0, 51));
        btnnewitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnnewitem.setText("New Item");
        btnnewitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewitemActionPerformed(evt);
            }
        });
        getContentPane().add(btnnewitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chef.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 130, -1, -1));

        txtid.setEditable(false);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 240, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 290, -1, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 290, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Price :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, -1, -1));
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 330, 120, -1));

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 51, 51));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, -1, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 390, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backg.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("<-");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mback.setForeground(new java.awt.Color(255, 153, 0));
        mback.setText("Back");
        mback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbackActionPerformed(evt);
            }
        });
        jMenu1.add(mback);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbackActionPerformed
        // TODO add your handling code here:
        AdminPage hForm = new AdminPage();
                hForm.setVisible(true);
                dispose();
    }//GEN-LAST:event_mbackActionPerformed

    private void btnnewitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewitemActionPerformed
        // TODO add your handling code here:
        AddItem hForm = new AddItem();
                hForm.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnnewitemActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        int i=1;
        DefaultTableModel dtmS = (DefaultTableModel) titem.getModel();
        ArrayList<Item> itemS = ItemDao.getAllItems();
        Iterator<Item> itrS = itemS.iterator();
         while(itrS.hasNext()){
            Item o = itrS.next();
            dtmS.addRow(new Object[]{i,o.getId(),o.getName(),o.getPrice(),o.getCategory()});
             i++;}
    }//GEN-LAST:event_formComponentShown

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void titemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titemKeyPressed
        // TODO add your handling code here:
        int ind = titem.getSelectedRow();
        TableModel tm =titem.getModel();
        
        String name = tm.getValueAt(ind, 2).toString();
        String id = tm.getValueAt(ind, 1).toString();
        String price = tm.getValueAt(ind, 3).toString();
        
//        System.out.println(name);
        
        txtid.setText(id);
        txtname.setText(name);
        txtprice.setText(price);
    }//GEN-LAST:event_titemKeyPressed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        Item i = new Item();
        i.setId(txtid.getText());
        i.setName(txtname.getText());
        i.setPrice(txtprice.getText());
        
        ItemDao.delete(i);
        
        
        
        int in=1;
        DefaultTableModel dtmS = (DefaultTableModel) titem.getModel();
        ArrayList<Item> itemS = ItemDao.getAllItems();
        Iterator<Item> itrS = itemS.iterator();
        
        int rc=dtmS.getRowCount();
        for(int x=0;x<rc;x++){
            dtmS.removeRow(0);
        }
        
         while(itrS.hasNext()){
            Item o = itrS.next();
            dtmS.addRow(new Object[]{in,o.getId(),o.getName(),o.getPrice(),o.getCategory()});
             in++;}
        txtid.setText("");
        txtname.setText("");
        txtprice.setText("");
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        Item i = new Item();
        i.setId(txtid.getText());
        i.setName(txtname.getText());
        i.setPrice(txtprice.getText());
        
        ItemDao.update(i);
        
        
        int in=1;
        DefaultTableModel dtmS = (DefaultTableModel) titem.getModel();
        ArrayList<Item> itemS = ItemDao.getAllItems();
        Iterator<Item> itrS = itemS.iterator();
        
        int rc=dtmS.getRowCount();
        for(int x=0;x<rc;x++){
            dtmS.removeRow(0);
        }
        
         while(itrS.hasNext()){
            Item o = itrS.next();
            dtmS.addRow(new Object[]{in,o.getId(),o.getName(),o.getPrice(),o.getCategory()});
             in++;}
         txtid.setText("");
        txtname.setText("");
        txtprice.setText("");
        
         
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(ItemTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnewitem;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mback;
    private javax.swing.JTable titem;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
