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
        Casa c1 = new Casa();
        c1.setDireccion("Elm Street");
        System.out.println(c1);
        c1.getCalefactor().encender();
        c1.getCalefactor().setTemperatura(25);
        System.out.println(c1);
    }

}
