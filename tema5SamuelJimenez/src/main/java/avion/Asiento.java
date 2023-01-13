/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avion;

/**
 *
 * @author samuel
 */
public class Asiento {

    private int fila, numAsiento;
    private Pasajero pasajero;

    public Asiento(int fila, int numAsiento) {
        this.fila = fila;
        this.numAsiento = numAsiento;
        this.pasajero = null;
    }

    public Asiento() {
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El asiento de la fila ").append(fila).append(" con número de asiento ").append(numAsiento).append(" está ocupado por: \n");
        sb.append(pasajero.toString());
        return sb.toString();
    }

}
