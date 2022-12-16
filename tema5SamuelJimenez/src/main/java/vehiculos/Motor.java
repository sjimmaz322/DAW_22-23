/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author samuel
 */
public class Motor {

    private int cc;
    private boolean estado;//true encendido, false apagado.

    public Motor() {
    }

    public Motor(int cc, boolean estado) {
        this.cc = cc;
        this.estado = estado;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean getEstado() {
        return estado;
    }

    public void arrancar() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor{");
        sb.append("cc=").append(cc);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

}
