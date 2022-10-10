/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraderepeticion;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {//Imprime desde el 1 hasta el 10 en diferentes lineas
            System.out.println("Número: " + numero);
            numero++;
        }
        do {//Imprime desde el 10 hasta el 1 en diferentes lineas
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }

}
