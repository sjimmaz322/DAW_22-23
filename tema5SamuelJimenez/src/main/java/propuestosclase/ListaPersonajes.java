/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuestosclase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author samuel
 */
public class ListaPersonajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Personaje> listaPersonajes = new ArrayList<>();
        //---
        Personaje p1 = new Personaje("Thor Lyserod", 42, "Humano", "Un viejo aventurero con una vida ahora apacible", "Bárbaro", 15);
        Personaje p2 = new Personaje("Zanerius Manosuave", 21, "Humano", "Un pillo que busca ganarse la vida como puede", "Bardo", 3);
        Personaje p3 = new Personaje("Mort Morterius", 16, "Tiefling", "Un inseguro nigromante con un potecial inmenso", "Warlock", 6);
        Personaje p4 = new Personaje("Helios Norin", 20, "Halfling", "Un ladrón camorrista que huye de un pasado que poca gente espera", "Ladrón", 4);
        Personaje p5 = new Personaje("Paulo", 22, "Humano", "Viajero que solo quiere ser feliz", "Monje", -2);
        Personaje pAux = new Personaje();
        //---
        listaPersonajes.add(p1);
        listaPersonajes.add(p2);
        listaPersonajes.add(p3);
        listaPersonajes.add(p4);
        listaPersonajes.add(p5);
        //---
        System.out.println("\n---- Imprimimos la lista recién creada -----");
        listaPersonajes.forEach(System.out::println);
        //---
        ordenacionNatural(listaPersonajes);
        //---
        System.out.println("----- Imprimimos la lista ordenada por nombre (orden natural) -----");
        listaPersonajes.forEach(System.out::println);
        //---
        ordenacionPorEdad(listaPersonajes);
        System.out.println("----- Imprimimos la lista ordenada por edad -----");
        listaPersonajes.forEach(System.out::println);
        //---
        ordenacionPorRaza(listaPersonajes);
        System.out.println("----- Imprimimos la lista ordenada por raza -----");
        listaPersonajes.forEach(System.out::println);
        //---
        ordenacionPorCategoria(listaPersonajes);
        System.out.println("----- Imprimimos la lista ordenada por Categoria -----");
        listaPersonajes.forEach(System.out::println);
        //---
        ordenacionPorNivel(listaPersonajes);
        System.out.println("----- Imprimimos la lista ordenada por nivel -----");
        listaPersonajes.forEach(System.out::println);
        //---
        int pos = buscarPorNombre(listaPersonajes, "Thor Lyserod");
        System.out.println("Thor está en la posición: " + pos);
        //---
        pos = buscarPorEdad(listaPersonajes, 18);
        System.out.println("El primer personaje con 18 años está en la posición: " + pos);
        //---
        pos = buscarPorRaza(listaPersonajes, "Orco");
        System.out.println("El primer personaje orco está en la posición: " + pos);
        //---
        pos = buscarPorCategoria(listaPersonajes, "Warlock");
        System.out.println("El primer personaje Warlock está en la posición: " + pos);
        //---
        pos = buscarPorNivel(listaPersonajes, 6);
        System.out.println("El primer personaje con nivel 6 está en la posición: " + pos);

    }

    private static void ordenacionNatural(List<Personaje> lista) {
        Collections.sort(lista);
    }

    private static void ordenacionPorEdad(List<Personaje> lista) {
        Comparator<Personaje> criterio = (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad());
        Collections.sort(lista, criterio);
    }

    private static void ordenacionPorRaza(List<Personaje> lista) {
        Comparator<Personaje> criterio = (p1, p2) -> p1.getRaza().compareTo(p2.getRaza());
        Collections.sort(lista, criterio);
    }

    private static void ordenacionPorCategoria(List<Personaje> lista) {
        Comparator<Personaje> criterio = (p1, p2) -> p1.getCategoria().compareTo(p2.getCategoria());
        Collections.sort(lista, criterio);
    }

    private static void ordenacionPorNivel(List<Personaje> lista) {
        Comparator<Personaje> criterio = (p1, p2) -> Integer.compare(p1.getNivel(), p2.getNivel());
        Collections.sort(lista, criterio);
    }

    private static int buscarPorNombre(List<Personaje> lista, String nombre) {
        ordenacionNatural(lista);
        Personaje aux = new Personaje();
        aux.setNombre(nombre);
        return Collections.binarySearch(lista, aux);
    }

    private static int buscarPorEdad(List<Personaje> lista, int edad) {
        ordenacionPorEdad(lista);
        Comparator<Personaje> criterio = (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad());
        Personaje aux = new Personaje();
        aux.setEdad(edad);
        return Collections.binarySearch(lista, aux, criterio);
    }

    private static int buscarPorRaza(List<Personaje> lista, String raza) {
        ordenacionPorRaza(lista);
        Comparator<Personaje> criterio = (p1, p2) -> p1.getRaza().compareTo(p2.getRaza());
        Personaje aux = new Personaje();
        aux.setRaza(raza);
        return Collections.binarySearch(lista, aux, criterio);
    }

    private static int buscarPorCategoria(List<Personaje> lista, String categoria) {
        ordenacionPorCategoria(lista);
        Comparator<Personaje> criterio = (p1, p2) -> p1.getCategoria().compareTo(p2.getCategoria());
        Personaje aux = new Personaje();
        aux.setCategoria(categoria);
        return Collections.binarySearch(lista, aux, criterio);
    }

    private static int buscarPorNivel(List<Personaje> lista, int nivel) {
        ordenacionPorNivel(lista);
        Comparator<Personaje> criterio = (p1, p2) -> Integer.compare(p1.getNivel(), p2.getNivel());
        Personaje aux = new Personaje();
        aux.setNivel(nivel);
        return Collections.binarySearch(lista, aux, criterio);
    }

}
