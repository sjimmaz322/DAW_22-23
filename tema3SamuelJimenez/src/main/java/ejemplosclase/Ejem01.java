/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosclase;

import java.util.Scanner;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class Ejem01 {

    /*
    Muestra si la letra está contenida en el nombre.
    Muestra el número de caracteres tiene el nombre y la posición de la letra si está.
    En otro caso mostrar si el número de letras es par o impar.
     */
    public static void main(String[] args) {
        //Creamos el objeto escaner para introducir los datos
        Scanner sc = new Scanner(System.in);
        //Guardamos el nombre en un String
        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.nextLine();
        //Guardamos la letra que buscaremos en un String
        System.out.println("¿Qué letra quiere buscar?");
        String letra = sc.nextLine();

        //Guardamos en una variable la longitud del nombre
        int longitudNombre = nombre.length();

        if (nombre.toLowerCase().contains(letra.toLowerCase())) {//Si el nombre contiene la letra

            //Guardamos la posición en la que está el caracter
            int posicion = nombre.indexOf(letra);

            //Creamos un String para guardar el resultado y lo imprimimos
            String resultado = "La letra '" + letra + "' está en el nombre " + nombre + " tiene " + longitudNombre + " caracteres"
                    + " y la letra está en la posición: " + (++posicion) + " natural y el la posición " + (--posicion) + " lógica";
            System.out.println(resultado);

        } else {//Si el nombre no contiene la letra
            //Con un operador ternario guardamos el resultado de comprobar si el número de caracteres es par o no
            //Para comprobar si es divisible por 2 usamos el mod o %
            String parImpar = (longitudNombre % 2 == 0) ? "El número de caracteres del nombre es " + longitudNombre + " por ende es par"
                    : "El número de caracteres del nombre es " + longitudNombre + " por ende es impar";
            //Imprimimos el resultado
            System.out.println(parImpar);
        }

    }

}
