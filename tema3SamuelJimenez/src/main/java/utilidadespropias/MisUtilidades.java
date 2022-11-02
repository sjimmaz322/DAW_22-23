/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidadespropias;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class MisUtilidades {

    /**
     *
     */
    public static Random rd = new Random();

    /**
     *
     */
    public static boolean seguir = true;
    /**
     * Devuelve un número entero entre un rangod determinado dado por dos números introducidos en el método.
     * 
     * 
     * @param mayor     Un número (Integer) introducido que será el límite máximo del rango
     * @param menor     Un número (Integer) introducido que será el límite mínimo del rango
     * 
     * @return Un número entero comprendido entre el número mayor y el número menor introducidos
     */
    public static int intRangoRandom(int mayor, int menor) {
        int num = rd.nextInt(mayor - menor + 1) + menor;
        return num;
    }

    /**
     *
     * @param mayor
     * @param menor
     * @return
     */
    public static double doubleRangoRandom(double mayor, double menor) {
        double num = rd.nextDouble(mayor - menor + 1) + menor;
        return num;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static int pedirIntVentana(String mensaje) {
        int num = 0;
        do {
            try {
                seguir = true;
                num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

            } catch (NumberFormatException nfe) {
                seguir = false;
                JOptionPane.showMessageDialog(null, "Intoduzca un número válido");
            }
        } while (!seguir);
        return num;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static double pedirDoubleVentana(String mensaje) {
        double num = 0;
        do {
            try {
                seguir = true;
                num = Double.parseDouble(JOptionPane.showInputDialog(mensaje));

            } catch (NumberFormatException nfe) {
                seguir = false;
                JOptionPane.showMessageDialog(null, "Intoduzca un número válido");
            }
        } while (!seguir);
        return num;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static String pedirString(String mensaje) {
        String string = JOptionPane.showInputDialog(mensaje);
        return string;
    }

}
