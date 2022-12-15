/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author samuel
 */
public class Ejemplo {

    public static void main(String[] args) {

        Empresa e1 = new Empresa();

        e1.aniadirCliente();
        e1.aniadirVehiculo(new Vehiculo());
        String resultado = e1.registrarAlquiler("1", "1", LocalDate.now(), 8) ? "Alquiler realizado con exito" : "Alquiler imposible";

//        System.out.println(Arrays.toString(e1.getListadoClientes().getListaClientes()));
//        System.out.println(Arrays.toString(e1.getListadoVehiculos().getListaVehiculos()));
//        System.out.println(e1.getListadoAlquiler().getNumeroAlquileres());
        System.out.println(resultado);
    }

}
