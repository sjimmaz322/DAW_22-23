/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class EjemploExpresionesLogicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Leer por teclado nombre y apellidos, de una persona, edad, peso (kg) y estatura (cm).
        
        Guardar en variables booleanas el resultado de evaluar las siguientes expresiones:
        
        A - Si la edad está comprendida entre 25 y 35 años ambos incluidos.
        B - Si el peso es mayor de 50 kg o menor o igual de 100 kg.
        C - Si no mide 175 cm.
        D - Si la estatura está entre 100 cm y 180 cms, excluidos ambos.
        E - Si la edad más 10 años supera los 60 años.
        F - Si el nombre es igual a "Pablo", ignorando mayúsculas y minúsculas.  Usa EqualsIgnoreCase.
        G - Si el apellido contiene la letra "j".
        H - Si el apellido termina en "-dez".
        I - Si la edad no está entre los 40 y 50 años.           
         */

        //Para leer textos y números hay que limpiar el buffer después de leer números antes que poner texto.
        //Hay que hacer un sc.next(); para limpiar el buffer.
        String nombre, apellido;
        int edad, altura;
        double peso;
        boolean edadEntre25y35, pesoMayorDe50YMenorDe100, mide175, mideEntre100Y180,
                mayorDe60, seLlamaPablo, apellidoConJ, apellidoAcabaEnDez, edadNoEntre40Y50;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduzca el apellido");
        apellido = sc.nextLine();
        sc.next();
        System.out.println("Introduzca la edad");
        edad = sc.nextInt();
        System.out.println("Introduzca la altura");
        altura = sc.nextInt();
        System.out.println("Introduzca el peso");
        peso = sc.nextDouble();

        edadEntre25y35 = edad >= 25 && edad <= 35;
        pesoMayorDe50YMenorDe100 = peso > 50 && peso < 100;
        mide175 = altura == 175;
        mideEntre100Y180 = altura > 100 && altura < 180;
        mayorDe60 = edad > 60;
        seLlamaPablo = nombre.equalsIgnoreCase("pablo");
        apellidoConJ = apellido.toLowerCase().contains("j");
        apellidoAcabaEnDez = apellido.toLowerCase().endsWith("dez");
        edadNoEntre40Y50 = edad < 40 || edad > 50;

        System.out.println("""
                           ¿La edad está comprendida entre 25 y 35 años ambos incluidos?    --- %b
                           ¿El peso es mayor de 50 y menor de 100?                          --- %b
                           ¿La altura es 175 cms?                                           --- %b
                           ¿La altura está entre 100 cms y 180 cms?                         --- %b
                           ¿La edad es mayor de 60 años?                                    --- %b
                           ¿Se llama Pablo?                                                 --- %b
                           ¿El apellido contiene la letra J?                                --- %b
                           ¿El apellido acaba en -dez?                                      --- %b
                           ¿La edad no está entre 40 y 50 años?                             --- %b
                           """.formatted(edadEntre25y35, pesoMayorDe50YMenorDe100, mide175, mideEntre100Y180, mayorDe60,
                seLlamaPablo, apellidoConJ, apellidoAcabaEnDez, edadNoEntre40Y50));

    }

}
