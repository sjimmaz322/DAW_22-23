package ejercicio4esamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samuel
 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000.0;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > this.capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafera() {
        cantidadActual = capacidadMaxima;
    }

    public double servirTaza(double cantidadAServir) {

        if (cantidadActual > cantidadAServir) {
            cantidadActual = cantidadActual - cantidadAServir;
        } else {
            cantidadAServir = cantidadActual;
            cantidadActual = 0;
        }
        return cantidadAServir;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(double cantidadAgregar) {
        if (cantidadActual + cantidadAgregar <= capacidadMaxima) {
            cantidadActual += cantidadAgregar;
        } else {
            cantidadActual = capacidadMaxima;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.capacidadMaxima) ^ (Double.doubleToLongBits(this.capacidadMaxima) >>> 32));
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
        final Cafetera other = (Cafetera) obj;
        return Double.doubleToLongBits(this.capacidadMaxima) == Double.doubleToLongBits(other.capacidadMaxima);
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}
