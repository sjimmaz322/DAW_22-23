/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casa c1 = new Casa("Elm Street");
        //---
        c1.getListaVentanas().add(new Ventana("cerrada"));
        c1.getListaVentanas().add(new Abatible(120, "cerrada"));
        c1.getListaVentanas().add(new Corredera(2, "cerrada"));
        //---
        c1.getListaCalefactores().add(new Calefactor("encendido", 28));
        //---
        System.out.println(c1);
        //---
        for (int i = 0; i < c1.getListaVentanas().size(); i++) {
            c1.getListaVentanas().get(i).abrir();
            System.out.println("---");
            c1.getListaVentanas().get(i).cerrar();
            System.out.println("\n");
        }
       
    }

}
