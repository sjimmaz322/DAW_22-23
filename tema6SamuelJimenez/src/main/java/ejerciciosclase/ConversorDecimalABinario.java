/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.ArrayList;
import java.util.Collections;
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
    }

    private static String conversorIterativo(int num) {

        return "";
    }
}
