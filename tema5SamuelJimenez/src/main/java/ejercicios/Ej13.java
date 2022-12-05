/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej13 {

    /*
    Escribir un programa que lea números enteros entre 1 y 20 desde teclado.
    Se debe generar un histograma con las frecuencias de cada entero en la secuencia.
    Para representar las barras del histograma hay que utilizar secuencias del carácter ‘*’.
    El programa finaliza al introducir un cero.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
        int num;

        do {
            System.out.println("¿Qué número quieres introducir?\nMarca cero para finalizar");
            num = sc.nextInt();
            if ((num != 0) && (num >= 1) && (num <= 20)) {
                arr[num - 1] = arr[num - 1].concat("*");
            } else if (num < 0 || num > 20) {
                System.out.println("Solo números del 1 al 20");
            } else {
                break;
            }
        } while (true);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);

        }

    }

}
