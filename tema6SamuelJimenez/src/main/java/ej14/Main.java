/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14;

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

        List<Silencioso> lista = new ArrayList<>();
        //---
        lista.add(new Frigorifico(50, 400, "MortoFrio"));
        lista.add(new Microondas(800, 550, "GïraManduken"));
        //--- lista.add(new CampanaExtractora(0, 0, "Chüüpenmucheen")); NO podemos añadirla porque no implemente Silencioso, por lo tanto no es de ese tipo

    }

}
