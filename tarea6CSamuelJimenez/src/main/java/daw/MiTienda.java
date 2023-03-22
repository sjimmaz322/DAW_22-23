/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author samuel
 */
public class MiTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--- Apartado 1 - Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        //---
        List<Producto> listado = new ArrayList<>();
        List<Libro> listaLibros = new ArrayList<>();
        List<SeEnvia> listaEnviables = new ArrayList<>();
        //---
        Producto p1 = new Pantalon("M", "Daaobos", 1, 21, 8.00, "Un pantalón de imitación barata");
        Producto p2 = new Pantalon("XXL", "Puma", 2, 21, 15.99, "Pantalón de deporte");
        Producto p3 = new LibroPapel(800, "456789", 3, 10, 6.95, "Un libro de aventuras");
        Producto p4 = new LibroPapel(1200, "125471", 4, 10, 8.99, "Un manual sobre el uso e Git");
        Producto p5 = new LibroDigital(1024, "852146", 5, 10, 7, "Hackeo ético 101");
        Producto p6 = new LibroDigital(6548, "713958", 6, 10, 9.99, "Libro de autoayuda");
        Producto p7 = new Musica("Javaticca", 7, 10, 8, "Grupo de Disco Duro");
        Producto p8 = new Musica("Iron Coding", 8, 10, 11.49, "Música para estresarse programando");
        //--- Productos que no se encuentrarán en la lista
        Producto p9 = new LibroPapel(600, "453789", 9, 10, 7.95, "Un libro de desaventuras");
        Producto p10 = new LibroDigital(100, "", 10, 4, 8, "");
        //---
        listado.add(p1);
        listado.add(p2);
        listado.add(p3);
        listado.add(p4);
        listado.add(p5);
        listado.add(p6);
        listado.add(p7);
        listado.add(p8);
        //---
        //--- Apartado 2 - Muestra los datos de los productos usando un foreach. 
        //---
        System.out.println("Mostramos la lista desordenada");
        listado.forEach(p -> p.toString());
        //---
        //--- Apartado 3 - Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y una expresión lambda. Muestra la lista de productos ordenados por precio.
        //---
        Comparator<Producto> criterioPrecio = (pr1, pr2) -> Double.compare(pr1.getPrecio(), pr2.getPrecio());
        Collections.sort(listado, criterioPrecio);
        System.out.println("\nMostramos la lista ordenada por precio");
        listado.forEach(System.out::println);
        //---
        //--- Apartado 4 - Ordena la lista de productos según el código, haciendo uso de <<Comparator>> y una expresión lambda. Muestra la lista de productos ordenados por código.
        //---
        Comparator<Producto> criterioCodigo = (pr1, pr2) -> Integer.compare(pr1.getCodigo(), pr2.getCodigo());
        Collections.sort(listado, criterioCodigo);
        System.out.println("\nImprimimos la lista ordenada por código");
        listado.forEach(System.out::println);
        //--- 
        //--- Apartado 5 - Realiza la búsqueda binaria, según su código, de algún producto que exista dentro de la lista y otro que no exista, mostrando la posición que ocupa en la lista.
        //---
        int pos = Collections.binarySearch(listado, p3, criterioCodigo);
        System.out.println("\nEl producto está en la posición: " + pos);
        //---
        pos = Collections.binarySearch(listado, p9, criterioCodigo);
        System.out.println("\nEl producto está en la posición: " + pos);
        //---
        //--- Apartado 6 - Recorre la lista de productos y guarda todos los libros en una lista de libros.
        //---
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i) instanceof Libro) {
                listaLibros.add((Libro) listado.get(i));//--- Casting explícito
            }

        }
        //---
        //--- Apartado 7 - Muestra los datos de la lista de libros usando un objeto Iterator. 
        //---
        Iterator<Libro> it = listaLibros.iterator();
        while (it.hasNext()) {
            Libro lib = it.next();
            System.out.println(lib);
        }
        //---
        //--- Apartado 8 - Ordena los libros según ISBN, haciendo uso de <<Comparable>>. Muestra la lista de libros ordenada. 
        //---
        Collections.sort(listaLibros);
        listaLibros.forEach(System.out::println);
        //---
        //--- Apartado 9 (Aprovechamos el Iterator del apartado 7) - Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        //---
        while (it.hasNext()) {
            Libro lib = it.next();
            if (lib instanceof LibroDigital) {
                ((LibroDigital) lib).descargar();//--- Casting explícito
            }
            if (lib instanceof LibroPapel) {//--- Casting explícito
                ((LibroPapel) lib).enviar("Mi casita");
            }
        }
        //---
        //---Apartado 11 - Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        //---
        System.out.println(listaLibros.contains((Libro) p4) ? "\nEl libro está en la lista" : "\nEl libro no está en la lista");
        //---
        System.out.println(listaLibros.contains((Libro) p10) ? "\nEl libro está en la lista" : "\nEl libro no está en la lista\n");
        //---
        //--- Apartado 12 - Usando la lista de productos inicial, crea una nueva lista con todos los objetos que Se Envian.
        //---
        for (Producto p : listado) {
            if (p instanceof SeEnvia) {
                listaEnviables.add((SeEnvia) p);
            }
        }
        //---
        //--- Apartado 13 - Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        //---
        listaEnviables.forEach(p -> p.enviar("La mia casa"));
        //---
        //--- Apartado 14 - Inventa un método abstracto en Libro que tenga comportamientos diferentes en las subclases. Implementa los métodos en las clases hijas.
        //---
        System.out.println("\nProbamos el método abstracto de Libro\n");
        listaLibros.forEach(l -> l.encanto());
    }

}
