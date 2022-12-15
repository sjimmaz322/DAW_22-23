package ejercicio5bempresarentacarsamueljimenez;

import java.time.LocalDate;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/**
 *
 * @author samuel
 */
public class Prueba {

    private static Scanner sc = new Scanner(System.in);
    private static String dni = "";
    private static String numBastidor = "";
    private static String eleccion = "";

    public static void main(String[] args) {
        Empresa rentacar = new Empresa();
        rentacar.setNombre("Rentacar");
        rentacar.setCif(RandomStringUtils.randomAlphabetic(4));

        rentacar.registrarAlquiler("2", "3", LocalDate.now(), 2);

        System.out.println(rentacar);
        System.out.println(rentacar.getListadoAlquiler());
        rentacar.recibirVehiculo(rentacar.getListadoAlquiler().buscarAlquilerPorID("1"));
        System.out.println(rentacar.getListadoAlquiler());
    }

    private static void registrarAlquiler(Empresa e) {
        System.out.println("Introduza el NIF del solicitante del alquiler");
        do {
            dni = sc.nextLine();
            if (e.listadoClientes.buscarClientePorNif(dni) == null) {
                System.out.println("El cliente no está en el sistema");
                System.out.println("¿Desea registrarlo?\nSi --- No");
                eleccion = sc.nextLine();
                if (eleccion.equalsIgnoreCase("si")) {
                    aniadirClienteNuevo(e);
                }

            } else {
                break;
            }
        } while (true);

    }

    private static void aniadirClienteNuevo(Empresa e) {
        Clientes nuevoCliente = new Clientes();
        System.out.println("Introduza el dni del cliente");
        String dniCliente = sc.nextLine();
        nuevoCliente.setNIF(dniCliente);
        System.out.println("Introduza el nombre del cliente");
        String nombre = sc.nextLine();
        nuevoCliente.setNombre(nombre);
        System.out.println("Introduzca el primer apellido del cliente");
        String apellido1 = sc.nextLine();
        nuevoCliente.setApellido1(apellido1);
        System.out.println("Introduza el segundo apellido del cliente");
        String apellido2 = sc.nextLine();
        nuevoCliente.setApellido2(apellido2);
        e.listadoClientes.aniadirCliente(nuevoCliente);
    }
}
