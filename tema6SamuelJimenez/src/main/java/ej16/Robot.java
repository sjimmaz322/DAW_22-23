/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16;

import java.util.Random;

/**
 *
 * @author samuel
 */
public class Robot {

    private static Random rd = new Random();

    private int numSerie;
    private int nivelBateria;

    public Robot() {
        this.numSerie = rd.nextInt(1000);
        this.nivelBateria = rd.nextInt(101);
    }

    public Robot(int numSerie, int nivelBateria) {
        this.numSerie = numSerie;
        this.nivelBateria = nivelBateria;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.numSerie;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        return this.numSerie == other.numSerie;
    }

    @Override
    public String toString() {
        return "Robot{" + "numSerie=" + numSerie + ", nivelBateria=" + nivelBateria + '}';
    }

}
