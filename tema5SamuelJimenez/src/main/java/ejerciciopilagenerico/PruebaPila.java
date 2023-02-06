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
        Pila<String> pilaStr = new Pila(5);
        Pila<Cancion> pilaCan = new Pila(5);
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
        pilaStr.push("Charly");
        pilaStr.push("Bravo");
        pilaStr.push("Tango");
        pilaStr.push("Delta");
        pilaStr.push("Alfa");
        pilaStr.push("Winsconsing");
        //---
        pilaStr.mostrarLista();
        //---
        pilaStr.pop();
        pilaStr.pop();
        //---
        pilaStr.mostrarLista();
        //---
        String estado = pilaCan.pilaLlena();
        System.out.println(estado);
        //---
        estado = pilaCan.pilaVacia();
        System.out.println("\n" + estado);
        //---
        Object[] listaCanciones = pilaCan.sacarElementos();
        for (Object cancion : listaCanciones) {
            System.out.println(cancion);
        }
        //---
        estado = pilaCan.pilaLlena();
        System.out.println(estado);
        //---
        estado = pilaCan.pilaVacia();
        System.out.println("\n" + estado);
        //---
    }

}
