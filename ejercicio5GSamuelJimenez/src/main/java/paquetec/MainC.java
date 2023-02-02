/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetec;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MainC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //--- Creamos nuestra estructura Map donde guardaremos nuestros ejércitos
        Map<String, Ejercito> fuerzasArmadas = new HashMap<>();

        //--- Creamos nuestros ejércitos y los aádimos al Map con su identificador
        crearEjercito(fuerzasArmadas, "Fuerzas Aéreas");
        crearEjercito(fuerzasArmadas, "Ejército de Tierra");
        crearEjercito(fuerzasArmadas, "Marina");

        //--- Creamos 10 soldados, 9 válidos
        Soldado s1 = new Soldado("11111", "Darth", "Vader", "", 0);
        Soldado s2 = new Soldado("22222", "Han", "Solo", "", 0);
        Soldado s3 = new Soldado("33333", "Lando", "Carlisian", "", 0);
        //---
        Soldado s4 = new Soldado("44444", "Jason", "Voorhees", "", 0);
        Soldado s5 = new Soldado("55555", "Freddy", "Krueger", "", 0);
        Soldado s6 = new Soldado("66666", "Michael", "Myers", "", 0);
        //---
        Soldado s7 = new Soldado("77777", "Jack", "Sparrow", "", 0);
        Soldado s8 = new Soldado("88888", "Davy", "Jones", "", 0);
        Soldado s9 = new Soldado("99999", "Héctor", "Barbossa", "", 0);
        //---
        Soldado s10 = new Soldado("11111", "Darth", "Vader", "", 0);

        //--- Alistamos los soldados a cada ejército
        alistarSoldado(fuerzasArmadas, "Fuerzas Aéreas", s1);
        alistarSoldado(fuerzasArmadas, "Fuerzas Aéreas", s2);
        alistarSoldado(fuerzasArmadas, "Fuerzas Aéreas", s3);
        alistarSoldado(fuerzasArmadas, "Fuerzas Aéreas", s10);
        //---
        alistarSoldado(fuerzasArmadas, "Ejército de Tierra", s4);
        alistarSoldado(fuerzasArmadas, "Ejército de Tierra", s5);
        alistarSoldado(fuerzasArmadas, "Ejército de Tierra", s6);
        //---
        alistarSoldado(fuerzasArmadas, "Marina", s7);
        alistarSoldado(fuerzasArmadas, "Marina", s8);
        alistarSoldado(fuerzasArmadas, "Marina", s9);

        //--- Imprimimos un listado con todos los ejércitos y sus efectivos
        imprimirEjercitos(fuerzasArmadas);

        //--- Imprimimos el ejército buscado con sus efectivos si existe
        imprimirUnEjercito(fuerzasArmadas, "Marina");
    }

    private static void crearEjercito(Map<String, Ejercito> lista, String identificador) {
        lista.put(identificador, new Ejercito());
    }

    private static void alistarSoldado(Map<String, Ejercito> lista, String id, Soldado s) {
        String resultado = lista.get(id).alistarSoldado(s);
        System.out.println(resultado);

    }

    private static void imprimirEjercitos(Map<String, Ejercito> reg) {
        for (String key : reg.keySet()) {
            System.out.printf("-----%nID del Ejército: %s %n-----%nFichas de los soldados:%n %s %n", key, reg.get(key));
        }
    }

    private static void imprimirUnEjercito(Map<String, Ejercito> reg, String id) {
        if (reg.get(id) != null) {
            System.out.println("\nImprimiendo el ejército con identificador: " + id);
            System.out.println(reg.get(id));
        } else {
            System.out.println("El ejercito con identificador " + id + " fue buscado y no se encuentra en el sistema.");

        }
    }

}
