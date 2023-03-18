/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public final class Fija extends Sala {

    private String estado;

    public Fija() {
    }

    public Fija(String estado, String nombre, int numSala, List<Obra> elemExpuestos, Humedad alarmaHUM, Temperatura alarmaTMP) {
        super(nombre, numSala, elemExpuestos, alarmaHUM, alarmaTMP);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + "Fija{" + "estado=" + estado + '}';
    }

}
