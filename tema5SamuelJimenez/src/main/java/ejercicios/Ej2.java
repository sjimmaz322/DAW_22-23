/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int longitudArray, sumaAlturas = 0, alturaInferiorMedia = 0, alturaSuperiorMedia = 0, alturaIgualAmedia = 0, media;

        do {
            System.out.println("¿Cuál es la longitud del array?");
            longitudArray = sc.nextInt();
            if (longitudArray > 0) {
                break;
            }
        } while (true);

        int[] alturas = new int[longitudArray];

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("¿Cuánto mide la persona (en cms)?");
            alturas[i] = Math.abs(sc.nextInt());
            sumaAlturas += alturas[i];
        }
        media = sumaAlturas / longitudArray;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) {
                alturaSuperiorMedia++;
            } else if (alturas[i] < media) {
                alturaInferiorMedia++;
            } else {
                alturaIgualAmedia++;
            }

        }
        System.out.println("La altura media es de " + media + " cms.");
        System.out.println("Hay " + alturaInferiorMedia + " personas más bajas que la media.");
        System.out.println("Hay " + alturaIgualAmedia + " personas que miden exactamente lo mismo que la media");
        System.out.println("Hay " + alturaSuperiorMedia + " personas más altas que la media.");

    }

}
