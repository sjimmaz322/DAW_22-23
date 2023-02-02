/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package paquetea;

import java.util.Collection;
import java.util.Set;
import traductor.Traductor;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MainA {

    public static void main(String[] args) {

        //-- Creamos nuestro diccionario, en este caso inglés - español
        Traductor diccionarioEng = new Traductor();

        //--- Añadimos 10 palabras a nuestro diccionario
        diccionarioEng.aniadirRegistro("Unlock", "Desbloquear");
        diccionarioEng.aniadirRegistro("Wait", "Esperar");
        diccionarioEng.aniadirRegistro("Empty", "Vacío");
        diccionarioEng.aniadirRegistro("Rinse", "Enjuagar");
        diccionarioEng.aniadirRegistro("Seed", "Semilla");
        diccionarioEng.aniadirRegistro("Spray", "Fluflu");
        diccionarioEng.aniadirRegistro("Blink", "Pestañear");
        diccionarioEng.aniadirRegistro("Sick", "Enfermo");
        diccionarioEng.aniadirRegistro("Dress", "Vestido");
        diccionarioEng.aniadirRegistro("Box", "Caja");

        //--- Guardamos en un Set las palabras clave
        //--- Al crear el diccionario como TreeSet las palabras clave están ordenadas por orden alfabético (orden natural)
        System.out.println("\n----- Imprimimos las palabras originales -----");
        Set<String> listaClaves = diccionarioEng.listadoPalabrasOriginales();
        listaClaves.forEach(System.out::println);

        //--- Guardamos las palabras traducidas en una colección
        System.out.println("\n----- Imprimimos las palabras traducidas -----");
        Collection<String> listaTraducciones = diccionarioEng.listadoPalabrasTraducidas();
        listaTraducciones.forEach(System.out::println);

        //--- Imprimimos el diccionario completo
        System.out.println("\n----- Imprimimos el diccionario -----");
        diccionarioEng.imprimirConjunto();

        //--- Actualizamos Spray a Pulverizamos en vez de Fluflu
        System.out.println("\n----- Actualizamos el registro de Spray -----");
        diccionarioEng.actualizarRegistro("Spray", "Pulverizador");

        //--- Volvemos a imprimir el diccionario para comprobar que el cambio de ha realizado
        diccionarioEng.imprimirConjunto();

        //--- Borramos el registro de Sick e imprimimos de nuevo el diccionario
        System.out.println("\n----- Borramos 'Sick' del diccionario junto a su traducción -----");
        diccionarioEng.borrarRegistro("Sick");
        diccionarioEng.imprimirConjunto();

        //--- Solicitamos la traducción de una palabra contenida en el diccionario.
        //--- Se controla si la palabra no está contenida en el diccionario, se podría solicitar su inclusión.
        System.out.println("\n----- Buscamos la traducción de 'Seed' -----");
        String traduccion = diccionarioEng.traducirPalabra("Seed");
        System.out.println("La traducción de 'Seed' es: " + traduccion);
    }
}
