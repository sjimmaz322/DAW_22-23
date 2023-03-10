/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author samuel
 */
public abstract class Profesor extends Persona {

    private String especialidad;

    public Profesor() {
    }

    public Profesor(String especialidad, String nombre, String apellidos, String nif, Direccion dir) {
        super(nombre, apellidos, nif, dir);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Profesor{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final void identificate() {//--- Al ponerlo final ya no se puede sobrescribir en las hijas
        System.out.println("Mi nombre es " + this.getNombre() + " y soy un profesor.");
    }

}
