/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcity;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author TED
 */
public class grncheck extends javax.swing.JPanel {

    /**
     * Creates new form grncheck
     */
    public grncheck() {
        initComponents();
         jButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ye = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        gid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" C H E C K   O L D   G R N ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 20));
        jPanel1.add(ye, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 200, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grn ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 60, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Month :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 30));

        mo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apri", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jPanel1.add(mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 200, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/srch.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 60, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item id", "Badge", "Name", "Unit price", "Qty", "Discount", "Sub total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 380, 340));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grn Id", "Date", "Discount", "Dis  Value", "Net Tot"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 590, 340));
        jPanel1.add(gid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 200, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/print.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 120, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/srch.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 60, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ll.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();
        dtm.setRowCount(0);
        int lol = 0;
        if (ye.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter year", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            ye.grabFocus();
        } else if (ye.getText().length() != 4) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter correct year", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            ye.grabFocus();
        } else {
            String month = mo.getSelectedItem().toString();
            String mn = "";
            if (month.equalsIgnoreCase("jan")) {
                mn = "01";
            } else if (month.equalsIgnoreCase("feb")) {
                mn = "02";
            } else if (month.equalsIgnoreCase("mar")) {
                mn = "03";
            } else if (month.equalsIgnoreCase("apr")) {
                mn = "04";
            } else if (month.equalsIgnoreCase("may")) {
                mn = "05";
            } else if (month.equalsIgnoreCase("jun")) {
                mn = "06";
            } else if (month.equalsIgnoreCase("jul")) {
                mn = "07";
            } else if (month.equalsIgnoreCase("aug")) {
                mn = "08";
            } else if (month.equalsIgnoreCase("sep")) {
                mn = "09";
            } else if (month.equalsIgnoreCase("oct")) {
                mn = "10";
            } else if (month.equalsIgnoreCase("nov")) {
                mn = "11";
            } else if (month.equalsIgnoreCase("dec")) {
                mn = "12";
            }
            String d = ye.getText() + "-" + mn;
            try {
                ResultSet rs = db.search("select a.*,b.fname,b.lname from (grn a inner join emp b on a.emp_emp_id=b.emp_id)where date like '%" + d + "%'");

                while (rs.next()) {
                    lol=1;
                   Vector v=new Vector();
                   v.add(rs.getString("grn_id"));
                   v.add(rs.getString("date"));
                   v.add(rs.getString("discount"));
                   v.add(rs.getString("dis_value"));
                   v.add(rs.getString("net_tot"));
                   v.add(rs.getString("fname")+" "+rs.getString("lname"));
                   dtm.addRow(v);
                }
                if (lol == 0) {
                    DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
                    dtm1.setRowCount(0);
                    dtm.setRowCount(0);
                    javax.swing.JOptionPane.showMessageDialog(this, "No data in this month","Warning",javax.swing.JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
       int  x=jTable.getSelectedRow();
        String id=jTable.getValueAt(x, 0).toString();
        try {
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs=db.search("select a.*,b.* from(item_has_grn a inner join item b on a.item_item_id=b.item_id)where grn_grn_id='"+id+"' ");
            while(rs.next()){
            Vector v=new Vector();
            v.add(rs.getString("item_id"));
             v.add(rs.getString("badge_badge_number"));
             v.add(rs.getString("name"));
             v.add(rs.getString("unit_price"));
             v.add(rs.getString("qty"));
             v.add(rs.getString("discount"));
             v.add(rs.getString("subtot"));
             dtm.addRow(v);
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            ResultSet rs=db.search("select * from grn where grn_id='"+gid.getText()+"'");
            if(rs.next()){
            jButton1.setEnabled(true);
            }else{
                  jButton1.setEnabled(false);
                javax.swing.JOptionPane.showMessageDialog(this,"Wrong grn id","Warning",javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            String path="C:\\ProgramData\\supercity\\2\\grndup.jrxml";
            JasperReport jr=JasperCompileManager.compileReport(path);
            Map m=new HashMap<String, Object>();
            m.put("id",gid.getText());
            JasperPrint jp=JasperFillManager.fillReport(jr,m,db.con());
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) {
        e.printStackTrace();
        }
          jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mo;
    private javax.swing.JTextField ye;
    // End of variables declaration//GEN-END:variables
}
