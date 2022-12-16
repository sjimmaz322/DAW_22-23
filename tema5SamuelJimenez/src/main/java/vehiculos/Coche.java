/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author samuel
 */
public class Coche {

    private Rueda ruedaDI;
    private Rueda ruedaDD;
    private Rueda ruedaTI;
    private Rueda ruedaTD;
    private Puerta puertaDerecha;
    private Puerta puertaIzquierda;
    //--- Si no lo pongo así me da TOC
    private String matricula;
    private Motor motor;

    public Coche(Rueda ruedaDI, Rueda ruedaDR, Rueda ruedaTI, Rueda ruedaTD, Puerta puertaDerecha, Puerta puertaIzquierda, String matricula, Motor motor) {
        this.ruedaDI = ruedaDI;
        this.ruedaDD = ruedaDR;
        this.ruedaTI = ruedaTI;
        this.ruedaTD = ruedaTD;
        this.puertaDerecha = puertaDerecha;
        this.puertaIzquierda = puertaIzquierda;
        this.matricula = matricula;
        this.motor = motor;
    }

    public Rueda getRuedaDI() {
        return ruedaDI;
    }

    public void setRuedaDI(Rueda ruedaDI) {
        this.ruedaDI = ruedaDI;
    }

    public Rueda getRuedaDD() {
        return ruedaDD;
    }

    public void setRuedaDD(Rueda ruedaDD) {
        this.ruedaDD = ruedaDD;
    }

    public Rueda getRuedaTI() {
        return ruedaTI;
    }

    public void setRuedaTI(Rueda ruedaTI) {
        this.ruedaTI = ruedaTI;
    }

    public Rueda getRuedaTD() {
        return ruedaTD;
    }

    public void setRuedaTD(Rueda ruedaTD) {
        this.ruedaTD = ruedaTD;
    }

    public Puerta getPuertaDerecha() {
        return puertaDerecha;
    }

    public void setPuertaDerecha(Puerta puertaDerecha) {
        this.puertaDerecha = puertaDerecha;
    }

    public Puerta getPuertaIzquierda() {
        return puertaIzquierda;
    }

    public void setPuertaIzquierda(Puerta puertaIzquierda) {
        this.puertaIzquierda = puertaIzquierda;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append("ruedaDI=").append(ruedaDI);
        sb.append(", ruedaDR=").append(ruedaDD);
        sb.append(", ruedaTI=").append(ruedaTI);
        sb.append(", ruedaTD=").append(ruedaTD);
        sb.append(", puertaDerecha=").append(puertaDerecha);
        sb.append(", puertaIzquierda=").append(puertaIzquierda);
        sb.append(", matricula=").append(matricula);
        sb.append(", motor=").append(motor);
        sb.append('}');
        return sb.toString();
    }

}
