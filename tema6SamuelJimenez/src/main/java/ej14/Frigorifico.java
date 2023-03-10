/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author samuel
 */
public class Frigorifico extends Electrodomestico implements Silencioso {

    private int capacidad;

    public Frigorifico() {
    }

    public Frigorifico(int capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Frigorifico{");
        sb.append("capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void silencioso() {
        System.out.println("Este frigorífico del modelo "+this.getModelo()+" emite solo 50dB.");
    }

}
