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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] nums = new int[10];
        int numPos = 0, numNeg = 0, numCeros = 0;

        rellenarAray(nums);

        numPos = contarPositivos(nums);
        numNeg = contarNegativos(nums);
        numCeros = contarCeros(nums);

        mostrarArray(nums);

        mediaPositvos(nums);
        mediaNegativos(nums);

    }

    public static void rellenarAray(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.println("Introduza un número entero");
            aux[i] = sc.nextInt();
        }
    }

    private static int contarPositivos(int[] aux) {
        int pos = 0;
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] > 0) {
                pos++;
            }
        }
        return pos;
    }

    private static int contarNegativos(int[] aux) {
        int neg = 0;
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] < 0) {
                neg++;
            }
        }
        return neg;
    }

    private static int contarCeros(int[] aux) {
        int ceros = 0;
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] == 0) {
                ceros++;
            }
        }
        return ceros;
    }

    private static void mostrarArray(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.println("El valor de la posición " + (i + 1) + " es " + aux[i]);
        }
    }

    private static void mediaPositvos(int[] aux) {
        int media = 0, suma = 0;

        for (int i = 0; i < aux.length; i++) {
            if (aux[i] > 0) {
                suma += aux[i];
            }
        }
        try {
            media = suma / contarPositivos(aux);
        } catch (ArithmeticException ae) {
            System.out.println("No has puesto ningún número positivo");
        }
        System.out.println("La media de los números positivos es " + media);
    }

    private static void mediaNegativos(int[] aux) {
        int media = 0, suma = 0;

        for (int i = 0; i < aux.length; i++) {
            if (aux[i] < 0) {
                suma += aux[i];
            }
        }
        try {
            media = suma / contarNegativos(aux);
        } catch (ArithmeticException ae) {
            System.out.println("No has puesto ningún número negativo");
        }
        System.out.println("La media de los números negativos es " + media);
    }
}
