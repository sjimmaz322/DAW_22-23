/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dame el tamaño del array");
        int longitud = sc.nextInt();
        int[] arr1 = new int[longitud];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduce el valor de la posición del array");
            arr1[i] = sc.nextInt();

        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
