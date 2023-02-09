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
    private Persiana persiana;

    public Ventana() {
        this.estado = "cerrada";
        this.persiana = new Persiana();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La ventana está ").append(estado).append(" y la persiana de la ventana está").append(this.persiana.getEstado());
        return sb.toString();
    }

}
