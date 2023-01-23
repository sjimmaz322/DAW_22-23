/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuestosclase;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MayorFilaMenorColumna {

    /*
    Implementar un programa que permita encontrar el elemento mayor de una fila y menor de una columna de un array de N filas x N columnas números enteros.
    Para ello, el programa tendrá varias opciones: 
    a) El programa solicitará al usuario el número N (entre 3 y 6) y creará una matriz con los números que introduzca el usuario por teclado.
    b) El programa solicitará al usuario el número N (entre 3 y 6) y creará una matriz con los números aleatorios entre 0 y 20.
    Una vez creada la matriz con los datos, ésta se pasará a un método que se encargará de devolver la Coordenada (clase que debes crear)
    del número que es mayor o igual a todos los de su fila y menor o igual a todos los de su columna, si existe. Si no existe indicará la coordenada (-1 , -1).
    Se debe imprimir por consola la matriz creada en a) o b) y la coordenada generada, para comprobar que el resultado obtenido es correcto.
    Por ejemplo, en la siguiente matriz de 3X3, la coordenada a devolver sería fila 2 columna 0.

    10  9   8
    9   10  11
    8   8   5
     */
    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();

    public static void main(String[] args) {
        //---
        int numFilasColumnas = 0;
        //---
        int[][] matriz;
        //---
        String menu = """
                    Introduzca la versión del programa que desea utilizar.
                    A - Introducir los números manualmente.
                    B - Generar los números aleatoriamente.
                    Salir / S - Salir del programa.
                    """;
        String menuOpt;
        //---
        do {
            Coordenada resultado;
            System.out.println("");
            //---
            menuOpt = "";
            System.out.println(menu);
            menuOpt = sc.nextLine().toUpperCase();
            //---

            switch (menuOpt) {
                case "A":
                    numFilasColumnas = pedirNumMatriz();
                    matriz = new int[numFilasColumnas][numFilasColumnas];
                    rellenarMatriz(matriz);
                    //---
                    System.out.println("");
                    mostrarMatriz(matriz);
                    sc.nextLine();
                    System.out.println("");
                    //---
                    resultado = buscarCoorPedida(matriz);
                    System.out.println(resultado);
                    break;
                case "B":
                    numFilasColumnas = pedirNumMatriz();
                    matriz = new int[numFilasColumnas][numFilasColumnas];
                    rellenarMatrizRandom(matriz);
                    //---
                    System.out.println("");
                    mostrarMatriz(matriz);
                    sc.nextLine();
                    System.out.println("");
                    //---
                    resultado = buscarCoorPedida(matriz);
                    System.out.println(resultado);
                    break;
                case "SALIR":
                case "S":
                    System.out.println("Gracias por contar con nosotros");
                    menuOpt = "s";
                    break;
                default:
                    System.out.println("Elija una de las opciones ofrecidas");
            }
        } while (!(menuOpt.equalsIgnoreCase("s")));
    }

    private static int pedirNumMatriz() {
        int num = 0;
        do {//--- Do-while que se repite hasta que introduzcamos valores aceptados
            num = pedirIntConsola("Introduza el número para crear la matriz cuadrada");
            if (num < 3 || num > 6) {
                System.out.println("Solo se admiten números entre 3 y 6");
            }
        } while (num < 3 || num > 6);
        return num;
    }

    private static void mostrarMatriz(int[][] m) {
        //--- Recorremos la matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
                //--- Cuando terminemos la fila metemos un salto de línea
                if (j == m[i].length - 1) {
                    System.out.println("");
                }
            }
        }

    }

    private static void rellenarMatrizRandom(int[][] m) {
        //--- Recorremos la matriz y la rellenamos de números aleatorios entre 0 y 20
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextInt(21);
            }
        }
    }

    private static void rellenarMatriz(int[][] m) {

        int casillas = (m.length * m.length) - 1;
        //--- Al ser una matriz cuadrada podemos hacerlo así
        //--- Podemos hacer Math.pow(m.lenght,2) pero devuelve un double y no quiero decimales
        //--- Recorremos la matriz guardando valores en cada casilla y avisando de cuantas quedan
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = pedirIntConsola("Introduzca el número que desea para la celda " + i + "-" + j);
                System.out.println("Quedan " + casillas + " números por introducir\n");
                casillas--;
            }
        }
    }

    private static Coordenada buscarCoorPedida(int[][] m) {
        //--- Creamos las variables que vamos a usar
        boolean esElMayorDeLaFila;
        boolean esElMenorDeLaColumna;
        int numActual;
        //--- Doble bucle for para recorrer matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //--- Inicializamos las variables con los valores que necesitamos en este momento
                esElMayorDeLaFila = true;
                esElMenorDeLaColumna = true;
                numActual = m[i][j];
                //---
                for (int k = 0; k < m.length; k++) {//--- la i fija para no movernos de fila
                    //--- Comprobamos las filas: Si el número actual es menor que algún valor, no es el mayor, dejamos de buscar
                    //--- Si no salimos del bucle antes del final del mismo, es que tenemos el número que buscamos
                    if (numActual < m[i][k]) {
                        esElMayorDeLaFila = false;
                        break;
                    }
                }
                //--- Comprobamos las columnas: Si el número actual es mayor que algún valor, no es el menor, dejamos de buscar
                //--- Si no salimos del bucle antes del final del mismo, es que tenemos el número que buscamos
                for (int k = 0; k < m[i].length; k++) {//--- La j fija para no movernos de columna
                    if (numActual > m[k][j]) {
                        esElMenorDeLaColumna = false;
                        break;
                    }
                }
                //--- Si ambos valores son true, es porque es el mayor de la fila y menor de la columna
                if (esElMayorDeLaFila && esElMenorDeLaColumna) {
                    return new Coordenada(i, j);
                }
            }
        }
        //--- Si no entra en el if anterior es que no hay número que cumpla las condiciones
        return new Coordenada(-1, -1);
    }

    public static int pedirIntConsola(String mensaje) {
        //--- Método de nuestra clase Utilidades para evitar Excepciones
        int num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");
            } catch (InputMismatchException ime) {
                System.out.println("Introduza un número por favor");
                sc.nextLine();
            }
        } while (true);
        return num;
    }

}
