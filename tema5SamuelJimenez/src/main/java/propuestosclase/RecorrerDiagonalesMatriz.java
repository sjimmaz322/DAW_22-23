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
 * @author samuel
 */
public class RecorrerDiagonalesMatriz {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();

    public static void main(String[] args) {
        /*
        Recorrer diagonales de una matriz cuadrada y devolvemos los valores que toquen.
        Diagonal principal   \    y diagonal secundaria     /
         */
        String mensaje = "Introduza las filas que desea que tenga la matriz\n(El número de filas y columnas será el mismo)";

        int numPedido = pedirIntConsola(mensaje);
        System.out.println(" ");
        char[][] matriz = new char[numPedido][numPedido];
        System.out.println(" ");
        rellenarMatriz(matriz);
        System.out.println(" ");
        mostrarMatriz(matriz);
        System.out.println(" ");
        System.out.println("Mostramos la diagonal principal");
        String diagonalP = recorrerDiagonalPrincipal(matriz);
        System.out.println(diagonalP);
        System.out.println(" ");
        System.out.println("Mostramos la diagonal secundaria");
        String diagonalS = recorrerDiagonalSecundaria(matriz);
        System.out.println(diagonalS);

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
    
    private static String recorrerDiagonalPrincipal (char[][] m){
        String diagonal="";
        for (int i = 0; i < m.length; i++) {
            diagonal +=m[i][i];         
        }
        return diagonal;
    }
    
        private static String recorrerDiagonalSecundaria(char[][] m){
        String diagonal="";
        int i=0;
        for (int j = m.length-1; j >= 0; j--) {
           diagonal+=m[i][j];
            i++;
        }
        return diagonal;
    }

}
