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
    public static boolean seguir = true;
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
                seguir = true;
                num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

            } catch (NumberFormatException nfe) {
                seguir = false;
                JOptionPane.showMessageDialog(null, "Intoduzca un número válido");
            }
        } while (!seguir);
        return num;
    }

    public static int pedirIntConsola(String mensaje) {
        int num = 0;
        do {
            try {
                seguir = true;
                System.out.println(mensaje);
                num = sc.nextInt();

            } catch (NumberFormatException nfe) {
                seguir = false;
                System.out.println("Introduzca un número válido");
            }
        } while (!seguir);
        return num;
    }

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

    public static double pedirDoubleConsola(String mensaje) {
        double num = 0;
        do {
            try {
                seguir = true;
                System.out.println(mensaje);
                num = sc.nextDouble();

            } catch (NumberFormatException nfe) {
                seguir = false;
                System.out.println("Introduzca un número válido");
            }
        } while (!seguir);
        return num;
    }

    public static String pedirString(String mensaje) {
        String string = JOptionPane.showInputDialog(mensaje);
        return string;
    }

}
