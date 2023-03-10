/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<>();
        List<Identificable> listaIdentificable = new ArrayList<>();
        //---
        lista.add(new Estudiante("1", "Pache", "Jiménez", "4785M", new Direccion("Gades", "Manilva", "29692", "ESP")));
        lista.add(new Titular(LocalDate.now(), "Repostería", "Ester", "Colero", "1258L", new Direccion()));
        lista.add(new Interino(LocalDate.MIN, LocalDate.MAX, "Mates", "Monolito", "Polinomio", "9547P", new Direccion()));
        //---
        listaIdentificable.add(new Estudiante("1", "Pache", "Jiménez", "4785M", new Direccion("Gades", "Manilva", "29692", "ESP")));
        listaIdentificable.get(0).identificate();
        //---
        lista.forEach(p -> p.identificate());

        for (Persona p : lista) {
            if (p instanceof Interino) {
                System.out.println("Empezó el: " + ((Interino) p).getFechaInicioSustitucion());
            }
            if (p instanceof Titular) {
                System.out.println("Se jubila el :" + ((Titular) p).getFechaJubilacion());
            }
            if (p instanceof Estudiante) {
                ((Estudiante) p).estudiar();
            }
            if (p instanceof Identificable) {
                System.out.println("Soy identificable");
            }
        }
    }

}
