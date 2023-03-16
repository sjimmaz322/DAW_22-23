/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Hospital {

    private String nombre, direccion;
    private int numCamas;
    private List<Empleado> listaTrabajadores;
    private List<Paciente> listaPacientes;

    public Hospital(String nombre, String direccion, int numCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numCamas = numCamas;
        this.listaTrabajadores = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado emp) {
        this.listaTrabajadores.add(emp);
    }

    public void ingresarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public List<Empleado> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(List<Empleado> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("El hospital con nombre ").append(nombre).append(" situado en ").append(direccion).append("\n");
        sb.append("Tiene un número de camas de ").append(numCamas);
        sb.append("\nY en sus instalaciones trabajan:\n").append(listaTrabajadores);
        sb.append("Mientras que están ingresados:\n").append(listaPacientes);
        return sb.toString();
    }

}
