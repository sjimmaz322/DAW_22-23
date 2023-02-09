/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Calefactor {

    private String estado;
    private int temperatura;

    public Calefactor() {
        this.estado = "apagado";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void encender() {
        this.setEstado("encendido");
    }

    public void apagar() {
        this.setEstado("apagado");
    }

    public void fijarTemperatura(int n) {
        this.setTemperatura(n);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El calentador está ").append(estado).append(" y a una temperatura programada de ").append(temperatura);
        return sb.toString();
    }

}
