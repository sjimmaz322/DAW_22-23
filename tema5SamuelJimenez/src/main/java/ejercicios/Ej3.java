/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author samuel
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();

        double[] array1 = new double[20];
        double[] array2 = new double[20];

        for (int i = 0; i < array1.length; i++) {
            Array.setDouble(array1, i, 7.5);
        }
        array2 = array1.clone();

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);

        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println(" ");
        String resultado = Arrays.equals(array1, array2) ? "Los arrays son iguales" : "Los arrays son diferentes";
        System.out.println(" ");
        System.out.println(resultado);

        Array.setDouble(array2, rd.nextInt(20), 6.3);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);

        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println(" ");
        resultado = Arrays.equals(array1, array2) ? "Los arrays son iguales" : "Los arrays son diferentes";
        System.out.println(" ");
        System.out.println(resultado);
    }

}
