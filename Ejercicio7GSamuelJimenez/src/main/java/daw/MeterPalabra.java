/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */

/*
Meter por JOption palabras hasta que pongamos terminar, que las guarde en txt
 */
public class MeterPalabra {

    public static void main(String[] args) {
        String palabra;
        String nomFichero = "palabras.txt";

        //
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("./" + nomFichero + ".txt"))) {
            do {
                palabra = JOptionPane.showInputDialog("Introduce una palabra 'Si pones Terminar se acabará el programa'");
                if (!palabra.equalsIgnoreCase("Terminar")) {// Si la palabra no es Terminar la introducimos
                    flujo.write(palabra);
                    flujo.newLine();
                } else {//Si la palabra es terminar volcamos todo al archivo
                    flujo.flush();
                }
            } while (!palabra.equalsIgnoreCase("Terminar"));//Mientras que no excribamos Terminar el programa vuelve a iniciarse

            System.out.println("Fichero " + nomFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
