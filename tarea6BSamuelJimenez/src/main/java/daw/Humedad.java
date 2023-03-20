/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public final class Humedad extends Sensor {

    private final double MAX_HUM, MIN_HUM;

    public Humedad(double MAX_HUM, double MIN_HUM, int id) {
        super(id);
        this.MAX_HUM = MAX_HUM;
        this.MIN_HUM = MIN_HUM;
    }

    public double getMAX_HUM() {
        return MAX_HUM;
    }

    public double getMIN_HUM() {
        return MIN_HUM;
    }

    @Override
    public String toString() {
        return super.toString() + "Humedad{" + "MAX_HUM=" + MAX_HUM + ", MIN_HUM=" + MIN_HUM + '}';
    }

    @Override
    public void alarma() {
        System.out.println("La alarma está programada cuando se exceda el " + MAX_HUM + " % de humedad o cuando la humedad se encuentre por debajo del " + MIN_HUM + " %.");
    }

}
