/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author samuel
 */
public class Deportivo extends Vehiculo {

    private int cilindrada;

    public Deportivo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int cilindrada) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }

    public Deportivo() {
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
        public void arrancar() {
        System.out.println("El coche hace vroooooom");
    }

    public void apagar() {
        System.out.println("Ala, el coche callaito");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cilindrada: ").append(cilindrada);
        return sb.toString();
    }

}
