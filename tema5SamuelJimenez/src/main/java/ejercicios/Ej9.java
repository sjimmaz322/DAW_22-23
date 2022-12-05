/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int longitud = rd.nextInt(20);
        int[] nums = new int[longitud];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rd.nextInt(10);
        }
        System.out.println("¿Qué número buscamos?");
        int numBuscado = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == numBuscado) {
                System.out.println("El número " + numBuscado + " se encuentra en la posición lógica " + i + " y en la posición natural " + (i + 1));
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        ordenarBubble(nums);
        System.out.println("-");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        String resultado = (Arrays.binarySearch(nums, numBuscado) < 0) ? "El número no está en el array" : "El número está en el índice " + Arrays.binarySearch(nums, numBuscado);
        System.out.println(resultado);

    }

    private static void ordenarBubble(int[] arrayOrdenar) {
        int tmp;
        for (int i = 0; i < arrayOrdenar.length - 1; i++) {
            for (int j = i + 1; j < arrayOrdenar.length; j++) {
                if (arrayOrdenar[i] > arrayOrdenar[j]) {
                    tmp = arrayOrdenar[i];
                    arrayOrdenar[i] = arrayOrdenar[j];
                    arrayOrdenar[j] = tmp;
                }
            }
        }

    }

}
