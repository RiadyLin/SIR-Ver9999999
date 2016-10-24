/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.garage;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Garage;
import com.sumames.sir.helper.AppUtil;
import java.awt.Dimension;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My pc
 */
public class GarageData extends javax.swing.JPanel {

    private String option;
    private int recordId;
    private Garage garage;

    /**
     * Creates new form EmployerInput
     */
    public GarageData() {

    }

    public GarageData(String option, int recordId) {
        this.option = option;
        this.recordId = recordId;
        initComponents();
        LoadingData();
    }

    public String getOption() {
        return option;
    }

    public int getRecordId() {
        return recordId;
    }
    
    public JTable getTbCar() {
        return tbCar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCar = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfDescription = new javax.swing.JTextArea();
        tfName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(844, 417));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/6-01.png"))); // NOI18N
        btSave.setBorderPainted(false);
        btSave.setContentAreaFilled(false);
        btSave.setPreferredSize(new java.awt.Dimension(65, 23));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        tbCar.setFont(getFont());
        tbCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record Id", "Name", "Plate Number", "Price", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
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
        tbCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCar);
        if (tbCar.getColumnModel().getColumnCount() > 0) {
            tbCar.getColumnModel().getColumn(0).setMinWidth(0);
            tbCar.getColumnModel().getColumn(0).setMaxWidth(0);
        }

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

        tfDescription.setColumns(20);
        tfDescription.setFont(getFont());
        tfDescription.setRows(5);
        jScrollPane3.setViewportView(tfDescription);

        tfName.setFont(getFont());
        tfName.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel6.setFont(getFont());
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name :");

        jLabel5.setFont(getFont());
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAdd)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        saveData();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        Main.getFrame().getGlasspane().showPanel(new CarData("NEW", 1, this), new Dimension(400, 250));
        Main.getFrame().getGlasspane().setVisible(true);
    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        Main.getFrame().getGlasspane().showPanel(new CarData("EDIT", Integer.valueOf(tbCar.getValueAt(tbCar.getSelectedRow(), 0).toString()), this), new Dimension(400, 250));
        Main.getFrame().getGlasspane().setVisible(true);
    }//GEN-LAST:event_btEditActionPerformed

    private void tbCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarMouseClicked
        if (evt.getClickCount() == 2) {
            if (tbCar.getSelectedRow() >= 0) {
                Main.getFrame().getGlasspane().showPanel(new CarData("EDIT", Integer.valueOf(tbCar.getValueAt(tbCar.getSelectedRow(), 0).toString()), this), new Dimension(400, 250));
                Main.getFrame().getGlasspane().setVisible(true);
            }
        }
    }//GEN-LAST:event_tbCarMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (tbCar.getSelectedRow() >= 0) {
            Car car = AppUtil.getService().getCarById(Integer.valueOf(tbCar.getValueAt(tbCar.getSelectedRow(), 0).toString()));
            if (car != null) {
                car.setDeleteDatetime(new Date());
                car.setDeletebyuserRecordid(Main.getFrame().getLogin().getEmployeeRecordId());
                if (AppUtil.getService().save(car)) {
                    msg("Delete Done!");
                    refreshTable();
                } else {
                    msg("Delete Failed!");
                }

            }

        }
    }//GEN-LAST:event_btDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbCar;
    private javax.swing.JTextArea tfDescription;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
    public void saveData() {
        if (option.equals("NEW")) {
            formToObject();
            if (AppUtil.getService().save(garage)) {
                for (int i = 0; i < tbCar.getRowCount(); i++) {
                    Car carData = new Car();
                    carData.setCarGarageRecordId(garage.getRecordId());
                    carData.setName(tbCar.getValueAt(i, 1).toString());
                    carData.setPlateNumber(tbCar.getValueAt(i, 2).toString());
                    carData.setPrice(Double.parseDouble(tbCar.getValueAt(i, 3).toString()));
                    AppUtil.getService().save(carData);
                }
                msg("Save Done!");
                Main.getFrame().getTab().removeTabAt(Main.getFrame().getTab().getSelectedIndex());
            } else {
                msg("Save Failed!");
            }
        } else if (option.equals("EDIT")) {
            formToObject();
            garage.setRecordId(recordId);
            if (AppUtil.getService().save(garage)) {
                msg("Save Done!");
                Main.getFrame().getTab().removeTabAt(Main.getFrame().getTab().getSelectedIndex());
            } else {
                msg("Save Failed!");
            }
        }
    }

    public void LoadingData() {

        if (option.equals("NEW")) {
            tfName.setText("");
            tfDescription.setText("");
        } else if (option.equals("EDIT")) {
            garage = AppUtil.getService().getGarageById(recordId);
            objectToForm();
            refreshTable();
        }
    }

    public void refreshTable() {
        List<Car> list = AppUtil.getService().getListCarById(recordId);
        DefaultTableModel dtm = (DefaultTableModel) getTbCar().getModel();
        dtm.setRowCount(0);
        for (Car car : list) {
            dtm.addRow(new Object[]{car.getRecordId(), car.getName(), car.getPlateNumber(), car.getPrice(), car.getAvailability()});
        }
    }

    public void formToObject() {
        if (garage == null) {
            garage = new Garage();
        }
        garage.setName(tfName.getText());
        garage.setDescription(tfDescription.getText());
    }

    public void objectToForm() {
        if (garage != null) {
            tfName.setText(garage.getName());
            tfDescription.setText(garage.getDescription());
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
