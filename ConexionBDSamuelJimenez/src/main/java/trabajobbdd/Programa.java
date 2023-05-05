/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobbdd;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import productos.Producto;

/**
 *
 * @author J. Carlos F. Vico <jcarlosvico@maralboran.es>
 */
public class Programa {

    public static void main(String[] args) {

        ProductoDAO prod = new ProductoDAO();
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(1, "Dados Mica Borde afilado", 8));
        listaProductos.add(new Producto(2, "Dados Tinta Borde afilado", 7));
        listaProductos.add(new Producto(3, "Dados Mica Borde suave", 6));
        listaProductos.add(new Producto(4, "Dados Tinta Borde suave", 8));
        listaProductos.add(new Producto(5, "Dados Mica Borde afilado 2 colores", 9));

        try {

            System.out.println("Nº productos insertados " + prod.insertProducto(listaProductos));
            System.out.println("-----------------------------------------");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<Producto> nuevaLista = prod.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Persona con primary key 1: ");
            System.out.println(prod.findByPk(1));
            System.out.println("-----------------------------------------");
            System.out.println("Se va a borrar el producto con id 3");
            System.out.println("Nº productos borrados "
                    + prod.deleteProducto(new Producto(3, "Dados Mica Borde suave", 6)));
            System.out.println("-----------------------------------------");
            nuevaLista = prod.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de borrar un producto -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Modificación del producto");
            System.out.println("Nº Productos modificados "
                    + prod.updateProducto(5, new Producto(7, "Dados Mica Borde afilado 2 colores", 10)));
            System.out.println("-----------------------------------------");
            nuevaLista = prod.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de modificar un producto -------------");
            nuevaLista.forEach(System.out::println);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
        System.out.println("-------- Lista original --------------------");
        listaProductos.forEach(System.out::println);

    }

}
