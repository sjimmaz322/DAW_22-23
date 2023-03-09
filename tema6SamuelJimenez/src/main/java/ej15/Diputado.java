/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Diputado extends Legislador {

    private int numAsiento;

    public Diputado() {
    }

    public Diputado(int numAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numAsiento = numAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Número de asiento que ocupa: ").append(numAsiento).append("\n");
        return sb.toString();
    }

    @Override
    public String getCamara() {
        return "Soy " + getNombre() + " y pertenezco a la cámara del congreso de los diputados, en el asiento " + this.numAsiento + ".";
    }

}
