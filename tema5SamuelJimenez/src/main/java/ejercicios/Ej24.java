/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        ListaReproduccion nuevaLista = new ListaReproduccion();
        //---
        Cancion c1 = new Cancion("Muerte a pellizcos", 165, "Rock melódico");
        Cancion c2 = new Cancion("No quiero currar", 245, "Balada");
        Cancion c3 = new Cancion("Mi cama y yo", 60, "Balada");
        //---
        String resultado = nuevaLista.estaVacia() ? "Vacia como mi corazón" : "Con cosas dentro";
        System.out.println("La lista está: " + resultado);
        //---
        nuevaLista.getCanciones().add(c1);
        nuevaLista.getCanciones().add(c2);
        nuevaLista.getCanciones().add(c3);
        //---
        resultado = nuevaLista.estaVacia() ? "Vacia como mi corazón" : "Con cosas dentro";
        System.out.println("La lista está: " + resultado);
        //---
        int numCanciones = nuevaLista.numeroCanciones();
        System.out.println("Hay " + numCanciones + " en la lista.");
        //---
        ListaReproduccion.imprimirCanciones(nuevaLista);
        //---
        nuevaLista.ordenarPorNombre();
        System.out.println(nuevaLista);
        //--
        nuevaLista.ordenarPorGenero();
        System.out.println(nuevaLista);
    }

}
