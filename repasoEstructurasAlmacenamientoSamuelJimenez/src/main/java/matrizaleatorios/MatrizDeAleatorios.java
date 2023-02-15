/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package matrizaleatorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MatrizDeAleatorios {

    /*
    Implementa un programa que genere matrices de NxN, 
    rellenando la matriz en cada posición de forma aleatoria,
    con números que no se pueden repetir, entre 1 y N^2 .
     */
    private static Random rd = new Random();

    public static void main(String[] args) {
        //--- Creamos la matriz
        int[][] matriz = new int[4][4];
        //--- Rellenamos la matriz gracias a nuestro método
        rellenarMatriz(matriz);
        //--- Mostramos la matriz para ver que es correcta
        mostrarMatriz(matriz);
    }

    private static void rellenarMatriz(int[][] m) {
        //--- Calculamos el número máximo que puede aparecer en la matriz
        int numMax = (int) Math.pow(m.length, 2);
        int num = 0;
        //---
        List<Integer> listaNum = new ArrayList<>();
        //---
        for (int i = 1; i <= numMax; i++) {
            listaNum.add(i);
        }
        //---
        Collections.shuffle(listaNum);
        //---
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = listaNum.get(num);
                num++;
            }

        }
    }

    private static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
