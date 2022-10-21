/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosclase;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class EjemploDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Imprimir del 0 al 10
        int num = 0;
        do {
            System.out.println(num);
            num++;

        } while (num <= 10);

        System.out.println("El primer bucle terminó");

        //Imprimir del 20 al 0
        num = 20;
        do {
            System.out.println(num);
            num--;
        } while (num >= 0);

        System.out.println("El segundo bucle terminó");

        //Imprimir del 50 al 70 de 3 en 3
        num = 50;
        do {
            System.out.println(num);
            num += 3;

        } while (num < 70);

        System.out.println("El tercer bucle terminó");

        //Pide un número entre 100 y 200
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca un número entre 100 y 200");
            num = sc.nextInt();
        } while (num < 100 || num > 200);

        System.out.println("Fin del cuarto y último bucle");
    }

}
