/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Deportivo{");
        sb.append("cilindrada=").append(cilindrada);
        sb.append('}');
        return sb.toString();
    }

}
