/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraderepeticion;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej03 {

    /*
    Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. No se introducen valores por teclado.
     */
    public static void main(String[] args) {

        final int LIMITEREPETICIONES = 25;
        int contador = 1, numero = 15;

        do {
            System.out.println(numero);
            numero *= 2;
            contador++;

        } while (contador <= LIMITEREPETICIONES);

        contador = 1;
        numero = 15;

        for (int i = contador; i <= LIMITEREPETICIONES; i++) {
            System.out.println(numero);
            numero *= 2;
        }
    }

}
