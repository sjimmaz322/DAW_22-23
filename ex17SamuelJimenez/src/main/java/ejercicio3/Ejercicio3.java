/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import ejercicio1.Docente;
import java.io.File;
import java.io.FileNotFoundException;
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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Docente> listaDocentes = leerFichero("RelEmpCenAus", "csv", ",");
        //---
        listaDocentes.forEach(System.out::println);
    }

    public static List<Docente> leerFichero(String nomFichero, String formato, String separador) {
        List<Docente> lista = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //
        String idFichero = "./" + nomFichero + "." + formato;
        // Variables para guardar los datos que se van leyendo
        String linea;
        String[] tokens;
        //

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                Docente d = new Docente();
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                tokens = linea.split(separador);

               for (int i = 0; i < tokens.length; i++) {
                    tokens[i] = tokens[i].replaceAll("\"", "");
                }
                d.setNombre(tokens[0].trim().concat(", ").concat(tokens[1]));
                d.setDni(tokens[2].trim());
                d.setTipoPersona(tokens[3].trim());
                d.setPuestoTrabajo(tokens[4].trim());
                d.setHorarioPersonalizado(tokens[5].trim().equalsIgnoreCase("Si"));
                d.setFechaAlta(LocalDate.parse(tokens[6].trim(), formatter));
                try {
                    d.setFechaBaja(LocalDate.parse(tokens[7].trim(), formatter));
                } catch (DateTimeParseException dtpe) {
                    d.setFechaBaja(null);
                }
                d.setHorasIniciales(tokens[8].trim());

                d.setHorasTotales(tokens[9].trim());
                d.setActivo(tokens[10].trim().equalsIgnoreCase("S"));

                lista.add(d);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

}
