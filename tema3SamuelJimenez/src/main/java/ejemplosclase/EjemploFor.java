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
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Del 0 al 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Fin del primer bucle");
        System.out.println(" ");

        //Del 0 al 20 de 2 en 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Fin del segundo bucle");
        System.out.println(" ");

        //Del 20 al 0
        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Fin del tercer bucle");
        System.out.println(" ");

        //Del 50 al 70 de 3 en 3
        for (int i = 50; i < 70; i += 3) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Fin del cuarto bucle");
        System.out.println(" ");

        //Pedimos un número entre 100 y 200
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100 || i > 200; i = sc.nextInt()) {
            System.out.println("Introduce un número entre 100 y 200");
        }

        System.out.println(" ");
        System.out.println("Fin del último bucle");
        System.out.println(" ");
    }

}
