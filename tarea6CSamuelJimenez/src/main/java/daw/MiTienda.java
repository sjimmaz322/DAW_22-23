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
        //---
        List<Producto> listado = new ArrayList<>();
        List<Libro> listaLibros = new ArrayList<>();
        //---
        Producto p1 = new Pantalon("M", "Daaobos", 1, 21, 8.00, "Un pantalón de imitación barata");
        Producto p2 = new Pantalon("XXL", "Puma", 2, 21, 15.99, "Pantalón de deporte");
        Producto p3 = new LibroPapel(800, "456789", 3, 10, 6.95, "Un libro de aventuras");
        Producto p4 = new LibroPapel(1200, "125471", 4, 10, 8.99, "Un manual sobre el uso e Git");
        Producto p5 = new LibroDigital(1024, "852146", 5, 10, 7, "Hackeo ético 101");
        Producto p6 = new LibroDigital(6548, "713958", 6, 10, 9.99, "Libro de autoayuda");
        Producto p7 = new Musica("Javaticca", 7, 10, 8, "Grupo de Disco Duro");
        Producto p8 = new Musica("Iron Coding", 8, 10, 11.49, "Música para estresarse programando");
        //--- Producto para que no se encuentre en la lista
        Producto p9 = new LibroPapel(600, "453789", 9, 10, 7.95, "Un libro de desaventuras");
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
        System.out.println("Mostramos la lista desordenada");
        listado.forEach(p -> p.toString());
        //---
        Comparator<Producto> criterioPrecio = (pr1, pr2) -> Double.compare(pr1.getPrecio(), pr2.getPrecio());
        Collections.sort(listado, criterioPrecio);
        System.out.println("\nMostramos la lista ordenada por precio");
        listado.forEach(System.out::println);
        //---
        Comparator<Producto> criterioCodigo = (pr1, pr2) -> Integer.compare(pr1.getCodigo(), pr2.getCodigo());
        Collections.sort(listado, criterioCodigo);
        System.out.println("\nImprimimos la lista ordenada por código");
        listado.forEach(System.out::println);
        //--- 
        int pos = Collections.binarySearch(listado, p3, criterioCodigo);
        System.out.println("\nEl producto está en la posición: " + pos);
        pos = Collections.binarySearch(listado, p9, criterioCodigo);
        System.out.println("\nEl producto está en la posición: " + pos);
        //---
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i) instanceof Libro) {
                listaLibros.add((Libro) listado.get(i));
            }
            
        }
        //---
        Iterator<Libro> it = listaLibros.iterator();
        while (it.hasNext()) {
            Libro lib = it.next();
            System.out.println(lib);
        }
        //---
        Collections.sort(listaLibros);
        listaLibros.forEach(System.out::println);
        //---
        while (it.hasNext()) {
            Libro lib = it.next();
            if (lib instanceof LibroDigital) {
                ((LibroDigital) lib).descargar();
            }
            if (lib instanceof LibroPapel) {
                ((LibroPapel) lib).enviar("Mi casita");
            }
        }
        //---
        System.out.println(listaLibros.contains((Libro) p4) ? "El libro está en la lista" : "El libro no está en la lista");
        Producto p10 = new LibroDigital(100, "", 10, 4, 8, "");
        System.out.println(listaLibros.contains((Libro) p10) ? "El libro está en la lista" : "El libro no está en la lista");
        //---
        List<SeEnvia> listaEnviables = new ArrayList<>();
        for (Producto p : listado) {
            if (p instanceof SeEnvia) {
                listaEnviables.add((SeEnvia) p);
            }
        }
        //---
        listaEnviables.forEach(p -> p.enviar("La mia casa"));
        //---
        System.out.println("Probamos el método abstracto de Libro");
        listaLibros.forEach(l -> l.encanto());
    }
    
}
