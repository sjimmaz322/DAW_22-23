package utilidadespropias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class MisUtilidades {

    public static Random rd = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static int intRangoRandom(int mayor, int menor) {
        int num = rd.nextInt(mayor - menor + 1) + menor;
        return num;
    }

    public static double doubleRangoRandom(double mayor, double menor) {
        double num = rd.nextDouble(mayor - menor + 1) + menor;
        return num;
    }

    public static int pedirIntVentana(String mensaje) {
        int num = 0;
        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                break;
            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Intoduzca un número válido");
            }
        } while (true);
        return num;
    }

    public static int pedirIntConsola(String mensaje) {
        int num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");
            }
        } while (true);
        return num;
    }

    public static double pedirDoubleVentana(String mensaje) {
        double num = 0;
        do {
            try {
                num = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                break;
            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Intoduzca un número válido");
            }
        } while (true);
        return num;
    }

    public static double pedirDoubleConsola(String mensaje) {
        double num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextDouble();
                break;
            } catch (NumberFormatException nfe) {

                System.out.println("Introduzca un número válido");
            }
        } while (true);
        return num;
    }

    public static String pedirString(String mensaje) {
        String string = JOptionPane.showInputDialog(mensaje);
        return string;
    }

    public static boolean comprobarRangoIntIncluyente(int num, int max, int min) {
        return num <= max && num >= min;
    }

    public static boolean comprobarRangoIntExcluyente(int num, int max, int min) {
        return num < max && num > min;
    }

    public static boolean comprobarRangoDoubleIncluyente(double num, double max, double min) {
        return num <= max && num >= min;
    }

    public static boolean comprobarRangoDoubleExcluyente(double num, double max, double min) {
        return num < max && num > min;
    }

}
