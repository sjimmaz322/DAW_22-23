/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author samuel
 */
public class ListaSoldadosMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Soldado> listado = new HashMap<>();
        //---
        Soldado s1 = new Soldado("1234", "Obi", "Wan", "Kenobi", 0);
        Soldado s2 = new Soldado("4567", "Han", "Solo", "", 0);
        Soldado s3 = new Soldado("1478", "Anakin", "Skywalker", "Amidala", 0);
        Soldado s4 = new Soldado("9874", "Droide", "R2-D2", "", 0);
        Soldado s5 = new Soldado("4321", "Leia", "Organa", "Amidala", 0);
        //---
        listado.put(s1.getNif(), s1);
        listado.put(s2.getNif(), s2);
        listado.put(s3.getNif(), s3);
        listado.put(s4.getNif(), s4);
        listado.put(s5.getNif(), s5);
        //--

    }

}
