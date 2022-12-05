package utilidadespropias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Utilidades {

    /*
    Método 1: Leer entero sin errores
    Método 2: Pedir num entre un rango.
    Método 3: Comprobar si un número está en un rango.
    Método 4: Generar aleatorio en un rango
     */
    //Atributos de clase para usar en toda la clase
    private static Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que mediante un rango introducido devuelve un número entero
     *
     * @param mayor El número que será el máximo que podrá devolver
     * @param menor El número que será el mínimo que podrá devolver
     *
     * @return Un número entero comprendido entre mayor y menor, ambos
     * incluidos.
     */
    public static int intRangoRandom(int mayor, int menor) {
        int num = rd.nextInt(mayor - menor + 1) + menor;
        return num;
    }

    /**
     * Método que mediante un rango introducido devuelve un número decimal
     *
     * @param mayor El número que será el máximo que podrá devolver
     * @param menor El número que será el mínimo que podrá devolver
     *
     * @return Un número decimal comprendido entre mayor y menor, ambos
     * incluidos.
     */
    public static double doubleRangoRandom(double mayor, double menor) {
        double num = rd.nextDouble(mayor - menor + 1) + menor;
        return num;
    }

    /**
     * Método que solicita mediante un JOptionPane un número entero
     *
     * @param mensaje El mensaje que se mostrará en la ventana para entender que
     * es lo que se nos pide.
     *
     * @return Un número entero introducido, controlando le excepción de
     * NumberFormatException
     */
    public static int pedirIntVentana(String mensaje) {
        int num = 0;
        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                break;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Introduzca un número válido");
            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "Introduzca un número por favor");
            }
        } while (true);
        return num;
    }

    /**
     * Método que por consola pide un número entero controlando excepciones
     *
     * @param mensaje Es el mensaje que se mostrará por consola para entender
     * qué es lo que se nos solicita.
     *
     * @return Un número entero que introducimos, controla la excepción
     * NumberFormatException
     */
    public static int pedirIntConsola(String mensaje) {
        int num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");
            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número por favor");
                sc.nextLine();
            }

        } while (true);
        return num;
    }

    /**
     * Método que solicita mediante un JOptionPane un número decimal
     *
     * @param mensaje El mensaje que se mostrará en la ventana para entender que
     * es lo que se nos pide.
     *
     * @return Un número decimal introducido, controlando le excepción de
     * NumberFormatException
     */
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

    /**
     * Método que solicita mediante un mensaje por consola un número decimal
     *
     * @param mensaje El mensaje que se mostrará en la consola para entender que
     * es lo que se nos pide.
     *
     * @return Un número decimal introducido, controlando le excepción de
     * NumberFormatException
     */
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

    /**
     *
     * @param mensaje
     * @return
     */
    public static String pedirString(String mensaje) {
        String string = JOptionPane.showInputDialog(mensaje);
        return string;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoIntIncluyente(int num, int max, int min) {
        return num <= max && num >= min;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoIntMinIncluido(int num, int max, int min) {
        return num < max && num >= min;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoIntMaxIncluido(int num, int max, int min) {
        return num <= max && num > min;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoIntExcluyente(int num, int max, int min) {
        return num < max && num > min;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoDoubleIncluyente(double num, double max, double min) {
        return num <= max && num >= min;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoDoubleExcluyente(double num, double max, double min) {
        return num < max && num > min;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoDoubleMinIncluido(double num, double max, double min) {
        return num < max && num >= min;
    }

    /**
     *
     * @param num
     * @param max
     * @param min
     * @return
     */
    public static boolean comprobarRangoDoubleMaxIncluido(double num, double max, double min) {
        return num <= max && num > min;
    }

    public static int intConsolaRangoIncluyente(String mensaje, int mayor, int menor) {
        int num;
        do {
            num = pedirIntConsola(mensaje);
        } while (!comprobarRangoIntIncluyente(num, mayor, menor));
        return num;
    }

    public static int intVentanaRangoIncluyente(String mensaje, int mayor, int menor) {
        int num;
        do {
            num = pedirIntVentana(mensaje);
        } while (!comprobarRangoIntIncluyente(num, mayor, menor));
        return num;
    }

    public static double doubleConsolaRangoIncluyente(String mensaje, double mayor, double menor) {
        double num;
        do {
            num = pedirDoubleConsola(mensaje);
        } while (!comprobarRangoDoubleIncluyente(num, mayor, menor));
        return num;
    }

    public static double doubleVentanaRangoIncluyente(String mensaje, int mayor, int menor) {
        double num;
        do {
            num = pedirDoubleVentana(mensaje);
        } while (!comprobarRangoDoubleIncluyente(num, mayor, menor));
        return num;
    }

    public static boolean comprobar2OpcionesInt(int num, int op1, int op2) {
        return (num == op1 || num == op2);
    }

    public static boolean comprobar3OpcionesInt(int num, int op1, int op2, int op3) {
        return (num == op1 || num == op2 || num == op3);
    }

    public static boolean comprobar4OpcionesInt(int num, int op1, int op2, int op3, int op4) {
        return (num == op1 || num == op2 || num == op3 || num == op4);
    }

    public static boolean comprobar2OpcionesDouble(double num, double op1, double op2) {
        return (num == op1 || num == op2);
    }

    public static boolean comprobar3OpcionesDouble(double num, double op1, double op2, double op3) {
        return (num == op1 || num == op2 || num == op3);
    }

    public static boolean comprobar4OpcionesDouble(double num, double op1, double op2, double op3, double op4) {
        return (num == op1 || num == op2 || num == op3 || num == op4);
    }

    public static boolean comprobar2OpcionesString(String txt, String op1, String op2) {
        return (txt.equalsIgnoreCase(op1) || txt.equalsIgnoreCase(op2));
    }

    public static boolean comprobar3OpcionesString(String txt, String op1, String op2, String op3) {
        return (txt.equalsIgnoreCase(op1) || txt.equalsIgnoreCase(op2) || txt.equalsIgnoreCase(op3));
    }

    public static boolean comprobar4OpcionesString(String txt, String op1, String op2, String op3, String op4) {
        return (txt.equalsIgnoreCase(op1) || txt.equalsIgnoreCase(op2) || txt.equalsIgnoreCase(op3) || txt.equalsIgnoreCase(op4));
    }

    public static void ordenarBubble(int[] arrayOrdenar) {
        int tmp;
        for (int i = 0; i < arrayOrdenar.length - 1; i++) {
            for (int j = i + 1; j < arrayOrdenar.length; j++) {
                if (arrayOrdenar[i] > arrayOrdenar[j]) {
                    tmp = arrayOrdenar[i];
                    arrayOrdenar[i] = arrayOrdenar[j];
                    arrayOrdenar[j] = tmp;
                }
            }
        }
    }

    public static int busquedaSecuencialPrimeraCoincidencia(int[] aux, int num) {

        for (int i = 0; i < aux.length; i++) {
            if (aux[i] == num) {
                return i;

            }
        }
        return -1;

    }

    public static int busquedaSecuencialUltimaCoincidencia(int[] aux, int num) {
        int pos = 0;
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] == num) {
                pos = i;

            }
        }
        return pos;

    }

}
