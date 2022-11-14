/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

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

        System.out.println("¿Cuántas temporadas tienes?");
        int numTem = sc.nextInt();
        s1.setNumTemporadas(numTem);

        System.out.println("¿Cuántos likes tiene?");
        int likes = sc.nextInt();
        s1.setNumLikes(likes);

        return s1;
    }
}
