/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class GestionHospital {

    private static Random rd = new Random();

    public static void main(String[] args) {

        Hospital hos1 = new Hospital("Hospital Virgen de los Hostiones", "Calle Piñazo nº 3", 200);
        //---
        Empleado e1 = crearMedico();
        Empleado e2 = crearMedico();
        Empleado e3 = crearPersonalPas();
        Empleado e4 = crearPersonalPas();
        Empleado e5 = crearPersonalPas();
        //---
        Paciente p1 = crearPaciente();
        Paciente p2 = crearPaciente();
        Paciente p3 = crearPaciente();
        Paciente p4 = crearPaciente();
        Paciente p5 = crearPaciente();
        //---
        hos1.contratarEmpleado(e1);
        hos1.contratarEmpleado(e2);
        hos1.contratarEmpleado(e3);
        hos1.contratarEmpleado(e4);
        hos1.contratarEmpleado(e5);
        //---
        hos1.ingresarPaciente(p1);
        hos1.ingresarPaciente(p2);
        hos1.ingresarPaciente(p3);
        hos1.ingresarPaciente(p4);
        hos1.ingresarPaciente(p5);
        //---
        System.out.println(hos1);
    }

    private static Paciente crearPaciente() {
        Long num = rd.nextLong(99999999) + 1;

        String numHistoria = JOptionPane.showInputDialog("Introduzca el número de la historia del paciente");
        String nombre = JOptionPane.showInputDialog("Introduzca el nombre del paciente");
        String apellidos = JOptionPane.showInputDialog("Introduzca los apellidos del paciente");

        Paciente pAux = new Paciente(numHistoria, nombre, apellidos, new Nif(num, LocalDate.now()));

        return pAux;
    }

    private static Medico crearMedico() {
        Long num = rd.nextLong(99999999) + 1;
        Grupo g;
        String especialidad = JOptionPane.showInputDialog("Introduzca la especialidad del médico");
        String grupoIRPF = JOptionPane.showInputDialog("Introduzca el grupo de IRPF al que pertenece el médico");
        g = switch (grupoIRPF) {
            case "C" ->
                Grupo.C;
            case "D" ->
                Grupo.D;
            default ->
                Grupo.E;
        };
        String numSS = JOptionPane.showInputDialog("Introduzca el número de la Seguridad Social del médico");
        String nombre = JOptionPane.showInputDialog("Introduza el nombre del médico");
        String apellidos = JOptionPane.showInputDialog("Introduzca los apellidos del médico");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduza el salario del médico"));

        Medico mAux = new Medico(especialidad, g, numSS, salario, nombre, apellidos, new Nif(num, LocalDate.now()));

        return mAux;
    }

    private static Administrativo crearPersonalPas() {
        Long num = rd.nextLong(99999999) + 1;
        Grupo g;
        String grupoIRPF = JOptionPane.showInputDialog("Introduzca el grupo de IRPF al que pertenece el médico");
        g = switch (grupoIRPF) {
            case "C" ->
                Grupo.C;
            case "D" ->
                Grupo.D;
            default ->
                Grupo.E;
        };
        String numSS = JOptionPane.showInputDialog("Introduzca el número de la Seguridad Social del médico");
        String nombre = JOptionPane.showInputDialog("Introduza el nombre del médico");
        String apellidos = JOptionPane.showInputDialog("Introduzca los apellidos del médico");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduza el salario del médico"));

        Administrativo aAux = new Administrativo(Grupo.C, numSS, salario, nombre, apellidos, new Nif(num, LocalDate.now()));

        return aAux;
    }

}
