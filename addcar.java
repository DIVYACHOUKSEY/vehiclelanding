/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminlogin.car;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author micro
 */
public class addcar extends javax.swing.JFrame {

    /**
     * Creates new form addcar
     */
    public addcar() {
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

        cardetail = new javax.swing.JPanel();
        carvalidity = new javax.swing.JTextField();
        caraverage = new javax.swing.JTextField();
        carcolor = new javax.swing.JTextField();
        carmodel = new javax.swing.JTextField();
        carno = new javax.swing.JTextField();
        submit1 = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardetail.setBackground(new java.awt.Color(204, 0, 51));
        cardetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cardetail.setOpaque(false);
        cardetail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carvalidity.setBorder(null);
        carvalidity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carvalidityActionPerformed(evt);
            }
        });
        cardetail.add(carvalidity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 290, 20));

        caraverage.setBorder(null);
        caraverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraverageActionPerformed(evt);
            }
        });
        cardetail.add(caraverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 320, 20));

        carcolor.setBorder(null);
        carcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carcolorActionPerformed(evt);
            }
        });
        cardetail.add(carcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 330, 20));

        carmodel.setBorder(null);
        cardetail.add(carmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 310, 20));

        carno.setBorder(null);
        carno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnoActionPerformed(evt);
            }
        });
        cardetail.add(carno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 290, 20));

        submit1.setBackground(new java.awt.Color(0, 51, 204));
        submit1.setForeground(new java.awt.Color(255, 255, 255));
        submit1.setText("submit");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        cardetail.add(submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 30));

        cancel1.setBackground(new java.awt.Color(0, 51, 204));
        cancel1.setForeground(new java.awt.Color(255, 255, 255));
        cancel1.setText("cancel");
        cardetail.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, 30));

        getContentPane().add(cardetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 450, 400));

        jButton3.setBackground(new java.awt.Color(0, 102, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("add driver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 170, 40));

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("View");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 170, 40));

        jButton7.setBackground(new java.awt.Color(0, 102, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("vehicle booking");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 170, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminlogin/car/closedicon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1337, 0, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminlogin/car/toplogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add Vehicle");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 255, 80, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1360, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminlogin/car/addcar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1500, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carvalidityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carvalidityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carvalidityActionPerformed

    private void caraverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraverageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caraverageActionPerformed

    private void carnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carnoActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        
      
        Long Carno=Long.parseLong(carno.getText());
         String Carmodel=carmodel.getText();
        String Carvalidity=carvalidity.getText();
        String Caraverage=caraverage.getText();
        String Carcolor=carcolor.getText();
SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
Session session=sessionfac.openSession();
Transaction tx=session.beginTransaction();
   AddCarBean  ref=new    AddCarBean(Carno,Carmodel,Carvalidity,Caraverage,Carcolor);
  
  session.save(ref);
    tx.commit();
      JOptionPane.showMessageDialog(this,"vehicle successfully added");
      new vehicledata().setVisible(true);
    session.close();
      
    }//GEN-LAST:event_submit1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new addDriver().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void carcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carcolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carcolorActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        new bookingdata().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new vehiclebooking().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

    new addcar().setVisible(true);
       
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(addcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField caraverage;
    private javax.swing.JTextField carcolor;
    private javax.swing.JPanel cardetail;
    private javax.swing.JTextField carmodel;
    private javax.swing.JTextField carno;
    private javax.swing.JTextField carvalidity;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton submit1;
    // End of variables declaration//GEN-END:variables
}
