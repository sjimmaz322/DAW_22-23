/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author samuel
 */
public class UtilesLaberinto {

    //--- Random para generar aleatoriamente los valores de las celdas de la matriz de Character
    private static final Random rd = new Random();

    public static Character[][] generadorLaberinto(int n) {
        //--- Lanzamos la excepción si el número es menor que 3 o mayor que 10
        if (n < 3 || n > 10) {
            throw new IllegalArgumentException("Número introducido fuera del rango permitido");
        }
        //--- Creamos nuestra matriz si no saltó la excepión
        Character[][] matriz = new Character[n][n];
        boolean tmp;
        //--- Recorremos toda la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                tmp = rd.nextBoolean();//--- Si el random es true guardamos 'c', sino guardamos 'b'
                if (tmp == true) {
                    matriz[i][j] = 'c';
                } else {
                    matriz[i][j] = 'b';
                }
            }
        }
        return matriz;//--- Devolvemos la matriz rellena
    }

    public static Casilla[][] generadorLaberintoCasillas(Character[][] m) {
        //--- Creamos una matriz de Casillas con la misma dimensión de la original, aprovechamos que es una matriz cuadrada
        int num = m.length;
        Casilla[][] matriz = new Casilla[num][num];
        //--- Recorremos la matriz completa
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (m[i][j] == 'c') {//--- Si la celda contenía una 'c' creamos una casilla de tipo CAMINO
                    matriz[i][j] = new Casilla(i, j, TipoCasilla.Camino);
                } else {//--- Si contenía otra cosa, en este caso solo puede ser una 'b', la casilla será de tipo BOSQUE
                    matriz[i][j] = new Casilla(i, j, TipoCasilla.Bosque);
                }
            }
        }
        return matriz; //--- Devolvemos la matriz
    }

}
