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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, notaMedia;

        final float DIVISOR = 3.0f;

        System.out.println("Introduzca la primera nota");
        nota1 = sc.nextFloat();
        System.out.println("Introduzca la segunda nota");
        nota2 = sc.nextFloat();
        System.out.println("Introduzca la tercera nota");
        nota3 = sc.nextFloat();
        
        notaMedia = (nota1+nota2+nota3)/DIVISOR;
        
        System.out.println("La media entre "+nota1+", "+nota2+" y "+nota3+" es "+notaMedia);
    }

}
