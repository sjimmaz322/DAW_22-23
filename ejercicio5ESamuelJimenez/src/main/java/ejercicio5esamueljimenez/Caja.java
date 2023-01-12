/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5esamueljimenez;

import java.util.Objects;

/**
 *
 * @author samuel
 */
public class Caja {

    private static int identificador = 0;
    private Cinta cinta;

    public Caja() {
        identificador++;
        this.cinta = new Cinta();

    }

    public static int getIdentificador() {
        return identificador;
    }

    public static void setIdentificador(int identificador) {
        Caja.identificador = identificador;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }

    public Ticket generarTicket() {
        Ticket t = new Ticket(this.getCinta().getListaProducto());
        return t;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.cinta);
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
        final Caja other = (Caja) obj;
        return Objects.equals(this.cinta, other.cinta);
    }

    @Override
    public String toString() {
        String tmp = cinta.toString();
        return tmp;
    }

}
