/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5esamueljimenez;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author samuel
 */
public class Cinta {

    private ArrayList<Producto> listaProducto;

    public Cinta() {
        this.listaProducto = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public void aniadirProducto(Producto p) {
        this.getListaProducto().add(p);
    }

    public boolean quitarProducto(Producto p) {
        if (this.getListaProducto().contains(p) && p != null) {
            this.getListaProducto().remove(p);
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarCinta() {
        return this.listaProducto.isEmpty();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.listaProducto);
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
        final Cinta other = (Cinta) obj;
        return Objects.equals(this.listaProducto, other.listaProducto);
    }

    @Override
    public String toString() {

        String tmp = "|Nombre|\t|Precio|\t|Cantidad|\t|IVA|\t|Precio sin IVA|\n";
        for (Producto p : listaProducto) {

            if (p != null) {

                tmp += p.nombre() + "|---|" + p.precio() + "|---|" + p.cantidad() + "|---|" + p.IVA() + "|---|" + (p.precio() * p.cantidad() + "|\n");
            }
        }

        return tmp;
    }
}
