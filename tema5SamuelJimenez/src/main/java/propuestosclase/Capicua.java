/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuestosclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Capicua {

    /*
    1 - leer por teclado un entero
    2 - Decir si es capicua o no
        2.1 - De int a String
        2.2 - De String a array de char[]
        2.3 - Recorrer de delante a atrás y de atrás a delante
     */
    
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String mensaje = "Introduzca un número entero por favor";
        int num = pedirIntConsola(mensaje);
        String numTxt = String.valueOf(num);

        char[] array = numTxt.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i] = numTxt.charAt(i);
        }

        boolean capicua = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[(array.length - 1) - i]) {
                capicua = false;
                break;
            } else {
                capicua = true;
            }

        }
        String resultado = capicua ? "El número " + num + " es capicua" : "El número " + num + " no es capicua";
        System.out.println(resultado);

    }

    public static int pedirIntConsola(String mensaje) {
        int num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");
            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número por favor");
                sc.nextLine();
            }

        } while (true);
        return num;
    }

}
