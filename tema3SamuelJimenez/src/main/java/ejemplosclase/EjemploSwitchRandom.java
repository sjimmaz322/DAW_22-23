/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosclase;

import com.sun.source.tree.SwitchTree;
import java.util.Random;
import java.util.Scanner;
import utilidadespropias.MisUtilidades;

/**
 *
 * @author samuel
 */
public class EjemploSwitchRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ENUNCIADO
        /*
        Devuelva un número.
        Si el usuario introduce A, B o C, se debe guardar un aleatorio entre 1 y 10.
        
        Si  introduce D, guardar aleatorio entre 11 y 25.
        
        Si introduce E, guardar aleatorio entre 26 y 33.
        
        En otro caso aleatorio entre 34 y 100.
         */

        //Creamos el objeto Random llamado rd con el constructor.
        Random rd = new Random();
        //Creamos el objejo Scanner llamado sc con su constructor.
        Scanner sc = new Scanner(System.in);

        //Creamos las variables necesarias.
        int numAleatorio;
        String letraIntroducida;

        //Solicitamos por consola la introducción de la letra, la guardamos en letraIntroducida
        System.out.println("Introduza la letra deseada");
        letraIntroducida = sc.nextLine();

        //Creamos un SwtchArrow para darle funcionalidad a nuestro programa
        numAleatorio = switch (letraIntroducida) {
            case "A","B","C" ->
                rd.nextInt(10) + 1;
            case "D" ->
                rd.nextInt(25 - 11 + 1) + 11;
            case "E" ->
                rd.nextInt(33 - 26 + 1) + 26;
            default ->
                rd.nextInt(100 - 34 + 1) + 34;
        };

        //Imprimimos por consola el resultado
        System.out.println("El número resultante es " + numAleatorio);

    }

}
