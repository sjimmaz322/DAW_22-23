/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author samuel
 */
public class Jardinere extends Empleado {

    private int antiguedad;//--- Años en la empresa

    public Jardinere(int antiguedad, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
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
    public void aumentarSalario(int num) {
        num = (int)Math.abs(num*0.4);
        this.setSalario(this.getSalario() + num);
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

    @Override
    public int compareTo(Persona o) {

        return Integer.compare(antiguedad, ((Jardinere) o).getAntiguedad());

    }
}
