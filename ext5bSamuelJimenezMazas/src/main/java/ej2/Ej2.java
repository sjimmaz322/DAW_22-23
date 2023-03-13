/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;
import java.util.List;
import java.util.Map;

/**
 *
 * @author samuel
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        Desfibrilador dAux = new Desfibrilador("8309", "DEA_250", "Camino Colmenar, 46", "registro@emasa.es", "683770062");
        Desfibrilador dAux2 = new Desfibrilador("9999", "DEA_250", "Camino Colmenar, 46", "registro@emasa.es", "683770062");
        //---
        Desfibrilador[] arrDes = UtilesDesfibrilador.getDesfibriladores();
        //---
        MapDesfibrilador map1 = new MapDesfibrilador(arrDes, true);
        System.out.println(map1.toString());
        //---
        System.out.println("---------\n");
        List<Desfibrilador> lista = map1.listaDesfibriladores();
        lista.forEach(System.out::println);
        //---
        System.out.println("---------\n");
        boolean b1 = map1.buscadorDesfibrilador(dAux2);
        System.out.println(b1 ? "El desfibrilador buscado está en la lista" : "El desfibrilador buscado no está en la lista");
        //---
        Map<String, Integer> map2 = map1.numDesfibriladoresAsociados();
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + " --- " + val);

        }

    }

}
