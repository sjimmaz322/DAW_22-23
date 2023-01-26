/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5f;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ejercito {

    private Set<Soldado> listaEfectivos;

    public Ejercito() {
        this.listaEfectivos = new HashSet<>();
    }

    public Set<Soldado> getListaEfectivos() {
        return listaEfectivos;
    }

    public void setListaEfectivos(Set<Soldado> listaEfectivos) {
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

    public void licenciarSoldado(String nif) {

        this.listaEfectivos.remove(new Soldado(nif, "", "", "", 0));
    }
}
