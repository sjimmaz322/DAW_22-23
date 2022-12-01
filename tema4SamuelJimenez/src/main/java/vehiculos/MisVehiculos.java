/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package vehiculos;

/**
 *
 * @author samuel
 */
public class MisVehiculos {

    public static void main(String[] args) {
        // este programa crea un objeto de la clase vehiculo y
// muestra sus atributos

// instanciación del objeto vehiculo1
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "45789654133", "VW", "GTI", "Blanco", 100.0, true);
        Vehiculo miCacharro = new Vehiculo("6219 FSN", "456789321", "Dacia", "Logan", "Gris", 100, false);
        Vehiculo miCarro = new Vehiculo(miCacharro);

// invocación de métodos para mostrar los datos del objeto vehiculo1
        System.out.println("Datos del vehículo :" + vehiculo1.getMatricula() + "," + vehiculo1.getMarca());
        System.out.println("Mostramos miChacharro");
        vehiculo1.setDisponible(false);
        System.out.println(miCacharro.toString());

        miCacharro = new Vehiculo(miCarro);

        System.out.println("Mostramos miChacharro con la matricula cambiada desde atributos");
        System.out.println(miCacharro);
        miCacharro.setMatricula("6219 NSF");
        System.out.println(" ");

        System.out.println("Mostramos miChacharro con la matricula cambiada con setter");
        System.out.println(miCacharro);

        System.out.println(" ");
        System.out.println("Tras copiar miCacharro a miCarro, mostramos miCarro");
        System.out.println(miCarro);
        System.out.println(" ");
        System.out.println(vehiculo1);
        MisVehiculos.cambiarDisponibilidad(vehiculo1);
        System.out.println(vehiculo1);
        
        System.out.println(miCacharro.equals(miCarro));
    }

    private static void cambiarDisponibilidad(Vehiculo v) {
        v.setDisponible(true);
    }
}
