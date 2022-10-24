/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosclase;

import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class CodigoVideoIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.println("Introduza su nombre");
        nombre = sc.next();

        if (nombre.toLowerCase().contains("m")) {
            System.out.println("El nombre contiene la M");
            if (nombre.length() < 8) {
                System.out.println("El nombre " + nombre + " es corto");
            }
            if (nombre.length() >= 8) {
                System.out.println("El nombre " + nombre + " es largo");
            }
        } else {
            System.out.println("El nombre no contiene la M");
        }
    }

}
