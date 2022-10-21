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
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        //Inicialización de la variable de control
//        int numero = 0;
//
//        //Condición del bucle
//        //Mientras la condición sea cierta se repite
//        while (numero <= 10) {
//            //Siempre dentro del bucle hay que actualizar la variable de control
//            System.out.println(numero);//Código de función
//            numero++;//Actualización de variable
//
//        }
//
//        System.out.println("El bucle ha terminado");
//
//        numero = 20;
//
//        while (numero >= 0) {
//            System.out.println(numero);
//            numero--;
//        }
//        System.out.println("El segundo bucle ha terminado");
//
//        //Del 50 al 70 de 3 en 3
//        numero = 50;
//        while (numero <= 70) {
//            System.out.println(numero);
//            numero += 3;
//
//        }
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (Entre 100 y 200)");
        num = sc.nextInt();
        while (!(num >= 100 && num <= 200)) {
            System.out.println("Entre 100 y 200 ANIMAL!!!");
            num = sc.nextInt();
        }

    }

}
