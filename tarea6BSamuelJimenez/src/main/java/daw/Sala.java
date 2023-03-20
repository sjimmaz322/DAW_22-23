/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public abstract class Sala {

    private String nombre;
    private int numSala;
    private List<Obra> elemExpuestos;
    private Humedad alarmaHUM;
    private Temperatura alarmaTMP;

    public Sala() {
    }

    public Sala(String nombre, int numSala, List<Obra> elemExpuestos, Humedad alarmaHUM, Temperatura alarmaTMP) {
        this.nombre = nombre;
        this.numSala = numSala;
        this.elemExpuestos = elemExpuestos;
        this.alarmaHUM = alarmaHUM;
        this.alarmaTMP = alarmaTMP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public List<Obra> getElemExpuestos() {
        return elemExpuestos;
    }

    public void setElemExpuestos(List<Obra> elemExpuestos) {
        this.elemExpuestos = elemExpuestos;
    }

    public Humedad getAlarmaHUM() {
        return alarmaHUM;
    }

    public void setAlarmaHUM(Humedad alarmaHUM) {
        this.alarmaHUM = alarmaHUM;
    }

    public Temperatura getAlarmaTMP() {
        return alarmaTMP;
    }

    public void setAlarmaTMP(Temperatura alarmaTMP) {
        this.alarmaTMP = alarmaTMP;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numSala;
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
        final Sala other = (Sala) obj;
        return this.numSala == other.numSala;
    }
    

    @Override
    public String toString() {
        return "Sala{" + "nombre=" + nombre + ", numSala=" + numSala + ", elemExpuestos=" + elemExpuestos + ", alarmaHUM=" + alarmaHUM + ", alarmaTMP=" + alarmaTMP + '}';
    }

}
