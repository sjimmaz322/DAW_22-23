/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ventana {

    private String estado;
    

    public Ventana() {
        this.estado = "cerrada";
    }

    public Ventana(String estado) {
        this.estado = estado;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void abrir(){
        System.out.println("Abriendo la ventana");
    }
    public void cerrar(){
        System.out.println("Cerrando la ventana");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La ventana está ").append(estado);
        return sb.toString();
    }

}
