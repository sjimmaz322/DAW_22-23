/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio5esamueljimenez;

/**
 *
 * @author samuel
 */
public enum IVA {
    IVA4("4", 0.04),
    IVA10("10", 0.10),
    IVA21("21", 0.21);

    private final String tipoIva;
    private final double porcentajeIva;

    private IVA(String tipoIva, double porcentajeIva) {
        this.tipoIva = tipoIva;
        this.porcentajeIva = porcentajeIva;
    }

    public String getTipoIva() {
        return tipoIva;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IVA{");
        sb.append("tipoIva=").append(tipoIva);
        sb.append(", porcentajeIva=").append(porcentajeIva);
        sb.append('}');
        return sb.toString();
    }

}
