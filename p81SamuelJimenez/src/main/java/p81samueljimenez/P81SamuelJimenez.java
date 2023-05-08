/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package p81samueljimenez;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author samuel
 */
public class P81SamuelJimenez {

    public static void main(String[] args) {
        List<Factura> lista = p81samueljimenez.UtilidadesFactura.generarListaFacturas("facturas", "csv", ";");
        //---
        lista.forEach(System.out::println);
        //---
        FacturaDAO fDAO = new FacturaDAO();
        //---
        try {
            for (Factura f : lista) {
                fDAO.insertFactura(f);
            }
            System.out.println("Nº Facturas insertadas " + fDAO.insertFactura(lista));
            System.out.println("-----------------------------------------");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<Factura> nuevaLista = fDAO.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Factura con el código único 1: ");
            System.out.println(fDAO.findByPk(1));
            System.out.println("-----------------------------------------");
            System.out.println("Se va a borrar la Factura con código 3");
            System.out.println("Nº facturas borradas "
                    + fDAO.deleteFactura(new Factura()));
            System.out.println("-----------------------------------------");
            nuevaLista = fDAO.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de borrar una factura -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Modificación de la factura");
            System.out.println("Nº Facturas modificados "
                    + fDAO.updateFactura(5, new Factura()));
            System.out.println("-----------------------------------------");
            nuevaLista = fDAO.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de modificar una factura -------------");
            nuevaLista.forEach(System.out::println);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
    }

}
