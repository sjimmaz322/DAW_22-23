/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdeseleccion;

import java.util.Scanner;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class Ej02 {

    /*
    Utilizando el operador ternario ?: de Java, implementa las siguientes sentencias:
    A) Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se devolverá “menor”.
    Las cadenas que se devuelven se guardarán en una variable llamada resultado.
    B) Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá “Mayor que cero”.
    C) Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número con el cual trabajaremos");
        int num = sc.nextInt(), numeroAbsoluto;

        boolean sentencia1 = num >= 135;
        String resultado = sentencia1 ? "mayor" : "menor";
        System.out.println("El número " + num + " es " + resultado + " que 135.");

        boolean sentencia2 = num <= 0;
        resultado = sentencia2 ? "Menor que cero" : "Mayor que cero";
        System.out.println("El número " + num + " es " + resultado + ".");

        if (num >= 0) {
            numeroAbsoluto = num;
        } else {
            numeroAbsoluto = num * (-1);
        }
        System.out.println("El absoluto de " + num + " es " + numeroAbsoluto);
        int absoluto = (num >= 0) ? num : -(num);
        System.out.println("El absoluto de " + num + " es " + numeroAbsoluto);

    }

}
