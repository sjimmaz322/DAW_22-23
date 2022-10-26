/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package samueljimenezmazas;

import java.time.Year;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Bisiestos {

    /*
    Bucle, hasta que el usuario introduzca un cero.
    Si introduce un año negativo se pone en positivo.
    El programa debe decir si es bisiesto o no.
    El año para que sea bisiesto debe ser divisible por 4 y no divisible por 100 o divisible por 400.
     */
    public static void main(String[] args) {
        int anio;
        do {
            anio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año que desea comprobar"));

            if (anio < 0) {
                anio = Math.abs(anio);
            }
            if (anio != 0) {
                if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {

                    JOptionPane.showMessageDialog(null, "El año es bisiesto");
                } else {
                    JOptionPane.showMessageDialog(null, "El año no es bisiesto");
                }
            }
        } while (anio != 0);

        /*
        La forma "profesional" de hacerlo
        String bisiesto = Year.isLeap(anio) ? "Es bisiesto" : "No es bisiesto";
        JOptionPane.showMessageDialog(null, anio + " " + bisiesto);
         */
    }
}
