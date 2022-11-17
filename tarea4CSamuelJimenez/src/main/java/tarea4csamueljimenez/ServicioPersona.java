/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4csamueljimenez;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ServicioPersona {

    private static final Scanner sc = new Scanner(System.in);

    public static Persona crearRegistroPersona() {
        String nombre, sexoString;
        int edad;
        char sexo;
        double altura, peso;
        System.out.println("¿Cuál es el nombre de la persona?");
        nombre = sc.nextLine();
        System.out.println("¿Cuál es el sexo de la persona?");
        sexoString = sc.nextLine();
        sexo = sexoString.charAt(0);
        edad = pedirIntConsola("¿Cuál es la edad de la persona?");
        peso = pedirDoubleConsola("¿Cuánto pesa la persona?");
        altura = pedirDoubleConsola("¿Cuánto mide la persona?");

        Persona p1 = new Persona(nombre, sexo, edad, peso, altura);
        return p1;
    }

    public static double pedirDoubleConsola(String mensaje) {
        double num;
        do {
            num = 0;
            System.out.println(mensaje);
            try {
                num = sc.nextDouble();
                break;
            } catch (NumberFormatException | InputMismatchException nfe) {
                System.out.println("Introduzca un número válido");
                sc.nextLine();
            }
        } while (true);
        return num;
    }

    public static int pedirIntConsola(String mensaje) {
        int num;
        do {
            num = 0;
            System.out.println(mensaje);
            try {
                num = sc.nextInt();
                break;
            } catch (NumberFormatException | InputMismatchException nfe) {
                System.out.println("Introduzca un número válido");
                sc.nextLine();
            }
        } while (true);
        return num;
    }
}
