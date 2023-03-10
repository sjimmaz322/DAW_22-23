/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author samuel
 */
public class Microondas extends Electrodomestico implements Silencioso {

    private int potenciaW;

    public Microondas() {
    }

    public Microondas(int potenciaW, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaW = potenciaW;
    }

    public int getPotenciaW() {
        return potenciaW;
    }

    public void setPotenciaW(int potenciaW) {
        this.potenciaW = potenciaW;
    }

    @Override
    public String toString() {
        return super.toString() + "Microondas{" + "potenciaW=" + potenciaW + '}';
    }

    @Override
    public void silencioso() {
        System.out.println("El microondas con consumo de " + this.getConsumo() + " emite solo 40dB.");
    }

}
