/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendesfibriladoresycoros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author samuel
 */
public class Ej1 {

    public static void main(String[] args) {
        //--- Usando el método de la clase dada por Vico obtenemos
        Desfibrilador[] prueba = UtilesDesfibrilador.getDesfibriladores();
        //--- Con nuestro método personal pasamos el Array a un Set
        Set<Desfibrilador> grupoDes = agrupadorDesfibriladores(prueba);
        //--- Mostramos cada elemento de la lista
        grupoDes.forEach(System.out::println);
        //--- Dejamos una linea en blanco por estética
        System.out.println("\n");
        //--- Convertimos el Set en un Map<String, Desfibrilador> con nuestro método personal
        Map<String, Desfibrilador> mapDesfibriladores = mapeoDesfibriladores(grupoDes);
        //---
        for (Map.Entry<String, Desfibrilador> entry : mapDesfibriladores.entrySet()) {
            String key = entry.getKey();
            Desfibrilador val = entry.getValue();
            //--- Mostramos cada uno de los pares del Map
            System.out.println("La id es " + key + " asociada al desfibrilador " + val);
            //---
        }

    }

    private static Set<Desfibrilador> agrupadorDesfibriladores(Desfibrilador[] arrayDes) {
        //--- Creamos una lista de desfibriladores
        List<Desfibrilador> listado = new ArrayList<>();
        //--- Añadimos todos los elementos del Array a la lista que creamos
        listado.addAll(Arrays.asList(arrayDes));
        //--- Usando un casting explícito pasamos directamente la lista a un Set
        Set<Desfibrilador> grupo = new TreeSet<>(listado);
        //--- Devolvemos el Set
        return grupo;

    }

    private static Map<String, Desfibrilador> mapeoDesfibriladores(Set<Desfibrilador> setDes) {
        //--- Creamos un map para devolverlo al final
        Map<String, Desfibrilador> mapDes = new TreeMap<>();
        //--- Por cada registro del Set creamos un Iterator con la id del Desfibrilador y como value el propio Desfibrilador
        for (Iterator<Desfibrilador> iterator = setDes.iterator(); iterator.hasNext();) {
            Desfibrilador next = iterator.next();
            mapDes.put(next.getId(), next);

        }
        //--- Devolvemos el Map
        return mapDes;

    }
}
