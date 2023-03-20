/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public final class Temperatura extends Sensor {

    private final double MAX_TMP, MIN_TMP;

    public Temperatura(double MAX_TMP, double MIN_TMP, int id) {
        super(id);
        this.MAX_TMP = MAX_TMP;
        this.MIN_TMP = MIN_TMP;
    }

    public double getMAX_TMP() {
        return MAX_TMP;
    }

    public double getMIN_TMP() {
        return MIN_TMP;
    }

    @Override
    public String toString() {
        return super.toString() + "Humedad{" + "MAX_HUM=" + MAX_TMP + ", MIN_HUM=" + MIN_TMP + '}';
    }

    @Override
    public void alarma() {
        System.out.println("La alarma está programada cuando se excedan los " + MAX_TMP + " ºC o cuando la temperatura baje de " + MIN_TMP + " ºC.");
    }
}
