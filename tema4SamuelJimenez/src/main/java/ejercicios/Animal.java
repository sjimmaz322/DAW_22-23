/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private String tipo;
    private double peso;
    private String estado;

    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, double peso, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        if ((estado.equalsIgnoreCase("despierto") || estado.equalsIgnoreCase("jugando") || estado.equalsIgnoreCase("durmiendo") || estado.equalsIgnoreCase("Reposo") || estado.equalsIgnoreCase("comiendo"))) {
            this.estado = estado;
        } else {
            this.estado = "Reposo";
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if ((estado.equalsIgnoreCase("despierto") || estado.equalsIgnoreCase("jugando") || estado.equalsIgnoreCase("durmiendo") || estado.equalsIgnoreCase("Reposo") || estado.equalsIgnoreCase("comiendo"))) {
            this.estado = estado;
        } else {
            this.estado = "Reposo";
        }
    }

    @Override
    public String toString() {
        return "El animal de nombre " + nombre + ".\n"
                + "Nacido en: " + fechaNacimiento + ".\n"
                + "De la especie: " + tipo + ".\n"
                + "Tiene un peso de " + peso + "g.\n"
                + "Y su estado es " + estado + ".\n";
    }

    public void comer(double cantidadGramos) {
        this.estado = "Comiendo";
        cantidadGramos = Math.abs(cantidadGramos);
        this.peso = peso + cantidadGramos;
    }

    public void despertar() {
        this.estado = "Despierto";
    }

    public void dormir() {
        this.estado = "Durmiendo";
    }

    public void descansar() {
        this.estado = "Reposo";
    }

    public void jugar(int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos);
        this.estado = "Jugando";
        if (cantidadMinutos < 30) {
            this.peso = peso - 10;
        }
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("El tiempo no puede superar los 180 minutos");
        }
        if (cantidadMinutos > 30 && cantidadMinutos < 180) {
            this.peso = (peso - (int) (cantidadMinutos / 30) * 20);
        }
    }

    public static Animal clonar(Animal pet) {
        Animal aux = new Animal();
        try {
            aux.setNombre(pet.getNombre());
            aux.setFechaNacimiento(pet.getFechaNacimiento());
            aux.setTipo(pet.getTipo());
            aux.setPeso(pet.getPeso());
            aux.setEstado(pet.getEstado());
        } catch (NullPointerException npe) {
            throw new NullPointerException("El atributo del objeto apunta a Null");
        }

        return aux;
    }

}
