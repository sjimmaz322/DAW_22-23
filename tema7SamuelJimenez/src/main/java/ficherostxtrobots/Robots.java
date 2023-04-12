/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherostxtrobots;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author samuel
 */
public class Robots implements Comparable<Robots> {

    private static Random rd = new Random();

    private int numSerie;
    private int nivelBateria;

    public Robots() {
        this.numSerie = rd.nextInt(5000);
        this.nivelBateria = rd.nextInt(101);
    }

    public Robots(int numSerie, int nivelBateria) {
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
        final Robots other = (Robots) obj;
        return this.numSerie == other.numSerie;
    }

    public static List<Robots> generarListaRobots() {
        List<Robots> lista = new ArrayList<>();

        for (int i = 0; i < rd.nextInt(35-15+1)+15; i++) {
            lista.add(new Robots());
        }

        return lista;
    }

    @Override
    public String toString() {
        return "Robot: " + numSerie + " - Vida: " + nivelBateria;
    }

    @Override
    public int compareTo(Robots o) {
        return Integer.compare(this.numSerie, o.getNumSerie());
    }

}
