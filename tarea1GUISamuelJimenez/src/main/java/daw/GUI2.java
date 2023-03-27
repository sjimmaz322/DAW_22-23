/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author samuel
 */
public class GUI2 extends JPanel {

    // Añadimos un componente de tipo etiqueta (JLabel)
    private JLabel etiqueta;

    // Constructor pasando un color, que llama al método initComponents(),
// y luego al método cambiarColorFondo 
    public GUI2(Color color) {
        initComponents();
        cambiarColorFondo(color);
    }

    // Método que inicializa los elementos gráficos del formulario
    private void initComponents() {
        // Construimos la etiqueta con el texto que queremos que muestre
        etiqueta = new JLabel("Etiqueta de MiPanel");
        // Añade la etiqueta al contenedor MiPanel (al JPanel)
        this.add(etiqueta);
    }

    private void cambiarColorFondo(Color color) {
        // Establece el color de fondo del panel
        this.setBackground(color);
    }

    // Método getter
    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Samuel Alejandro Jiménez Mazas");

        // Establecemos posición y tamaño
        ventanaPrincipal.setBounds(250, 250, 800, 600);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre 	
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        GUI2 p1 = new GUI2(Color.lightGray);
        GUI2 p2 = new GUI2(Color.magenta);
        GUI2 p3 = new GUI2(Color.pink);
        GUI2 p4 = new GUI2(Color.cyan);
        GUI2 p5 = new GUI2(Color.white);
        //---
        p1.etiqueta.setText("Hola");
        p2.etiqueta.setText("Programar");
        p3.etiqueta.setText("Me quita y me da");
        p4.etiqueta.setText("Años");
        p5.etiqueta.setText("De vida");

        ventanaPrincipal.add(p1, BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(p2, BorderLayout.WEST);
        // Añadir panel gris en la posición central (CENTER)

        ventanaPrincipal.add(p3, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(p4, BorderLayout.EAST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(p5, BorderLayout.SOUTH);

        ventanaPrincipal.setResizable(false);

    }

}
