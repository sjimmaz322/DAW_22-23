/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI3 extends JPanel implements ActionListener {

    // Componentes gráficos: un botón y un área de texto
    private JButton boton;
    private JTextArea texto;

    public GUI3() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Borde del panel"));

        // Creamos el botón, con un texto a mostrar
        boton = new JButton("Saludar");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JTextArea(1, 25);

        // Establecemos el color de fondo del textArea
        texto.setBackground(Color.gray);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(boton);
        this.add(texto);

        boton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        // Este ejemplo es tan básico que no hemos usado el objeto ae
        // Indicamos el texto que queremos mostrar en el área de texto
        texto.setText("Hola amigos!!");
    }

    public static void main(String[] args) {
        // Construimos la ventana
        JFrame frame = new JFrame("App");
        // La ventana no se puede redimensionar
        frame.setResizable(false);
        // Posición de la ventana
        frame.setLocationRelativeTo(null);
        // Incluimos el panel en la ventana
        frame.add(new GUI3());
        // Ajusta el frame al contenido
        frame.pack();
        // Hacemos visible la ventana
        frame.setVisible(true);
        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
