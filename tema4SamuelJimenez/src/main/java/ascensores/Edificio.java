/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascensores;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Edificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos la variable que recogerá la nueva fecha de revisión
        LocalDate nuevaFechaRevision;

        //Creamos los objetos de la clase Elevador
        Elevador ascensor1 = new Elevador("Desatranques Jaen", 7, 350);
        Elevador ascensor2 = new Elevador("LG", 52, -52);

        //Imprimimos los datos por consola
        System.out.println(ascensor1);
        System.out.println(ascensor2);

        //Comprobamos que el método para la siguiente fecha de revisión funciona.
        nuevaFechaRevision = Edificio.fechaSiguienteRevision(ascensor1);
        
        System.out.println("\nLa fecha de la siguiente revisión del ascensor con número de serie" + ascensor1.getNumSerie() + " es " + nuevaFechaRevision + "\n");

        //Hacemos un viaje posible para el ascensor 1
        String resultado = ascensor1.mover(4, 200, 3) ? "El viaje se puede realizar" : "El viaje no se puede realizar";
        //
        //Comprobamos que hace lo que queremos y actualiza el estado y la planta del ascensor 1
        System.out.println(resultado);
        System.out.println(ascensor1);

        //Hacemos un viaje imposible para el ascensor 2
        resultado = ascensor2.mover(8, 1000, 47) ? "El viaje se puede realizar" : "El viaje no se puede realizar";
        //
        //Comprobamos que no ha realizado actualización ninguna
        System.out.println(resultado);
        System.out.println(ascensor2);

        //Hacemos un viaje posible para el ascensor 1 y volvemos a hacer el mismo para comprobar que si está en la misma planta a la que va no hace el viaje.
        resultado = ascensor1.mover(1, 70, 1) ? "El viaje se puede realizar" : "El viaje no se puede realizar";
        System.out.println(resultado);
        System.out.println(ascensor1);
        //
        resultado = ascensor1.mover(1, 70, 1) ? "El viaje se puede realizar" : "El viaje no se puede realizar";
        System.out.println(resultado);
        System.out.println(ascensor1);
        
    }

    //Método que le suma 6 meses a la fecha de revisión del ascensor seleccionado   
    private static LocalDate fechaSiguienteRevision(Elevador aux) {
        aux.setFechaRevision(aux.getFechaRevision().plusMonths(6));
        
        return aux.getFechaRevision().plusMonths(6);
        
    }
    
}
