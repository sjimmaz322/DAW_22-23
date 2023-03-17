/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendesfibriladoresycoros;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ej3 {

    public static void main(String[] args) {
        //--- Creamos nuestra lista de Voz en este caso de 30 elementos
        List<Ej3Voz> lista = Ej3Coro.generarVoces(30);

        /*
        
        Hacemos una lista para hacer pruebas de nuestros métodos
        
        List<Voz> listaPrueba = new ArrayList<>();
        
        listaPrueba.add(Ej3Voz.BARITONO);
        listaPrueba.add(Ej3Voz.CONTRALTO);
        listaPrueba.add(Ej3Voz.CONTRATENOR);
        listaPrueba.add(Ej3Voz.MEZZOSOPRANO);
        listaPrueba.add(Ej3Voz.SOPRANO);
        listaPrueba.add(Ej3Voz.TENOR);
        
        listaPrueba.add(Ej3Voz.BARITONO);
        listaPrueba.add(Ej3Voz.CONTRALTO);
        listaPrueba.add(Ej3Voz.CONTRATENOR);
        listaPrueba.add(Ej3Voz.MEZZOSOPRANO);
        listaPrueba.add(Ej3Voz.SOPRANO);
        listaPrueba.add(Ej3Voz.TENOR);
        
        listaPrueba.add(Ej3Voz.BARITONO);
        listaPrueba.add(Ej3Voz.CONTRALTO);
        listaPrueba.add(Ej3Voz.CONTRATENOR);
        listaPrueba.add(Ej3Voz.MEZZOSOPRANO);
        listaPrueba.add(Ej3Voz.SOPRANO);
        listaPrueba.add(Ej3Voz.TENOR);
         */
        //--- Ordenamos la lista para que sea más fácil ver cuantas hay de cada tipo de Voz
        Collections.sort(lista);
        //--- Mostramos la lista
        lista.forEach(System.out::println);
        //--- Creamos una separación por estética
        System.out.println("\n----------\n");
        //--- Guardamos el número de coros mixtos que podemos crear en una variable
        int numCorosMixtos = Ej3Coro.getNumeroCorosMixtos(lista);
        //--- Mostramos cuantos coros mixtos podemos crear
        System.out.println("El número de coros mixtos que podemos formar es: " + numCorosMixtos);
        //--- Creamos otra separación por estética
        System.out.println("\n----------\n");
        //--- Creamos un Map para guardar el resultado de nuestro método para buscar las voces más repetidas
        Set<Ej3Voz> mapi = Ej3Coro.buscarVozMasRepetida(lista);
        //--- Por cada Entry mostramos por consola
        mapi.forEach(System.out::println);
    }
}
