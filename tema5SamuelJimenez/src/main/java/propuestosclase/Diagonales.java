/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuestosclase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Diagonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] m = {
            {4, 6, 3, 2},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}
        };

        mostrarMatriz(m);
        System.out.println(" ----- ----- -----");
        mostrar(m);
        System.out.println(" ----- ----- -----");
        elementosDiagonalPrincip(m).forEach(System.out::print);
        System.out.println("\n ----- ----- -----");
        System.out.println(Arrays.toString(elementosDiagonalSecund(m)));

    }

    private static void mostrarMatriz(int[][] m) {
        //--- Recorremos la matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
                //--- Cuando terminemos la fila metemos un salto de línea
                if (j == m[i].length - 1) {
                    System.out.println("");
                }
            }
        }

    }

    public static void mostrar(int[][] m) {
        for (int[] fila : m) {//Por cada fila que hay en la matriz
            for (int valor : fila) {//Por cada valor que hay en la fila
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }

    public static List<Integer> elementosDiagonalPrincip(int[][] m) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            lista.add(m[i][i]);
        }

        return lista;
    }

    public static int[] elementosDiagonalSecund(int[][] m) {
        int[] lista = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            lista[i] = (m[i][m.length - 1 - i]);

        }

        return lista;
    }
    
   
}
