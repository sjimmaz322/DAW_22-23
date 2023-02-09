/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Casa {

    private Ventana ventana;
    private Puerta puerta;
    private String direccion;
    private Calefactor calefactor;

    public Casa() {
        this.puerta = new Puerta();
        this.ventana = new Ventana();
        this.calefactor = new Calefactor();
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Calefactor getCalefactor() {
        return calefactor;
    }

    public void setCalefactor(Calefactor calefactor) {
        this.calefactor = calefactor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La casa de ").append(direccion).append("\n");
        sb.append("Tiene una puerta que está ").append(this.puerta.getEstado()).append("\n");
        sb.append("Una ventana que está ").append(this.ventana.getEstado()).append(", cuya persiana está ").append(this.ventana.getPersiana().getEstado()).append("\n");
        sb.append("Y tiene una temperatura de ").append(this.calefactor.getTemperatura())
                .append("ºC gracias a su calefactor que ahora está ").append(this.calefactor.getEstado()).append(".");
        return sb.toString();
    }

}
