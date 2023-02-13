/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class ConversorDecimalABinario {

    /**
     * @param args the command line arguments
     */
    private static final int DIVISOR = 2;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduza el número decimal a pasar a binario");
        int num = sc.nextInt();

        String numBinario = conversorIterativo(num);
        System.out.println("El número " + num + " en binario es " + numBinario);
        System.out.println("----- PROBAMOS EL OTRO MÉTODO -----");
        System.out.print("El número " + num + " en binario es ");
        conversorRecursivo(num);

    }

    private static String conversorIterativo(int num) {
        String binario = "";
        String resultado = "";

        do {
            binario += String.valueOf(num % DIVISOR);
            num = num / DIVISOR;

        } while (num >= 2);

        binario += num % DIVISOR;
        for (int i = binario.length() - 1; i >= 0; i--) {
            resultado += binario.charAt(i);
        }
        return resultado;
    }

    private static void conversorRecursivo(int num) {

        if (num < 2) {
            System.out.print(num);
        } else {
            conversorRecursivo(num / 2);
            System.out.print(num % 2);
        }

    }
}
