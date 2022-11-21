/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.time.LocalDate;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class RefugioAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos lo animales que usaremos
        Animal perli = new Animal(LocalDate.of(2020, 6, 7), "Perla", "Perro", 8500, "Reposo");
        Animal niebla = new Animal(LocalDate.of(2009, 2, 14), "Niebla", "Perro", 14300, "Durmiendo");
        Animal parker = new Animal(LocalDate.of(2019, 10, 22), "Parker", "Gato", 6010, "Despierto");
        //Creamos a Pico con un estado no admitido para ver que controlamos el atributo
        Animal pico = new Animal(LocalDate.of(2022, 5, 30), "Pico", "Periquito", 500, "Molestando");
        Animal jerboy = new Animal(LocalDate.of(2021, 7, 3), "Jerboy", "Cobaya", 2500, "Durmiendo");
        Animal noName = new Animal();

        //Mostramos los datos de los animales
        System.out.println(perli);
        System.out.println(niebla);
        System.out.println(parker);
        System.out.println(pico);
        System.out.println(jerboy);
        System.out.println(noName);

//        //Clonamos a noName para que nos salte la excepción con el mensaje que deseamos.
//        Animal noNoName = Animal.clonar(noName);
//        
//        System.out.println(noNoName);
        //Le damos 100 gramos de comida a Perli para que no pase hambre
        //Su peso debería pasar de 8500 a 8600 gramos
        perli.comer(100);
        System.out.println(perli);

        //Jugamos con Niebla para que mantenga la salud
        //Debería pasar el peso de 14300 a 14280 gramos
        niebla.jugar(59);
        System.out.println(niebla);

        //Mandamos a Parker a dormir
        parker.dormir();
        System.out.println(parker);

        //Despertamos a Jerboy
        jerboy.despertar();
        System.out.println(jerboy);

        //Jugamos con Perla 190 minutos para que nos salte la excepción que queremos
        perli.jugar(190);
    }

}
