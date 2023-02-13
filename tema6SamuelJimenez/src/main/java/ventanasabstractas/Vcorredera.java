/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanasabstractas;

/**
 *
 * @author samuel
 */
public class Vcorredera extends VentanaAbstracta {

    private int apertura;

    public Vcorredera(int apertura, boolean estado) {
        super(estado);
        this.apertura = apertura;
    }

    public Vcorredera() {
    }

    public int getApertura() {
        return apertura;
    }

    @Override
    public void abrir(int num) {
        this.setEstado(true);
        this.apertura = num;
    }

    @Override
    public void cerrar(int num) {
        this.setEstado(false);
        this.apertura = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vcorredera{");
        sb.append("apertura=").append(apertura);
        sb.append('}');
        return sb.toString();
    }

}
