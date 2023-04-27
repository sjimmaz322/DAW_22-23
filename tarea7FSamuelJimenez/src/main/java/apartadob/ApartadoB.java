/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartadob;

import daw.Ej7FSamuelJimenez;
import daw.Profesor;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ApartadoB {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        //---
        List<Profesor> lista = Ej7FSamuelJimenez.generarLista("./", "RelPerCen", "csv", ",");
        
        //--- Contar el número de profesores de Tecnología.
        int profTecnología = (int) lista.stream()
                .filter(p -> p.getPuesto().contains("Tecnología"))
                .count();
        System.out.println("Hay " + profTecnología + " profesores de tecnología.");
        
        //--- Saber si algún profesor/a de Informática es también coordinador
        boolean informaticoCoordinador = lista.stream()
                .noneMatch(p -> p.getPuesto()
                        .contains("Informática") && p.isCoordinador() == true);
        System.out.println(informaticoCoordinador ? "No hay informáticos coordinadores" : "Hay un informático coordinador");
        
        //--- Obtener una lista ordenada alfabéticamente con todos los apellidos de los empleados cuyo NIF contenga la letra J.
        System.out.println("Apellidos de profesores con DNI con J");
        List<String> apellidos = lista.stream()                
                .filter(p -> p.getDni().contains("J"))                
                .map(p -> p.getApellido())
                .collect(Collectors.toList());
        //---
        apellidos.forEach(System.out::println);
        
        //--- Verificar que ningún profesor se llama "Jonh".
        boolean hayJonh = lista.stream().anyMatch(p -> p.getNombre().contains("Jonh"));
        System.out.println(hayJonh ? "Si hay Jonh" : "No hay Jonh");
    }

}
