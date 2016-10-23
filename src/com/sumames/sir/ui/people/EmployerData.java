/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.people;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.entity.Login;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.AutoCompletion;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author My pc
 */
public class EmployerData extends javax.swing.JPanel {

    private final SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
    private HashMap<String ,Integer> mapAccess;
    private String option;
    private int recordId;
    private Employer employer;

    public EmployerData() {

    }

    /**
     * Creates new form CustomerInput
     *
     * @param Option utk mengetahui form new / edit
     * @param recordId utk mengetahui record id jika edit
     */
    public EmployerData(String Option, int recordId) {
        initComponents();
        setOption(Option);
        setRecordId(recordId);
        LoadingData();
    }

    public String getOption() {
        return option;
    }

    private void setOption(String option) {
        this.option = option;
    }

    public int getRecordId() {
        return recordId;
    }

    private void setRecordId(int recordId) {
        this.recordId = recordId;
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
        taAddress = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        tfID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNoTelp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        dcBirthdate = new com.toedter.calendar.JDateChooser();
        rbFemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbBirthplace = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();

        setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        setOpaque(false);

        taAddress.setColumns(20);
        taAddress.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        taAddress.setRows(5);
        jScrollPane1.setViewportView(taAddress);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfID.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        tfID.setPreferredSize(new java.awt.Dimension(150, 30));

        jButton2.setText("Cancel");

        jLabel2.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No Telp :");

        jLabel6.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID :");

        tfNoTelp.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        tfNoTelp.setPreferredSize(new java.awt.Dimension(150, 30));
        tfNoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoTelpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email :");

        tfEmail.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        tfEmail.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel7.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address :");

        jLabel3.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Birth :");

        jLabel5.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender :");

        rbMale.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        rbMale.setForeground(new java.awt.Color(255, 255, 255));
        rbMale.setText("Male");
        rbMale.setPreferredSize(new java.awt.Dimension(100, 30));

        dcBirthdate.setOpaque(false);
        dcBirthdate.setPreferredSize(new java.awt.Dimension(100, 30));

        rbFemale.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        rbFemale.setForeground(new java.awt.Color(255, 255, 255));
        rbFemale.setText("Female");
        rbFemale.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel1.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name :");

        tfName.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        tfName.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel8.setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status :");

        cbBirthplace.setBackground(new java.awt.Color(250, 174, 66));
        cbBirthplace.setFont(getFont());
        cbBirthplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBirthplace.setMinimumSize(new java.awt.Dimension(56, 30));
        cbBirthplace.setPreferredSize(new java.awt.Dimension(56, 30));
        AutoCompletion.enable(cbBirthplace);

        cbStatus.setBackground(new java.awt.Color(250, 174, 66));
        cbStatus.setFont(getFont());
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbStatus.setMinimumSize(new java.awt.Dimension(56, 30));
        cbStatus.setPreferredSize(new java.awt.Dimension(56, 30));
        AutoCompletion.enable(cbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2))
                            .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbBirthplace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbBirthplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfNoTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoTelpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbBirthplace;
    private javax.swing.JComboBox<String> cbStatus;
    private com.toedter.calendar.JDateChooser dcBirthdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNoTelp;
    // End of variables declaration//GEN-END:variables
    private void saveData() {
        if (getOption().equals("NEW")) {
            Employer test = new Employer();
            test.setNo(tfID.getText());
            test.setName(tfName.getText());
            String gender = "";
            if (rbMale.isSelected()) {
                gender = "M";
            } else if (rbFemale.isSelected()) {
                gender = "F";
            }
            test.setGender(gender);
            test.setAddress(taAddress.getText());
            test.setTelephone(tfNoTelp.getText());
            test.setBirthplace(cbBirthplace.getSelectedItem().toString());
            test.setBirthdate(dcBirthdate.getDate());
            test.setEmail(tfEmail.getText());
            AppUtil.getService().save(test);
            Login login = new Login();
            login.setEmployeeRecordId(test.getRecordId());
            login.setUsername(tfName.getText());
            login.setPassword("employer" + dcBirthdate.getDate().getDay() + dcBirthdate.getDate().getMonth());
            login.setAccessRecordId(mapAccess.get(cbStatus.getSelectedItem().toString()));
            AppUtil.getService().save(login);
            JOptionPane.showMessageDialog(null, " records, Done!");
            Main.getFrame().getTab().removeTabAt(Main.getFrame().getTab().getSelectedIndex());
        } else if (getOption().equals("EDIT")) {
            Employer test = new Employer();
            test.setRecordId(getRecordId());
            test.setNo(tfID.getText());
            test.setName(tfName.getText());
            String gender = "";
            if (rbMale.isSelected()) {
                gender = "M";
            } else if (rbFemale.isSelected()) {
                gender = "F";
            }
            test.setGender(gender);
            test.setAddress(taAddress.getText());
            test.setTelephone(tfNoTelp.getText());
            test.setBirthplace(cbBirthplace.getSelectedItem().toString());
            test.setBirthdate(dcBirthdate.getDate());
            test.setEmail(tfEmail.getText());
            AppUtil.getService().save(test);
            JOptionPane.showMessageDialog(null, " records, Done!");
        }
    }

    public void LoadingData() {
        cbBirthplace.removeAllItems();
        cbStatus.removeAllItems();
        List<Employer> list = AppUtil.getService().getEmployers();
        List<LoginAccess> laList = AppUtil.getService().getAccesses();
        for (Employer customer : list) {

            if (cbBirthplace.getItemCount() == 0) {
                cbBirthplace.addItem(customer.getBirthplace());
            } else {
                int ketemu = 0;
                for (int i = 0; i < cbBirthplace.getItemCount(); i++) {
                    if (!cbBirthplace.getItemAt(i).equals(customer.getBirthplace())) {
                        ketemu = 1;
                    }
                }
                if (ketemu == 1) {
                    cbBirthplace.addItem(customer.getBirthplace());
                }
            }
        }
        mapAccess = new HashMap();
        for (LoginAccess loginAccess : laList) {
            System.out.println(loginAccess.getName());
            mapAccess.put(loginAccess.getName(), loginAccess.getRecordId());
            cbStatus.addItem(loginAccess.getName());
        }
        if (getOption().equals("NEW")) {
            tfID.setText("");
            tfName.setText("");
            rbMale.setSelected(true);
            taAddress.setText("");
            tfNoTelp.setText("");
            dcBirthdate.setDate(new Date());
            tfEmail.setText("");
        } else if (getOption().equals("EDIT")) {
            employer = AppUtil.getService().getEmployerById(getRecordId());
            tfID.setText(employer.getNo());
            tfName.setText(employer.getName());
            if (employer.getGender().equals("M")) {
                rbMale.setSelected(true);
            } else {
                rbFemale.setSelected(true);
            }
            taAddress.setText(employer.getAddress());
            tfNoTelp.setText(employer.getTelephone());
            cbBirthplace.setSelectedItem(employer.getBirthplace());
            dcBirthdate.setDate(employer.getBirthdate());
            tfEmail.setText(employer.getEmail());
        }
    }
}
