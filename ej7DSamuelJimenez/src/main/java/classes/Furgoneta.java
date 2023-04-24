/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author samuel
 */
public class Furgoneta extends Vehiculo {

    private int carga;
    private int volumen;

    public Furgoneta(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int carga, int volumen) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.carga = carga;
        this.volumen = volumen;
    }

    public Furgoneta() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void arrancar() {
        System.out.println("Amonos, cuidado con la carga");
    }

    public void apagar() {
        System.out.println("¿Llegó bien la carga?");
    }

    @Override
    public String toString() {
        return super.toString() + carga + ":" + volumen + ":";
    }

}
