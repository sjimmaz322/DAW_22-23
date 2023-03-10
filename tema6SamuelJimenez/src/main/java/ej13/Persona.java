/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author samuel
 */
public abstract class Persona implements Identificable {

    private String nombre, apellidos, nif;
    private Direccion dir;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String nif, Direccion dir) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.dir = dir;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", nif=").append(nif);
        sb.append(", dir=").append(dir);
        sb.append('}');
        return sb.toString();
    }

    
    
}
