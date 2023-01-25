/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacionbusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author samuel
 */
public class OrdenacionBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EE.UU", 146, 1_500_400, "Dollar Americano"));
        paises.add(new Pais("Italia", 46, 505_400, "Euro"));
        paises.add(new Pais("Vietnam", 46, 505_400, "Euro"));
        //---
        paises.forEach(System.out::println);
        //---
        Collections.sort(paises); //--- Ordenación usando comparable
        System.out.println("\nOrdenamos por nombre");
        paises.forEach(System.out::println);
        //--- Ordenamos por Población
        Collections.sort(paises, (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion())); //---Ordenación mediante comparator
        System.out.println("\nOrdenamos por población");
        paises.forEach(System.out::println);
        //--- Ordenamos por moneda
        System.out.println("\nOrdenamos por moneda");
        Collections.sort(paises, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        paises.forEach(System.out::println);
        //--- Para ordenar al revés damos al punto y seleccinamos reverse.
        //--- Podemos crear los criterios aparte
        Comparator<Pais> criterioPoblacion = (p1, p2) -> (Long.compare(p1.getPoblacion(), p2.getPoblacion()));
        System.out.println("\nOrdenamos por población");
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        //---
        Collections.sort(paises, criterioPoblacion.reversed());
        paises.forEach(System.out::println);
        //--- 
        Comparator<Pais> criterioSuperficie = (p1, p2) -> (Long.compare(p1.getSuperficie(), p2.getSuperficie()));
        Comparator<Pais> criterioNombre = (p1, p2) -> (p1.getNombre().compareTo(p2.getNombre()));
        //---
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
    }

}
