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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int contadorPos = 0, contadorNeg = 0, contadorCeros = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduza un número entero");
            nums[i] = sc.nextInt();
            if (nums[i] == 0) {
                contadorCeros++;
            } else if (nums[i] > 0) {
                contadorPos++;
            } else {
                contadorNeg++;
            }
        }

        String mensaje = """
                         En el Array, de los 10 números hay:
                         %d números positivos.
                         %d números negativos.
                         %d ceros.
                         """.formatted(contadorPos, contadorNeg, contadorCeros);

        System.out.println(mensaje);

    }

}
