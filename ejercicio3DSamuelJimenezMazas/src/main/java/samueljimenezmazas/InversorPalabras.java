/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samueljimenezmazas;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class InversorPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Introducimos una palabra por teclado mientras ponga "salir".
        Leer una palabra y el programa tiene que crear una palabra con la palabra al revés.
         */
        Scanner sc = new Scanner(System.in);
        String palabra, palabraInversa;
        final String CONDICION_SALIDA = "salir";
        char letra;

        do {
            palabraInversa = " ";

            System.out.println("Introduzca la palabra que desea invertir o escriba 'Salir' para salir");
            palabra = sc.nextLine();
            if (!palabra.equalsIgnoreCase(CONDICION_SALIDA)) {
                for (int i = palabra.length() - 1; i >= 0; i--) {
                    letra = palabra.charAt(i);
                    palabraInversa = palabraInversa + letra;
                }
                System.out.println("El inverso de " + palabra + " es " + palabraInversa);
            }
        } while (!palabra.equalsIgnoreCase(CONDICION_SALIDA));

    }

}
