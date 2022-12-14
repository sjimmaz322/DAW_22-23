/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author samuel
 */
public class Empresa {

    String cif;
    String nombre;
    Clientes[] listadoClientes;
    Vehiculo[] listadoVehiculos;
    Alquiler[] listadoAlquiler;

    //Catálogo de vehículos
    //Catálogo de clientes
    //Catálogo de alquileres
    /*
    - Registrar un cliente
    - Registrar un vehiculo
    - buscar un cliente por nif
    - buscar vehículo por bastidor
    
     */
    public Empresa(int tamanio) {
        this.listadoClientes = new Clientes[tamanio];
        this.listadoVehiculos = new Vehiculo[tamanio];
        this.listadoAlquiler = new Alquiler[tamanio];
    }

    public Empresa(String cif, String nombre, Clientes[] listadoClientes, Vehiculo[] listadoVehiculos, Alquiler[] listadoAlquiler) {
        this.cif = cif;
        this.nombre = nombre;
        this.listadoClientes = listadoClientes;
        for (int i = 0; i < listadoClientes.length; i++) {
            this.listadoClientes[i] = new Clientes();
        }
        this.listadoVehiculos = listadoVehiculos;
        for (int i = 0; i < listadoVehiculos.length; i++) {
            this.listadoVehiculos[i] = new Vehiculo();
        }
        this.listadoAlquiler = listadoAlquiler;
        for (int i = 0; i < listadoAlquiler.length; i++) {
            this.listadoAlquiler[i] = new Alquiler();
        }
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public Clientes[] getListadoClientes() {
        return listadoClientes;
    }

    public Vehiculo[] getListadoVehiculos() {
        return listadoVehiculos;
    }

    public Alquiler[] getListadoAlquiler() {
        return listadoAlquiler;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListadoClientes(Clientes[] listadoClientes) {
        this.listadoClientes = listadoClientes;
    }

    public void setListadoVehiculos(Vehiculo[] listadoVehiculos) {
        this.listadoVehiculos = listadoVehiculos;
    }

    public void setListadoAlquiler(Alquiler[] listadoAlquiler) {
        this.listadoAlquiler = listadoAlquiler;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cif);
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("cif=").append(cif);
        sb.append(", nombre=").append(nombre);
        sb.append(", listadoClientes=").append(listadoClientes);
        sb.append(", listadoVehiculos=").append(listadoVehiculos);
        sb.append(", listadoAlquiler=").append(listadoAlquiler);
        sb.append('}');
        return sb.toString();
    }

    public void aniadirClientes(Clientes c) {
       
        for (int i = 0; i < listadoClientes.length; i++) {
            if(listadoClientes[i]== null){
                this.listadoClientes[i] = c;
                break;
            }
            
        }
        
    }
}
