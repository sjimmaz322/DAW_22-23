/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import ejercicio1.Docente;
import static ejercicio3.Ejercicio3.leerFichero;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Docente> listaDocentes = leerFichero("RelEmpCenAus", "csv", ",");

        listaDocentes.stream()
                .map(d -> d.getPuestoTrabajo())
                .distinct()
                .forEach(System.out::println);

        long numTrabajadores = listaDocentes.stream()
                .filter(d -> d.isActivo() == true)
                .map(d -> d.getNombre())
                .distinct()
                .count();

        System.out.println("Hay " + numTrabajadores + " trabajadores en el centro.");
        Comparator<Docente> criterioDNI = (d1, d2) -> d1.getDni().compareToIgnoreCase(d2.getDni());

        List<String> listaDnis = listaDocentes.stream()
                .filter(d -> d.isActivo() == false)
                .map(d -> d.getDni())
                .distinct()
                .sorted()
                .toList();

        listaDnis.forEach(System.out::println);

    }

}
