/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
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
        ArrayList<Integer> arr = new ArrayList<>();
        int num;

        do {
            System.out.println("¿Qué número quieres introducir?\nMarca cero para finalizar");
            num = sc.nextInt();
            if (num != 0) {
                arr.add(num);
            } else {
                break;
            }
        } while (true);

        for (int i = 0; i < arr.size(); i++) {
            String linea = "";
            for (int j = 0; j < arr.get(i); j++) {
                linea = linea.concat("*");
            }
            System.out.println(linea);

        }

    }

}
