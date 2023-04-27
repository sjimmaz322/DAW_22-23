/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author samuel
 */
public class LeerXML {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        {
            JAXBContext contexto = JAXBContext.newInstance(CatFacturas.class);
            // Crea el objeto Unmarshaller
            Unmarshaller um = contexto.createUnmarshaller();

            // Llama al método de unmarshalling
            CatFacturas catalogo = (CatFacturas) um.unmarshal(new File("./xml/facturas.xml"));

            ArrayList<Factura> lista = catalogo.getListaFacturas();

            lista.forEach(System.out::println);
        }

    }
}
