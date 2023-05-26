/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import controladores.UsuariosJpaController;
import entidades.Personajes;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MenuEditarUsuario extends javax.swing.JFrame {

    UsuariosJpaController ujc = new UsuariosJpaController();

    /**
     * Creates new form MenuEditarUsuario
     */
    public MenuEditarUsuario() {
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

        rId = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rNombre = new javax.swing.JRadioButton();
        rEdad = new javax.swing.JRadioButton();
        rDirecc = new javax.swing.JRadioButton();
        rCumple = new javax.swing.JRadioButton();
        campoTxt = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDICIÓN DE USUARIO");
        setLocation(new java.awt.Point(500, 200));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rId.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rId.setForeground(new java.awt.Color(255, 255, 255));
        rId.setText("ID");
        getContentPane().add(rId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR POR:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        rNombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rNombre.setForeground(new java.awt.Color(255, 255, 255));
        rNombre.setText("NOMBRE");
        getContentPane().add(rNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        rEdad.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rEdad.setForeground(new java.awt.Color(255, 255, 255));
        rEdad.setText("EDAD");
        getContentPane().add(rEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        rDirecc.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rDirecc.setForeground(new java.awt.Color(255, 255, 255));
        rDirecc.setText("DIRECCIÓN");
        getContentPane().add(rDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        rCumple.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rCumple.setForeground(new java.awt.Color(255, 255, 255));
        rCumple.setText("CUMPLEAÑOS");
        getContentPane().add(rCumple, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));
        getContentPane().add(campoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 220, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        tablaContenidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaContenidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 560, 160));

        btnModificar.setText("MODIFICAR");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoEditar.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dfm = new DefaultTableModel() {
            //Evitamos que las celdas sean modificables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //Creamos una cabecera
        String[] cabecera = {"ID", "NOMBRE", "TRASFONDO", "NIVEL", "ALINEACION", "JUGADOR"};
        //Añadimos la cabecera a la tabla
        dfm.setColumnIdentifiers(cabecera);
        //Guardamos en una lista las facturas
        List<Personajes> lista = pjc.findPersonajesEntities();
        //Por cada factura de la lista añadimos una fila a la tabla
        if (!lista.isEmpty()) {
            for (Personajes p : lista) {
                try {
                    Object[] o = {p.getId(), p.getArquetipo(), p.getTrasfondo(), p.getNivel(), p.getAlineacion(), p.getIdJugador().getApodo()};

                    dfm.addRow(o);
                } catch (NullPointerException npe) {
                    Object[] o = {p.getId(), p.getArquetipo(), p.getTrasfondo(), p.getNivel(), p.getAlineacion(), "Sin jugador asociado"};

                    dfm.addRow(o);
                }
            }
        }
        //Añadimos el modelo a nuestra tabla para que se muestre la información

        tablaContenidos.setModel(dfm);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEditarUsuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField campoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rCumple;
    private javax.swing.JRadioButton rDirecc;
    private javax.swing.JRadioButton rEdad;
    private javax.swing.JRadioButton rId;
    private javax.swing.JRadioButton rNombre;
    private javax.swing.JTable tablaContenidos;
    // End of variables declaration//GEN-END:variables
}
