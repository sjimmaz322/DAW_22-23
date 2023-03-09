/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoclase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author samuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        Jugador j1 = new Jugador("Samuel", 13);
        Jugador j2 = new Jugador("Nacho", 69);
        Jugador j3 = new Jugador("Victoria", 42);
        Jugador j4 = new Jugador("Jess", 7);
        //---
        Map<Jugador, Integer> map1 = new TreeMap<>();
        //---
        map1.put(j1, j1.dorsal());
        map1.put(j2, j2.dorsal());
        map1.put(j3, j3.dorsal());
        map1.put(j4, j4.dorsal());
        //---
        //--- for para imprimir todo junto
        for (Map.Entry<Jugador, Integer> entry : map1.entrySet()) {
            Jugador key = entry.getKey();
            Integer val = entry.getValue();
            //---
            System.out.println("El jugador " + key.nombre() + " tiene el dorsal " + val);
        }
        //---
        List<Jugador> listaJug = new ArrayList<>();
        //---
        listaJug.add(j1);
        listaJug.add(j2);
        listaJug.add(j3);
        listaJug.add(j4);
        //---
        Collections.sort(listaJug);
        System.out.println("\nOrdenamos por dorsal usando comparator");
        listaJug.forEach(j -> System.out.println("El dorsal es : " + j.dorsal()));
        //---
        //--- Comparator<Jugador> criterioNombre = (ju1, ju2) -> ju1.nombre().compareToIgnoreCase(ju2.nombre());
        //---Collections.sort(listaJug, criterioNombre);//--- Donde está criterioNombre podemos poner directamente la expresión lambda
        Collections.sort(listaJug, (jug1, jug2) -> jug1.nombre().compareToIgnoreCase(jug2.nombre())); //--- La mejor opción
        //---
        System.out.println("\nOrdenamos por nombre usando comparator");
        listaJug.forEach(j -> System.out.println("El nombre del jugador es : " + j.nombre()));
        //---
        /*
        Cuando implementas una Interface, esa clase es de tipo Object, de su propio tipo y del tipo de la Interface
         */
        //---
    }

}
