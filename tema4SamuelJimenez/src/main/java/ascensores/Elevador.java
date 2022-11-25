/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ascensores;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samuel
 */
public class Elevador {

    private String numSerie, fabricante;
    private int maxPersonas;
    private double pesoMaximo;
    private LocalDate fechaFabricacion, fechaRevision;
    private String estado;
    private int numPlanta;

    public Elevador(String fabricante, int maxPersonas, double pesoMaximo) {
        this.numSerie = RandomStringUtils.randomNumeric(8);
        this.fabricante = fabricante;
        if (maxPersonas < 0 || maxPersonas > 10) {
            maxPersonas = 5;
        }
        this.maxPersonas = maxPersonas;
        if (pesoMaximo < 0 || pesoMaximo > 800) {
            pesoMaximo = 400;
        }
        this.pesoMaximo = pesoMaximo;

        this.fechaFabricacion = LocalDate.now();

        this.fechaRevision = LocalDate.now();
        this.estado = null;
        this.numPlanta = 0;

    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public String getEstado() {
        return estado;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumPlanta(int numPlanta) {
        if (numPlanta < 0 || numPlanta > 8) {
            numPlanta = this.numPlanta;
        }
        this.numPlanta = numPlanta;
    }

    @Override
    public String toString() {
        return "El ascensor con número de serie " + numSerie + ", fabricado por " + fabricante + " tiene las siguientes características:\n"
                + "Número máximo de personas: " + maxPersonas + ".\n"
                + "Peso máximo admitido " + pesoMaximo + " kg.\n"
                + "Fue fabricado el " + fechaFabricacion + ".\n"
                + "Fue revisado el " + fechaRevision + ".\n"
                + "Actualmente está " + estado + " en/dirección a la planta " + numPlanta + ".\n";
    }

    public boolean mover(int numPersonas, double pesoPersonas, int planta) {
        boolean viajePosible;
        if (planta < 0 || planta > 8) {
            this.estado = "Detenido";
            viajePosible = false;
        }

        if ((numPersonas < maxPersonas) && (pesoPersonas < pesoMaximo) && (planta < numPlanta)) {
            this.estado = "Bajando";
            this.numPlanta = planta;
            viajePosible = true;
        } else if ((numPersonas < maxPersonas) && (pesoPersonas < pesoMaximo) && (planta > numPlanta)) {
            this.estado = "Subiendo";
            this.numPlanta = planta;
            viajePosible = true;
        } else {
            viajePosible = false;
            this.estado = "Detenido";
        }
        return viajePosible;
    }

}
