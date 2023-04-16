/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;
import vehiculos.Deportivo;
import vehiculos.Furgoneta;
import vehiculos.Turismo;
import vehiculos.Vehiculo;

/**
 *
 * @author samuel
 */
public class Ejercicio7BSamuelJimenez {

    /*
//////    A.- Generación del fichero vehiculos.txt
//////    Usando la jerarquía de la clase Vehículo, implementa un programa que realice lo siguiente:
//////
//////    Crea 30 vehículos (10 Turismos, 10 Deportivos y 10 Furgonetas) con valores de tu elección y guárdalos en una lista de objetos tipo Vehiculo.
//////    Guarda los vehículos en un fichero de texto llamado “vehículos.txt”, haciendo uso del método polimórfico toString(), 
//////    teniendo en cuenta que el string devuelto lleve separados los campos del objeto por el carácter dos puntos (:).
//////    Cada línea del fichero estará compuesta por un número, un espacio, un guión, un espacio y los datos del vehículo en cuestión. 
//////    El número de cada línea será 0, 1 o 2 si el objeto es un Turismo, un Deportivo o una Furgoneta, respectivamente. 
//////    Cada vehículo irá en una línea distinta del fichero.
//////    Ejemplos de líneas, los campos no tienen porqué coincidir con los de tus clases:
//////
//////    0 – 4534JTK:Seat:Ibiza:Blanco:… (Este vehículo sería un Turismo)
//////    1 – 3322FFF:Ford:Kuga:Rojo:… (Este vehículo sería un Deportivo)


//////    B.- Lectura del fichero vehiculos.txt
//////    Realiza un programa que lea los datos fichero vehiculos.txt. 
//////    Para ello creará una lista de objetos de tipo Vehículo. 
//////    El programa irá almacenando en la lista los objetos leídos desde el archivo de texto “vehículos.txt”. 
//////    Una vez cargados todos los datos en la lista, ordena los vehículos por Marca y muestra el resultado por consola.


    C.- Generación de turismos.txt, deportivos.txt, furgonetas.txt.
    A partir de los datos almacenados en vehiculos.txt, crea tres archivos de texto para almacenar los vehículos del mismo tipo.  
    
     */
    private static Random rd = new Random();

    public static void main(String[] args) {
        List<Vehiculo> lista = generarLista();
        //---
        lista.forEach(System.out::println);
        //---
        generarFichero("vehículos", "txt", lista);
        //---
        List<Vehiculo> listaOrdenada = generarListaVehiculosDesdeArchivo("vehículos", "txt", ":");
        //---
        System.out.println("\nVEMOS LA LISTA ORDENADA\n");
        listaOrdenada.forEach(System.out::println);
        //---
        generarFicherosTipoVehiculo(listaOrdenada);

    }

    public static List<Vehiculo> generarLista() {
        List<Vehiculo> lista = new ArrayList<>();
        String numBastidor;
        String numMatricula;
        String marca;
        String color;
        int opt;
        numBastidor = RandomStringUtils.randomNumeric(17);
        numMatricula = RandomStringUtils.randomNumeric(4) + "-" + RandomStringUtils.randomAlphabetic(3).toUpperCase();

        for (int i = 0; i < 10; i++) {

            numBastidor = RandomStringUtils.randomNumeric(17);
            numMatricula = RandomStringUtils.randomNumeric(4) + "-" + RandomStringUtils.randomAlphabetic(3).toUpperCase();
            opt = rd.nextInt(5);
            switch (opt) {
                case 0:
                    marca = "Renault";
                    color = "Blanco";
                    break;
                case 1:
                    marca = "FIAT";
                    color = "Rojo";
                    break;
                case 2:
                    marca = "Mercedes";
                    color = "Verde";
                    break;
                case 3:
                    marca = "Dacia";
                    color = "Gris";
                    break;
                case 4:
                    marca = "Suzuki";
                    color = "Azul";
                    break;
                default:
                    marca = "Honda";
                    color = "Amarillo";
            }

            Vehiculo v = new Turismo(Long.valueOf(numBastidor), numMatricula, marca, "V" + opt, color, rd.nextInt(150) + 1, rd.nextInt(5 - 3 + 1) + 3, rd.nextBoolean());
            lista.add(v);
        }

        for (int i = 0; i < 10; i++) {

            numBastidor = RandomStringUtils.randomNumeric(17);
            numMatricula = RandomStringUtils.randomNumeric(4) + "-" + RandomStringUtils.randomAlphabetic(3).toUpperCase();

            opt = rd.nextInt(5);
            switch (opt) {
                case 0:
                    marca = "Renault";
                    color = "Blanco";
                    break;
                case 1:
                    marca = "FIAT";
                    color = "Rojo";
                    break;
                case 2:
                    marca = "Mercedes";
                    color = "Verde";
                    break;
                case 3:
                    marca = "Dacia";
                    color = "Gris";
                    break;
                case 4:
                    marca = "Suzuki";
                    color = "Azul";
                    break;
                default:
                    marca = "Honda";
                    color = "Amarillo";
            }

            Vehiculo v = new Deportivo(Long.valueOf(numBastidor), numMatricula, marca, "V" + opt, color, rd.nextInt(1000 - 500 + 1) + 500, rd.nextInt(300 - 60 + 1) + 60);
            lista.add(v);
        }

        for (int i = 0; i < 10; i++) {

            numBastidor = RandomStringUtils.randomNumeric(17);
            numMatricula = RandomStringUtils.randomNumeric(4) + "-" + RandomStringUtils.randomAlphabetic(3).toUpperCase();

            opt = rd.nextInt(5);
            switch (opt) {
                case 0:
                    marca = "Renault";
                    color = "Blanco";
                    break;
                case 1:
                    marca = "FIAT";
                    color = "Rojo";
                    break;
                case 2:
                    marca = "Mercedes";
                    color = "Verde";
                    break;
                case 3:
                    marca = "Dacia";
                    color = "Gris";
                    break;
                case 4:
                    marca = "Suzuki";
                    color = "Azul";
                    break;
                default:
                    marca = "Honda";
                    color = "Amarillo";
            }

            Vehiculo v = new Furgoneta(Long.valueOf(numBastidor), numMatricula, marca, "V" + opt, color, rd.nextInt(200) + 1, rd.nextInt(3500 - 1000 + 1) + 1000, rd.nextInt(500 - 200 + 1) + 200);
            lista.add(v);
        }

        return lista;
    }

    public static void generarFichero(String nomFichero, String formato, List<Vehiculo> l) {

        String idFichero = nomFichero + "." + formato;
        String tmp;
        String tipoVehi = "";
        //---
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (Vehiculo v : l) {
                if (v instanceof Turismo) {
                    tipoVehi = "0 - ";
                }
                if (v instanceof Deportivo) {
                    tipoVehi = "1 - ";
                }
                if (v instanceof Furgoneta) {
                    tipoVehi = "2 - ";
                }

                tmp = tipoVehi + v.toString();

                flujo.write(tmp);
                flujo.newLine();
            }

            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<Vehiculo> generarListaVehiculosDesdeArchivo(String nomFichero, String formato, String separador) {
        List<Vehiculo> lista = new ArrayList<>();
        Comparator<Vehiculo> criterioMarca = (v1, v2) -> v1.getMarca().compareToIgnoreCase(v2.getMarca());
        //---
        String idFichero = nomFichero + "." + formato;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        //---

        //---
        Vehiculo v = null;
        //---
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(separador);
                // Convierte en String tokens
                if (linea.contains("0 - ")) {//--- Si es un turismo
                    tokens[0] = tokens[0].replaceAll("0 - ", "");

                    v = new Turismo(Long.valueOf(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], Double.parseDouble(tokens[5]), Integer.parseInt(tokens[7]), Boolean.parseBoolean(tokens[8]));
                }
                if (linea.contains("1 - ")) {//--- Si es un deportivo
                    tokens[0] = tokens[0].replaceAll("1 - ", "");
                    v = new Deportivo(Long.valueOf(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], Double.parseDouble(tokens[5]), Integer.parseInt(tokens[7]));

                }
                if (linea.contains("2 - ")) {//--- Si es una furgoneta
                    tokens[0] = tokens[0].replaceAll("2 - ", "");
                    v = new Furgoneta(Long.valueOf(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], Double.parseDouble(tokens[5]), Integer.parseInt(tokens[7]), Integer.parseInt(tokens[8]));
                }

                lista.add(v);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //---
        Collections.sort(lista, criterioMarca);
        return lista;

    }

    public static void generarFicheroIndividual(String nomFichero, String formato, List<Vehiculo> l) {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idFichero = nomFichero + "." + formato;
        String tmp;
        //
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (Vehiculo v : l) {
                tmp = v.toString();
                flujo.write(tmp);
                flujo.newLine();
            }
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void generarFicherosTipoVehiculo(List<Vehiculo> lista) {
        List<Vehiculo> turismos = new ArrayList<>();
        List<Vehiculo> deportivos = new ArrayList<>();
        List<Vehiculo> furgonetas = new ArrayList<>();
        //---
        for (Vehiculo v : lista) {
            if (v instanceof Turismo) {
                turismos.add(v);
            }
            if (v instanceof Deportivo) {
                deportivos.add(v);
            }
            if (v instanceof Furgoneta) {
                furgonetas.add(v);
            }
            //---
            generarFicheroIndividual("Turismos", "txt", turismos);
            generarFicheroIndividual("Deportivos", "txt", deportivos);
            generarFicheroIndividual("Furgonetas", "txt", furgonetas);
        }
    }
}
