/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author samuel
 */
public class CampanaExtractora extends Electrodomestico {

    private int nivelDecibelios;

    public CampanaExtractora(int nivelDecibelios) {
        if (nivelDecibelios < 50) {
            nivelDecibelios = 50;
        }
        this.nivelDecibelios = nivelDecibelios;
    }

    public CampanaExtractora(int nivelDecibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (nivelDecibelios < 50) {
            nivelDecibelios = 50;
        }
        this.nivelDecibelios = nivelDecibelios;
    }

    public int getNivelDecibelios() {
        return nivelDecibelios;
    }

    public void setNivelDecibelios(int nivelDecibelios) {
        if (nivelDecibelios < 50) {
            nivelDecibelios = 50;
        }
        this.nivelDecibelios = nivelDecibelios;
    }

    @Override
    public String toString() {
        return super.toString() + "CampanaExtractora{" + "nivelDecibelios=" + nivelDecibelios + '}';
    }

}
