/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5f;

import java.util.ArrayList;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ParteB {

    /*
    Crea una clase ParteB donde haya la misma funcionalidad pero hay que tener en cuenta que en este caso no hay duplicados y los soldados están ordenados según su nif.
     */
    public static void main(String[] args) {
        //---
        EjercitoOrdenado ejercito = new EjercitoOrdenado();
        //--- 2 - Alistar un soldado
        ejercito.alistarSoldado(new Soldado("1234", "Obi", "Wan", "Kenobi", 0));
        ejercito.alistarSoldado(new Soldado("4567", "Han", "Solo", "", 0));
        ejercito.alistarSoldado(new Soldado("1478", "Anakin", "Skywalker", "Amidala", 0));
        ejercito.alistarSoldado(new Soldado("9874", "Droide", "R2-D2", "", 0));
        ejercito.alistarSoldado(new Soldado("4321", "Leia", "Organa", "Amidala", 0));
        //--- 1 - Saber el número de soldados que hay
        int numEfectivos = ejercito.conteoSoldados();
        System.out.println("Nuestro ejercito tiene " + numEfectivos + " soldados.");
        System.out.println("-----");
        //--- 3 - Saber si el ejército no tiene soldados
        System.out.println("-----");
        String estado = ejercito.ejercitoVacio();
        System.out.println(estado);
        //--- 4 - Saber si un soldado está en el ejército
        System.out.println("-----");
        String resultado = ejercito.buscarSoldado("1234");
        System.out.println(resultado);
        //--- 5 - Sacar todos los soldados en forma de ArrayList
        System.out.println("-----");
        ArrayList<Soldado> efectivos = ejercito.imprimirEjercito();
        efectivos.forEach(System.out::println);
        //--- 6 - Desmatricular a un soldado del ejército
        System.out.println("-----");
        resultado = ejercito.licenciarSoldado("1234");
        System.out.println(resultado);
        //--- Volvemos a imprimir el ejercito para comprobar que realmente hemos licenciado a Obi Wan
        System.out.println("-----");
        efectivos = ejercito.imprimirEjercito();
        efectivos.forEach(System.out::println);

    }

}
