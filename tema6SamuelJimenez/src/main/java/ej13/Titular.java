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
public final class Titular extends Profesor {

    private LocalDate fechaJubilacion;

    public Titular() {
    }

    public Titular(LocalDate fechaJubilacion, String especialidad, String nombre, String apellidos, String nif, Direccion dir) {
        super(especialidad, nombre, apellidos, nif, dir);
        this.fechaJubilacion = fechaJubilacion;
    }

    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Titular{");
        sb.append("fechaJubilacion=").append(fechaJubilacion);
        sb.append('}');
        return sb.toString();
    }

}
