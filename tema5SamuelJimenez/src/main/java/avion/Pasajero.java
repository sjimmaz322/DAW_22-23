/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avion;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samuel
 */
public class Pasajero {

    private final String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    //---
    private String nombre, apellido, DNI;

    public Pasajero() {
        this.DNI = generarNIF(letras);
    }

    public Pasajero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = generarNIF(letras);
    }

    private static String generarNIF(String[] letras) {
        String DNI = RandomStringUtils.randomNumeric(8);
        int numDNI = Integer.parseInt(DNI);
        String letra = letras[numDNI % 23];
        String DNICompleto = DNI.concat(letra);

        return DNICompleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------\n");
        sb.append("Datos del pasajero:\n");
        sb.append("Nombre :").append(nombre).append("\n");
        sb.append("Apellido :").append(apellido).append("\n");
        sb.append("DNI :").append(DNI).append("\n");
        sb.append("-----------------------------\n");

        return sb.toString();
    }

}
