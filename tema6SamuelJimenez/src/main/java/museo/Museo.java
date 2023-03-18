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
public class Museo {

    private String nombre, direccion;
    private List<Sala> salasMuseo;
    private List<Empleado> listaTrabajadores;

    public Museo() {
    }

    public Museo(String nombre, String direccion, List<Sala> salasMuseo, List<Empleado> listaTrabajadores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salasMuseo = salasMuseo;
        this.listaTrabajadores = listaTrabajadores;
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

    public List<Sala> getSalasMuseo() {
        return salasMuseo;
    }

    public void setSalasMuseo(List<Sala> salasMuseo) {
        this.salasMuseo = salasMuseo;
    }

    public List<Empleado> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(List<Empleado> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public void contratar(Empleado e) {
        this.listaTrabajadores.add(e);
    }

    public boolean despedir(Empleado e) {
        return this.listaTrabajadores.remove(e);
    }

    public void aniadirSala(Sala s) {
        this.salasMuseo.add(s);
    }

    public boolean quitarSala(Sala s) {
        return this.salasMuseo.remove(s);
    }

    @Override
    public String toString() {
        return "Museo{" + "nombre=" + nombre + ", direccion=" + direccion + ", salasMuseo=" + salasMuseo + ", listaTrabajadores=" + listaTrabajadores + '}';
    }

}
