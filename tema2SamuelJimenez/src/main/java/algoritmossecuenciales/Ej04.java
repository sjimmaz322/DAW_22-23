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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final double PRECIOFIJO = 125, PRECIOKM = 8, CENTIMOSENEURO = 100;
        
        double kmRecorridos, preciofinal;
        
        System.out.println("Introduzca los kilómetros a recorrer");
        kmRecorridos = sc.nextDouble();
        
        preciofinal = ((PRECIOFIJO+(PRECIOKM*kmRecorridos))/CENTIMOSENEURO);
        
        System.out.println("El presupuesto del viaje es de "+preciofinal+"€");
    }
    
}
