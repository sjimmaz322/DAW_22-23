/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;
import utlidadeshospital.UtilidadesHospital;

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
        //---

        /*
        //--- ESTE COMENTARIO ES PARA COMPROBAR LOS MÉTODOS DEL EJERCICIO DE MANERA MÁS SENCILLA
        //--- USANDO NUESTRA CLASE UtilidadesHospital
        hos1.setListaTrabajadores(UtilidadesHospital.getListaEmpleados());
        hos1.setListaPacientes(UtilidadesHospital.getListaPacientes());
        //---
        System.out.println(hos1);
        //---
        System.out.println("\n--- Comprobamos el DNI del paciente ---");
        System.out.println(hos1.getListaPacientes().get(0));
        hos1.getListaPacientes().get(0).renovarNif();
        System.out.println("--- Renovamos el DNI al paciente (La fecha debería ser la fecha actual más diez años)---");
        System.out.println(hos1.getListaPacientes().get(0));
        //---
        System.out.println("--- MEDICO NO CIRUJANO ---");
        System.out.println(hos1.getListaTrabajadores().get(1).getNombre() + " paga de IRPF por estar en el grupo: " + ((Medico) hos1.getListaTrabajadores().get(1)).getGrupo());
        System.out.println(hos1.getListaTrabajadores().get(1).calcularIRPF());
        //---
        System.out.println("--- MEDICO CIRUJANO ---");
        System.out.println(hos1.getListaTrabajadores().get(2).getNombre() + " paga de IRPF por estar en el grupo: " + ((Medico) hos1.getListaTrabajadores().get(2)).getGrupo());
        System.out.println(hos1.getListaTrabajadores().get(2).calcularIRPF());
        //---
        System.out.println("--- ADMINISTRATIVO DEL GRUPO C ---");
        System.out.println(hos1.getListaTrabajadores().get(5).getNombre() + " paga de IRPF por estar en el grupo: " + ((Administrativo) hos1.getListaTrabajadores().get(5)).getGrupo());
        System.out.println(hos1.getListaTrabajadores().get(5).calcularIRPF());
        //---
        System.out.println("--- ADMINISTRATIVO DEL GRUPO D ---");
        System.out.println(hos1.getListaTrabajadores().get(6).getNombre() + " paga de IRPF por estar en el grupo: " + ((Administrativo) hos1.getListaTrabajadores().get(6)).getGrupo());
        System.out.println(hos1.getListaTrabajadores().get(6).calcularIRPF());
        System.out.println("--- ADMINISTRATIVO DEL GRUPO E ---");
        //---
        System.out.println(hos1.getListaTrabajadores().get(7).getNombre() + " paga de IRPF por estar en el grupo: " + ((Administrativo) hos1.getListaTrabajadores().get(7)).getGrupo());
        System.out.println(hos1.getListaTrabajadores().get(7).calcularIRPF());
        //---
        System.out.println("\n--- TRATAMOS A UN PACIENTE CON PANCETINA ---");
        ((Medico) hos1.getListaTrabajadores().get(3)).tratarPaciente(((Paciente) hos1.getListaPacientes().get(1)), "Pancetina 600mg");
        //---
        System.out.println("\n--- COMPROBAMOS SI LA PANCETINA CURA AL PACIENTE ---");
        hos1.getListaPacientes().get(1).tomarMedicina("Pancetina 600mg");
        //---
        System.out.println("\n--- VEMOS DE NUESTROS TRABAJADORES CUÁLES PUEDEN NADAR ---");
        for (int i = 0; i < hos1.getListaTrabajadores().size(); i++) {
            if (hos1.getListaTrabajadores().get(i) instanceof Nadadores) {
                ((Nadadores) hos1.getListaTrabajadores().get(i)).nadar();
            }
        }
        System.out.println("\n--- HACEMOS QUE UN ADMINISTRATIVO REGISTRE UN DOCUMENTO ---");
        ((Administrativo) hos1.getListaTrabajadores().get(8)).registrarDocumento("Evadir denuncias por malapraxis 101");
        //--- Cambiamos una letra del nombre del documento para ver como cambia el HashCode
        ((Administrativo) hos1.getListaTrabajadores().get(8)).registrarDocumento("Evadir denuncia por malapraxis 101");
         */
    }

    private static Paciente crearPaciente() {
        String dniText = RandomStringUtils.randomNumeric(8);
        Long num = Long.valueOf(dniText);

        String numHistoria = JOptionPane.showInputDialog("Introduzca el número de la historia del paciente");
        String nombre = JOptionPane.showInputDialog("Introduzca el nombre del paciente");
        String apellidos = JOptionPane.showInputDialog("Introduzca los apellidos del paciente");

        Paciente pAux = new Paciente(numHistoria, nombre, apellidos, new Nif(num, LocalDate.now()));

        return pAux;
    }

    private static Medico crearMedico() {
        String dniText = RandomStringUtils.randomNumeric(8);
        Long num = Long.valueOf(dniText);
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
        String dniText = RandomStringUtils.randomNumeric(8);
        Long num = Long.valueOf(dniText);
        Grupo g;
        String grupoIRPF = JOptionPane.showInputDialog("Introduzca el grupo de IRPF al que pertenece el administrativo");
        g = switch (grupoIRPF) {
            case "C" ->
                Grupo.C;
            case "D" ->
                Grupo.D;
            default ->
                Grupo.E;
        };
        String numSS = JOptionPane.showInputDialog("Introduzca el número de la Seguridad Social del administrativo");
        String nombre = JOptionPane.showInputDialog("Introduza el nombre del administrativo");
        String apellidos = JOptionPane.showInputDialog("Introduzca los apellidos del administrativo");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduza el salario del administrativo"));

        Administrativo aAux = new Administrativo(g, numSS, salario, nombre, apellidos, new Nif(num, LocalDate.now()));

        return aAux;
    }

}
