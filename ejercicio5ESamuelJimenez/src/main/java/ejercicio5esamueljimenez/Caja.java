/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5esamueljimenez;

import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class Caja {

    private static int identificador = 0;
    private ArrayList<Producto> cinta;

    public Caja() {
        identificador++;
        this.cinta = new ArrayList<>();

    }

    public static int getIdentificador() {
        return identificador;
    }

    public static void setIdentificador(int identificador) {
        Caja.identificador = identificador;
    }

    public ArrayList<Producto> getCinta() {
        return cinta;
    }

    public void setCinta(ArrayList<Producto> cinta) {
        this.cinta = cinta;
    }

    public void aniadirProducto(Producto p) {
        this.cinta.add(p);
    }

    public boolean quitarProducto(Producto p) {
        if (cinta.contains(p) && p != null) {
            cinta.remove(p);
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarCaja() {
        return this.cinta.isEmpty();
    }

    public Ticket generarTicket() {
        Ticket t = new Ticket(this);
        return t;
    }

    @Override
    public String toString() {
        String tmp = "|Producto|---|Precio|---|Cantidad|---|IVA|---|Precio sin IVA|\n";
        String linea = """
                       """;
        for (Producto p : cinta) {

            if (p != null) {

                tmp += p.nombre() + "|---|" + p.precio() + "|---|" + p.cantidad() + "|---|" + p.IVA() + "|---|" + (p.precio() * p.cantidad() + "|\n");
            }

        }
        return tmp;
    }

}
