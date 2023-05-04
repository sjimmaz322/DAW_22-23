/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

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
public class UtilidadesEjercicio {

    public static List<Docente> leerFichero(String nomFichero, String formato, String separador) {
        List<Docente> lista = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //
        String idFichero = "./" + nomFichero + "." + formato;
        // Variables para guardar los datos que se van leyendo
        String linea;
        String[] tokens;
        String[] subtokens;
        //

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            for (int i = 0; i < 8; i++) {
                datosFichero.nextLine();
            }
            while (datosFichero.hasNextLine()) {
                Docente d = new Docente();
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                tokens = linea.split(separador);

//                for (int i = 0; i < tokens.length; i++) {
//                    System.out.println(i + "-" + tokens[i]);
//
//                }
                d.setNombre(tokens[0].trim());
                d.setDni(tokens[1].trim());
                d.setTipoPersona(tokens[2].trim());
                d.setPuestoTrabajo(tokens[3].trim());
                d.setHorarioPersonalizado(tokens[4].trim().equalsIgnoreCase("Si"));
                d.setFechaAlta(LocalDate.parse(tokens[5].trim(), formatter));
                try {
                    d.setFechaBaja(LocalDate.parse(tokens[6].trim(), formatter));
                } catch (DateTimeParseException dtpe) {
                    d.setFechaBaja(null);
                }
                d.setHorasIniciales(tokens[7].trim());

                d.setHorasTotales(tokens[8].trim());
                d.setActivo(tokens[9].trim().equalsIgnoreCase("S"));

                lista.add(d);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
