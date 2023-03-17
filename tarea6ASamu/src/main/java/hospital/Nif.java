/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Nif {

    private long numDNI;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif(long numDNI, LocalDate fechaSolicitud) {
        this.numDNI = numDNI;
        this.letra = calcularLetra(numDNI);
        this.fechaCaducidad = renovar(fechaSolicitud);
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (this.numDNI ^ (this.numDNI >>> 32));
        hash = 11 * hash + this.letra;
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
        final Nif other = (Nif) obj;
        if (this.numDNI != other.numDNI) {
            return false;
        }
        return this.letra == other.letra;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numDNI).append("-").append(letra).append(" caducando el ").append(fechaCaducidad);
        return sb.toString();
    }

    private static char calcularLetra(Long num) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int pos = (int) (num % 23);

        char letra = letras[pos];

        return letra;
    }

    public final LocalDate renovar(LocalDate fechaSolicitud) {
        return fechaSolicitud.plusYears(10);

    }

}
