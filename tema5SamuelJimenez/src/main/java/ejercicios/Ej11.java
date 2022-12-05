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
public class Ej11 {

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

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        System.out.println("¿Qué número buscamos?");
        int numBuscado = sc.nextInt();
        String estaNum = buscarNumBusquedaBinaria(nums, numBuscado) ? "Está el número que buscamos" : "No está el número que buscamos";
        System.out.println(estaNum);

    }

    private static boolean buscarNumBusquedaBinaria(int[] aux, int num) {
        return (Arrays.binarySearch(aux, num) > 0);
    }
}
