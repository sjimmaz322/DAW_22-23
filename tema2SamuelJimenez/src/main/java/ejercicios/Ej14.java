package ejercicios;

import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaramos e inicializamos un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Declaramos las variables que usaremos
        int horas, minutos, segundos;

        final int SEGUNDOSENHORA = 3600,MINUTOSENHORA = 60, SEGUNDOSENMINUTO = 60;

        //Mensaje para informar de lo que se requiere que se introduzca
        System.out.println("Introduzca los segundos que quiera");

        //Declaramos e inicializamos con lo introducido por Scanner la variable segundos.      
        int tiempo = sc.nextInt();

        //Inicializamos con los cálculos las variables horas, minutos y segundos restantes
        horas = tiempo / SEGUNDOSENHORA; //Para calcular las horas hacemos el cálculo de los segundos introducimos partido los segundos en una hora
        minutos = (tiempo % SEGUNDOSENHORA) / MINUTOSENHORA;// Para calcular los minutos cogemos el resto del cálculo anterior y lo dividimos por los minutos en una hora que son iguales a los segundo por un minuto
        segundos = (tiempo % SEGUNDOSENMINUTO); //Los segundos restantes sería el resto de los segundo entre los segundos en un minuto

        //Mostramos por consola el resultado.
        System.out.println("""
                           %d segundos son:
                           %d horas.
                           %d minutos.
                           %d segundos.
                           """.formatted(tiempo, horas, minutos, segundos));

    }

}
