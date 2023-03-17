/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utlidadeshospital;

import hospital.Administrativo;
import hospital.Empleado;
import hospital.Grupo;
import hospital.Medico;
import hospital.Nif;
import hospital.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class UtilidadesHospital {

    public static List<Empleado> getListaEmpleados() {
        List<Empleado> lista = new ArrayList<>();
        //---
        lista.add(new Medico("Traumatología", Grupo.C, "000000001", 1500, "Samuel", "Jimenez", new Nif(12345678, LocalDate.now().minusYears(5))));
        lista.add(new Medico("Psicología", Grupo.E, "000000002", 1500, "Victoria", "Sampalo", new Nif(23456789, LocalDate.now().minusYears(4))));
        lista.add(new Medico("Cirugía", Grupo.D, "000000003", 1500, "Ignacio", "Salcedo", new Nif(34567891, LocalDate.now().minusYears(3))));
        lista.add(new Medico("Pediatría", Grupo.C, "000000004", 1500, "Rosa", "Claeys", new Nif(45678912, LocalDate.now().minusYears(2))));
        lista.add(new Medico("Cardiología", Grupo.C, "000000005", 1500, "Jessica", "Macioszek", new Nif(56789123, LocalDate.now().minusYears(1))));
        //---
        lista.add(new Administrativo(Grupo.C, "000000006", 1000, "Cristina", "Jiménez", new Nif(67891234, LocalDate.now().plusYears(1))));
        lista.add(new Administrativo(Grupo.D, "000000007", 1000, "José Ángel", "García", new Nif(78945612, LocalDate.now().plusYears(2))));
        lista.add(new Administrativo(Grupo.E, "000000008", 1000, "Cristina", "Hernández", new Nif(89123456, LocalDate.now().plusYears(3))));
        lista.add(new Administrativo(Grupo.C, "000000009", 1000, "Almudena", "Valbuena", new Nif(91234567, LocalDate.now().plusYears(4))));
        lista.add(new Administrativo(Grupo.E, "000000010", 1000, "María de los Ángeles", "Acosta", new Nif(98765432, LocalDate.now().plusYears(5))));
        //---
        return lista;
    }

    public static List<Paciente> getListaPacientes() {
        List<Paciente> lista = new ArrayList<>();
        //---
        lista.add(new Paciente("00100011", "Javier", "Parodi", new Nif(14725836, LocalDate.now().minusWeeks(100))));
        lista.add(new Paciente("00200012", "Clara", "Rey", new Nif(47258369, LocalDate.now().minusWeeks(110))));
        lista.add(new Paciente("00300013", "David", "Romero", new Nif(72583691, LocalDate.now().minusWeeks(120))));
        lista.add(new Paciente("00400014", "Claudia", "Pavón", new Nif(25836914, LocalDate.now().minusWeeks(130))));
        lista.add(new Paciente("00500015", "José Carlos", "Prieto", new Nif(58369147, LocalDate.now().minusWeeks(140))));
        //---
        return lista;
    }

}
