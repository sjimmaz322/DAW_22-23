/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author samuel
 */
public class Medico extends Empleado implements Nadadores {

    private String especialidad;
    private Grupo grupo;

    public Medico(String especialidad, Grupo grupo, String numSS, double salario, String nombre, String apellidos, Nif dni) {
        super(numSS, salario, nombre, apellidos, dni);
        this.especialidad = especialidad;
        this.grupo = grupo;
    }

    public void tratarPaciente(Paciente p, String medicina) {
        System.out.println("El médico " + this.getNombre() + " trata con " + medicina + " al paciente " + p.getNombre());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    

    @Override
    public double calcularIRPF() {

        if (especialidad.equalsIgnoreCase("Cirugía")) {
            return ((this.getSalario() * 25) / 100);
        } else {
            return ((this.getSalario() * 23.5) / 100);
        }
    }

    @Override
    public void nadar() {
        System.out.println("El médico " + this.getNombre() + " sabe nadar.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Perteneciente al grupo de IRPF ").append(grupo).append("\n");
        sb.append("De la especialidad de ").append(especialidad).append("\n");
        return sb.toString();

    }

}
