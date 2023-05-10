/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] m = leerFichero("concierto", "txt");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);

            }

        }

    }

    public static char[][] leerFichero(String nomFichero, String formato) {

        char[][] matriz = new char[6][11];
        int contador = 0;
        //
        String idFichero = "./" + nomFichero + "." + formato;
        // Variables para guardar los datos que se van leyendo
        String linea;

        //
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            //--- toCharArray probarlo en casa
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                contador++;
                char[] s = new char[linea.length()];
                for (int i = 0; i < linea.length(); i++) {
                    s[i] = linea.charAt(i);
                }
                matriz[contador] = s;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return matriz;
    }

}
