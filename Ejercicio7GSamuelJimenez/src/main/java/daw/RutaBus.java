/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class RutaBus {

    private String numLinea;
    private String origen;
    private String destino;
    private List<LocalTime> horario;

    public RutaBus() {
        this.horario = new ArrayList<>();
    }

    public RutaBus(String numLinea, String origen, String destino, List<LocalTime> horario) {
        this.numLinea = numLinea;
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
    }

    public String getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(String numLinea) {
        this.numLinea = numLinea;
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

    public List<LocalTime> getHorario() {
        return horario;
    }

    public void setHorario(List<LocalTime> horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RutaBus{");
        sb.append("numLinea=").append(numLinea);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", horario=").append(horario);
        sb.append('}');
        return sb.toString();
    }

}
