/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej7FSamuelJimenez {

    /*
    Abre el fichero adjunto, estudia su contenido (datos de ejemplo inventados) y crea una clase Java (POJO) para guardar los registros del fichero adjunto.
    Recuerda que una clase POJO es aquella que contiene como mínimo los atributos encapsulados, getters, setters y toString, equals, hashcode.
    Estas clases no suelen implementar constructor parametrizado, aunque se puede poner.

    Crea una clase que contenga el método main() y gestione la lectura del fichero adjunto. 
    Ten en cuenta que la codificación que ha usado el sistema Séneca para exportar el fichero ha sido ISO-8859-1. 
    Puedes leer el fichero completo y después crear una lista de objetos o bien hacerlo línea a línea.

    Una vez tengas  la lista con todos los registros cargados guarda en un fichero JSON la lista de empleados que, contando a partir de hoy,
    lleven trabajando más de 10 y menos de 15 años (ten en cuenta la fecha de toma de posesión en el puesto de trabajo).

    Las lecturas y escrituras de los ficheros se realizan de forma relativa a la carpeta raíz del proyecto Java. Cuanto más modularizado esté todo mejor.

       
     */
    public static void main(String[] args) throws IOException {

        //---
        List<Profesor> profesorado = generarLista("./", "RelPerCen", "csv", ",");
        //---
        // profesorado.forEach(System.out::println);
        //---Filtramos los profesores que lleven entre 15 y 10 años trabajando
        List<Profesor> profesoradoFiltrado = profesorado.stream()
                .filter(p -> p.getFechaTomaPasicion().isAfter(LocalDate.now().minusYears(15)))
                .filter(p -> p.getFechaTomaPasicion().isBefore(LocalDate.now().minusYears(10)))
                .toList();
        //---
        ObjectMapper mapeador = new ObjectMapper();
        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());
        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        //--- mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        //--- Creamos el archivo con todos los profesores
        //--- generarJSON("./listadoProfesores", profesorado);
        //--- Creamos el archivo con los profesores que llevan entre 10 y 15 años trabajando
        generarJSON("./listadoProfesoresFiltrados", profesoradoFiltrado);
        //---

    }

    public static List<Profesor> generarLista(String ruta, String nomFichero, String formato, String separador) {
        //---
        List<Profesor> lista = new ArrayList<>();
        //---
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //---
        String idFichero = ruta + nomFichero + "." + formato;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        //---
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                Profesor p = new Profesor();
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                // Convierte en String tokens
                tokens = linea.split(separador);
                //--- Eliminamos los caracteres " para evitar fallos al parsear
                for (int i = 0; i < tokens.length; i++) {
                    tokens[i] = tokens[i].replaceAll("\"", "");
                }
                //--- Guardamos cada elemento en su token correspondiente
                p.setApellido(tokens[0]);
                p.setNombre(tokens[1]);
                p.setDni(tokens[2]);
                p.setPuesto(tokens[3]);
                //--- bloque try-catch para evitar excepciones al tener la fecha vacía
                try {
                    p.setFechaTomaPasicion(LocalDate.parse(tokens[4], formatter));
                } catch (DateTimeParseException dyf) {
                    p.setFechaTomaPasicion(null);
                }
                //---
                try {
                    p.setFechaCese(LocalDate.parse(tokens[5], formatter));
                } catch (DateTimeParseException dyf) {
                    p.setFechaCese(null);
                }
                p.setTelefono(tokens[6]);
                p.setEvaluador(tokens[7].equalsIgnoreCase("Sí"));
                p.setCoordinador(tokens[8].equalsIgnoreCase("Sí"));

                //--- Añadimos el Profesor a la lista
                lista.add(p);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //---

        return lista;

    }

    public static void generarJSON(String ruta, List<Profesor> lista) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());
        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        //--- Creamos el archivo con todos los profesores
        //mapeador.writeValue(new File("profesorado.json"), profesorado);
        //--- Creamos el archivo con los profesores que llevan entre 10 y 15 años trabajando
        mapeador.writeValue(new File(ruta.concat(".json")), lista);

    }
}
