package ejercicio4esamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author samuel
 */
public class TestCafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creamos los objetos que usaremos en nuestro programa
        Cafetera caf1 = new Cafetera(1234, 500);
        Cafetera caf2 = new Cafetera();
        Persona p1 = new Persona("Samu", 28);
        PersonaR p2 = new PersonaR("Jess", 24);

        //Mostramos la información de la cafetera 1
        System.out.println(caf1.toString());

        //Llenamos completamente la cafetera
        caf1.llenarCafera();

        //Volvemos a mostrar los datos de la cafetera
        System.out.println(caf1.toString());
        System.out.println(" ");

        //Creamos una variable para comprobar que sirve la cantidad que queremos
        Double cantidadServida = caf1.servirTaza(100);
        //Vemos que ha servido la cantidad que queremos y miramos cuanto café queda en la cafetera
        System.out.println("\nSe ha servido " + cantidadServida + " cc de café, quedan en la cafetera " + caf1.getCantidadActual() + " cc.");
        //Ponemos café que permite la cafetera
        cantidadServida = caf1.servirTaza(800);
        System.out.println("\nSe ha servido " + cantidadServida + " cc de café, quedan en la cafetera " + caf1.getCantidadActual() + " cc.");
        //Echamos una cantidad excesiva a lo que tiene para ver que echa el resto
        cantidadServida = caf1.servirTaza(5100);
        System.out.println("\nSe ha servido " + cantidadServida + " cc de café, quedan en la cafetera " + caf1.getCantidadActual() + " cc.");
        System.out.println("\n----------\n");

        System.out.println("Agregamos 300 cc de café a la cafetera 1");
        //Agregamos 300 cc de café a la cafetera 1
        caf1.agregarCafe(300);
        //Comprobamos su nueva capacidad
        System.out.println(caf1.toString());

        System.out.println("\nAgregamos 5000 cc de café a la cafetera");
        //Agregamos una cantidad excesiva de café a la cafetera 1
        caf1.agregarCafe(5000);
        //Comprobamos si su capacidad actual es igual a la máxima
        System.out.println(caf1);

        //Vaciamos la cafetera 2.
        System.out.println("\nVaciamos la cafetera");
        caf1.vaciarCafetera();
        //Mostramos la información de la cafetera 2
        System.out.println(caf1);
        System.out.println("\n---------\n");

        //Hacemos que la persona 1 rellene la cafetera 2 que creamos vacía.
        p1.hacerCafe(caf2);
        //Mostramos la información de la cafetera.
        System.out.println(caf2);
        //Hacemos que la persona 1 se sirva media cafetera
        p1.beberCafe(caf2, 500);
        //Volvemos a mostrar la información para comprobar que hemos bebido el café requerido
        System.out.println(caf2);

        //Comprobamos si las dos cafeteras son iguales
        System.out.println("\n----------\n");
        System.out.println("¿Son iguales las dos cafeteras?");
        System.out.println(caf1.equals(caf2) ? "Las cafeteras son iguales" : "Las cafeteras no son iguales");
        //Comprobamos los HashCodes
        System.out.println("HashCode de la cafetera 1 : " + caf1.hashCode() + "\nHashCode de la cafetera 2 : " + caf2.hashCode());

    }

}
