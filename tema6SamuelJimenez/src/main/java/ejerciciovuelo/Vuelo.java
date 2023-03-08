/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovuelo;

import java.util.List;

/**
 *
 * @author samuel
 */
public class Vuelo {
    
    private int codVuelo;
    private String origen, destino;
    private double duracion;
    private List<Pasajero> listadoPasajeros;
    
    

/*
    Clase Vuelo:
    codVuelo, Origen, Destino, Duración, Lista de Pasajeros
    En Main:
    - A) - A partir la lista de vuelos, hace return de un Map que para cada ciudad de destino diga cuanta gente viajó en total.
    - B) - A partir la lista de vuelos que guarde para cada codVuelo el conjunto de pasajeros.
    */

    public Vuelo(int codVuelo, String origen, String destino, double duracion, List<Pasajero> listadoPasajeros) {
        this.codVuelo = codVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.listadoPasajeros = listadoPasajeros;
    }

    public int getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public List<Pasajero> getListadoPasajeros() {
        return listadoPasajeros;
    }

    public void setListadoPasajeros(List<Pasajero> listadoPasajeros) {
        this.listadoPasajeros = listadoPasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("codVuelo=").append(codVuelo);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", duracion=").append(duracion);
        sb.append(", listadoPasajeros=").append(listadoPasajeros);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
