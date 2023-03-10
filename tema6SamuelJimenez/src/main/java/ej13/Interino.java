/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public final class Interino extends Profesor implements Comparable<Interino> {//--- Clase final indica que no puede tener descendencia

    private LocalDate fechaInicioSustitucion, fechaFinSustitucion;

    public Interino() {
    }

    public Interino(LocalDate fechaInicioSustitucion, LocalDate fechaFinSustitucion, String especialidad, String nombre, String apellidos, String nif, Direccion dir) {
        super(especialidad, nombre, apellidos, nif, dir);
        this.fechaInicioSustitucion = fechaInicioSustitucion;
        this.fechaFinSustitucion = fechaFinSustitucion;
    }

    public LocalDate getFechaInicioSustitucion() {
        return fechaInicioSustitucion;
    }

    public void setFechaInicioSustitucion(LocalDate fechaInicioSustitucion) {
        this.fechaInicioSustitucion = fechaInicioSustitucion;
    }

    public LocalDate getFechaFinSustitucion() {
        return fechaFinSustitucion;
    }

    public void setFechaFinSustitucion(LocalDate fechaFinSustitucion) {
        this.fechaFinSustitucion = fechaFinSustitucion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("Interino{");
        sb.append("fechaInicioSustitucion=").append(fechaInicioSustitucion);
        sb.append(", fechaFinSustitucion=").append(fechaFinSustitucion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Interino i) {
        return this.fechaInicioSustitucion.compareTo(i.getFechaInicioSustitucion());
    }

}
