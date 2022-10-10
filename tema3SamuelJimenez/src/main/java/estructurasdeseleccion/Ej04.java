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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        String resultado = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";

        System.out.println(resultado);
    }

}
