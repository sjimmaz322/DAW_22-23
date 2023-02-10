/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author samuel
 */
public class Electrico extends Vehiculo {

    private int numBaterias;
    private int duracionCarga;//--- En minutos

    public Electrico() {
    }

    public Electrico(int numBaterias, int duracionCarga, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.numBaterias = numBaterias;
        this.duracionCarga = duracionCarga;
    }

    public void cargar() {
        System.out.println("La batería del vehículo con bastidor " + super.getBastidor() + " está cargada.");
    }

    public void cambiarBateria() {
        System.out.println("La batería del vehículo con bastidor " + super.getBastidor() + " fue cambiada por una nueva.");
    }

    @Override
    public void arrancar() {
        System.out.println("Soy un vehículo eléctrico muy chulo de " + this.getMatricula() + " y estoy arrancando.");
    }

    public int getNumBaterias() {
        return numBaterias;
    }

    public void setNumBaterias(int numBaterias) {
        this.numBaterias = numBaterias;
    }

    public int getDuracionCarga() {
        return duracionCarga;
    }

    public void setDuracionCarga(int duracionCarga) {
        this.duracionCarga = duracionCarga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Número de baterías: ").append(numBaterias).append("\n");
        sb.append("Duración de la carga: ").append(duracionCarga).append(" minutos\n");
        return sb.toString();
    }

}
