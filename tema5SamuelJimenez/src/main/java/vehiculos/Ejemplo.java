/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Ejemplo {

    public static void main(String[] args) {

        CatalogoClientes catalogoClientes = new CatalogoClientes(5);
        CatalogoVehiculos catalogoVehiculos = new CatalogoVehiculos(5);
        CatalogoAlquiler catalogoAlquileres = new CatalogoAlquiler(10);

        Clientes c1 = new Clientes();
        Vehiculo v1 = new Vehiculo();
         
        Alquiler alq1 = new Alquiler(c1, v1, LocalDate.now(), 8);

//        Clientes c = catalogoClientes.buscarClientePorNif("3");
//        Vehiculo v = catalogoVehiculos.buscarVehiculoPorBastidor("4");

        catalogoAlquileres.aniadirAlquiler(alq1);

        System.out.println(alq1);
        System.out.println("---");
        System.out.println(c1.toString());
        System.out.println("---");
        System.out.println(v1.toString());
        System.out.println("--");
         System.out.println(catalogoAlquileres);
      

    }

}
