/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5esamueljimenez;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Caja {

    private static int identificador = 0;
    private List<Producto> listaProductos;

    public Caja() {
        identificador++;
        this.listaProductos = new ArrayList<>();

    }

    public static int getIdentificador() {
        return identificador;
    }

    public static void setIdentificador(int identificador) {
        Caja.identificador = identificador;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void aniadirProducto(Producto p) {
        this.listaProductos.add(p);
    }

    public boolean quitarProducto(Producto p) {
        if (listaProductos.contains(p) && p != null) {
            listaProductos.remove(p);
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarCaja() {
        return this.listaProductos.isEmpty();
    }

    @Override
    public String toString() {
        String tmp = "Producto\tPrecio\tCantidad\tIVA\tPrecio sin IVA\n";
        String linea = """
                       """;
        for (Producto p : listaProductos) {

            if (p != null) {

                tmp += p.nombre() + "\t" + p.precio() + "\t" + p.cantidad() + "\t" + p.IVA() + "\t" + (p.precio() * p.cantidad() + "\n");
            }

        }
        return tmp;
    }

}
