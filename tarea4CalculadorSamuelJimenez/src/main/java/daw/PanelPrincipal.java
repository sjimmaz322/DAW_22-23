package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelPrincipal extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;

    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;
    private double valorPrevio;

    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1;
    }

    private void initComponents() {
        botonera = new PanelBotones();
        areaTexto = new JTextArea(10, 50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);

        this.setLayout(new BorderLayout());
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton : botonera.getgrupoBotones()) {
            boton.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o instanceof JButton jButton) {
            String textoBoton = jButton.getText();
            switch (textoBoton) {
                case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" ->
                    areaTexto.setText(areaTexto.getText() + textoBoton);
                case "+" -> {
                    valorPrevio = Double.parseDouble(areaTexto.getText());
                    tipoOperacion = 0;
                    areaTexto.setText("");
                }
                case "-" -> {
                    valorPrevio = Double.parseDouble(areaTexto.getText());
                    tipoOperacion = 1;
                    areaTexto.setText("");
                }
                case "*" -> {
                    valorPrevio = Double.parseDouble(areaTexto.getText());
                    tipoOperacion = 2;
                    areaTexto.setText("");
                }
                case "/" -> {
                    valorPrevio = Double.parseDouble(areaTexto.getText());
                    tipoOperacion = 3;
                    areaTexto.setText("");
                }
                case "C" -> {
                    tipoOperacion = -1;
                    areaTexto.setText("");
                }
                case "=" -> {
                    try {
                        double valorActual = Double.parseDouble(areaTexto.getText());
                        switch (tipoOperacion) {
                            case 0 -> {
                                // Suma
                                double resultadoSuma = valorPrevio + valorActual;
                                areaTexto.setText(String.valueOf(resultadoSuma));
                            }
                            case 1 -> {
                                // Resta
                                double resultadoResta = valorPrevio - valorActual;
                                areaTexto.setText(String.valueOf(resultadoResta));
                            }
                            case 2 -> {
                                // Multiplicación
                                double resultadoMultiplicacion = valorPrevio * valorActual;
                                areaTexto.setText(String.valueOf(resultadoMultiplicacion));
                            }
                            case 3 -> {
                                // División
                                if (valorActual != 0) {
                                    double resultadoDivision = valorPrevio / valorActual;
                                    areaTexto.setText(String.valueOf(resultadoDivision));
                                } else {
                                    areaTexto.setText("Error: división por cero");
                                }
                            }
                        }
                    } catch (NumberFormatException ex) {
                        areaTexto.setText("Error: entrada inválida");
                    }
                    tipoOperacion = -1;
                }
            }
        }
    }
}
