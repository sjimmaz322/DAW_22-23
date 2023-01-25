/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuestosclase;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class RecorrerVecinasMatriz {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();

    public static void main(String[] args) {
        /*
        Mostrar las vecinas de una coordenada de una matriz cuadrada
         */
        int fila, columna;
        //---
        int dimension = pedirIntConsola("Introduzca el número de filas y columnas de la matriz");
        char[][] matriz = new char[dimension][dimension];
        do {
            columna = pedirIntConsola("Introduzca la coordenada X (columna) que desea tomar como centro");
            if (columna < 0 || columna >= dimension) {
                System.out.println("Los valores admitidos están entre 0 y " + (dimension - 1));
            }
        } while (columna < 0 || columna >= dimension);
        //---
        do {
            fila = pedirIntConsola("Introduzca la coordenada Y (fila) que desea tomar como centro");
            if (fila < 0 || fila >= dimension) {
                System.out.println("Los valores admitidos están entre 0 y " + (dimension - 1));
            }
        } while (fila < 0 || fila >= dimension);
        //---
        rellenarMatriz(matriz);
        System.out.println(" ");
        mostrarMatriz(matriz);
        System.out.println(" ");
        //---
        sacarVecinas(matriz, fila, columna);
        //---
        List<CasillaMatriz> lista = casillasVecinas(fila, columna, matriz);

        for (CasillaMatriz casilla : lista) {
            System.out.println(casilla);
        }

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

    private static void mostrarMatriz(char[][] m) {
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

    private static void rellenarMatriz(char[][] m) {
        //--- Recorremos la matriz
        int letra;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                letra = rd.nextInt(122 - 97 + 1) + 97;
                m[i][j] = (char) letra;
            }
        }

    }

    private static void sacarVecinas(char[][] m, int x, int y) {
        /*
        m[x-1][y-1]   m[x-1][y]   m[x-1][y+1]
        m[x][y-1]     m[x][y]     m[x][y+1]
        m[x+1][y-1]   m[x+1][y]   m[x+1][y+1]
         */
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if ((i >= 0 && i < m.length) && (j >= 0 && j < m[i].length) && ((i != x) || (j != y))) {
                    System.out.println("El valor de la coordenada " + i + "-" + j + " es " + m[i][j]);
                }
            }

        }
    }

    public static List<CasillaMatriz> casillasVecinas(int fila, int columna, char[][] m) {
        List<CasillaMatriz> lista = new ArrayList<>();
        //comprobamos filas y columnas
        if (esFilaValida(fila, m) && esColumnaValida(columna, m)) {
            for (int i = fila - 1; i <= fila + 1; i++) {
                if (esFilaValida(i, m)) {
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        if (esColumnaValida(j, m)) {
                            if ((i == fila) && (j == columna)) {
                                System.out.println(i + "-" + j + " es la casilla que estamos mirando");
                                continue;
                            }
                            lista.add(new CasillaMatriz(i, j, m[i][j]));
                        }
                    }

                }
            }

        }
        return lista;
    }

    public static boolean esFilaValida(int fila, char[][] m) {
        return (fila >= 0 && fila < m.length);
    }

    public static boolean esColumnaValida(int columna, char[][] m) {
        return (columna >= 0 && columna < m.length);
    }

}
