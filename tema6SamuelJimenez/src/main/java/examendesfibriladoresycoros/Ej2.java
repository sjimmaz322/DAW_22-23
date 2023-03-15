/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examendesfibriladoresycoros;

import java.util.List;
import java.util.Map;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej2 {

    /*
    EJ2 (2,5 puntos).- Crea una clase, llamada Ej2MapDesfibrilador, en el paquete ej2, que encapsule un objeto Map, inmutable, que tenga los siguientes métodos:
    (0,5 puntos) El constructor de la clase recibe un array de objetos Desfibrilador y un booleano. Guarda en los valores del map los objetos Desfibrilador, siendo la key de cada entrada el “id” del objeto a guardar. 
    Si el booleano es true, entonces la estructura debe mantener orden en las keys.
    (0,5 puntos) toString, que debe devolver por cada entrada del map una línea con la siguiente información: “id” -> “nombre” -> “email”. Este método debe implementarse usando el método keySet() del map.
    Por ejemplo: 		8304 -> DEA_251 -> registro2@emasa.es
			8309 -> DEA_250 -> registro@emasa.es
			…
    (0,25 puntos) A partir de un objeto Desfibrilador que se pasa como parámetro, saber si ese objeto ya está contenido en la estructura usando la key del mismo.
    (0,25 puntos)  Obtener y devolver un objeto List<Desfibrilador> con todos los valores del map.
    (0,75 puntos) Obtener el número de desfibriladores asociados a un correo electrónico. Devolverá una nueva estructura Map con la información anterior.
    Crea la clase Prueba (0,25 puntos), en ej2, para crear un objeto Ej2MapDesfibrilador y probar los métodos anteriores.
     */
    public static void main(String[] args) {
        Desfibrilador[] arrDes = UtilesDesfibrilador.getDesfibriladores();
        Ej2MapDesfibrilador map1 = new Ej2MapDesfibrilador(arrDes, true);
        //---
        Desfibrilador dAux = new Desfibrilador("8309", "DEA_250", "Camino Colmenar, 46", "registro@emasa.es", "683770062");
        //---
        System.out.println(map1.toString());
        //---
        System.out.println(map1.buscadorDesfibrilador(dAux));
        System.out.println("");
        //---
        List<Desfibrilador> lista = map1.listaDesfibriladores();
        lista.forEach(System.out::println);
        System.out.println("");
        //--
        Map<String, Integer> mapNumDes = map1.numDesfibriladoresAsociados();
        //---
        for (Map.Entry<String, Integer> entry : mapNumDes.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();

            System.out.println(key + " tiene asociados " + val + " desfibriladores.");
        }

    }

}
