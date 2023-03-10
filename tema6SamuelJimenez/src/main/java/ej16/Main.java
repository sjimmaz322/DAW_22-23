/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Main {

    /*
    16.- Se desea manejar una lista de tamaño variable de Robots. Cada robot tiene un número de serie (int) y un porcentaje de vida (un valor aleatorio entre 1 y 100). Se pide construir una aplicación que permita cumplir con la siguiente funcionalidad:
    Crear una lista con 20 robots, creados aleatoriamente.
    Imprimir la lista de robots ordenada por porcentaje de vida de los robots. Al principio de la lista DEBEN estar los robots con menos porcentaje de vida. 
    Imprimir la cantidad de robots que tienen más del 50% de vida. 
    Imprimir el número de serie de los TRES robots que tienen mayor porcentaje de vida. 
    Además, debe ser posible ordenar los robots por número de serie.
    Una vez ordenada la lista por número de serie, realizar búsqueda binaria de algún robot dentro de la lista.

     */
    public static void main(String[] args) {

        List<Robot> listaRoboces = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Robot r = new Robot();
            listaRoboces.add(r);
        }

        Comparator<Robot> criterioBateria = (r1, r2) -> Integer.compare(r1.getNivelBateria(), r2.getNivelBateria());
        Collections.sort(listaRoboces, criterioBateria);

        listaRoboces.forEach(System.out::println);

        List<Robot> listaRobocesCargados = new ArrayList<>();

        for (Robot r : listaRoboces) {
            if (r.getNivelBateria() > 50) {
                listaRobocesCargados.add(r);
            }
        }
        System.out.println("\nImprimimos los robots con más de 50% de batería");
        listaRobocesCargados.forEach(System.out::println);

    }

}
