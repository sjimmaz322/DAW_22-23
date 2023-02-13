/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosbinarios;

import java.util.Random;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MatrizBinaria {

    private static Random rd = new Random();

    public static void main(String[] args) {
        //--- Creamos la Coordenada que nos devolverá y la matriz
        Coordenada coordenada;
        int[][] matriz = new int[5][5];
        //--- Rellenamos la matriz
        rellenarMatriz(matriz);
        //--- Buscamos si hay una coordenada que se adecue a lo que pedimos
        coordenada = buscadorCeroRodeado(matriz);
        System.out.println(coordenada);
        //--- Mostramos la matriz para comprobar
        mostrarMatriz(matriz);

    }

    private static void rellenarMatriz(int[][] m) {
        //--- Rellenamos la matriz aleatoriamente con 0 y 1
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextInt(2);
            }
        }
    }

    private static Coordenada buscadorCeroRodeado(int[][] m) {
        //--- Recorremos la matriz
        //--- i y j valen 1 para obviar las coordenadas que no tienen 4 esquinas
        //--- Al igual que no llegamos a la última casilla de i ni de j
        for (int i = 1; i < m.length - 1; i++) {
            for (int j = 1; j < m[i].length - 1; j++) {
                if (comprobadorEsquinas(i, j, m)) {
                    return new Coordenada(i, j);
                }
            }

        }
        return new Coordenada(-1, -1);
    }
    
    //Método que comprueba si las "esquinas" de la coordenada tienen 1 y la propia coordenada 0 
    private static boolean comprobadorEsquinas(int i, int j, int[][] m) {
        if ((m[i][j] == 0) && (m[i - 1][j - 1] == 1) && (m[i - 1][j + 1] == 1) && (m[i + 1][j - 1] == 1) && (m[i + 1][j + 1] == 1)) {
            return true;
        } else {
            return false;
        }
    }

    private static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
