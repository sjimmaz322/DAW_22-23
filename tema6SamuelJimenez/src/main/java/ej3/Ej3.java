/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado p1 = new Programador();
        Empleado p2 = new Jardinere();
        Persona p3 = new Persona();
        //---
        System.out.println(p1.toString());
        System.out.println("-----");
        System.out.println(p2.toString());
        System.out.println("-----");
        System.out.println(p3.toString());
        System.out.println("-----");
        //---
        Empleado p4 = new Jardinere(5, 100, "A", "B", 0);
        Empleado p5 = new Jardinere(1, 100, "C", "D", 0);
        Empleado p6 = new Jardinere(4, 100, "E", "F", 0);
        //---
        Set<Empleado> lista = new TreeSet<>();
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        //---
        lista.forEach(System.out::println);
        //---
    }

}
