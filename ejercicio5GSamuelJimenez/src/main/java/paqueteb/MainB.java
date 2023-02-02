/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteb;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MainB {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //--- Creamos el Map
        Map<String, Integer> registroLoteria = new TreeMap<>();

        //--- Rellenamos el registro con nuestro método
        rellenarRegistro(registroLoteria);

        //--- Imprimimos la lista de premios
        System.out.println("\n----- LISTA DE PREMIOS -----");
        imprimirListaPremios(registroLoteria);

        //--- Buscamos si nuestro voleto tiene premio, añadimos nuestro número para comprobar el funcionamiento del programa
        System.out.println("\n---- Introduza el número del boleto que desea buscar -----");
        String numBoleto = sc.nextLine();
        String resultado = comprobarBoleto(numBoleto, registroLoteria);
        System.out.println(resultado);
    }

    private static void rellenarRegistro(Map<String, Integer> reg) {
        Random rd = new Random();
        int[] premios = {100, 2000, 30000, 400000, 5000000};
        for (int i = 0; i < 1000; i++) {
            reg.put(RandomStringUtils.randomNumeric(5), premios[rd.nextInt(5)]);
        }
    }

    private static void imprimirListaPremios(Map<String, Integer> reg) {
        for (String key : reg.keySet()) {
            System.out.printf("Número boleto: %s -- Premio: %s€ %n", key, reg.get(key));
        }
    }

    public static String comprobarBoleto(String numBoleto, Map<String, Integer> lista) {
        if (lista.get(numBoleto) != null) {
            return "El boleto con número " + numBoleto + " está premiado con un premio de " + lista.get(numBoleto) + "€.";
        } else {
            return "El boleto con número " + numBoleto + " no está premiado.";
        }
    }

}
