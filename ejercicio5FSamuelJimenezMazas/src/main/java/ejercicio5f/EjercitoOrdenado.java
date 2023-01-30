/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5f;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class EjercitoOrdenado {

    private SortedSet<Soldado> listaEfectivos;

    public EjercitoOrdenado() {
        this.listaEfectivos = new TreeSet<>();
    }

    public EjercitoOrdenado(Comparator c) {// Por si queremos ordenar más allá del orden natural
        this.listaEfectivos = new TreeSet<>(c);
    }

    public SortedSet<Soldado> getListaEfectivos() {
        return listaEfectivos;
    }

    public void setListaEfectivos(TreeSet<Soldado> listaEfectivos) {
        this.listaEfectivos = listaEfectivos;
    }

    public int conteoSoldados() {
        return this.listaEfectivos.size();
    }

    public String alistarSoldado(Soldado s) {

        String resultado = this.listaEfectivos.add(s) ? "El soldado " + s.getNombre() + " ha sido alistado" : "El soldado ya estaba en el sistema";
        return resultado;

    }

    public String ejercitoVacio() {
        boolean resultado = this.listaEfectivos.isEmpty();
        return resultado ? "El ejército está vacio, empezaremos a reclutar" : "Ya hay soldados en el ejército";
    }

    public String buscarSoldado(String dni) {

        boolean resultado = this.listaEfectivos.contains(new Soldado(dni, "", "", "", 0));

        return resultado ? "El soldado buscado está en el ejército" : "El soldado no se encuentra entre nuestras filas";
    }

    public ArrayList<Soldado> imprimirEjercito() {
        ArrayList<Soldado> lista = new ArrayList<>(this.listaEfectivos);
        return lista;
    }

    public String licenciarSoldado(String nif) {

        return this.listaEfectivos.remove(new Soldado(nif, "", "", "", 0)) ? "El soldado con nif " + nif + " fue licenciado" : "El soldado no estaba en el sistema";
    }
}
