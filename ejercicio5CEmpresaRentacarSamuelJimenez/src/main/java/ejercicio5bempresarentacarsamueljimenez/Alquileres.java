package ejercicio5bempresarentacarsamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Alquileres {

    private int alquilerID;
    private static int contador = 0;
    private Clientes cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicioAlquiles;
    private int duracionAlquileresDias;
    private String estado;

    public Alquileres(Clientes cliente, Vehiculo vechiculo, LocalDate fechaInicioAlquiles, int duracionAlquileresDias) {
        this.alquilerID = ++contador;
        this.cliente = cliente;
        this.vehiculo = vechiculo;
        this.fechaInicioAlquiles = fechaInicioAlquiles;
        this.duracionAlquileresDias = duracionAlquileresDias;
        this.estado = "Activo";
    }

    public Alquileres() {
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

    public int getDuracionAlquileresDias() {
        return duracionAlquileresDias;
    }

    public void setDuracionAlquileresDias(int duracionAlquileresDias) {
        this.duracionAlquileresDias = duracionAlquileresDias;
    }

    public int getAlquileresID() {
        return alquilerID;
    }

    public void setAlquileresID(int alquilerID) {
        this.alquilerID = alquilerID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        final Alquileres other = (Alquileres) obj;
        return this.alquilerID == other.alquilerID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------");
        sb.append("\nIdentificador del alquiler : ").append(alquilerID);
        sb.append("\nDNI del cliente que alquiló : ").append(cliente.getNIF());
        sb.append("\nNúmero de bastido del vehículo alquilado : ").append(vehiculo.getBastidor());
        sb.append("\nFecha del inicio del alquiler : ").append(fechaInicioAlquiles);
        sb.append("\nDuración del alquiler (días) : ").append(duracionAlquileresDias);
        sb.append("\nEstado del alquiler : ").append(estado);
        sb.append("\n---------");
        return sb.toString();
    }

}
