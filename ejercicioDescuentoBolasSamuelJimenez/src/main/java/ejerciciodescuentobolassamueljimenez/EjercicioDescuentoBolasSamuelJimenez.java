/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejerciciodescuentobolassamueljimenez;

import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class EjercicioDescuentoBolasSamuelJimenez {

    /*
    Se saca una bola.
    Azul - 20% de descuento.
    Roja - 25% de descuento.
    Blanca - no descuento.
    Verde - se saca otra vez.
     */
    public static void main(String[] args) {
        int opcion = JOptionPane.YES_NO_OPTION, codBola;

        String colorBola = "", resumenPago = "";
        final String mensaje = """
                         Introduzca el total de su cuenta a pagar.
                         """;
        double precioProducto, precioDescontado;
        final double DESCUENTO_AZUL = 0.2, DESCUENTO_ROJO = 0.25;
        final int PORCENTAJE_AZUL = 20, PORCENTAJE_ROJO = 25, PORCENTAJE_BLANCO = 0;
        do {
            precioProducto = Utilidades.pedirDoubleConsola(mensaje);
            codBola = Utilidades.intRangoRandom(4, 1);
            do {

                switch (codBola) {
                    case 1:
                        colorBola = "Azul";
                        precioDescontado = precioProducto - (precioProducto * DESCUENTO_AZUL);
                        resumenPago = """
                          El resumen de la transacción es:
                          El total de la cuenta es de %.2f €.
                          Sacó una bola de color %s.
                          Por lo tanto le corresponde un descuento del %d por ciento.
                          Quedando un precio final de %.2f €.
                          """.formatted(precioProducto, colorBola, PORCENTAJE_AZUL, precioDescontado);
                        break;
                    case 2:
                        colorBola = "Rojo";
                        precioDescontado = precioProducto - (precioProducto * DESCUENTO_ROJO);
                        resumenPago = """
                          El resumen de la transacción es:
                          El total de la cuenta es de %.2f €.
                          Sacó una bola de color %s.
                          Por lo tanto le corresponde un descuento del %d por ciento.
                          Quedando un precio final de %.2f €.
                          """.formatted(precioProducto, colorBola, PORCENTAJE_ROJO, precioDescontado);
                        break;
                    case 3:
                        colorBola = "Blanco";
                        precioDescontado = precioProducto;
                        resumenPago = """
                          El resumen de la transacción es:
                          El total de la cuenta es de %.2f €.
                          Sacó una bola de color %s.
                          Por lo tanto le corresponde un descuento del %d por ciento.
                          Quedando un precio final de %.2f €.
                          """.formatted(precioProducto, colorBola, PORCENTAJE_BLANCO, precioDescontado);
                        break;
                    case 4:
                        colorBola = "Verde";
                        JOptionPane.showMessageDialog(null, "Salió una bola de color verde, la quitamos y sacaremos otra.");
                        codBola = Utilidades.intRangoRandom(3, 1);
                        break;
                }

            } while (codBola == 4);
            JOptionPane.showMessageDialog(null, resumenPago);

            if (JOptionPane.showConfirmDialog(null, "¿Hay otro cliente detrás suyo?", "Linea de cola",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            } else {
                JOptionPane.showMessageDialog(null, "Gracias por comprar con nosotros");
                break;
            }
        } while (true);

    }
}
