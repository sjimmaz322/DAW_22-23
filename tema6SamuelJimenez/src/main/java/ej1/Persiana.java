/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Persiana {

    private String estado;

    public Persiana() {
        this.estado = "bajada";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void subir() {
        this.setEstado("subida");
    }

    public void bajar() {
        this.setEstado("bajada");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La persiana está ").append(estado);
        return sb.toString();
    }

}
