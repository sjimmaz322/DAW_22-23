/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.List;

/**
 *
 * @author samuel
 */
public class PruebaCoro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Voz> listaVoces = Coro.generarVoces(7);
        listaVoces.forEach(System.out::println);
    }
    
}
