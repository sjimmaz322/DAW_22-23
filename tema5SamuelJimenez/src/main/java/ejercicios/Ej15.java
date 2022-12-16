/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lanzamonedas lanzadora = new Lanzamonedas();
        //--
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
