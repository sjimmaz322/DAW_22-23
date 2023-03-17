/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Random;

/**
 *
 * @author samuel
 */
public class Paciente extends Persona implements Nadadores {

    private Random rd = new Random();
    private String numHistoria;

    public Paciente(String numHistoria, String nombre, String apellidos, Nif dni) {
        super(nombre, apellidos, dni);
        this.numHistoria = numHistoria;
    }

    public void tomarMedicina(String medicina) {
        boolean bool = rd.nextBoolean();
        if (bool) {
            System.out.println("El paciente " + this.getNombre() + " se ha curado gracias a la  " + medicina);
        } else {
            System.out.println("El paciente " + this.getNombre() + " no ha conseguido curarse con " + medicina);
        }
    }

    @Override
    public void nadar() {
        System.out.println("El paciente " + this.getNombre() + " sabe nadar.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Con número de historia clínica: ").append(numHistoria).append("\n");
        return sb.toString();
    }

}
