/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasderepeticion;

import java.util.Scanner;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class Ej05 {

    /*
    Implementa y completa el siguiente programa.
    Ten en cuenta que cuando se entre en cada una de las opciones (1,2 o 3) el programa realice su función.
    Esto es, si se selecciona la opción 1, el programa debe entrar en la parte de calcular el área de un cuadrado
    y debe solicitar los dos lados y mostrar el resultado. Así con el resto de opciones.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el 	área de un triángulo...");
            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }

    }
