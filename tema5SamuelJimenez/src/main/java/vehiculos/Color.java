/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vehiculos;

import java.util.Random;

/**
 *
 * @author samuel
 */
public enum Color {
      ROJO, NEGRO, AZUL, AMARILLO, BLANCO;

    public static Color getAleatorio() {

        var r = new Random();
        Color[] colores = Color.values();
        int posicion = r.nextInt(0, colores.length);

        return colores[posicion];

    }

}
