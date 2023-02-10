/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author samuel
 */
public class Corredera extends Ventana {

    private int numRieles;//-- 1 o 2
    private Persiana persiana;

    public Corredera() {
    }

    public Corredera(int numRieles, String estado) {
        super(estado);
        this.numRieles = numRieles;
        this.persiana = new Persiana();
    }

    public int getNumRieles() {
        return numRieles;
    }

    public void setNumRieles(int numRieles) {
        this.numRieles = numRieles;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo la ventana corredera, no te salgas del raíl");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando la ventana corredera, mantén los rieles limpios");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Tiene: ").append(numRieles).append(" rieles \n");
        sb.append(this.persiana.toString());
        return sb.toString();
    }

}
