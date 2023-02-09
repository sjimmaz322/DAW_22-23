/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Puerta {

    private String estado;

    public Puerta() {
        this.estado = "cerrada";
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
        sb.append("La puerta está ").append(estado);
        return sb.toString();
    }

}
