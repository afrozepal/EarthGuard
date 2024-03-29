/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guimod1.guiclasses;

import com.mycompany.guimod1.businesslayer.ConnectionClass;
import com.mycompany.guimod1.system.SystemLayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author danaa
 */
public class ProcessComplains extends javax.swing.JFrame {

    /**
     * Creates new form ProcessComplains
     */
    public ProcessComplains() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientid = new javax.swing.JLabel();
        compalinfactor = new javax.swing.JLabel();
        dismissedbutton = new javax.swing.JButton();
        resolvebutton = new javax.swing.JButton();
        reslovedlist = new javax.swing.JButton();
        pendinglist = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        complainlist = new javax.swing.JTable();
        dismissedlist = new javax.swing.JButton();
        complaintid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setEndColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setStartColor(new java.awt.Color(52, 143, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPLAINTS LIST");

        clientid.setForeground(new java.awt.Color(255, 255, 255));
        clientid.setText("Clientid");

        compalinfactor.setForeground(new java.awt.Color(255, 255, 255));
        compalinfactor.setText("Complain Factor");

        dismissedbutton.setBackground(new java.awt.Color(51, 51, 51));
        dismissedbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dismissedbutton.setForeground(new java.awt.Color(255, 102, 0));
        dismissedbutton.setText("DISSMISSED");
        dismissedbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dismissedbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismissedbuttonActionPerformed(evt);
            }
        });

        resolvebutton.setBackground(new java.awt.Color(51, 51, 51));
        resolvebutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resolvebutton.setForeground(new java.awt.Color(255, 102, 0));
        resolvebutton.setText("RESOLVE");
        resolvebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resolvebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolvebuttonActionPerformed(evt);
            }
        });

        reslovedlist.setText("Show  Resolved list");
        reslovedlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reslovedlistActionPerformed(evt);
            }
        });

        pendinglist.setText("Show pending list");
        pendinglist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendinglistActionPerformed(evt);
            }
        });

        complainlist.setBackground(new java.awt.Color(51, 51, 51));
        complainlist.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        complainlist.setForeground(new java.awt.Color(255, 255, 255));
        complainlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Complaint_ID", "Client_ID", "Complain Factor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        complainlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                complainlistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(complainlist);

        dismissedlist.setText("Show  Dismissed list");
        dismissedlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismissedlistActionPerformed(evt);
            }
        });

        complaintid.setForeground(new java.awt.Color(255, 255, 255));
        complaintid.setText("Complaintid");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(complaintid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(clientid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(compalinfactor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(resolvebutton)
                        .addGap(71, 71, 71)
                        .addComponent(dismissedbutton)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(pendinglist, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(reslovedlist)
                        .addGap(101, 101, 101)
                        .addComponent(dismissedlist)
                        .addGap(196, 196, 196))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pendinglist)
                    .addComponent(reslovedlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dismissedlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compalinfactor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dismissedbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolvebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complaintid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 130, 1024, 603);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  int complaint_id;
  SystemLayer spc = new SystemLayer();
    private void dismissedbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismissedbuttonActionPerformed
        // TODO add your handling code here:
        spc.dismissComplain(complaint_id);
    }//GEN-LAST:event_dismissedbuttonActionPerformed

    private void resolvebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolvebuttonActionPerformed
        // TODO add your handling code here:
        spc.resolveComplain(complaint_id);
    }//GEN-LAST:event_resolvebuttonActionPerformed

    private void reslovedlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reslovedlistActionPerformed
        // TODO add your handling code here:
        try {
            // Establish database connection
             ConnectionClass conn = new ConnectionClass();
             Connection connection = conn.getConnectionString();

            Statement st = connection.createStatement();
            String sql = "SELECT * FROM Complaints WHERE Status='Resolved'";

            ResultSet rs = st.executeQuery(sql);

            // Clear existing data in the table model
            DefaultTableModel tb1Model = (DefaultTableModel)complainlist.getModel();
            tb1Model.setRowCount(0);

            while (rs.next()) {
                String cid = String.valueOf(rs.getInt("complaintID"));
                String id = String.valueOf(rs.getInt("clientID"));
                String factor = rs.getString("description");

                // Add data to the table model
                String[] tbData = {cid, id, factor};
                tb1Model.addRow(tbData);
            }
            // Add an empty row for each iteration
            for (int i=0 ; i<20 ; i++)
            {
                String[] emptyRow = {"", "", ""}; // Adjust the number of empty strings based on the number of columns
                tb1Model.addRow(emptyRow);
            }
            // Close resources
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_reslovedlistActionPerformed

    private void pendinglistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendinglistActionPerformed
        // TODO add your handling code here:
        try {
            // Establish database connection
            ConnectionClass conn = new ConnectionClass();
            Connection connection = conn.getConnectionString();

            Statement st = connection.createStatement();
            String sql = "SELECT * FROM Complaints WHERE Status='Pending'";

            ResultSet rs = st.executeQuery(sql);

            // Clear existing data in the table model
            DefaultTableModel tb1Model = (DefaultTableModel)complainlist.getModel();
            tb1Model.setRowCount(0);

            while (rs.next()) {
                String cid = String.valueOf(rs.getInt("complaintID"));
                String id = String.valueOf(rs.getInt("clientID"));
                String factor = rs.getString("description");

                // Add data to the table model
                String[] tbData = {cid , id, factor};
                tb1Model.addRow(tbData);
            }
            // Add an empty row for each iteration
            for (int i=0 ; i<20 ; i++)
            {
                String[] emptyRow = {"", "", ""}; // Adjust the number of empty strings based on the number of columns
                tb1Model.addRow(emptyRow);
            }
            // Close resources
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pendinglistActionPerformed

    private void complainlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complainlistMouseClicked
        // TODO add your handling code here:
        int i=complainlist.getSelectedRow();
        TableModel model=complainlist.getModel();
        String id = model.getValueAt(i, 0).toString();
        complaint_id = Integer.parseInt(id);
        complaintid.setText(id);
        clientid.setText(model.getValueAt(i,1).toString());
        compalinfactor.setText(model.getValueAt(i,2).toString());

    }//GEN-LAST:event_complainlistMouseClicked

    private void dismissedlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismissedlistActionPerformed
        // TODO add your handling code here:
        try {
            // Establish database connection
            ConnectionClass conn = new ConnectionClass();
            Connection connection = conn.getConnectionString();

            Statement st = connection.createStatement();
            String sql = "SELECT * FROM Complaints WHERE Status='Dismissed'";

            ResultSet rs = st.executeQuery(sql);

            // Clear existing data in the table model
            DefaultTableModel tb1Model = (DefaultTableModel)complainlist.getModel();
            tb1Model.setRowCount(0);

            while (rs.next()) {
                String cid = String.valueOf(rs.getInt("complaintID"));
                String id = String.valueOf(rs.getInt("clientID"));
                String factor = rs.getString("description");

                // Add data to the table model
                String[] tbData = {cid, id, factor};
                tb1Model.addRow(tbData);
            }
            // Add an empty row for each iteration
            for (int i=0 ; i<20 ; i++)
            {
                String[] emptyRow = {"", "", ""}; // Adjust the number of empty strings based on the number of columns
                tb1Model.addRow(emptyRow);
            }
            // Close resources
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_dismissedlistActionPerformed

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
            java.util.logging.Logger.getLogger(ProcessComplains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessComplains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessComplains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessComplains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessComplains().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clientid;
    private javax.swing.JLabel compalinfactor;
    private javax.swing.JTable complainlist;
    private javax.swing.JLabel complaintid;
    private javax.swing.JButton dismissedbutton;
    private javax.swing.JButton dismissedlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton pendinglist;
    private javax.swing.JButton reslovedlist;
    private javax.swing.JButton resolvebutton;
    // End of variables declaration//GEN-END:variables
}
