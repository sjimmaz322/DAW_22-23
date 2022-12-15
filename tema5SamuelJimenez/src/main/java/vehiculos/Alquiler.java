/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Alquiler {

    private int alquilerID;
    private static int contador = 0;
    private Clientes cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicioAlquiles;
    private int duracionAlquilerDias;

    public Alquiler(Clientes cliente, Vehiculo vechiculo, LocalDate fechaInicioAlquiles, int duracionAlquilerDias) {
        this.alquilerID = ++contador;
        this.cliente = cliente;
        this.vehiculo = vechiculo;
        this.fechaInicioAlquiles = fechaInicioAlquiles;
        this.duracionAlquilerDias = duracionAlquilerDias;
    }

    public Alquiler() {
    }
    

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vechiculo) {
        this.vehiculo = vechiculo;
    }

    public LocalDate getFechaInicioAlquiles() {
        return fechaInicioAlquiles;
    }

    public void setFechaInicioAlquiles(LocalDate fechaInicioAlquiles) {
        this.fechaInicioAlquiles = fechaInicioAlquiles;
    }

    public int getDuracionAlquilerDias() {
        return duracionAlquilerDias;
    }

    public void setDuracionAlquilerDias(int duracionAlquilerDias) {
        this.duracionAlquilerDias = duracionAlquilerDias;
    }

    public int getAlquilerID() {
        return alquilerID;
    }

    public void setAlquilerID(int alquilerID) {
        this.alquilerID = alquilerID;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.alquilerID;
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
        final Alquiler other = (Alquiler) obj;
        return this.alquilerID == other.alquilerID;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("alquilerID=").append(alquilerID);
        sb.append(", cliente=").append(cliente.getNIF());
        sb.append(", vehiculo=").append(vehiculo.getBastidor());
        sb.append(", fechaInicioAlquiles=").append(fechaInicioAlquiles);
        sb.append(", duracionAlquilerDias=").append(duracionAlquilerDias);
        sb.append('}');
        return sb.toString();
    }

}
