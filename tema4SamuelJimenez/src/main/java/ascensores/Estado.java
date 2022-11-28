/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ascensores;

/**
 *
 * @author samuel
 */
public enum Estado {
    SUBIENDO("Subiendo"),
    BAJANDO("Bajando"),
    DETENIDO("Detenido"),
    AVERIADO("Averiado");

    private String estado;

    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return estado;
    }

}
