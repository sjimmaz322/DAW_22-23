/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej17 {

    /*
    Implementa un programa que lea un String, lo pase a minúscula, lo introduzca en un array de caracteres y ordene dicho array siguiendo el orden Unicode (a<b<c<d...).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //---
        System.out.println("Introduza el String que desee");
        String frase = sc.nextLine();
        String fraseMinus = frase.toLowerCase();
        String fraseSinEspacios = fraseMinus.replace(" ", "");
        //---
        char[] letras = new char[fraseSinEspacios.length()];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = fraseSinEspacios.charAt(i);
        }
        //---
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
        }
        //---
        Arrays.sort(letras);
        //---
        System.out.println("\n");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
        }
    }

}
