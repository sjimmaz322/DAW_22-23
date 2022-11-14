/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author samuel
 */
public class TestSerie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Serie s1 = new Serie("Los Simpsons", "Cómedia", "...", "FOX", 34);
        Serie s2 = new Serie();
        Serie s3 = new Serie("Prison Break", "Acción", "Un notas quiere salir de la cárcel", "No che", 5, 120);

        System.out.println(s1);
        System.out.println(" ");
        System.out.println(s2);
        System.out.println(" ");
        System.out.println(s3);

//        Serie s4 = ServicioSerie.crearSerieTeclado();
//        System.out.println(s4);
        s1.darLike();
        s2.darLike();
        s3.darLike();
//        s4.darLike();

//        System.out.println(" ");
//        System.out.println(s3);
        Serie s5 = ServicioSerie.crearSerieTeclado();

        ServicioSerie.preguntarLike(s5);

        System.out.println(s5);
    }

}
