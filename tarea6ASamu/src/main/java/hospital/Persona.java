/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public abstract class Persona {

    private String nombre, apellidos;
    private Nif dni;

    public Persona(String nombre, String apellidos, Nif dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Nif getDni() {
        return dni;
    }

    public void setDni(Nif dni) {
        this.dni = dni;
    }

    final public void renovarNif() {
        this.dni.setFechaCaducidad(this.dni.renovar(LocalDate.now()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" ").append(apellidos).append(" con DNI: ").append(dni);
        return sb.toString();
    }

}
