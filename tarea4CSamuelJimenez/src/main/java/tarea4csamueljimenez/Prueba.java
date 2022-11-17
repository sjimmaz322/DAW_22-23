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
        //Declaramos las variables que usaremos
        String mayoriaEdad;

        //Creamos la persona con el método que usa el constructor parametrizado
        Persona p1 = ServicioPersona.crearRegistroPersona();
        System.out.println(" ");
        System.out.println("Imprimimos los datos de la primera persona");
        System.out.println(p1);
        System.out.println(" ");
        //Vemos si la persna es mayor de edad 
        System.out.println("Comprobamos si " + p1.getNombre() + " es mayor de edad");
        //Usamos el metodo que filtra la edad
        mayoriaEdad = p1.esMayorEdad() ? "Es mayor de edad" : "No es mayor de edad";
        System.out.println(p1.getNombre() + " " + mayoriaEdad);
        //Calculamos el IMC y mostramos un mensaje dependiendo del resultado
        System.out.println(" ");
        System.out.println("Vemos el Índice de Masa Corporal de " + p1.getNombre());
        p1.calcularIMC();

        //Creamos una serie usando el método para ello que creamos
        Serie serie1 = ServicioSerie.crearSerieTeclado();

        System.out.println("Imprimimos los datos de la serie");
        System.out.println(serie1);
        //Sumamos un like que da la persona          
        System.out.println(" ");
        System.out.println("Imprimimos los datos de la serie tras dar like");
        p1.darLikeSerie(serie1);

        //Creamos otra persona con el constructor sin parámetros
        Persona p2 = new Persona();
        System.out.println(" ");
        System.out.println("Imprimimos los datos de la segunda persona");
        System.out.println(p2);

        //Hacemos lo mismo que hicimos con la primera persona
        System.out.println(" ");
        System.out.println("Comprobamos si la persona creada es mayor de edad");
        mayoriaEdad = p2.esMayorEdad() ? "Es mayor de edad" : "No es mayor de edad";
        System.out.println(p2.getNombre() + " " + mayoriaEdad);
        System.out.println(" ");
        System.out.println("Vemos el Índice de Masa Corporal de la persona");
        p2.calcularIMC();

    }

}
