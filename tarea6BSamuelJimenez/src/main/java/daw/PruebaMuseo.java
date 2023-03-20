/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class PruebaMuseo {

    /*
    Crea una clase con un método main. 
    Crea un museo, añade una sala fija con un cuadro y otra sala fija con una escultura.
    Crea un conjunto de obras únicas con todas las obras que haya en el museo (en este ejemplo habrá 2).
    Contrata a dos conservadores, uno escultórico y otro pictórico. 
    Realiza la restauración de las obras del museo por parte del conservador pictórico.
     */
    public static void main(String[] args) {
        //---
        List<Empleado> listaTrabajadores = new ArrayList<>();
        //---
        Empleado e1 = new Escultorico("1234", "3258", "Rompetechos");
        Empleado e2 = new Pictorico("7896", "1234", "Mr. Bean");
        //---
        List<Sala> salasMuseo = new ArrayList<>();
        //---
        List<Obra> listaObras1 = new ArrayList<>();
        List<Obra> listaObras2 = new ArrayList<>();
        //---
        Obra o1 = new Cuadro("Renacentista", "El manteca perdido", 1, "Munch");
        Obra o2 = new Escultura("Plomo", 2, "Da Vinci");
        //---
        Set<Obra> conjuntoObras = new HashSet<>();
        //---
        listaObras1.add(o1);
        listaObras2.add(o2);
        conjuntoObras.add(o1);
        conjuntoObras.add(o2);
        //
        Sala s1 = new Fija("Abierta", "Pequeños artistas", 1, listaObras1, new Humedad(35, 25, 1), new Temperatura(25, 15, 1));
        Sala s2 = new Temporal(LocalDate.now(), LocalDate.now().plusYears(1), "Grandes artistas", 2, listaObras2, new Humedad(35, 25, 2), new Temperatura(25, 15, 2));
        //---
        Museo museo1 = new Museo("El Pouvre", "Calle Falsa 123", salasMuseo, listaTrabajadores);
        //---
        museo1.aniadirSala(s1);
        museo1.aniadirSala(s2);
        //---
        museo1.contratar(e1);
        museo1.contratar(e2);
        //---
        System.out.println("\nImprimimos la obra antes de la restauración, su numRestauraciones debería ser 0");
        System.out.println(o1);
        //---
        ((Pictorico) e2).restaurarObra(o1);
        //---
        System.out.println("\nImprimimos la obra después de la restauración, su numRestauraciones debería ser 1");
        System.out.println(o1);
        //---
        System.out.println("");
        ((Pictorico) e2).restaurarObra(o2);
        //---
        System.out.println("");
        conjuntoObras.forEach(System.out::println);
    }

}
