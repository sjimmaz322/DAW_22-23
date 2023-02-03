/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ext15samueljimenez;

import java.time.Month;
import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int anio;
        do {

            anio = pedirIntConsola("Introduzca el año del que desea comprobar el calendario");
            if (anio < 1950 || anio > 2050) {
                System.out.println("El rango de fechas válido es entre 1950 y 2050");
            }

        } while (anio < 1950 || anio > 2050);

        Calendario calen = new Calendario(Month.JANUARY, Year.of(anio));
        Calendario.rellenarCalenario(calen);

        System.out.println(calen);
        String dia = Calendario.diaSemana(1, calen);
        System.out.println("\nEl año " + anio + " empezó un " + dia);

        System.out.println("\n-----\n");

        String[] anioEntero = Calendario.calendarioAnual(anio);

        for (int i = 0; i < anioEntero.length; i++) {
            System.out.println(anioEntero[i]);

        }

    }

    private static void mostrarMatriz(int[][] m) {
        //--- Recorremos la matriz
        System.out.println("L\tM\tX\tJ\tV\tS\tD");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " \t");
                //--- Cuando terminemos la fila metemos un salto de línea
                if (j == m[i].length - 1) {
                    System.out.println("");
                }
            }
        }

    }

    public static int pedirIntConsola(String mensaje) {
        int num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
                num = Math.abs(num);
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

}
