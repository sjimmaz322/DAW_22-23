/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Objects;

/**
 *
 * @author samuel
 */
public class Vehiculo {

    private String matricula;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula, String bastidor, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    //constructor copia
    public Vehiculo(Vehiculo aux) {
        this.matricula = aux.getMatricula();
        this.marca = aux.getMarca();
        this.modelo = aux.getModelo();
        this.color = aux.getColor();
        this.tarifa = aux.getTarifa();
    }
// los métodos ‘get’ y ‘set’ de la clase Vehiculo 

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

//Un método de operación para esta clase podría ser aquel que modifica la tarifa aplicando un descuento:
    public void aplicarDescuentoTarifa(double descuento) {
        this.tarifa -= descuento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.matricula);
        hash = 43 * hash + Objects.hashCode(this.bastidor);
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + Objects.hashCode(this.color);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        hash = 43 * hash + (this.disponible ? 1 : 0);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }



}
