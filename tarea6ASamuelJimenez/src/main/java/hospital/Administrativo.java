/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author samuel
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numSS, double salario, String nombre, String apellidos, Nif dni) {
        super(numSS, salario, nombre, apellidos, dni);
        this.grupo = grupo;
    }

    public void registrarDocumento(String nombreDoc) {
        System.out.println("El administrativo " + this.getNombre() + " " + this.getApellidos() + " registró el documento " + nombreDoc + " con un id de " + nombreDoc.hashCode());
    }

    @Override
    public double calcularIRPF() {
        return switch (this.grupo) {
            case C ->
                this.getSalario() * Grupo.C.getIrpf() / 100;
            case D ->
                this.getSalario() * Grupo.D.getIrpf() / 100;
            default ->
                this.getSalario() * Grupo.E.getIrpf() / 100;
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Perteneciente al grupo de IRPF").append(grupo);
        return sb.toString();
    }

}
