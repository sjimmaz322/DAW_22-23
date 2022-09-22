/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class Deporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitar al usuaro los minutos que está corriendo Forrest Gump
        //El programa tiene que decir la distncia que recorre suponiendo que corre a 8 km/h

        //Creamos el objeto Scanner para la petición de datos por teclado
        Scanner sc = new Scanner(System.in);

        //Declaramos e inicializamos las constantes y las variables
        final int VELOCIDADFORREST = 8;
        final double MINUTOSPORHORA = 60.0;

        double distanciaRecorrida;
        double tiempoCorrido;

        //Sout para pedir introducir el valor de la variable tiempoRecorrido
        System.out.println("¿Cuántos minutos corre Forrest corre?");

        tiempoCorrido = sc.nextDouble();

        //Inicializamos la variable distanciaRecorrida con la cuenta necesaria
        distanciaRecorrida = ((tiempoCorrido / MINUTOSPORHORA) * VELOCIDADFORREST);

        //Imprimimos el resultado por consola
        System.out.println("Forrest corre en " + tiempoCorrido + " minutos una distancia de " + distanciaRecorrida + " km.");

    }

}
