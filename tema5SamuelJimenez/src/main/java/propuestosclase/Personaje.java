/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestosclase;

import java.util.Objects;

/**
 *
 * @author samuel
 */
public class Personaje implements Comparable<Personaje> {

    private String nombre, raza, trasfondo, categoria;
    private int edad, nivel;

    public Personaje(String nombre, int edad, String raza, String trasfondo, String categoria, int nivel) {
        this.nombre = nombre;
        if (edad < 0) {
            edad = 0;
        }
        this.edad = edad;
        this.raza = raza;
        this.trasfondo = trasfondo;
        this.categoria = categoria;
        if (nivel < 0) {
            nivel = 0;
        }
        this.nivel = nivel;
    }

    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTrasfondo() {
        return trasfondo;
    }

    public void setTrasfondo(String trasfondo) {
        this.trasfondo = trasfondo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 0) {
            nivel = 0;
        }
        this.nivel = nivel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            edad = 0;
        }
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombre);
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
        final Personaje other = (Personaje) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ficha del personaje:");
        sb.append("\nNombre :").append(nombre);
        sb.append("\nEdad :").append(edad);
        sb.append("\nNivel :").append(nivel);
        sb.append("\nRaza :").append(raza);
        sb.append("\nCategoria :").append(categoria);
        sb.append("\nTrasfondo :").append(trasfondo).append("\n");

        return sb.toString();
    }

    @Override
    public int compareTo(Personaje o) {
        return this.nombre.compareTo(o.getNombre());
    }

}
