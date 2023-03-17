/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author samuel
 */
public abstract class Empleado extends Persona {

    private String numSS;
    private double salario;

    public Empleado(String numSS, double salario, String nombre, String apellidos, Nif dni) {
        super(nombre, apellidos, dni);
        this.numSS = numSS;
        this.salario = salario;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularIRPF();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Con número de la Seguridad Social ").append(numSS).append(".\n");
        sb.append("Y un salario de ").append(salario).append("€ mensuales.");
        return sb.toString();
    }

}
