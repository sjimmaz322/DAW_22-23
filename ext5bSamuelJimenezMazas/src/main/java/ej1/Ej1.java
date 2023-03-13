/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Desfibrilador[] prueba = UtilesDesfibrilador.getDesfibriladores();
        //---
        Set<Desfibrilador> grupoDes = agrupadorDesfibriladores(prueba);
        //---
        grupoDes.forEach(System.out::println);
        //---
        System.out.println("\n");
        //---
        Map<String, Desfibrilador> mapDesfibriladores = mapeoDesfibriladores(grupoDes);
        //---
        for (Map.Entry<String, Desfibrilador> entry : mapDesfibriladores.entrySet()) {
            String key = entry.getKey();
            Desfibrilador val = entry.getValue();
            //---
            System.out.println("La id es " + key + " asociada al desfibrilador " + val);
            //---
        }

    }

    private static Set<Desfibrilador> agrupadorDesfibriladores(Desfibrilador[] arrayDes) {
        List<Desfibrilador> listado = new ArrayList<>();

        listado.addAll(Arrays.asList(arrayDes));

        Set<Desfibrilador> grupo = new TreeSet<>(listado);

        return grupo;

    }

    private static Map<String, Desfibrilador> mapeoDesfibriladores(Set<Desfibrilador> setDes) {

        Map<String, Desfibrilador> mapDes = new TreeMap<>();

        Iterator<Desfibrilador> it = setDes.iterator();

        while (it.hasNext()) {

            Desfibrilador d1 = it.next();
            mapDes.put(d1.getId(), d1);
        }

        return mapDes;

    }

}
