/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopilagenerico;

/**
 *
 * @author samuel
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        Pila<String> pilaStr = new Pila<>();
        Pila<Cancion> pilaCan = new Pila<>();
        //---
        Cancion c1 = new Cancion("Muerte a pellizcos", "Vico", 2022);
        Cancion c2 = new Cancion("Eres un manteca", "Vico", 2022);
        Cancion c3 = new Cancion("Bueno, ¿qué me contáis?", "Vico", 2022);
        //---
        pilaCan.push(c1);
        pilaCan.push(c2);
        pilaCan.push(c3);
        //---
        pilaCan.mostrarLista();
        //---
        //---
        pilaStr.push("Soy");
        pilaStr.push("Un");
        pilaStr.push("Princeso");
        //---
        pilaStr.mostrarLista();
        //--
        String estado = pilaCan.pilaLlena();
        System.out.println(estado);
        //--
        estado = pilaCan.pilaVacia();
        System.out.println("\n" + estado);
        //--
        Object[] listaCanciones = pilaCan.sacarElementos();
        for (int i = 0; i < listaCanciones.length; i++) {
            System.out.println(listaCanciones[i]);

        }
        //--
        estado = pilaCan.pilaLlena();
        System.out.println(estado);
        //--
        estado = pilaCan.pilaVacia();
        System.out.println("\n" + estado);
        //--
    }

}
