/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //---
        System.out.println("Introduzca el número de lanzamientos a realizar");
        int lanzamientos = sc.nextInt();
        //---
        Lanzamonedas lanzadora = new Lanzamonedas(lanzamientos);
        //---
        lanzadora.rellenarArray();
        //---
        int caras = lanzadora.contarCaras();
        int cruz = lanzadora.contarCruces();
        //---
        System.out.println("De nuestras 1000 tiradas: " + caras + " han sido cara y " + cruz + " han sido cruz.");
        //---
        lanzadora.mostrarResultados();
    }

}
