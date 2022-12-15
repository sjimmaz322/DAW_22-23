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
public class Empresa {

    String cif;
    String nombre;
    CatalogoClientes listadoClientes;
    CatalogoVehiculos listadoVehiculos;
    CatalogoAlquiler listadoAlquiler;

    //Catálogo de vehículos
    //Catálogo de clientes
    //Catálogo de alquileres
    /*
    - Registrar un cliente
    - Registrar un vehiculo
    - buscar un cliente por nif
    - buscar vehículo por bastidor
    
     */
    public Empresa() {
        this.listadoClientes = new CatalogoClientes(0);
        this.listadoVehiculos = new CatalogoVehiculos(0);
        this.listadoAlquiler = new CatalogoAlquiler(0);
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatalogoClientes getListadoClientes() {
        return listadoClientes;
    }

    public CatalogoVehiculos getListadoVehiculos() {
        return listadoVehiculos;
    }

    public CatalogoAlquiler getListadoAlquiler() {
        return listadoAlquiler;
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

    private void aniadirCliente(Clientes aux) {
        this.listadoClientes.aniadirCliente(c);
    }

}
