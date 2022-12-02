/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author samuel
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 2};

        String resultado = Arrays.equals(array, array) ? "Son iguales" : "No son iguales";
        System.out.println("Array 1 y Array 2 " + resultado);
        resultado = Arrays.equals(array2, array) ? "Son iguales" : "No son iguales";
        System.out.println("Array 3 y Array 1 " + resultado);
        resultado = Arrays.equals(array, array3) ? "Son iguales" : "No son iguales";
        System.out.println("Array 1 y Array 4 " + resultado);

        System.out.println("\nProbamos nuestro método casero\n");

        resultado = compararArrays(array, array) ? "Son iguales" : "No son iguales";
        System.out.println("Array 1 y Array 2 " + resultado);
        resultado = compararArrays(array2, array) ? "Son iguales" : "No son iguales";
        System.out.println("Array 3 y Array 1 " + resultado);
        resultado = compararArrays(array, array3) ? "Son iguales" : "No son iguales";
        System.out.println("Array 1 y Array 4 " + resultado);

    }

    private static boolean compararArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
