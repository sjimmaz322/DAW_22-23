/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Tren {

    private int ID, numVagones, numPasajeros;

    public Tren() {
    }

    public Tren(int ID, int numVagones, int numPasajeros) {
        this.ID = ID;
        this.numVagones = numVagones;
        this.numPasajeros = numPasajeros;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumVagones() {
        return numVagones;
    }

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El tren con ID : ");
        sb.append(ID);
        sb.append(" tiene ").append(numVagones);
        sb.append(" vagones y ").append(numPasajeros);
        sb.append(" pasajeros.");
        return sb.toString();
    }

  
}
