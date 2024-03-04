/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guimod1.guiclasses;

import com.mycompany.guimod1.businesslayer.ConnectionClass;
import com.mycompany.guimod1.system.SystemLayer;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.sql.Date;
import javax.swing.table.TableModel;


/**
 *
 * @author afroz
 */
public class ManageFinances extends javax.swing.JFrame {

    /**
     * Creates new form managefinances
     */
    public ManageFinances() {
        initComponents();
    }
class GPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width=getWidth();
        int height=getHeight();
        
        Color color1 = new Color(52,143,80);
        Color color2 = new Color(86,180,211);

        GradientPaint gradient = new GradientPaint(
                0, 0, color1,
                width, height, color2);

        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
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

        jPanel1 = new GPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Billdetails = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billdetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Waste Management Application - Manage Finances");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setEndColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setStartColor(new java.awt.Color(52, 143, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 102, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FINANCES");

        Billdetails.setBackground(new java.awt.Color(51, 51, 51));
        Billdetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Billdetails.setForeground(new java.awt.Color(255, 102, 0));
        Billdetails.setText("VIEW DETAILS");
        Billdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Billdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BilldetailsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("VIEW BILL DETAILS");

        billdetails.setBackground(new java.awt.Color(51, 51, 51));
        billdetails.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        billdetails.setForeground(new java.awt.Color(255, 255, 255));
        billdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bill_ID", "Client_ID", "Amount Due", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(billdetails);
        if (billdetails.getColumnModel().getColumnCount() > 0) {
            billdetails.getColumnModel().getColumn(0).setResizable(false);
            billdetails.getColumnModel().getColumn(1).setResizable(false);
            billdetails.getColumnModel().getColumn(2).setResizable(false);
            billdetails.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 449, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(449, 449, 449))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(Billdetails))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Billdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jScrollPane1.setViewportView(jPanel2);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 120, 1100, 550);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String plantype;
SystemLayer smf=new SystemLayer();
float sucharges;
    private void BilldetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BilldetailsActionPerformed
        // TODO add your handling code here:
        try {
                     ConnectionClass conn=new ConnectionClass();
                     Connection connection = conn.getConnectionString();

                    Statement st = connection.createStatement();
                    String sql = "SELECT * FROM Bill";
                    ResultSet rs = st.executeQuery(sql);

                    // Clear existing data in the table model
                    DefaultTableModel tb1Model = (DefaultTableModel) billdetails.getModel();
                    tb1Model.setRowCount(0);

                    while (rs.next()) {
                        String bid = String.valueOf(rs.getInt("billID"));
                        String id = String.valueOf(rs.getInt("clientID"));
                        BigDecimal amountDue = rs.getBigDecimal("amountDue");
                        String amountdue = (amountDue != null) ? amountDue.toString() : null;
                        Date dueDate = rs.getDate("dueDate");
                        String duedate = (dueDate != null) ? dueDate.toString() : null;

                        
                        // Add data to the table model
                        String[] tbData = {bid , id, amountdue , duedate};
                        tb1Model.addRow(tbData);
                    }
                // Add an empty row for each iteration
    for (int i=0 ; i<20 ; i++)
    {
        String[] emptyRow = {"", "", ""}; 
    tb1Model.addRow(emptyRow);
    }       
                    // Close resources
                    rs.close();
                    st.close();
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }//GEN-LAST:event_BilldetailsActionPerformed

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
            java.util.logging.Logger.getLogger(ManageFinances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFinances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFinances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFinances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFinances().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Billdetails;
    private javax.swing.JTable billdetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}