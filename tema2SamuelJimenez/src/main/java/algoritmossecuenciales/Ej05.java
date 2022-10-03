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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final int HORASCLASE = 30;
        int horasImpartidas, grupos, profesores;
        
        //HORASCLASE*GRUPOS/HORASIMPARTIDAS = PROFESORES.
        
        System.out.println("Introduzca las horas que impartirá cada profesor");
        horasImpartidas = sc.nextInt();
        System.out.println("Introduzca cuantos grupos tiene el centro");
        grupos = sc.nextInt();
        
        profesores = (HORASCLASE*grupos)/horasImpartidas;
        
        System.out.println("Para este centro harán falta "+ (int)Math.ceil(profesores) + " profesores.");
        
        
        //Hacemos la opción de JOptionPane
        
        
        
        
    }
    
}
