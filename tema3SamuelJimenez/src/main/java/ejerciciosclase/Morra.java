/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.Random;

/**
 *
 * @author samuel
 */
public class Morra {

    /*
    Programa para jugar a Morra. (Está en wikipedia)
     */
    private static Random rd = new Random();

    public static void main(String[] args) {

        int numDedosJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente("¿Cuántos dedos desea sacar?", 10, 0);

        int numDedosMaquina = dedosMaquina();

    }

    private static int dedosMaquina() {
        int dedos = utilidadespropias.Utilidades.intRangoRandom(10, 0);
        return dedos;
    }

}
