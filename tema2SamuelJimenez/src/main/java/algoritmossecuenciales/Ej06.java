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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double suma, inversion1, inversion2, inversion3, porcentaje1, porcentaje2, porcentaje3;
        final int PERCENT = 100;
        
        System.out.println("Introduza la cantidad aportada por el sujeto 1");
        inversion1 = sc.nextDouble();
        System.out.println("Introduza la cantidad aportada por el sujeto 2");
        inversion2 = sc.nextDouble();
        System.out.println("Introduza la cantidad aportada por el sujeto 3");
        inversion3 = sc.nextDouble();
        
        suma = inversion1+inversion2+inversion3;
        
        porcentaje1 = (inversion1*PERCENT)/suma;
        porcentaje2 = (inversion2*PERCENT)/suma;
        porcentaje3 = (inversion3*PERCENT)/suma;
        
        System.out.println("El sujeto 1 aporta "+inversion1+"€, siendo el "+porcentaje1+"% del total de "+suma);
        System.out.println("El sujeto 1 aporta "+inversion2+"€, siendo el "+porcentaje2+"% del total de "+suma);
        System.out.println("El sujeto 1 aporta "+inversion3+"€, siendo el "+porcentaje3+"% del total de "+suma);


    }
    
}
