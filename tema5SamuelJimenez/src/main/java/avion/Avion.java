/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avion;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Avion {

    private Asiento[][] asientos;

    public Avion() {
        this.asientos = new Asiento[25][4];
    }

    public Avion(int filas, int asientosPorFila) {
        this.asientos = new Asiento[filas][asientosPorFila];
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public int numeroDeFilas() {
        return this.asientos.length;
    }

    public int asientosPorCadaFila() {
        return this.asientos[1].length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("En nuestro avión\n");
        sb.append("La lista de asientos ofrecidos es: \n");
        for (int i = 0; i < numeroDeFilas(); i++) {
            for (int j = 0; j < asientosPorCadaFila(); j++) {
                this.asientos[i][j].toString();
            }

        }
        return sb.toString();
    }

}
