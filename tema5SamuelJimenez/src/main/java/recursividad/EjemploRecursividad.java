/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author samuel
 */
public class EjemploRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        recursion(5);
        //---
        System.out.println("Imprimimos el factorial iterativo");
        factorial(5);
        //---
        System.out.println("Imprimimos el factorial recursivo");
        int numero = factorialRecursivo(5);
        System.out.println(numero);
        //---
    }

    public static void recursion(int n) {
        if (n > 0) {//--- Caso Base
            recursion(n - 1);//--- Ciclo activo
        }

        System.out.println(n);
    }

    public static void factorial(int n) {
        int num = 0;
        for (int i = n; i >= 0; i--) {
            num += n * (n - 1);
        }
        System.out.println(num);

    }

    public static int factorialRecursivo(int n) {

        n = Math.abs(n);

        if (n == 0 || n == 1) {//--- Caso base
            return 1;
        } else {
            return n * factorialRecursivo(n - 1); //--- Ciclo activo
        }
    }

}
