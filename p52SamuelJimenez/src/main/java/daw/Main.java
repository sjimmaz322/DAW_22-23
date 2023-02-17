/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

/**
 *
 * @author samuel
 */
public class Main {

    public static void main(String[] args) {
        //--- Creamos nuestro laberinto a null
        Character[][] matrizPreLaberinto = null;

        try {//--- Controlamos la excepción IllegalArgumentException
            matrizPreLaberinto = UtilesLaberinto.generadorLaberinto(3);
        } catch (IllegalArgumentException iae) {
            //--- Avisamos de que el número introducido no es válido
            System.out.println("Número introducido no válido.\nValores admitidos de 3 (incl) a 10 (incl)");
            //--- Informamos que se creará una matriz por defecto según los requisitos del enunciado
            System.out.println("Asignando dimensión de 6x6 a la matriz");
            matrizPreLaberinto = UtilesLaberinto.generadorLaberinto(6);
        }

        //--- 
        System.out.println("\n----- Mostramos nuestro laberinto con letras -----");
        mostrarLaberinto(matrizPreLaberinto);

        //---
        System.out.println("\n----- Mostramos nuestro laberinto con Casillas -----");
        Casilla[][] matrizLaberinto = UtilesLaberinto.generadorLaberintoCasillas(matrizPreLaberinto);
        mostrarLaberinto(matrizLaberinto);

    }

    //--- Métodos sobrecargados para recorrer las matrices y mostrar ordenadamente su contenido
    private static void mostrarLaberinto(Character[][] m) {
        //--- Hecho con for-loop por recomendación del propio NetBeans
        for (Character[] m1 : m) {//--- Por cada uno de los Arrays de la matriz
            for (Character m11 : m1) {//--- Por cada uno de los elementos del array
                System.out.print(m11 + "\t");
            }
            System.out.println("");
        }

    }
    //---
    private static void mostrarLaberinto(Casilla[][] m) {
        for (Casilla[] m1 : m) {
            for (Casilla m11 : m1) {
                System.out.print(m11 + "\t");
            }
            System.out.println("");
        }

    }
}
