/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        botonesInvisibles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnLectura = new javax.swing.JButton();
        btnGestionar = new javax.swing.JButton();
        btnAdministrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENÚ PRINCIPAL");
        setLocation(new java.awt.Point(500, 200));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLectura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 390));

        btnGestionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 115, 180, 370));

        btnAdministrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 105, 180, 380));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonLectura.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonGestionar.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAdministrar.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoMenuPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestionar().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturaActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModoLectura().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnLecturaActionPerformed

    private void btnAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModoAdministrar().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnAdministrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    private void botonesInvisibles() {
        btnAdministrar.setOpaque(false);
        btnAdministrar.setContentAreaFilled(false);
        btnAdministrar.setBorderPainted(false);
        btnGestionar.setOpaque(false);
        btnGestionar.setContentAreaFilled(false);
        btnGestionar.setBorderPainted(false);
        btnLectura.setOpaque(false);
        btnLectura.setContentAreaFilled(false);
        btnLectura.setBorderPainted(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrar;
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btnLectura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
