/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.report;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Journal;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.Support;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author My pc
 */
public class JournalList extends javax.swing.JPanel {

    private List<Journal> Journals;

    /**
     * Creates new form Journal
     */
    public JournalList() {
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
        tbJournal = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btRefresh = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setOpaque(false);

        tbJournal.setModel(new javax.swing.table.DefaultTableModel(
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
        tbJournal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbJournalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbJournal);

        tfSearch.setPreferredSize(new java.awt.Dimension(6, 25));

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/5-01.png"))); // NOI18N
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

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
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/1-01.png"))); // NOI18N
        btSearch.setBorderPainted(false);
        btSearch.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSearch)
                    .addComponent(btRefresh)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        JournalData cd = new JournalData("NEW", 0);
        new Support().NewTab(Main.getFrame().getTab(), cd, "Account Chart Data - New");

    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if (tbJournal.getSelectedRow() >= 0) {
            JournalData cd = new JournalData("EDIT", Integer.valueOf(tbJournal.getValueAt(tbJournal.getSelectedRow(), 0).toString()));
            new Support().NewTab(Main.getFrame().getTab(), cd, "Account Chart Data - " + tbJournal.getValueAt(tbJournal.getSelectedRow(), 1).toString());
        }else {
            msg("No Data is Selected");
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (tbJournal.getSelectedRow() >= 0) {
            Journal Journal = AppUtil.getService().getJournalById(Integer.valueOf(tbJournal.getValueAt(tbJournal.getSelectedRow(), 0).toString()));
            if (Journal != null) {
                Journal.setDeleteDatetime(new Date());
                Journal.setDeleteByUserRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
                if (AppUtil.getService().save(Journal)) {
                    msg("Delete Done!");
                    refreshTable();
                } else {
                    msg("Delete Failed!");
                }

            }

        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void tbJournalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbJournalMouseClicked
        if (evt.getClickCount() == 2) {
            if (tbJournal.getSelectedRow() >= 0) {
                JournalData cd = new JournalData("EDIT", Integer.valueOf(tbJournal.getValueAt(tbJournal.getSelectedRow(), 0).toString()));
                new Support().NewTab(Main.getFrame().getTab(), cd, "Account Chart Data - " + tbJournal.getValueAt(tbJournal.getSelectedRow(), 1).toString());
            }else {
                msg("No Data is Selected");
            }
        }    
    }//GEN-LAST:event_tbJournalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbJournal;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
    private void refreshTable() {
            Journals = AppUtil.getService().getJournals();
            tbJournal.setModel(new JournalTableModel(Journals));
            tbJournal.getColumnModel().getColumn(0).setMinWidth(0);
            tbJournal.getColumnModel().getColumn(0).setMaxWidth(0);

    }

    private class JournalTableModel extends AbstractTableModel {

        private List<Journal> listJournals;
        private final String[] tableHeaders = {"Record Id", "No", "Date", "Debet Base", "Credit Base", "Note"};

        public JournalTableModel(List<Journal> listJournals) {
            this.listJournals = listJournals;
        }

        public int getRowCount() {
            return listJournals.size();
        }

        public int getColumnCount() {
            return 6;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            Journal p = Journals.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return p.getRecordId();
                case 1:
                    return p.getNo();
                case 2:
                    return p.getDate();
                case 3:
                    return p.getDebetBase();
                case 4:
                    return p.getCreditBase();
                case 5:
                    return p.getNote();
                default:
                    return "";
            }
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}