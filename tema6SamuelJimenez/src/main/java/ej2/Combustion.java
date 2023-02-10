/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author samuel
 */
public class Combustion extends Vehiculo {

    private int capacidadDeposito;
    private TipoCombustible tipo;

    public Combustion() {
    }

    public Combustion(int capacidadDeposito, TipoCombustible tipo, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.capacidadDeposito = capacidadDeposito;
        this.tipo = tipo;
    }

    public void repostar() {
        System.out.println("El depósito de combustible del vehículo con bastidor " + super.getBastidor() + " fue llenado.");
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Capacidad del tanque de combustible: ").append(capacidadDeposito).append(" litros\n");
        sb.append("Tipo de combustible: ").append(tipo).append("\n");
        return sb.toString();
    }

}
