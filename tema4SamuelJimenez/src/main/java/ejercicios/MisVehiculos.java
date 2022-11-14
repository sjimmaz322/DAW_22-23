/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicios;

/**
 *
 * @author samuel
 */
public class MisVehiculos {

    public static void main(String[] args) {
        // este programa crea un objeto de la clase vehiculo y
// muestra sus atributos

// instanciación del objeto vehiculo1
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco",
                100.0);

// invocación de métodos para mostrar los datos del objeto vehiculo1
        System.out.println("Datos del vehículo :" + vehiculo1.getMatricula() + "," + vehiculo1.getMarca());

    }
}
