package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        int horas, minutos, segundosRestantes;

        //Mensaje para informar de lo que se requiere que se introduzca
        System.out.println("Introduzca los segundos que quiera");
        
        //Declaramos e inicializamos con lo introducido por Scanner la variable segundos.      
        int segundos = sc.nextInt();
        
        //Inicializamos con los cálculos las variables horas, minutos y segundos restantes
        horas = segundos/3600; //Para calcular las horas hacemos el cálculo de los segundos introducimos partido los segundos en una hora
        minutos = (segundos%3600)/60;// Para calcular los minutos cogemos el resto del cálculo anterior y lo dividimos por los minutos en una hora
        segundosRestantes = (segundos%60); //Los segundos restantes sería el resto de los segundo entre los segundos en un minuto
        
        //Mostramos por consola el resultado.
        System.out.printf(segundos+" son:"
         + "\nHoras: "+horas
        +"\nMinutos: "+minutos
        +"\nSegundos: "+ segundosRestantes);
        
//        //Mostramos por ventana los resultados.
//        JOptionPane.showMessageDialog(null, (segundos+" son:"
//         + "\nHoras: "+horas
//        +"\nMinutos: "+minutos
//        +"\nSegundos: "+ segundosRestantes));

    }

}
