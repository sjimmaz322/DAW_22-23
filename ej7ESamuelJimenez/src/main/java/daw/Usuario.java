/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Usuario {

    public static void main(String[] args) {
        //---
        String listaDirectorios = listarDirectorioALista("./facturascsv/");
        //---
        String opcionFactura = JOptionPane.showInputDialog(listaDirectorios + "\n\n¿Qué factura desea recibir?\n(Introduza el número de la factura)");
        //---
        Factura f = generarFactura(opcionFactura, ";");
        //---
        JOptionPane.showMessageDialog(null, "La factura nº " + opcionFactura + " contiene:\n" + f);
        //---
        borrarElemento("./facturascsv/Factura" + opcionFactura + ".csv");
        //---
        listaDirectorios = listarDirectorioALista("./facturascsv/");
        JOptionPane.showMessageDialog(null, "Lista de facturas actualizada \n" + listaDirectorios);
    }

    public static String listarDirectorioALista(String ruta) {
        String listado = "";
        int vuelta = 1;
        File f = new File(ruta);
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();
            for (File file2 : ficheros) {
                if (vuelta % 2 == 0) {
                    listado += "\n".concat(file2.getName());

                } else {
                    listado = listado + "     " + file2.getName();
                }
                vuelta++;
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
        return listado;
    }

    public static Factura generarFactura(String numFactura, String separador) {

        //---
        String idFichero = "./facturascsv/Factura" + numFactura + ".csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        Factura f = new Factura();
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
                //--- Dependiendo de como empiece la línea sabremos que tipo de objeto es
                //--- Usamos los tokens[] para guardar cada atributo según el constructor

                f.setCodigoUnico(tokens[0]);
                f.setFechaEmision(LocalDate.parse(tokens[1]));
                f.setDescripcion(tokens[2]);
                f.setTotalImporte(Double.parseDouble(tokens[3]));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return f;

    }

    public static void borrarElemento(String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + ruta + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no está vacío");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + ruta);
        }
    }
}
