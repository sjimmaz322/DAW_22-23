/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ListaReproduccion {

    /*
    Desarrolla una clase ListaReproduccion con los siguientes atributos y métodos.
    Es necesario implementar la clase Cancion:

    Atributos:
    --canciones: una lista de objetos de la clase Cancion.
    Métodos (recuerda implementar equals y hashcode en Cancion)
    -- constructor predeterminado (creará e inicializará la lista).
    -- numeroCanciones(): devuelve el número de canciones de la lista.
    -- estaVacia(): devuelve si la lista de reproducción está vacía.
    -- escucharCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
    -- cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
    -- grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
    -- eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
    -- eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la lista de reproducción. Usa el método remove(Cancion)
    -- imprimirLista (ListaReproduccion tmp). Método de clase que imprime los nombres de las canciones contenidas en tmp.
    -- buscarCancion(Cancion c), busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra. Usa el método indexOf.
    -- Incluye un par de métodos de ordenación (por ejemplo, por título y por cantante) usando el método Collections.sort(lista, criterioComparator)
    Añade también métodos para buscar, usando Collections.binarySearch(lista, objeto, criterioComparator)

     */
    private ArrayList<Cancion> canciones;

    public ListaReproduccion() {
        this.canciones = new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.canciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaReproduccion other = (ListaReproduccion) obj;
        return Objects.equals(this.canciones, other.canciones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListaReproduccion{");
        sb.append("canciones=").append(canciones);
        sb.append('}');
        return sb.toString();
    }

    public int numeroCanciones() {
        return this.canciones.size();
    }

    public boolean estaVacia() {
        return this.canciones.isEmpty();
    }

    public Cancion escucharCancion(int pos) {
        return this.canciones.get(pos);
    }

    public void cambiarCancion(int pos, Cancion c) {
        this.canciones.get(pos).setNombre(c.getNombre());
        this.canciones.get(pos).setGenero(c.getGenero());
        this.canciones.get(pos).setDuracion(c.getDuracion());
    }

    public void eliminarCancion(int pos) {
        this.canciones.remove(pos);
    }

    public void eliminarCancion(Cancion c) {
        this.canciones.remove(c);
    }

    public static void imprimirCanciones(ListaReproduccion tmp) {
        ArrayList<Cancion> aux = tmp.getCanciones();
        for (int i = 0; i < aux.size(); i++) {
            System.out.println(aux.get(i).getNombre());
        }
    }

    public int buscarCancion(Cancion c) {
        int pos;
        pos = this.canciones.indexOf(c);
        return pos;
    }

    public void ordenarPorNombre() {
        Collections.sort(canciones, (c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));
    }

    public void ordenarPorGenero() {
        Collections.sort(canciones, (c1, c2) -> c1.getGenero().compareTo(c2.getGenero()));
    }

}
