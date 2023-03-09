/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovuelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
        List<Pasajero> lista1 = new ArrayList<>();
        List<Pasajero> lista2 = new ArrayList<>();
        List<Pasajero> lista3 = new ArrayList<>();
        List<Pasajero> lista4 = new ArrayList<>();
        //---
        Pasajero p1 = new Pasajero("Samuel", "Jiménez", "47896512Ñ", TipoPasajero.STANDARD);
        Pasajero p2 = new Pasajero("Nacho", "Salcedo", "14578965K", TipoPasajero.VIP);
        Pasajero p3 = new Pasajero("Victoria", "Sampalo", "24587965M", TipoPasajero.VIP);
        Pasajero p4 = new Pasajero("José Ángel", "Marín", "879654125", TipoPasajero.STANDARD);
        Pasajero p5 = new Pasajero("Cristina", "Hernández", "32145879T", TipoPasajero.STANDARD);
        Pasajero p6 = new Pasajero("Jessica", "Macioszek", "X78451258B", TipoPasajero.VIP);
        //---
        lista1.add(p1);
        lista1.add(p3);
        lista1.add(p5);
        lista1.add(p6);
        //---
        lista2.add(p2);
        lista2.add(p4);
        lista2.add(p6);
        //---
        lista3.add(p1);
        lista3.add(p2);
        lista3.add(p3);
        //---
        lista4.add(p4);
        lista4.add(p5);
        lista4.add(p6);
        //---
        Vuelo v1 = new Vuelo(1, "Málaga", "Osaka", 0, lista1);
        Vuelo v2 = new Vuelo(2, "Cambridge", "Amsterdam", 0, lista2);
        Vuelo v3 = new Vuelo(3, "Berlin", "Dublin", 0, lista3);
        Vuelo v4 = new Vuelo(4, "Roma", "Moscú", 0, lista4);
        Vuelo v5 = new Vuelo(5, "Osaka", "Samoa", 0, lista2);
        Vuelo v6 = new Vuelo(6, "Cuba", "Madrid", 0, lista4);
        Vuelo v7 = new Vuelo(6, "Osaka", "Madrid", 0, lista1);
        Vuelo v8 = new Vuelo(6, "Osaka", "Madrid", 0, lista2);
        //---
        List<Vuelo> listadoVuelos = new ArrayList<>();
        //---
        listadoVuelos.add(v1);
        listadoVuelos.add(v2);
        listadoVuelos.add(v3);
        listadoVuelos.add(v4);
        listadoVuelos.add(v5);
        listadoVuelos.add(v6);
        listadoVuelos.add(v7);
        listadoVuelos.add(v8);
        //---
        Map<String, Integer> listadoLlegadas = registroLlegadas(listadoVuelos);
        //---
        Set<String> destinos = listadoLlegadas.keySet();
        Collection<Integer> numPasajeros = listadoLlegadas.values();
        //---
        destinos.forEach(System.out::println);
        numPasajeros.forEach(System.out::println);
        //---
        System.out.println("-----");
        //---
        Map<Integer, Set<Pasajero>> conjunto = conjuntoPasajeros(listadoVuelos);
        //---
        Set<Integer> codes = conjunto.keySet();
        Collection<Set<Pasajero>> pasaj = conjunto.values();
        //---
        codes.forEach(System.out::println);
        pasaj.forEach(System.out::println);
    }

    private static Map<String, Integer> registroLlegadas(List<Vuelo> lista) {
        Map<String, Integer> aux = new HashMap<>();

        for (int i = 0; i < lista.size(); i++) {

            if (aux.containsKey(lista.get(i).getDestino())) {

                aux.put(lista.get(i).getDestino(), // Seleccionamos el destino del vuelo actual
                        aux.get(lista.get(i).getDestino()) // Seleccionamos el value ya asociado con esa key
                        + lista.get(i).getListadoPasajeros().size()); // Sumamos al value los pasajeros del vuelo actual

            } else {

                aux.put(lista.get(i).getDestino(), lista.get(i).getListadoPasajeros().size());

            }

        }
        return aux;
    }

    //A partir la lista de vuelos que guarde para cada codVuelo el conjunto de pasajeros.
    private static Map<Integer, Set<Pasajero>> conjuntoPasajeros(List<Vuelo> lista) {
        Map<Integer, Set<Pasajero>> aux = new TreeMap<>();
        //---
        for (Vuelo v : lista) {
            //--- Así pasamos directamente la lista de pasajeros a un TreeSet
            Set<Pasajero> setPas = new TreeSet<>(v.getListadoPasajeros());
            /*
            Ya no hace falta el for
            for (int i = 0; i < v.getListadoPasajeros().size(); i++) {
                setPas.add(v.getListadoPasajeros().get(i));
            }
             */
            aux.put(v.getCodVuelo(), setPas);
        }
        return aux;

    }

}
