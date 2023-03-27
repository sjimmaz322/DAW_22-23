/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI1 extends JPanel implements ActionListener {

    // Componentes gráficos: dos botones y un área de texto
    private JButton botonNombre;
    private JButton botonApellidos;
    private JTextArea texto;

    public GUI1() {
        initComponents();
    }

    private void initComponents() {

        // Creamos los botones, con un texto a mostrar
        botonNombre = new JButton("Nombres");
        botonApellidos = new JButton("Apellidos");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JTextArea(1, 25);
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(BorderFactory.createTitledBorder("Borde del panel"));

        // Establecemos el color de fondo del textArea
        texto.setBackground(Color.gray);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(texto);

        // Agregamos los listeners a los botones
        botonNombre.addActionListener(this);
        botonApellidos.addActionListener(this);
    }

    @Override
    // Sobrescribimos el método de la interfaz
    public void actionPerformed(ActionEvent ae) {

        //--- Si el botón pulsado es el botón para el nombre
        if (ae.getSource().equals(botonNombre)) {
            texto.setBackground(Color.WHITE);
            texto.setText("Samuel Alejandro");
            //--- Sino es el botón para el apellido
        } else if (ae.getSource().equals(botonApellidos)) {
            texto.setBackground(Color.BLUE);
            texto.setText("Jiménez Mazas");
        }
    }

    public static void main(String[] args) {
        // Construimos la ventana
        JFrame frame = new JFrame("App");
        // La ventana no se puede redimensionar
        frame.setResizable(false);
        // Posición de la ventana
        frame.setLocationRelativeTo(null);
        // Incluimos el panel en la ventana
        frame.add(new GUI1());
        // Ajusta el frame al contenido
        frame.pack();
        // Hacemos visible la ventana
        frame.setVisible(true);
        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
