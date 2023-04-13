/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ficherostxtrobots;

import java.awt.Robot;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author samuel
 */
public class FicheroRobots {

    /*
    Imprimir por consola y escribir en el fichero con el formato
    "Robot: id - Vida vida"
     */
    private static Random rd = new Random();

    public static void main(String[] args) {

        List<Robots> listado = Robots.generarListaRobots();
        //---
        generarFicheroRobots("robots1", "txt", listado);
        //---
        System.out.println("Vemos lo que contiene nuestro archivo");
        leerFicheroRobots("robots1", "txt");
        //---
        System.out.println("\nVemos que la lista obtenida coincide con el contenido de nuestro archivo");
        List<Robots> listadoRecibido = sacarListaDeArchivo("robots1", "txt");
        //---
        for (Robots rob : listadoRecibido) {
            System.out.println(rob.toString());
        }

    }

    public static void generarFicheroRobots(String nomFichero, String formato, List<Robots> listaR) {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idFichero = nomFichero + "." + formato;
        String tmp;
        //
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (Robots r : listaR) {
                tmp = "Robot: " + r.getNumSerie() + " - Vida: " + r.getNivelBateria() + ";";
                flujo.write(tmp);
                flujo.newLine();
            }
            flujo.flush();
            System.out.println("Fichero " + nomFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leerFicheroRobots(String nomFichero, String formato) {

        // Fichero a leer con datos de ejemplo
        String idFichero = nomFichero + "." + formato;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");

                System.out.println(tokens[0]);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Robots> sacarListaDeArchivo(String nomFichero, String formato) {
        List<Robots> lista = new ArrayList<>();

        // Fichero a leer con datos de ejemplo
        String idFichero = nomFichero + "." + formato;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                Robots r = new Robots();
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
                String txt = tokens[0];
                Pattern pat = Pattern.compile("\\d+");
                Matcher matcher = pat.matcher(txt);
                //---
                if (matcher.find()) {
                    r.setNumSerie(Integer.parseInt(matcher.group()));
                }
                if (matcher.find()) {
                    r.setNivelBateria(Integer.parseInt(matcher.group()));
                }
                lista.add(r);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

}
