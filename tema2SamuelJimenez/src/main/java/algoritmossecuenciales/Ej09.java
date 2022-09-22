/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double IVA = 21.0 / 100.0;

        double precioArtículo, precioFinal;

        System.out.println("Introduzca el precio base del artículo");
        precioArtículo = sc.nextDouble();

        precioFinal = precioArtículo + (precioArtículo * IVA);

        System.out.println("El precio base del artículo es " + precioArtículo + "€, aplicándole un 21% de IVA el precio final será de " + precioFinal + "€");
    }

}
