package views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.MonHoc;
import repositories.MonHocRepository;
import services.MonHocService;

public class FormMonHoc extends javax.swing.JFrame {

    private MonHocService ser = new MonHocService();
    private MonHocRepository repo = new MonHocRepository();

    public FormMonHoc() {
        initComponents();
        fillTable();
        txtMa.setEditable(false);
    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbMon.getModel();
        model.setRowCount(0);
        for (MonHoc m : ser.getAll()) {
            Object[] row = new Object[]{
                m.getMaMon(), m.getTenMon()
            };
            model.addRow(row);
        }
    }

    public MonHoc checkValidate() {
        String ten = txtTen.getText();
        String ma = txtMa.getText();
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ten is not null");
            return null;
        }
        MonHoc monInput = new MonHoc(ten);
        return monInput;
    }

    public MonHoc checkValidate1() {
        String ten = txtTen.getText();
        String ma = txtMa.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Choose one line to update, Please");
            return null;
        }
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ten is not null");
            return null;
        }
        MonHoc monInput = new MonHoc(Integer.parseInt(ma), ten);
        return monInput;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Them = new javax.swing.JButton();
        SUa = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH MÔN HỌC");

        jLabel2.setText("MÃ MÔN");

        jLabel3.setText("TÊN MÔN");

        Them.setBackground(new java.awt.Color(255, 204, 204));
        Them.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Them.setText("Thêm");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        SUa.setBackground(new java.awt.Color(255, 204, 204));
        SUa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SUa.setText("Sửa");
        SUa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUaActionPerformed(evt);
            }
        });

        Xoa.setBackground(new java.awt.Color(255, 204, 204));
        Xoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Xoa.setText("Xóa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 204, 204));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 204, 204));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        tbMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MÃ MÔN", "TÊN MÔN"
            }
        ));
        tbMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Them)
                                        .addGap(18, 18, 18)
                                        .addComponent(SUa)
                                        .addGap(18, 18, 18)
                                        .addComponent(Xoa)
                                        .addGap(18, 18, 18)
                                        .addComponent(Clear)
                                        .addGap(1, 1, 1)))
                                .addGap(26, 26, 26)
                                .addComponent(Exit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Them)
                    .addComponent(SUa)
                    .addComponent(Xoa)
                    .addComponent(Clear)
                    .addComponent(Exit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        txtMa.setText("");
        txtTen.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void tbMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMonMouseClicked
        int s = tbMon.getSelectedRow();
        txtMa.setText(tbMon.getValueAt(s, 0).toString());
        txtTen.setText(tbMon.getValueAt(s, 1).toString());
    }//GEN-LAST:event_tbMonMouseClicked

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        MonHoc mon = checkValidate();
        if (mon == null) {
            return;
        }
        int check = ser.them(mon);
        if (check == 1) {
            JOptionPane.showMessageDialog(this, "Ma already exists");
            return;
        } else if (check == 0) {
            fillTable();
            JOptionPane.showMessageDialog(this, "Add success!!");
        } else {
            JOptionPane.showMessageDialog(this, "Add not success!!");
        }

    }//GEN-LAST:event_ThemActionPerformed

    private void SUaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUaActionPerformed
        MonHoc mon = checkValidate1();
        if (mon == null) {
            return;
        }
        int check = ser.sua(mon);
        if (check == 0) {
            fillTable();
            JOptionPane.showMessageDialog(this, "Update success!!");
        } else {
            JOptionPane.showMessageDialog(this, "Update not success!!");
        }
    }//GEN-LAST:event_SUaActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        int s = tbMon.getSelectedRow();
        if (s < 0) {
            JOptionPane.showMessageDialog(this, "Choose one line to delete, Please!");
            return;
        }
        String ma = tbMon.getValueAt(s, 0).toString();
        if (repo.delete(repo.findByMa(Integer.parseInt(ma)))) {
            fillTable();
            JOptionPane.showMessageDialog(this, "Delete success!!");
        } else {
            JOptionPane.showMessageDialog(this, "Delete not success!!");
        }
    }//GEN-LAST:event_XoaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMonHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JButton SUa;
    private javax.swing.JButton Them;
    private javax.swing.JButton Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMon;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
