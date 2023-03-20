/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public final class Temporal extends Sala {

    private LocalDate fecInicioUso, fecFinUso;

    public Temporal() {
    }

    public Temporal(LocalDate fecInicioUso, LocalDate fecFinUso, String nombre, int numSala, List<Obra> elemExpuestos, Humedad alarmaHUM, Temperatura alarmaTMP) {
        super(nombre, numSala, elemExpuestos, alarmaHUM, alarmaTMP);
        this.fecInicioUso = fecInicioUso;
        this.fecFinUso = fecFinUso;
    }



    public LocalDate getFecInicioUso() {
        return fecInicioUso;
    }

    public void setFecInicioUso(LocalDate fecInicioUso) {
        this.fecInicioUso = fecInicioUso;
    }

    public LocalDate getFecFinUso() {
        return fecFinUso;
    }

    public void setFecFinUso(LocalDate fecFinUso) {
        this.fecFinUso = fecFinUso;
    }

    @Override
    public String toString() {
        return super.toString() + "Temporal{" + "fecInicioUso=" + fecInicioUso + ", fecFinUso=" + fecFinUso + '}';
    }

}
