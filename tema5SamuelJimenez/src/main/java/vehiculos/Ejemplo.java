/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author samuel
 */
public class Ejemplo {

    /*
    Método copiar privado
    Empresa{
    Catálogo de clientes{nombre,apellidos, nif}
    Catálogo de vehiculos
    Catálogo de alquileres
    }
     */
    public static void main(String[] args) {
        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        CatalogoClientes catCli = new CatalogoClientes(5);

        catCli.getListaClientes()[0].setNombre("Samuel");
        catCli.getListaClientes()[0].setApellido1("Jiménez");
        catCli.getListaClientes()[0].setApellido2("Mazas");

        catCli.getListaClientes()[1].setNombre("Persona");
        catCli.getListaClientes()[1].setApellido1("Apellidez");
        catCli.getListaClientes()[1].setApellido2("Apellidez");

        catCli.getListaClientes()[2].setNombre("NoName");
        catCli.getListaClientes()[2].setApellido1("Unknown");
        catCli.getListaClientes()[2].setApellido2("Unknown");

        catCli.getListaClientes()[3].setNombre("Random");
        catCli.getListaClientes()[3].setApellido1("Nose");
        catCli.getListaClientes()[3].setApellido2("Quepone");

        catCli.getListaClientes()[4].setNombre("AHHHHHHHH");
        catCli.getListaClientes()[4].setApellido1("Mequiero");
        catCli.getListaClientes()[4].setApellido2("Iracasa");

        System.out.println(catCli.toString());

        catCli.borrarCliente(catCli.getListaClientes()[1]);
        System.out.println("--- Borramos a Persona Apellidez ---");
        System.out.println(catCli.toString());

        System.out.println("--- añadimos una persona en null");
        Clientes c1 = new Clientes();
        catCli.aniadirCliente(c1);
        System.out.println(catCli.toString());

        Clientes c2 = new Clientes();
        catCli.aniadirCliente(c2);
        System.out.println(catCli.toString());

//        catalogo.mostrarCatalogo();
//
//        catalogo.toString();
//
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
//        Vehiculo aux = new Vehiculo();
//        aux.setBastidor("123456789");
//        System.out.println(catalogo.getNumeroVehiculos());
//        catalogo.aniadirVehiculo(aux);
//        System.out.println(catalogo.getNumeroVehiculos());
//        aux.setBastidor("99999999");
//        catalogo.aniadirVehiculo(aux);
//        System.out.println(catalogo.getNumeroVehiculos());
    }

}
