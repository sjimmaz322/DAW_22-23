/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author samuel
 */
public class RegistroHoras {
        private String dni;
        private double horas;

    public RegistroHoras(String dni, double horas) {
        this.dni = dni;
        this.horas = horas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "RegistroHoras{" + "dni=" + dni + ", horas=" + horas + '}';
    }
        
        
}
