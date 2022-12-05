/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author samuel
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] matriz = new char[2][3];
        matriz[0][0] = 'a';
        matriz[0][1] = 'b';
        matriz[0][2] = 'c';
        matriz[1][0] = 'd';
        matriz[1][1] = 'e';
        matriz[1][2] = 'f';

        imprimirMatriz(matriz);

    }

    private static void imprimirMatriz(char[][] aux) {
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.println("La posición " + i + "-" + j + " tiene un valor de " + aux[i][j]);
            }
        }
    }

}
