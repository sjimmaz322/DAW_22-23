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

    public int getNumSerie() {
        return numSerie;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    @Override
    public String toString() {
        return "Robot{" + "numSerie=" + numSerie + ", nivelBateria=" + nivelBateria + '}';
    }

}
