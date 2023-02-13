/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosbinarios;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Coordenada {

    private int ejeX, ejeY;

    public Coordenada(int ejeX, int ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La coordenada es ");
        sb.append("[").append(ejeX).append("] - ");
        sb.append("[").append(ejeY).append("]");
        return sb.toString();
    }

}
