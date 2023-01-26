/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5f;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ParteA {

    /*
    Aplica lo estudiado para realizar una nueva clase llamada ParteA, que contenga un número de soldados N.
    El constructor debe inicializar la estructura SET (no hay soldados duplicados y el orden no importa).
    Debe haber métodos para:
    1. Saber el número de soldados que hay.
    2. Alistar a un solado.
    3. Saber si el ejército no tiene soldados.
    4. Saber si un soldado está en el ejército.
    5. Sacar todos los soldados, en forma de ArrayList.
    6. Desmatricular a un soldado del ejército.
     */
    public static void main(String[] args) {

        //--- Creamos la lista desordenada que será nuestro ejército, y una extra para comprobar métodos
        Ejercito ejercito = new Ejercito();
        Ejercito ejercito2 = new Ejercito();

        //--- Creamos 5 soldados y los añadimos a la lista directamente
        ejercito.alistarSoldado(new Soldado("1234", "Obi", "Wan", "Kenobi", 0));
        ejercito.alistarSoldado(new Soldado("4567", "Han", "Solo", "", 0));
        ejercito.alistarSoldado(new Soldado("1478", "Anakin", "Skywalker", "Amidala", 0));
        ejercito.alistarSoldado(new Soldado("9874", "Droide", "R2", "D2", 0));
        ejercito.alistarSoldado(new Soldado("4321", "Leia", "Organa", "Amidala", 0));
        //--- Contamos cuantos efectivos tiene nuestro ejército
        int efectivos = ejercito.conteoSoldados();
        System.out.println("-----");
        System.out.println("Nuestro ejército cuenta con " + efectivos + " soldados.");
        //--- Alistamos al nuevo recluta
        // alistarSoldado(ejercito);
        //--- Comprobamos que el soldado ha sido alistado realmente
        efectivos = ejercito.conteoSoldados();
        System.out.println("-----");
        System.out.println("Nuestro ejército cuenta con " + efectivos + " soldados.");
        //--- Comprobamos si el ejército está vacio
        String resultado = ejercito.ejercitoVacio();
        System.out.println("-----");
        System.out.println("Estado del primer ejército");
        System.out.println(resultado);
        //---
        System.out.println("-----");
        System.out.println("Estado del segundo ejército");
        resultado = ejercito2.ejercitoVacio();
        System.out.println(resultado);
        System.out.println("-----");
        //--- Buscamos un soldado que si esté y otro que no
        resultado = ejercito.buscarSoldado("1234");
        System.out.println("El soldado con dni 1234 :" + resultado);
        //---
        System.out.println("-----");
        resultado = ejercito.buscarSoldado("9999");
        System.out.println("El soldado con dni 9999 :" + resultado);
        //--- Metemos todo nuestro ejército en una lista
        ArrayList<Soldado> listado = ejercito.imprimirEjercito();
        System.out.println("-----");
        listado.forEach(System.out::println);
        //--- Licenciamos con honores al soldado con el DNI 1234
        ejercito.licenciarSoldado("1234");
        System.out.println("-----");
        //--- Imprimimos de nuevo el ejército para ver que Obi Wan ya no está
        listado = ejercito.imprimirEjercito();
        listado.forEach(System.out::println);
    }

}
