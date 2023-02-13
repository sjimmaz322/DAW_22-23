/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Programador();
        Persona p2 = new Empleado();
        Persona p3 = new Persona();
        //---
        System.out.println(p1.toString());
        System.out.println("-----");
        System.out.println(p2.toString());
        System.out.println("-----");
        System.out.println(p3.toString());
        System.out.println("-----");
        //---
    }

}
