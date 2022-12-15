package ejercicio5bempresarentacarsamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
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
        this.listadoClientes = new CatalogoClientes(5);
        this.listadoVehiculos = new CatalogoVehiculos(5);
        this.listadoAlquiler = new CatalogoAlquiler(5);
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
        sb.append("\nEmpresa:");
        sb.append("\nNombre de la empresa :").append(nombre);
        sb.append("\nEl cif de la Empresa :").append(cif);
        sb.append("\nListado de clientes de la empresa :").append(listadoClientes);
        sb.append("\nListado de vehículos de la empresa").append(listadoVehiculos);
        sb.append("\nAlquileres activos de la empresa:").append(listadoAlquiler);
        sb.append("\n---------");
        return sb.toString();
    }
    
    public void aniadirCliente(Clientes aux) {
        this.listadoClientes.aniadirCliente(aux);
    }
    
    public void aniadirCliente() {
        Clientes aux = new Clientes();
        this.listadoClientes.aniadirCliente(aux);
    }
    
    public void aniadirVehiculo(Vehiculo aux) {
        this.listadoVehiculos.aniadirVehiculo(aux);
    }
    
    public void aniadirVehiculo() {
        Vehiculo aux = new Vehiculo();
        this.listadoVehiculos.aniadirVehiculo(aux);
    }
    
    public Clientes buscarCliente(String nif) {
        Clientes aux = this.listadoClientes.buscarClientePorNif(nif);
        return aux;
    }
    
    public Vehiculo buscarVehiculo(String bastidor) {
        Vehiculo aux = this.listadoVehiculos.buscarVehiculoPorBastidor(bastidor);
        return aux;
    }
    
    public boolean registrarAlquiler(String nif, String bastidor, LocalDate fecha, int duracion) {
        Clientes cliAux = this.listadoClientes.buscarClientePorNif(nif);
        Vehiculo vehAux = this.listadoVehiculos.buscarVehiculoPorBastidor(bastidor);
        if (cliAux != null && (vehAux != null) && vehAux.isDisponible() == true) {
            vehAux.setDisponible(false);
            this.listadoAlquiler.aniadirAlquiler(new Alquiler(cliAux, vehAux, fecha, duracion));
            return true;
        }
        return false;
    }
    
    public boolean recibirVehiculo(Alquiler aux) {
        Alquiler alqAux = listadoAlquiler.buscarAlquilerPorID(String.valueOf(aux.getAlquilerID()));
        if (alqAux != null) {
            aux.getVehiculo().setDisponible(true);
            aux.setEstado("Finalizado");
            return true;
        }
        return false;
    }
    
}
