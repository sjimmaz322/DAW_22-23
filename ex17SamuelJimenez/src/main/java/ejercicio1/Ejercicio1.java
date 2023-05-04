/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1;

import java.util.List;

/**
 *
 * @author samuel
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //---
        List<Docente> listaDocentes = UtilidadesEjercicio.leerFichero("RelEmpCenAus", "txt", "\\|");
        //---
        listaDocentes.forEach(System.out::println);
    }

}
