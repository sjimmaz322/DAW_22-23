package ejercicio5bempresarentacarsamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import java.util.ArrayList;
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
    CatalogoAlquileres listadoAlquiler;

    public Empresa() {
        this.listadoClientes = new CatalogoClientes();
        this.listadoVehiculos = new CatalogoVehiculos();
        this.listadoAlquiler = new CatalogoAlquileres();
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

    public CatalogoAlquileres getListadoAlquiler() {
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
        this.listadoClientes.aniadirClientes(aux);
    }

    public void aniadirCliente() {
        Clientes aux = new Clientes();
        this.listadoClientes.aniadirClientes(aux);
    }

    public void aniadirVehiculo(Vehiculo aux) {
        this.listadoVehiculos.aniadirVehiculo(aux);
    }

    public void aniadirVehiculo() {
        Vehiculo aux = new Vehiculo();
        this.listadoVehiculos.aniadirVehiculo(aux);
    }

    public Clientes buscarCliente(String nif) {
        Clientes aux = this.listadoClientes.buscarClientesPorNif(nif);
        return aux;
    }

    public Vehiculo buscarVehiculo(String bastidor) {
        Vehiculo aux = this.listadoVehiculos.buscarVehiculoPorBastidor(bastidor);
        return aux;
    }

    public boolean registrarAlquiler(String nif, String bastidor, LocalDate fecha, int duracion) {
        Clientes cliAux = this.listadoClientes.buscarClientesPorNif(nif);
        Vehiculo vehAux = this.listadoVehiculos.buscarVehiculoPorBastidor(bastidor);
        if (cliAux != null && (vehAux != null) && vehAux.isDisponible() == true) {
            vehAux.setDisponible(false);
            this.listadoAlquiler.aniadirAlquileres(new Alquileres(cliAux, vehAux, fecha, duracion));
            return true;
        }
        return false;
    }

    public boolean recibirVehiculo(Alquileres aux) {
        Alquileres alqAux = listadoAlquiler.buscarAlquileresPorId((aux.getAlquileresID()));
        if (alqAux != null) {
            aux.getVehiculo().setDisponible(true);
            aux.setEstado("Finalizado");
            return true;
        }
        return false;
    }

    public ArrayList<Alquileres> listadoAlquileresClienteNif(String nif) {
        ArrayList<Alquileres> aux = new ArrayList<>();

        for (int i = 0; i < this.listadoAlquiler.getNumAlquileres(); i++) {
            if (this.listadoAlquiler.buscarAlquileresPorId(i).getCliente().getNIF().equalsIgnoreCase(nif)) {
                aux.add(this.listadoAlquiler.buscarAlquileresPorId(i));
            }
        }
        return aux;
    }

    public ArrayList<Alquileres> listadoAlquileresVehiculoBastidor(String bastidor) {
        ArrayList<Alquileres> aux = new ArrayList<>();

        for (int i = 0; i < this.listadoAlquiler.getNumAlquileres(); i++) {
            if (this.listadoAlquiler.buscarAlquileresPorId(i).getVehiculo().getBastidor().equalsIgnoreCase(bastidor)) {
                aux.add(this.listadoAlquiler.buscarAlquileresPorId(i));
            }
        }
        return aux;
    }

    public boolean borrarAlquilerID(int id) {
        Alquileres aux = this.listadoAlquiler.buscarAlquileresPorId(id);
        return this.listadoAlquiler.borrarAlquileres(aux);
    }

    public void borrarClientesSinAlquileres(Clientes c) {

        if (c.getNumAlquileres() == 0 && c != null) {
            listadoClientes.borrarClientes(c);
        }

    }

    public void borrarTodosClientesSinAlquileres() {
        for (int i = listadoClientes.getNumClientes() - 1; i >= 0; i--) {
            if (listadoClientes.getListaClientes().get(i).getNumAlquileres() == 0) {
                listadoClientes.borrarClientes(listadoClientes.getListaClientes().get(i));
            }
        }

    }
}
