/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package map;

import java.util.Objects;

/*
Crea la clase Soldado (nif, nombre, apellido1, apellido2 y edad) con constructores, getters, setters, toString y método equals.
Se entienden que dos soldados son iguales si su nif es igual. 
 */
public class Soldado implements Comparable<Soldado> {

    private String nif, nombre, apellido1, apellido2;
    private int edad;

    public Soldado() {
    }

    public Soldado(String nif, String nombre, String apellido1, String apellido2, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nif);
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
        final Soldado other = (Soldado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nNif: ").append(nif);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nPrimer Apellido: ").append(apellido1);
        sb.append("\nSegundo Apellido: ").append(apellido2);
        sb.append("\nEdad: ").append(edad).append("\n");

        return sb.toString();
    }

    @Override
    public int compareTo(Soldado o) {
        return this.nif.compareTo(o.getNif());
    }

}
