/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author samuel
 */
public class Turismo extends Vehiculo {

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int puertas, boolean marchaAutomatica) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public Turismo() {
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    public void arrancar() {
        System.out.println("El coche está encendido para irse con la familia");
    }

    public void apagar() {
        System.out.println("Se terminó el viaje");
    }

    @Override
    public String toString() {
        return super.toString() + puertas + ":" + marchaAutomatica + ":";
    }

}
