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

    public static Random rd = new Random();

    public static int intRangoRandom(int mayor, int menor) {
        int num = rd.nextInt(mayor - menor + 1) + menor;
        return num;
    }

    public static double doubleRangoRandom(double mayor, double menor) {
        double num = rd.nextDouble(mayor - menor + 1) + menor;
        return num;
    }

    public static int pedirIntVentana(String mensaje) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return num;

    }

    public static double pedirDoubleVentana(String mensaje) {
        double num = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return num;

    }

}
