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
        this.estado = estado;
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
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }

    private void comer(double cantidadGramos) {
        cantidadGramos = Math.abs(cantidadGramos);
        this.peso = peso + cantidadGramos;
    }

    private void despertar() {
        this.estado = "despierto";
    }

    private void dormir() {
        this.estado = "durmiendo";
    }

    private void descansar() {
        this.estado = "reposo";
    }

    private void jugar(int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos);
        this.estado = "jugando";
        if (cantidadMinutos < 30) {
            this.peso = peso - 10;
        }
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("El tiempo no puede superar los 180 minutos");
        }
        if (cantidadMinutos > 30 && cantidadMinutos < 180) {
            this.peso = (peso - (cantidadMinutos / 30) * 20);
        }
    }

    private Animal clonar(Animal pet) {
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
