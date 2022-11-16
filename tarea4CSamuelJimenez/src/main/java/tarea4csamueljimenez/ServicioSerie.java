/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4csamueljimenez;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class ServicioSerie {

    private static Scanner sc = new Scanner(System.in);

    /*
    Me sirva de conexión entre el main y la clase Serie
     */
    public static Serie crearSerieTeclado() {
        Serie s1 = new Serie();

        System.out.println(" ");
        System.out.println("¿Cuál es el título de la serie?");
        String titulo = sc.nextLine();
        s1.setTitulo(titulo);

        System.out.println("¿De qué género es la serie?");
        String genero = sc.nextLine();
        s1.setGenero(genero);

        System.out.println("¿Cuál es la sinopsis de la serie?");
        String sinopsis = sc.nextLine();
        s1.setSinopsis(sinopsis);

        System.out.println("¿Quién dirigió/produció la serie?");
        String direcProdu = sc.nextLine();
        s1.setDirectorProductor(direcProdu);

        int numTem = pedirIntConsola("¿Cuántas temporadas tienes?");
        s1.setNumTemporadas(numTem);

        int likes = pedirIntConsola("¿Cuántos likes tiene?");
        s1.setNumLikes(likes);

        return s1;
    }

    public static void preguntarLike(Serie s) {
        sc.next();
        System.out.println("¿Te ha gustado " + s.getTitulo() + "?");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            s.setNumLikes(s.getNumLikes() + 1);
        }
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
