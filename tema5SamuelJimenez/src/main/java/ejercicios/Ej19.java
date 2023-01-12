/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej19 {

    /*
    Crear un programa que, mediante un menú, permita reservar o cancelar asientos de un avión, así como mostrar qué asientos están ocupados y libres actualmente.
    El avión tendrá 25 filas de 4 asientos cada una.
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //---
        boolean[][] avion = new boolean[25][4];
        boolean salir = false;
        //---
        rellenarArrayRandom(avion);
        //---
        mostrarArray(avion);
        //---
        String mensaje = """
                         """;
        String menu = """
                      
                     --------------------------------------
                     Bienvenido a PacheAirlines.
                         ¿Qué desea hacer?
                     --------------------------------------
                     1 - Realizar reserva.
                     2 - Cancelar reserva.
                     3 - Salir.
                     -------------------------------------
                      
                    """;
        do {
            String opcion = "";
            System.out.println(menu);
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    reservarAsiento(avion);
                    sc.nextLine();
                    break;
                case "2":
                    cancelarAsiento(avion);
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("Gracias por usar nuestros servicios");
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una de las opciones disponibles.");
            }
        } while (!salir);
    }

    private static void rellenarArray(boolean[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = true;
            }

        }

    }

    private static void rellenarArrayRandom(boolean[][] m) {
        Random rd = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextBoolean();
            }

        }

    }

    private static void mostrarArray(boolean[][] m) {
        String tmp = "\tListado de asientos\n\n";
        for (int i = 0; i < m.length; i++) {
            tmp += i + "-0\t" + i + "-1\t" + i + "-2\t" + i + "-3\t" + "\n"
                    + m[i][0] + "\t" + m[i][1] + "\t" + m[i][2] + "\t" + m[i][3] + "\n";
        }
        System.out.println(tmp);
    }

    private static void reservarAsiento(boolean[][] m) {
        int fila, columna, intentos = 0;
        do {
            do {
                String mensaje1 = "Introduzca la fila del asiento";
                System.out.println(mensaje1);
                fila = sc.nextInt();
                if (fila < 0 || fila > 3) {
                    System.out.println("El número de fila debe ser entre 0 y 3");
                }
            } while (fila < 0 || fila > 3);

            do {
                String mensaje2 = "Introduzca la columna del asiento";
                System.out.println(mensaje2);
                columna = sc.nextInt();
                if (columna < 0 || columna > 24) {
                    System.out.println("El número de columna debe ser entre 0 y 24");
                }
            } while (columna < 0 || columna > 24);

            if (m[columna][fila] == true) {
                m[columna][fila] = false;
                System.out.println("Asiento reservado correctamente");
                break;
            } else {
                System.out.println("El asiento ya fue reservado, seleccione otro");
                if (intentos == 3) {
                    System.out.println("Número de intentos máximos alcanzado, volviendo al menú principal.");
                    break;
                }
            }
        } while (true);
    }

    private static void cancelarAsiento(boolean[][] m) {
        int fila, columna, intentos = 0;
        do {
            do {
                String mensaje1 = "Introduzca la fila del asiento";
                System.out.println(mensaje1);
                fila = sc.nextInt();
                if (fila < 0 || fila > 3) {
                    System.out.println("El número de fila debe ser entre 0 y 3");
                }
            } while (fila < 0 || fila > 3);

            do {
                String mensaje2 = "Introduzca la columna del asiento";
                System.out.println(mensaje2);
                columna = sc.nextInt();
                if (columna < 0 || columna > 24) {
                    System.out.println("El número de columna debe ser entre 0 y 24");
                }
            } while (columna < 0 || columna > 24);

            if (m[columna][fila] == false) {
                m[columna][fila] = true;
                System.out.println("Asiento cancelado correctamente");
                break;
            } else {
                System.out.println("El asiento no estaba reservado, seleccione otro");
                intentos++;
                if (intentos == 3) {
                    System.out.println("Número de intentos máximos alcanzado, volviendo al menú principal.");
                    break;
                }
            }
        } while (true);
    }
}
