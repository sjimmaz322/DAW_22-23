/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El fibonacci de 9");
        ArrayList<Integer> lista = fibonacciIterativo(9);
        System.out.println("Imprimimos la lista hasta el fibonacci de 9");
        lista.forEach(System.out::println);
        int resultFibo = fibonacciRecursivo(9);
        System.out.println("-----");
        System.out.println(resultFibo);
    }
    
    private static ArrayList<Integer> fibonacciIterativo(int n) {
        ArrayList<Integer> fibo = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            switch (i) {
                case 0:
                    fibo.add(0);
                    break;
                case 1:
                    fibo.add(1);
                    break;
                default:
                    fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
                    break;
            }
        }
        System.out.println("El f(" + n + ") es " + fibo.get(n));
        return fibo;
    }
    
    private static int fibonacciRecursivo(int n) {
        
        if (n == 0) {//Caso base para 0
            return 0;
        }
        
        if (n == 1) {//Caso base para 1
            return 1;
        } else {
            return (fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2));//Da vueltas restando hasta llegar al caso base 1 y luego va sumando
        }
        
    }
    
}
