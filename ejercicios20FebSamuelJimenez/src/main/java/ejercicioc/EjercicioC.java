/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class EjercicioC {

    /*
    c) Inventa una jerarquía sencilla de clases, con una superclase abstracta y dos subclases.
    La superclase debe contener un método abstracto. Cada subclase debe añadir (no sobrescribir) al menos un método propio,
    y tener al menos un atributo propio de la clase, no presente en la clase padre. Sobrescribe el método abstracto en las subclases y el método toString,
    mostrando información de la superclase y la propia clase. Crea una lista de varios objetos de la superclase. Recorre la lista de objetos,
    llamando a los métodos polimórficos. Dentro del bucle anterior, ejecuta el método propio de cada subclase, ayudándote de instanceof.
    Indica, mediante comentarios del código, donde hay conversiones implícitas y explícitas de tipos de datos. 
    Ordena la lista usando <<Comparator>> por algún atributo de la superclase. Imprime el resultado.
    Realiza una búsqueda binaria de algún elemento de la lista ordenada.
     */
    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        //---
        Empleado e1 = new Backender("Java", "Bobby", "Williams", 23, 1);
        Empleado e2 = new Backender("C#", "Nathalie", "Romanova", 28, 0);
        Empleado e3 = new Backender("Python", "Paulo", "Dosantos", 22, 4);
        Empleado e4 = new Frontender("Azul", "Margarett", "Beauxbouf", 45, 15);
        Empleado e5 = new Frontender("Naranja", "Beatrice", "Marell", 23, 2);
        //---
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
        //---
        for (Empleado emp : listaEmpleados) {
            emp.trabajar();//-- Aquí hay conversiones implícitas, las hace directamente el programa
            if (emp instanceof Backender) {
                ((Backender) emp).documentarCodigo();//--- Aquí tenemos una conversión explícita, la forzamos nosotros manualmente
            }
            if (emp instanceof Frontender) {
                ((Frontender) emp).buscarPaleta();
            }
            System.out.println("");
        }
        //---
        Comparator<Empleado> criterioAntiguedad = (em1, em2) -> Integer.compare(em1.getAntiguedad(), em2.getAntiguedad());
        Collections.sort(listaEmpleados, criterioAntiguedad);
        //---
        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.getNombre() + " lleva " + emp.getAntiguedad() + " años en la empresa.");
        }
        //---
        int pos = Collections.binarySearch(listaEmpleados, e3, criterioAntiguedad);
        System.out.println("\nPaulo está en la posición " + pos);

    }

}
