/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4csamueljimenez;

/**
 *
 * @author samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = ServicioPersona.crearRegistroPersona();
        System.out.println("Imprimimos los datos de la primera persona");
        System.out.println(p1);

        Persona p2 = new Persona();
        System.out.println(" ");
        System.out.println("Imprimimos los datos de la segunda persona");
        System.out.println(p2);

        Serie serie1 = ServicioSerie.crearSerieTeclado();

        System.out.println("Imprimimos los datos de la serie");
        System.out.println(serie1);
        //Sumamos un like que da la persona                     
        p1.darLikeSerie(serie1);

        System.out.println(" ");
        System.out.println("Imprimimos los datos de la serie tras dar like");
        System.out.println(serie1);
    }

}
