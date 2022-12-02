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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();

    public static void main(String[] args) {
        System.out.println("¿Cuál es la longitud de los arrays?");
        int longitud = sc.nextInt();

        int[] arr1 = new int[longitud];
        int[] arr2 = new int[longitud];

        rellenarArray(arr1);
        mostrarArray(arr1);
        System.out.println("----------");
        rellenarArray(arr2);
        mostrarArray(arr2);
        System.out.println("----------");
        int[] arrayMultiplicaciones = multiplicar(arr1, arr2);
        mostrarArray(arrayMultiplicaciones);

    }

    private static void mostrarArray(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.println("El valor de la posición " + (i + 1) + " es " + aux[i]);
        }
    }

    private static void rellenarArray(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            aux[i] = rd.nextInt(100) + 1;
        }
    }

    private static int[] multiplicar(int[] array1, int[] array2) {
        int[] aux = new int[array1.length];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = array1[i] * array2[i];
        }

        return aux;
    }

}
