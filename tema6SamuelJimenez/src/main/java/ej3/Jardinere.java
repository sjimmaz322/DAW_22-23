/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author samuel
 */
public class Jardinere extends Persona {

    private int antiguedad;//--- Años en la empresa

    public Jardinere(int antiguedad, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.antiguedad = antiguedad;
    }

    public Jardinere() {
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Jardinere{");
        sb.append("antiguedad=").append(antiguedad);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Jardinere o) {
        return Integer.compare(antiguedad, o.getAntiguedad());
    }

}
