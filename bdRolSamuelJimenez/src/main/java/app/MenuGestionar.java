/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MenuGestionar extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuGestionar() {
        initComponents();
        botonesTransparentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartelAniadir = new javax.swing.JButton();
        cartelEditar = new javax.swing.JButton();
        cartelBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAniadir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENÚ PRINCIPAL");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartelAniadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAniadir.jpg"))); // NOI18N
        cartelAniadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartelAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartelAniadirActionPerformed(evt);
            }
        });
        getContentPane().add(cartelAniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 30));

        cartelEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonEdit.jpg"))); // NOI18N
        cartelEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartelEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartelEditarActionPerformed(evt);
            }
        });
        getContentPane().add(cartelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 80, 30));

        cartelBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBorrar.jpg"))); // NOI18N
        cartelBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartelBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartelBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cartelBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 80, 30));

        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, 340));

        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 130, 340));

        btnAniadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, 340));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoMenu.jpg"))); // NOI18N
        fondo.setNextFocusableComponent(fondo);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartelAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartelAniadirActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAniadir().setVisible(true);
        });
    }//GEN-LAST:event_cartelAniadirActionPerformed

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAniadir().setVisible(true);
        });
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            new MenuEditar().setVisible(true);
        });
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            new MenuBorrar().setVisible(true);
        });
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cartelEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartelEditarActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            new MenuEditar().setVisible(true);
        });
    }//GEN-LAST:event_cartelEditarActionPerformed

    private void cartelBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartelBorrarActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            new MenuBorrar().setVisible(true);
        });
    }//GEN-LAST:event_cartelBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestionar().setVisible(true);

            }
        });
    }

    public void botonesTransparentes() {
        btnAniadir.setOpaque(false);
        btnAniadir.setContentAreaFilled(false);
        btnAniadir.setBorderPainted(false);
        btnEditar.setOpaque(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setBorderPainted(false);
        btnBorrar.setOpaque(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setBorderPainted(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton cartelAniadir;
    private javax.swing.JButton cartelBorrar;
    private javax.swing.JButton cartelEditar;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
