/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.access;

import com.sumames.sir.Main;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.ComponentUtils;
import com.sumames.sir.helper.Support;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author My pc
 */
public class AccessList extends javax.swing.JPanel {

    private List<LoginAccess> access;

    /**
     * Creates new form people
     */
    public AccessList() {
        initComponents();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccess = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setToolTipText("");
        setName(""); // NOI18N
        setOpaque(false);

        tbAccess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccessMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccess);

        tfSearch.setPreferredSize(new java.awt.Dimension(6, 25));
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/1-01.png"))); // NOI18N
        btSearch.setBorderPainted(false);
        btSearch.setContentAreaFilled(false);

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/2-01.png"))); // NOI18N
        btAdd.setBorder(null);
        btAdd.setContentAreaFilled(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/3-01.png"))); // NOI18N
        btEdit.setBorder(null);
        btEdit.setContentAreaFilled(false);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/4-01.png"))); // NOI18N
        btDelete.setBorder(null);
        btDelete.setContentAreaFilled(false);

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/5-01.png"))); // NOI18N
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btSearch)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRefresh)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAdd))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        new Support().NewTab(Main.getFrame().getTab(), new AccessData(), "Access Input");
    }//GEN-LAST:event_btAddActionPerformed

    private void tbAccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccessMouseClicked
        if (evt.getClickCount() == 2) {
            if (tbAccess.getSelectedRow() >= 0) {
//                CustomerData cd = new CustomerData("EDIT", Integer.valueOf(tbAccess.getValueAt(tbAccess.getSelectedRow(), 0).toString()));
//                new Support().NewTab(Main.getFrame().getTab(), cd, "Customer Data - " + tbAccess.getValueAt(tbAccess.getSelectedRow(), 1).toString());

//            JOptionPane.showMessageDialog(null, tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 0).toString());
            }
        }
    }//GEN-LAST:event_tbAccessMouseClicked

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if (tbAccess.getSelectedRow() >= 0) {
//            CustomerData cd = new CustomerData("EDIT", Integer.valueOf(tbAccess.getValueAt(tbAccess.getSelectedRow(), 0).toString()));
//            new Support().NewTab(Main.getFrame().getTab(), cd, "Customer Data - " + tbAccess.getValueAt(tbAccess.getSelectedRow(), 1).toString());

//            JOptionPane.showMessageDialog(null, tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        for (int i = 0; i < tbAccess.getRowCount(); i++) {
            if (tbAccess.getValueAt(i, 1).toString().startsWith(tfSearch.getText())) {
                //select baris yang ditemukan
                tbAccess.getSelectionModel().setSelectionInterval(i, i);
                //scroll ke baris tersebut kalau ada di bawah atau bagian atas 
                ComponentUtils.scrollToRect(tbAccess, i);
                break;
            } else if (tbAccess.getValueAt(i, 2).toString().startsWith(tfSearch.getText())) {
                //select baris yang ditemukan
                tbAccess.getSelectionModel().setSelectionInterval(i, i);
                //scroll ke baris tersebut kalau ada di bawah atau bagian atas 
                ComponentUtils.scrollToRect(tbAccess, i);
                break;
            }
        }
    }//GEN-LAST:event_tfSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAccess;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
    private void refreshTable() {
        access = AppUtil.getService().getAccesses();
        tbAccess.setModel(new AccessTableModel(access));
        tbAccess.getColumnModel().getColumn(0).setMinWidth(0);
        tbAccess.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    private class AccessTableModel extends AbstractTableModel {

        private List<LoginAccess> listCustomers;
        private final String[] tableHeaders = {"Record Id", "Name", "Description"};

        public AccessTableModel(List<LoginAccess> listCustomers) {
            this.listCustomers = listCustomers;
        }

        public int getRowCount() {
            return listCustomers.size();
        }

        public int getColumnCount() {
            return 3;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            LoginAccess p = access.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return p.getRecordId();
                case 1:
                    return p.getName();
                case 2:
                    return p.getNote();
                default:
                    return "";
            }
        }
    }

}
