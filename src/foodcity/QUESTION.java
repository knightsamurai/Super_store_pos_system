/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcity;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Probosha
 */
public class QUESTION extends javax.swing.JFrame {

    /**
     * Creates new form QUESTION
     */
    public QUESTION() {
        initComponents();
        this.setAlwaysOnTop(true);
        createqu();
        loadque();

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
        c = new javax.swing.JComboBox();
        a3 = new javax.swing.JTextField();
        a = new javax.swing.JComboBox();
        a1 = new javax.swing.JTextField();
        b = new javax.swing.JComboBox();
        a2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Questions ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 40));

        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cKeyReleased(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 570, -1));
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 570, -1));

        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 570, -1));
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 570, -1));

        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 570, -1));
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 570, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 130, 50));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
        updateques("q1");


    }//GEN-LAST:event_aMouseClicked

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed

    }//GEN-LAST:event_aActionPerformed

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        updateques("q2");
    }//GEN-LAST:event_bMouseClicked

    private void cKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyReleased

    }//GEN-LAST:event_cKeyReleased

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        updateques("q3");
    }//GEN-LAST:event_cMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (!a.getSelectedItem().equals("Select one...") & !b.getSelectedItem().equals("Select one...") & !c.getSelectedItem().equals("Select one...")) {
            if (a1.getText().replace(" ", "").length() > 0 & a2.getText().replace(" ", "").length() > 0 & a3.getText().replace(" ", "").length() > 0) {
                saveAnswers();

            } else {
                JOptionPane.showMessageDialog(this, "Please provide valid answers...", "Invalid answers", JOptionPane.WARNING_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a question...", "Quesion Not Selected", JOptionPane.WARNING_MESSAGE);

        }
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QUESTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QUESTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QUESTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QUESTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QUESTION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox a;
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JComboBox b;
    private javax.swing.JComboBox c;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void createqu() {
        try {
            ResultSet rs = db.search("select count(question_id) as x from forget_password");
            if (rs.next()) {
                int x = Integer.parseInt(rs.getString("x"));
                if (x == 0) {
                    db.iud("insert into forget_password(question) values('What is your home town?')");
                    db.iud("insert into forget_password(question) values('What is your favourit colour?')");
                    db.iud("insert into forget_password(question) values('What is your first teacher?')");
                    db.iud("insert into forget_password(question) values('What is your mother name?')");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadque() {
        try {
            ResultSet rs = db.search("select * from forget_password");
            while (rs.next()) {
                a.addItem(rs.getString("question"));
                b.addItem(rs.getString("question"));
                c.addItem(rs.getString("question"));

            }
            rs.close();
        } catch (Exception e) {
        }
    }

    private void updateques(String q) {
        String sql = "";
        if (q.equals("q1")) {
            a.removeAllItems();
            sql = "SELECT question FROM forget_password WHERE question NOT IN "
                    + "(SELECT question FROM forget_password WHERE question='" + b.getSelectedItem() + "' OR "
                    + "question='" + c.getSelectedItem() + "')";
        } else if (q.equals("q2")) {
            b.removeAllItems();
            sql = "SELECT question FROM forget_password WHERE question NOT IN "
                    + "(SELECT question FROM forget_password WHERE question='" + a.getSelectedItem() + "' OR "
                    + "question='" + c.getSelectedItem() + "')";
        } else if (q.equals("q3")) {
            c.removeAllItems();
            sql = "SELECT question FROM forget_password WHERE question NOT IN "
                    + "(SELECT question FROM forget_password WHERE question='" + b.getSelectedItem() + "' OR "
                    + "question='" + a.getSelectedItem() + "')";
        }
        try {
            ResultSet rs = db.search(sql);
            while (rs.next()) {
                if (q.equals("q1")) {
                    a.addItem(rs.getString("question"));
                } else if (q.equals("q2")) {
                    b.addItem(rs.getString("question"));
                }
                if (q.equals("q3")) {
                    c.addItem(rs.getString("question"));
                }
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveAnswers() {
int l=0;
        try {
            String[] ans = new String[3];
            String[] ques = new String[3];
            ans[0] = a1.getText();
            ans[1] = a2.getText();
            ans[2] = a3.getText();
            ques[0] = "" + a.getSelectedItem();
            ques[1] = "" + b.getSelectedItem();
            ques[2] = "" + c.getSelectedItem();
            byte i = 0;
            for (String k : ques) {
                l=1;
                ResultSet rs = db.search("SELECT question_id FROM forget_password WHERE question='" + ques[i] + "'");
                if (rs.next()) {
                    db.iud("INSERT INTO emp_has_forget_password (emp_emp_id, forget_password_question_id, answer) VALUES('" + first_login.ida + "','" + rs.getString(1) + "','" + ans[i] + "')");
                    ++i;
                    
                }
                rs.close();
                
            }if(l==1){
            JOptionPane.showMessageDialog(this, "Data successfully saved...!!!!", "Data Saved", JOptionPane.INFORMATION_MESSAGE);

                (new log()).setVisible(true);
                this.dispose();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
