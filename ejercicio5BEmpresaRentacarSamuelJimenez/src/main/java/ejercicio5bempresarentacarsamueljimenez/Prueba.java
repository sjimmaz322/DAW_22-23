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

        System.out.println("¿Qué desea hacer?\n1 - Registrar un cliente.\n2 - Registrar un vehículo.\n3 - Registrar un alquiler.\n4 - Recibir un vehículo.\n0 - Salir");
        eleccion = sc.nextLine();
        switch (eleccion) {
            case "1":
                aniadirClienteNuevo(rentacar);
                break;
            case "2":
                aniadirVehiculoNuevo(rentacar);
                break;
            case "3":
                registrarAlquiler(rentacar);
                break;
            case "4":
                String identificador = sc.nextLine();
                rentacar.listadoAlquiler.borrarAlquiler(rentacar.getListadoAlquiler().buscarAlquilerPorID(identificador));

                break;
            case "0":
                System.out.println("Saliendo del programa");
                break;
        }

    }

    private static void registrarAlquiler(Empresa e) {
        System.out.println("Introduza el NIF del solicitante del alquiler");

        dni = sc.nextLine();
        if (e.listadoClientes.buscarClientePorNif(dni) == null) {
            System.out.println("El cliente no está en el sistema");
            System.out.println("¿Desea registrarlo?\nSi --- No");
            eleccion = sc.nextLine();
            if (eleccion.equalsIgnoreCase("si")) {
                aniadirClienteNuevo(e);
                //---
                System.out.println("Introduza el número de bastidor del coche");
                numBastidor = sc.nextLine();
                //---
                if (e.listadoVehiculos.buscarVehiculoPorBastidor(numBastidor) == null) {
                    aniadirVehiculoNuevo(e);
                    //---
                    System.out.println("Introduzca cuantos días se alquilará el vehículo");
                    int dur = Math.abs(sc.nextInt());

                    e.listadoAlquiler.aniadirAlquiler(new Alquiler(e.listadoClientes.buscarClientePorNif(dni), e.listadoVehiculos.buscarVehiculoPorBastidor(numBastidor), LocalDate.now(), dur));
                }
            } else {
                System.out.println("Cancelando Operación");
            }
        } else {
            System.out.println("Introduza el número de bastidor del coche");
            numBastidor = sc.nextLine();
            //---
            if (e.listadoVehiculos.buscarVehiculoPorBastidor(numBastidor) == null) {
                System.out.println("El vehiculo no está en el sistema");
                System.out.println("¿Desea registrarlo?\nSi --- No");
                eleccion = sc.nextLine();
                if (eleccion.equalsIgnoreCase("si")) {
                    aniadirVehiculoNuevo(e);
                    //---
                    System.out.println("Introduzca cuantos días se alquilará el vehículo");
                    int dur = Math.abs(sc.nextInt());

                    e.listadoAlquiler.aniadirAlquiler(new Alquiler(e.listadoClientes.buscarClientePorNif(dni), e.listadoVehiculos.buscarVehiculoPorBastidor(numBastidor), LocalDate.now(), dur));
                } else {
                    System.out.println("Cancelando Operación");
                }
            }
            //---
            System.out.println("Introduzca cuantos días se alquilará el vehículo");
            int dur = Math.abs(sc.nextInt());
            e.listadoAlquiler.aniadirAlquiler(new Alquiler(e.listadoClientes.buscarClientePorNif(dni), e.listadoVehiculos.buscarVehiculoPorBastidor(numBastidor), LocalDate.now(), dur));
        }
    }

    private static void aniadirClienteNuevo(Empresa e) {
        Clientes nuevoCliente = new Clientes();
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

    private static void aniadirVehiculoNuevo(Empresa e) {
        Vehiculo nuevoCoche = new Vehiculo();
        System.out.println("Introduzca la matrícula del vehículo");
        String matricula = sc.nextLine();
        nuevoCoche.setMatricula(matricula);
        System.out.println("Introduzca la tarifa de alquiler del vehículo");
        double tarifa = sc.nextDouble();
        nuevoCoche.setTarifa(tarifa);
        System.out.println("Introduzca el modelo del vehiculo\n(Kuga, Panda o Cupra)");
        sc.nextLine();

        String modelo = sc.nextLine();
        switch (modelo) {
            case ("kuga"), ("Kuga"), ("KUGA") ->
                nuevoCoche.setModelo(Modelo.FORD_KUGA);
            case ("Panda"), ("panda"), ("PANDA") ->
                nuevoCoche.setModelo(Modelo.SEAT_PANDA);
            case ("cupra"), ("Cupra"), ("CUPRA") ->
                nuevoCoche.setModelo(Modelo.CUPRA);
            default -> {
                System.out.println("Modelo no reconocido, asignando modelo aleatorio");
                nuevoCoche.setModelo(Modelo.getAleatorio());
            }
        }

        System.out.println("Introduzca el color del vehículo\n(Rojo, Negro, Azul, Amarillo o Blanco)");
        String color = sc.nextLine();
        switch (color) {
            case ("Rojo"), ("rojo"), ("ROJO") ->
                nuevoCoche.setColor(Color.ROJO);
            case ("Negro"), ("negro"), ("NEGRO") ->
                nuevoCoche.setColor(Color.NEGRO);
            case ("Azul"), ("azul"), ("AZUL") ->
                nuevoCoche.setColor(Color.AZUL);
            case ("Amarillol"), ("amarillo"), ("AMARILLO") ->
                nuevoCoche.setColor(Color.AMARILLO);
            case ("Blanco"), ("blanco"), ("BLANCO") ->
                nuevoCoche.setColor(Color.BLANCO);
            default -> {
                System.out.println("Color no reconocido, asignando color aleatorio");
                nuevoCoche.setColor(Color.getAleatorio());
            }
        }
        nuevoCoche.setDisponible(true);

        e.listadoVehiculos.aniadirVehiculo(nuevoCoche);
    }
}
