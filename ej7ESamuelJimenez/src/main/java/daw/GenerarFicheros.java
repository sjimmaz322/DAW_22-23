/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author samuel
 */
public class GenerarFicheros {

    public static void main(String[] args) throws JAXBException {
        //--- Creamos la lista de facturas
        List<Factura> listaFacturas = new ArrayList<>();
        //--- Generamos las 50 facturas
        for (int i = 0; i < 50; i++) {
            Factura f = new Factura();
            f.setTotalImporte(Math.round(f.getTotalImporte()));
            listaFacturas.add(f);
        }
        //--- Mostramos la lista de facturas
        listaFacturas.forEach(System.out::println);
        //--- Creamos las carpetas
        generarCarpeta("csv");
        generarCarpeta("xml");
        //--- 
        generarFicheroCSV("csv", "facturas", "csv", listaFacturas);
        generarXML("xml", "facturas", "xml", listaFacturas);
        //---
        generarCarpeta("facturascsv");
        //---
        generarFicheroCSVIndividual("facturascsv", "Factura", "csv", listaFacturas);

    }

    private static void generarCarpeta(String ruta) {
        Path directory = Paths.get(ruta);
        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio " + ruta);
            System.out.println("Seguramente la ruta está mal escrita o no existe");
        }
    }

    public static void generarFicheroCSV(String ruta, String nomFichero, String formato, List<Factura> lista) {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idFichero = "./" + ruta + "/" + nomFichero + "." + formato;
        String tmp;
        //
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (Factura f : lista) {
                tmp = f.toString();
                flujo.write(tmp);
                flujo.newLine();
            }
            flujo.flush();
            System.out.println("Fichero " + nomFichero + ".csv creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void generarFicheroCSVIndividual(String ruta, String nomFichero, String formato, List<Factura> lista) {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto

        String idFichero = "";
        String tmp;
        //
        for (Factura f : lista) {
            try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("./" + ruta + "/" + nomFichero + f.getCodigoUnico() + "." + formato))) {

                idFichero = "./" + ruta + "/" + nomFichero + f.getCodigoUnico() + "." + formato;
                tmp = f.toString();
                flujo.write(tmp);
                flujo.flush();

                flujo.flush();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void generarXML(String ruta, String nomFichero, String formato, List<Factura> lista) throws JAXBException {
        String idFichero = "./" + ruta + "/" + nomFichero + "." + formato;

        CatFacturas cat = new CatFacturas();
        cat.setLista((ArrayList) lista);
        JAXBContext contexto = JAXBContext.newInstance(CatFacturas.class);
        Marshaller serializador = contexto.createMarshaller();
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        serializador.marshal(cat, new File(idFichero));
        System.out.println("Fichero " + nomFichero + ".xml creado correctamente.");
    }
}
