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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GUI1 extends JPanel implements ActionListener {
    
    private static Random rd = new Random();

    // Componentes gráficos: dos botones y un área de texto
    private JButton boton;
    
    private JLabel texto;
    
    public GUI1() {
        initComponents();
    }
    
    private void initComponents() {

        // Creamos los botones, con un texto a mostrar
        boton = new JButton("Generar Aleatorio");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JLabel("Número");
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(BorderFactory.createTitledBorder("Borde del panel"));

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());
        boton.setBackground(Color.lightGray);

        // Añadimos los componentes al panel
        this.add(boton);
        
        this.add(texto);

        // Agregamos los listeners a los botones
        boton.addActionListener(this);
        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(Color.cyan);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(Color.LIGHT_GRAY);
            }
            
        });
    }
    
    @Override
    // Sobrescribimos el método de la interfaz
    public void actionPerformed(ActionEvent ae) {

        //--- Si el botón pulsado es el botón para el nombre
        if (ae.getSource().equals(boton)) {
            int num = rd.nextInt(11);
            texto.setText(String.valueOf(num));
            //--- Sino es el botón para el apellido
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
