/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio4bsamueljimenez;

/**
 *
 * @author samuel
 */
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samuel
 */
public class Ej4BSamuelJimenez {

    /*
    Vamos a realizar una aplicación para generar contraseñas y números pin.
    La aplicación tendrá tres opciones:
    - La primera, genera números pin aleatorios para tarjetas SIM de teléfonos móviles;
    - La segunda opción genera contraseñas para usuarios de un sistema operativo con 8 caracteres, incluyendo números y letras; 
    - La tercera opción, genera una secuencia de "n" caracteres aleatorios de un conjunto que tú elijas (debes pasar un array de char de 10 elementos). 
    El número "n" se debe solicitar por teclado.
    Se deben crear, al menos, tres métodos de clase para generar las secuencias de cada opción.
     */
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //Declaramos e inicializamos las variables que necesitaremos
        int longitudContrasenia, opcionMenu;
        char[] conjuntoCaracteres = {'a', 'Z', '€', '*', '3', '5', 'y', 'x', '9', 'F'};

        //Mensaje para el menú
        String mensaje = """
                         Bienvenid@ al menú.
                         ¿Qué desea hacer?
                         1 - Generar número PIN.
                         2- Generar una contraseña de 8 dígitos
                         3- Generar una contraseña de una longitud especificada.
                         4 - Salir
                         """;
        do {//Bucle para que se repita todo el programa hasta que elijamos salir

            opcionMenu = Utilidades.pedirIntConsola(mensaje);

            switch (opcionMenu) {//Swtich para seleccionar que opción haremos
                case 1://Opción que genera un String random de números
                    String numeroPin = RandomStringUtils.randomNumeric(4);
                    System.out.println(numeroPin);
                    System.out.println(" ");
                    break;
                case 2://Opción que genera un String random de letras y números
                    String contrasenia = RandomStringUtils.randomAlphanumeric(8);
                    System.out.println(contrasenia);
                    System.out.println(" ");
                    break;
                case 3://Opción que genera una contraseña de la longitud que queramos dado unos caracteres que introducimos como Array de char
                    longitudContrasenia = Utilidades.pedirIntConsola("¿Cuántos caracteres tendrá su contraseña?");
                    String contasenia2 = RandomStringUtils.random(longitudContrasenia, conjuntoCaracteres);
                    System.out.println(contasenia2);
                    System.out.println(" ");
                    break;
                case 4://Mensaje de despedida
                    System.out.println("Gracias por usar mi programa");
                    break;
                default://Mensaje para avisar de que se introdujo una opción no válida.
                    System.out.println("Las opciones están claras introduzca una de las dadas");
                    System.out.println(" ");
                    break;
            }

        } while (opcionMenu != 4);
    }

}
