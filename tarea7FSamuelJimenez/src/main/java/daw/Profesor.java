/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Profesor {

    private String nombre;
    private String dni;
    private String puesto;
    private LocalDate fechaTomaPasicion;
    private LocalDate fechaCese;
    private String telefono;
    private boolean evaluador;
    private boolean coordinador;

    public Profesor() {
    }

    public Profesor(String nombre, String dni, String puesto, LocalDate fechaTomaPasicion, LocalDate fechaCese, String telefono, boolean evaluador, boolean coordinador) {
        this.nombre = nombre;
        this.dni = dni;
        this.puesto = puesto;
        this.fechaTomaPasicion = fechaTomaPasicion;
        this.fechaCese = fechaCese;
        this.telefono = telefono;
        this.evaluador = evaluador;
        this.coordinador = coordinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaTomaPasicion() {
        return fechaTomaPasicion;
    }

    public void setFechaTomaPasicion(LocalDate fechaTomaPasicion) {
        this.fechaTomaPasicion = fechaTomaPasicion;
    }

    public LocalDate getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEvaluador() {
        return evaluador;
    }

    public void setEvaluador(boolean evaluador) {
        this.evaluador = evaluador;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public String toString() {
        return nombre + "," + dni + "," + puesto + "," + fechaTomaPasicion + "," + fechaCese + "," + telefono + "," + evaluador + "," + coordinador + ",";
    }

}
