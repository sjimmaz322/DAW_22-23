/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

import animales.Animal;
import animales.Persona;
import java.time.LocalDate;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos los animalitos
        Animal a1 = new Animal(LocalDate.of(2020, 6, 7), "Perla", "Perro", 8500, "Reposo");
        Animal a2 = new Animal(LocalDate.of(2009, 2, 14), "Niebla", "Perro", 14300, "Durmiendo");

        //Creamos a las personas
        Persona p1 = new Persona("Samuel", 28);
        Persona p2 = new Persona("Jéssica", 24);

        //Imprimimos los valores de los animales con toString
        System.out.println(a1.toString());
        System.out.println(a2);

        //Clonamos el animal a2 en a3
        Animal a3 = Animal.clonar(a2);

//        //Comprobamos el toString de a3
//        System.out.println(a3);

        //Hacemos que p1 despierte a los 3 animales
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);

//        //Comprobamos que han sido despertados
//        System.out.println(a1.getEstado());
//        System.out.println(a2.getEstado());
//        System.out.println(a3.getEstado());
        //Hacemos que p2 juego con a2 durante 120 minutos
        p2.jugar(a2, 120);

//        //Comprobamos la variación de peso de a2
//        System.out.println(a2.getPeso());
        //Hacemos que a1 le de un kilo de comida a a1
        p1.alimentar(a1, 1000);
        System.out.println("El nuevo peso de a1 es " + a1.getPeso() + "g");
        System.out.println(" ");

        //Hacemos que p1 juegue durante 200 minutos con a1
        p1.jugar(a1, 200);
        System.out.println("El nuevo peso de a1 es " + a1.getPeso() + "g");

    }

}
