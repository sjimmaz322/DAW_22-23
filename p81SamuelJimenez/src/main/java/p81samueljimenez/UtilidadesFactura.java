/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p81samueljimenez;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class UtilidadesFactura {

    public static List<Factura> generarListaFacturas(String nomFichero, String formato, String separador) {
        List<Factura> lista = new ArrayList<>();
        //---
        String idFichero = nomFichero + "." + formato;
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
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
                Factura f = new Factura();
                f.setCodigoUnico(Integer.parseInt(tokens[0]));
                f.setFechaEmision(LocalDate.parse(tokens[1]));
                f.setDescripcion(tokens[2]);
                f.setTotalImporte(Double.parseDouble(tokens[3]));

                //--- Añadimos el Vehículo a la lista
                lista.add(f);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return lista;

    }
}
