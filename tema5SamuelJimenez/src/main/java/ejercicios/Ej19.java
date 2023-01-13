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
        //mostrarArray(avion);
        //---
        String mensaje = """
                         """;
        //---
        String menu = """
                      
                     --------------------------------------
                     Bienvenido a PacheAirlines.
                         ¿Qué desea hacer?
                     --------------------------------------
                     1 - Realizar reserva.
                     2 - Cancelar reserva.
                     3 - Ver disponibilidad total.
                     4 - Comprobar disponibilidad de un asiento.
                     5 - Salir.
                     -------------------------------------
                      
                    """;
        //---
        do {
            String opcion = "";
            System.out.println(menu);
            opcion = sc.nextLine();
            //---
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
                    mostrarArray(avion);
                    break;
                case "4":
                    comprobarAsiento(avion);
                    break;
                case "5":
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
            String estadoColumna0 = m[i][0] ? "Libre" : "Ocupado";
            String estadoColumna1 = m[i][1] ? "Libre" : "Ocupado";
            String estadoColumna2 = m[i][2] ? "Libre" : "Ocupado";
            String estadoColumna3 = m[i][3] ? "Libre" : "Ocupado";

            tmp += i + "-0\t" + i + "-1\t||\t||\t" + i + "-2\t" + i + "-3\t" + "\n"
                    + estadoColumna0 + "\t" + estadoColumna1 + "\t||\t||\t" + estadoColumna2 + "\t" + estadoColumna3 + "\n";
        }
        System.out.println(tmp);
    }

    private static void reservarAsiento(boolean[][] m) {
        int columna, fila, intentos = 0;
        do {

            do {
                String mensaje2 = "Introduzca la fila del asiento";
                System.out.println(mensaje2);
                fila = sc.nextInt();
                if (fila < 0 || fila > 24) {
                    System.out.println("El número de fila debe ser entre 0 y 24");
                }
            } while (fila < 0 || fila > 24);
            do {
                String mensaje1 = "Introduzca la posición dentro de la fila del asiento";
                System.out.println(mensaje1);
                columna = sc.nextInt();
                if (columna < 0 || columna > 3) {
                    System.out.println("El número de la posición debe ser entre 0 y 3");
                }
            } while (columna < 0 || columna > 3);

            if (m[fila][columna] == true) {
                m[fila][columna] = false;
                System.out.println("Asiento reservado correctamente");
                break;
            } else {
                intentos++;
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
                String mensaje2 = "Introduzca la fila del asiento";
                System.out.println(mensaje2);
                fila = sc.nextInt();
                if (fila < 0 || fila > 24) {
                    System.out.println("El número de fila debe ser entre 0 y 24");
                }
            } while (fila < 0 || fila > 24);
            do {
                String mensaje1 = "Introduzca la posición dentro de la fila del asiento";
                System.out.println(mensaje1);
                columna = sc.nextInt();
                if (columna < 0 || columna > 3) {
                    System.out.println("El número de la posición debe ser entre 0 y 3");
                }
            } while (columna < 0 || columna > 3);

            if (m[fila][columna] == false) {
                m[fila][columna] = true;
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

    public static void comprobarAsiento(boolean[][] m) {
        int fila, columna;
        String reserva;
        do {
            String mensaje2 = "Introduzca la fila del asiento";
            System.out.println(mensaje2);
            fila = sc.nextInt();
            if (fila < 0 || fila > 24) {
                System.out.println("El número de fila debe ser entre 0 y 24");
            }
        } while (fila < 0 || fila > 24);
        do {
            String mensaje1 = "Introduzca la posición dentro de la fila del asiento";
            System.out.println(mensaje1);
            columna = sc.nextInt();
            if (columna < 0 || columna > 3) {
                System.out.println("El número de la posición debe ser entre 0 y 3");
            }
        } while (columna < 0 || columna > 3);

        if (m[fila][columna] == true) {
            sc.nextLine();
            System.out.println("El asiento seleccionado está disponible.\n¿Desea reservar el asiento?");
            System.out.println("Si - Para reservar");
            System.out.println("Otro comando para salir");
            reserva = sc.nextLine();
            if (reserva.equalsIgnoreCase("si")) {
                m[fila][columna] = false;
                System.out.println("Asiento reservado.");
            } else {
                System.out.println("Volviendo al menú.");
            }
        } else {
            System.out.println("El asiento comprobado no está disponible");

        }
    }
}
