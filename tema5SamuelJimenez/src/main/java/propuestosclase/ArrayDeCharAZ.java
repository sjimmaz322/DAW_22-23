/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuestosclase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class ArrayDeCharAZ {

    /*
    1 - Rellenar array de char de la 'A' a la 'Z'
    2 - Generar un tamaño aleatorio entre 15 y 25
    3 - Rellenar ese tamaño con posiciones válidad aleatorias.
    4 - Generar un String sacando los valores del array
     */
    private static final Random rd = new Random();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        A -> 65
//        Z -> 90
        System.out.println("¿Cuántos String quieres generar?");
        int vueltas = sc.nextInt();
        String[] arrayAleatorio = generarStringAlfabeticosAleatorios(vueltas);

        for (int i = 0; i < arrayAleatorio.length; i++) {
            System.out.println("El String número " + (i + 1) + " es " + arrayAleatorio[i]);
        }

    }

    public static int intRangoRandom(int mayor, int menor) {
        int num = rd.nextInt(mayor - menor + 1) + menor;
        return num;
    }

    public static String[] generarStringAlfabeticosAleatorios(int num) {
        String[] aux = new String[num];
        char[] abecedario = new char[26];
        int contador = 0;

        do {
            int tamanio = intRangoRandom(25, 15);
            int[] posicionNumerica = new int[tamanio];
            String resultado = "";

            for (int i = 0; i < abecedario.length; i++) {
                abecedario[i] = (char) (65 + i);
            }

            for (int i = 0; i < posicionNumerica.length; i++) {
                posicionNumerica[i] = rd.nextInt(26);
            }

            for (int i = 0; i < posicionNumerica.length; i++) {
                String letra = String.valueOf(abecedario[posicionNumerica[i]]);
                resultado = resultado.concat(letra);
            }
            aux[contador] = resultado;
            contador++;

        } while (contador < num);

        return aux;
    }

}
