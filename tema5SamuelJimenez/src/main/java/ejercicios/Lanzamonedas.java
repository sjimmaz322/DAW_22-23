/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author samuel
 */
public class Lanzamonedas {

    /*
    Escribe una clase LanzarMoneda que tenga como único atributo un array de booleanos de tamaño 1000. La clase tendrá los siguientes métodos: 
    un método para rellenar el array, de forma que simule 1000 lanzamientos de una moneda. El método debe almacenar el resultado de cada tirada en el array. 
    un método para saber cuántas “caras” salieron después de los lanzamientos.
    un método para saber cuántas “cruces” salieron después de los lanzamientos.
    un método para imprimir el resultado de los 1000 lanzamientos, de forma que aparezca el número de lanzamiento y el resultado (cara o cruz)  
     */
    private boolean[] arrayMonedas;//true cara, false cruz.
    private static Random rd = new Random();

    public Lanzamonedas(int numLanzamientos) {
        this.arrayMonedas = new boolean[numLanzamientos];
    }

    public boolean[] getArrayMonedas() {
        return arrayMonedas;
    }

    public void setArrayMonedas(boolean[] arrayMonedas) {
        this.arrayMonedas = arrayMonedas;
    }

    public void rellenarArray() {
        for (int i = 0; i < this.arrayMonedas.length; i++) {
            arrayMonedas[i] = rd.nextBoolean();
        }
    }

    public int contarCaras() {
        int caras = 0;
        for (int i = 0; i < this.arrayMonedas.length; i++) {
            if (arrayMonedas[i] == true) {
                caras++;
            }
        }
        return caras;
    }

    public int contarCruces() {
        int cruces = 0;
        for (int i = 0; i < this.arrayMonedas.length; i++) {
            if (arrayMonedas[i] == false) {
                cruces++;
            }
        }
        return cruces;
    }

    public void mostrarResultados() {
        String caraOCruz = "";
        System.out.println("\nMostrando resultados\n");
        for (int i = 0; i < arrayMonedas.length; i++) {
            caraOCruz = arrayMonedas[i] ? "Cara" : "Cruz";
            System.out.println("El resultado de la tirada " + (i + 1) + " es " + caraOCruz);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lanzamonedas{");
        sb.append("arrayMonedas=").append(arrayMonedas);
        sb.append('}');
        return sb.toString();
    }

}
