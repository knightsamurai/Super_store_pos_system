/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcity;

import static foodcity.Main.mp;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Senura
 */
public class supadd extends javax.swing.JPanel {

    int tb1click;
    int tb2click;

    public supadd() throws Exception {
        initComponents();
        loadtbl();
        tb1load();
        tb1click = 0;
        tb2click = 0;
        gemsupid();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sno = new javax.swing.JTextField();
        sstreet = new javax.swing.JTextField();
        scity = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        stp1 = new javax.swing.JTextField();
        smail = new javax.swing.JTextField();
        supid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stp2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ssave = new javax.swing.JButton();
        scansel = new javax.swing.JButton();
        sjdate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Prototype", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S U P P L I E R   R E G I S T R A T I O N");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier ID  :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name  :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telephone 1  :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail  :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" No   :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Street  :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("City  :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        sno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snoActionPerformed(evt);
            }
        });
        add(sno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        sstreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sstreetActionPerformed(evt);
            }
        });
        add(sstreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        scity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scityActionPerformed(evt);
            }
        });
        add(scity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 170, -1));

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, -1));

        stp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stp1ActionPerformed(evt);
            }
        });
        stp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stp1KeyTyped(evt);
            }
        });
        add(stp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 160, -1));
        add(smail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 160, -1));

        supid.setForeground(new java.awt.Color(255, 255, 255));
        supid.setText("jLabel9");
        add(supid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 20));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telephone 2  :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        stp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stp2ActionPerformed(evt);
            }
        });
        stp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stp2KeyTyped(evt);
            }
        });
        add(stp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 160, -1));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Joined Date  :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        ssave.setBackground(new java.awt.Color(255, 51, 204));
        ssave.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        ssave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/esv.png"))); // NOI18N
        ssave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssaveActionPerformed(evt);
            }
        });
        add(ssave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 140, 40));

        scansel.setBackground(new java.awt.Color(255, 0, 0));
        scansel.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        scansel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ecan.png"))); // NOI18N
        scansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanselActionPerformed(evt);
            }
        });
        add(scansel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 140, 40));
        add(sjdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, -1));

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 310, 120));

        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 310, 120));

        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 320, 130));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sup ID", "Name", "Joined date", "T.P", "Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 820, 200));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 20, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 20, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 20, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 20, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 20, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 20, -1));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb3);
        if (tb3.getColumnModel().getColumnCount() > 0) {
            tb3.getColumnModel().getColumn(0).setMinWidth(50);
            tb3.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 130, 200));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setMinWidth(50);
            tb1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 120, 220));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 50, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 50, 30));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("To Supplier");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 130, 20));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Available Item");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 130, 20));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(0).setMinWidth(50);
            tb2.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 130, 220));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ll.png"))); // NOI18N
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void snoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snoActionPerformed
        sstreet.grabFocus();
    }//GEN-LAST:event_snoActionPerformed

    private void ssaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssaveActionPerformed
        int tb2count = tb2.getRowCount();
        if (sname.getText().length() == 0 || sjdate.getDate() == null || sno.getText().length() == 0 || sstreet.getText().length() == 0
                || scity.getText().length() == 0 || stp1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Must enter high light details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (tb2count == 0) {
            JOptionPane.showMessageDialog(this, "Must add item to table", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {

            Date d = sjdate.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dat = sdf.format(d);

            try {
                db.iud("Insert into supplier(sup_id,name,joined_date,status) values ('" + supid.getText() + "','" + sname.getText() + "','" + dat + "','1')");

                db.iud("Insert into sup_address(no,street,city,supplier_sup_id) values ('" + sno.getText() + "','" + sstreet.getText() + "','" + scity.getText() + "','" + supid.getText() + "')");

                db.iud("Insert into sup_contact(tp1,tp2,mail,supplier_sup_id) values ('" + stp1.getText() + "','" + stp2.getText() + "','" + smail.getText() + "','" + supid.getText() + "')");
                loadtbl();
                for (int i = 0; i < tb2.getRowCount(); i++) {
                    db.iud("insert into item_has_supplier values('" + tb2.getValueAt(i, 0) + "','" + supid.getText() + "')");

                }
                JOptionPane.showMessageDialog(this, "SUCCSES");

                cle();
                gemsupid();
                tb1load();
                loadtbl();
                tb2remove();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_ssaveActionPerformed

    private void stp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stp2ActionPerformed
        smail.grabFocus();
    }//GEN-LAST:event_stp2ActionPerformed

    private void scanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanselActionPerformed

        cle();


    }//GEN-LAST:event_scanselActionPerformed

    private void stp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stp1KeyTyped
        char c = evt.getKeyChar();
        if (c >= '0' && c <= '9') {
            if (stp1.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_stp1KeyTyped

    private void stp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stp1ActionPerformed
        stp2.grabFocus();
    }//GEN-LAST:event_stp1ActionPerformed

    private void stp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stp2KeyTyped
        char c = evt.getKeyChar();
        if (c >= '0' && c <= '9') {
            if (stp2.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_stp2KeyTyped

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        sno.grabFocus();
    }//GEN-LAST:event_snameActionPerformed

    private void sstreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sstreetActionPerformed
        scity.grabFocus();
    }//GEN-LAST:event_sstreetActionPerformed

    private void scityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scityActionPerformed
        stp1.grabFocus();
    }//GEN-LAST:event_scityActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tb1click == 0) {
            JOptionPane.showMessageDialog(this, "Not selet item", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int x = tb1.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) tb1.getModel();
            String id = tb1.getValueAt(x, 0).toString();
            String name = tb1.getValueAt(x, 1).toString();
            DefaultTableModel dtm1 = (DefaultTableModel) tb2.getModel();
            Vector v = new Vector();
            v.add(id);
            v.add(name);
            dtm1.addRow(v);
            dtm.removeRow(x);
        }
        tb1click = 0;

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        tb1click = 1;
    }//GEN-LAST:event_tb1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tb2click == 0) {
            JOptionPane.showMessageDialog(this, "Not selet item", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int x = tb2.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) tb2.getModel();
            String id = tb2.getValueAt(x, 0).toString();
            String name = tb2.getValueAt(x, 1).toString();
            DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
            Vector v = new Vector();
            v.add(id);
            v.add(name);
            dtm1.addRow(v);
            dtm.removeRow(x);
        }
        tb2click = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb2MouseClicked
        tb2click = 1;
    }//GEN-LAST:event_tb2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int x = jTable1.getSelectedRow();
        try {
            ResultSet rs = db.search("select a.*,b.* from(item_has_supplier a  inner  join item b on a.item_item_id=b.item_id) where supplier_sup_id='" + jTable1.getValueAt(x, 0).toString() + "'");

            DefaultTableModel dtm = (DefaultTableModel) tb3.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("item_id"));
                v.add(rs.getString("name"));
                dtm.addRow(v);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton scansel;
    private javax.swing.JTextField scity;
    private com.toedter.calendar.JDateChooser sjdate;
    private javax.swing.JTextField smail;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sno;
    private javax.swing.JButton ssave;
    private javax.swing.JTextField sstreet;
    private javax.swing.JTextField stp1;
    private javax.swing.JTextField stp2;
    private javax.swing.JLabel supid;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    // End of variables declaration//GEN-END:variables

    private void gemsupid() throws Exception {

        try {
            ResultSet rs = db.search("select count(sup_id) as x from supplier");

            if (rs.next()) {
                int x = Integer.parseInt(rs.getString("x"));
                x++;

                if (x < 10) {
                    supid.setText("SUP00" + x);

                } else if (x < 100) {
                    supid.setText("SUP0" + x);

                } else {
                    supid.setText("SUP" + x);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadtbl() {
        try {
            ResultSet rs = db.search("select a.*,b.* from(supplier a inner join sup_contact b on a.sup_id=supplier_sup_id)");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("sup_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("joined_date"));
                v.add(rs.getString("tp1"));
                v.add(rs.getString("mail"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cle() {
        sno.setText(null);
        sname.setText(null);
        sjdate.setDate(null);
        stp1.setText(null);
        stp2.setText(null);
        smail.setText(null);
        sno.setText(null);
        sstreet.setText(null);
        scity.setText(null);

    }

    private void tb1load() {
        try {

            ResultSet rs1 = db.search("select * from item");
            DefaultTableModel dtm = (DefaultTableModel) tb1.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("item_id"));
                v.add(rs1.getString("name"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tb2remove() {
        DefaultTableModel dtm = (DefaultTableModel) tb2.getModel();
        dtm.setRowCount(0);
    }
}