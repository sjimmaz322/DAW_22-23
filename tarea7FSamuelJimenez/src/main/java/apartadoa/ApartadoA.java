/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartadoa;

import daw.Ej7FSamuelJimenez;
import daw.Profesor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ApartadoA {

    /**
     * @param args the command line arguments
     */
    //---
    /*
    a) Sin usar API Stream

    - Contar el número de profesores de Tecnología.
    - Saber si algún profesor/a de Informática es también coordinador
    - Obtener una lista ordenada alfabéticamente con todos los apellidos de los empleados cuyo NIF contenga la letra J.
    - Verificar que ningún profesor se llama "Jonh".
     */
    public static void main(String[] args) {
        //---
        List<Profesor> lista = Ej7FSamuelJimenez.generarLista("./", "RelPerCen", "csv", ",");
        //---Buscamos cuantos profesores de tecnología hay
        int numProfTecno = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPuesto().contains("Tecnología")) {
                numProfTecno++;
            }
        }
        //---Imprimimos el resultado
        System.out.println("Hay " + numProfTecno + " profesores de tecnología");
        //---
        boolean informaticoCoordinador = false;
        //---Buscamos si hay algún informático que sea coordinador
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPuesto().contains("Informática") && (lista.get(i).isCoordinador() == true)) {
                informaticoCoordinador = true;
            }
        }
        //--- Respondemos a la pregunta
        System.out.println("\n¿Hay al menos un  profesor de informática que también sea coordinador?");
        System.out.println(informaticoCoordinador ? "Si lo hay\n" : "No lo hay\n");
        //---
        //--- Creamos la lista para los apellidos
        List<String> apellidos = new ArrayList<>();
        //--- Seleccionamos los apellidos de los profesores cuyo DNI contenga la letra J
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDni().contains("J")) {
                apellidos.add(lista.get(i).getApellido());
            }
        }
        //--- Ordenamos la lista por orden alfabético
        apellidos.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("Imprimimos la lista de los apellidos de quien tiene un DNI con J");
        apellidos.forEach(System.out::println);
        //---
        //--- Comprobamos si hay algún profesor llamado Jonh
        boolean hayJonh = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase("Jonh")) {
                hayJonh = true;
                break;
            }
        }
        System.out.println("\n¿Algún profesor se llama Jonh?");
        System.out.println(hayJonh ? "Hay un profesor llamado Jonh" : "Nadie de la plantilla se llama Jonh");
    }

}
