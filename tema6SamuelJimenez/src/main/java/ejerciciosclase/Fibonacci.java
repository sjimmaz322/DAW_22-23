/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca el número del que desea calcular la serie de Fibonacci");
        int num = sc.nextInt();
        //---
        ArrayList<Integer> lista = fibonacciIterativo(num);
        //---
        System.out.println("\nImprimimos la lista hasta el fibonacci de " + num);
        //--- lista.forEach(System.out::println);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("El f(" + i + ") es " + lista.get(i));
        }
        //---
        int resultFibo = fibonacciRecursivo(num);
        System.out.println("\nImprimimos el resultado recursivo de Fibonacci de " + num);
        System.out.println(resultFibo);
    }

    private static ArrayList<Integer> fibonacciIterativo(int n) {
        ArrayList<Integer> fibo = new ArrayList<>();
        //---
        int num = Math.abs(n);
        //---
        for (int i = 0; i <= num; i++) {
            switch (i) {
                case 0 ->
                    fibo.add(0);
                case 1 ->
                    fibo.add(1);
                default ->
                    fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
            }
        }
        System.out.println("El f(" + num + ") es " + fibo.get(n));
        return fibo;
    }

    private static int fibonacciRecursivo(int n) {
        int num = Math.abs(n);
        //---
        if (num < 2) {//Caso base para 0 o 1
            return n;
            //---
        } else {
            return (fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2));//Da vueltas restando hasta llegar al caso base 0 y luego va sumando en el ciclo pasivo
        }

    }

}
