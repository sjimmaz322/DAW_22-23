/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Arrays;

/**
 *
 * @author samuel
 */
public class CatalogoAlquiler {

    private int Id = 0;
    private static int contador = 0;

    private int numeroAlquileres;

    private Alquiler[] listaAlquileres;

    public CatalogoAlquiler(int tamanio) {
        this.Id = ++contador;

        tamanio = Math.abs(tamanio);
        this.numeroAlquileres = 0;

        this.listaAlquileres = new Alquiler[tamanio];

    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public static int getContador() {
        return contador;
    }

    public Alquiler[] getListaAlquileres() {
        return listaAlquileres;
    }

    public int getNumeroAlquileres() {
        return numeroAlquileres;
    }

    public boolean borrarCliente(Alquiler c) {
        int posicion = buscarAlquiler(c);
        if (posicion >= 0) {

            this.listaAlquileres[posicion] = null;
            this.numeroAlquileres--;
            return true;

        }
        return false;
    }

    public Alquiler buscarAlquilerPorID(String id) {
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(Id);
        int pos = buscarAlquiler(aux);

        return (pos >= 0) ? this.listaAlquileres[pos] : null;
    }

    public int buscarAlquiler(Alquiler c) {
        if (c != null) {
            for (int i = 0; i < this.listaAlquileres.length; i++) {

                if (this.listaAlquileres[i] != null && c.equals(this.listaAlquileres[i])) {
                    return i;
                }
            }

        }
        return -1;
    }

    public void aniadirAlquiler(Alquiler c) {
        if (this.numeroAlquileres < this.listaAlquileres.length) {
            for (int i = 0; i < listaAlquileres.length; i++) {
                if (this.listaAlquileres[i] == null) {
                    this.listaAlquileres[i] = c;
                    this.numeroAlquileres++;
                    break;
                }

            }
        } else {
            this.numeroAlquileres++;
            this.listaAlquileres = Arrays.copyOf(this.listaAlquileres, this.numeroAlquileres);
            this.listaAlquileres[this.numeroAlquileres - 1] = c;
        }
    }

    private Alquiler[] copiar() {
        Alquiler[] aux = new Alquiler[listaAlquileres.length + 1];

        for (int i = 0; i < listaAlquileres.length; i++) {
            aux[i] = listaAlquileres[i];
        }
        return aux;
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Alquiler c : listaAlquileres) {

            if (c != null) {
                tmp += c.toString() + "\n";
            }

        }
        return tmp;
    }
}
