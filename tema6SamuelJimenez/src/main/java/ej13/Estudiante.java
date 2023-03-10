/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author samuel
 */
public class Estudiante extends Persona {

    private String id;

    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String apellidos, String nif, Direccion dir) {
        super(nombre, apellidos, nif, dir);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Estudiante{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void identificate() {
        System.out.println("Mi nombre es " + this.getNombre() + " y soy un estudiante.");
    }
    public void estudiar(){
        System.out.println("Estudio, pero poco");
    }
    
}
