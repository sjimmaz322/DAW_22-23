/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej14 {

    /*
    Escribe un programa que dada una matriz de 3x3 enteros y realice las siguientes funciones:

    Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
    Calcular la media de todos los valores
    Calcular el valor mínimo y el máximo de todos los valores

     */
    private static Random rd = new Random();

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        rellenarMatriz(matriz);
        String media = calcularMedia(matriz);
        //-----
        int min = calcularMinimo(matriz);
        int max = calcularMaximo(matriz);
        System.out.println("----- MOSTRAMOS LA MATRIZ PARA VER QUE ES CORRECTO -----");
        mostrar3x3(matriz);
        System.out.println("\nLA MEDIA ES:");
        System.out.println(media);
        System.out.println("\nEL VALOR MÍNIMO ES:");
        System.out.println(min);
        System.out.println("\nEL VALOR MÁXIMO ES:");
        System.out.println(max);

    }

    private static void rellenarMatriz(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(100) + 1;
            }
        }
    }

    private static String calcularMedia(int[][] m) {
        DecimalFormat df = new DecimalFormat("#.00");
        double suma = 0, casillas = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(100) + 1;
                casillas++;
                suma += m[i][j];
            }
        }
        return df.format(suma / casillas);
    }

    private static int calcularMinimo(int[][] m) {
        int min = 101;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] < min) {
                    min = m[i][j];
                }
            }
        }
        return min;
    }

    private static int calcularMaximo(int[][] m) {
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        return max;
    }

    private static void mostrar3x3(int[][] m) {
        String resultado = """
                         --------------------
                         |%d|\t|%d|\t|%d|
                         |%d|\t|%d|\t|%d|
                         |%d|\t|%d|\t|%d|
                         --------------------
                         """.formatted(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2]);
        System.out.println(resultado);
    }

}
