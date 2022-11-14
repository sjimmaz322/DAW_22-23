/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajascarton;

/**
 *
 * @author samuel
 */
public class CajaCarton {

    private double alto, ancho, largo, peso;

    public CajaCarton() {
        this.alto = 0;
        this.ancho = 0;
        this.largo = 0;
        this.peso = 0;
    }

    public CajaCarton(double alto, double ancho, double largo, double peso) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void Abrir() {

    }

    public void Cerrar() {

    }

    @Override
    public String toString() {
        return "La caja de cartón tiene:\n"
                + "De alto " + alto + " mm\n"
                + "De ancho " + ancho + " mm\n"
                + "De largo " + largo + " mm\n"
                + "Y pesa " + peso + " gramos";

    }

}
