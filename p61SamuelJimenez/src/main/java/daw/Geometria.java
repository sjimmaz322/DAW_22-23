/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Samuel Alejandro Jiménez Mazas
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //---   Creamos el conjunto Set que contendrá nuestras figuras
        Set<Figura> conjunto = new HashSet<>();

        //---   Creamos las figuras
        Figura f1 = new Triangulo(3, 3, 1, "Azul");
        Figura f2 = new Triangulo(4, 5, 2, "Verde");
        Figura f3 = new Circulo(6, 3, "Rojo");
        Figura f4 = new Circulo(2, 4, "Azul");
        //---    Cambiamos el punto de origen de uno de los circulos para las comprobaciones del apartado 8 
        ((Circulo) f4).getP1().setLocation(1, 0);
        //---   
        Figura f5 = new Rectangulo(5, 7, 5, "Verde");
        Figura f6 = new Rectangulo(7, 5, 6, "Rojo");

        //---   Añadimos las figuras al Set
        conjunto.add(f1);
        conjunto.add(f2);
        conjunto.add(f3);
        conjunto.add(f4);
        conjunto.add(f5);
        conjunto.add(f6);

        //---   Por cada elemento del conjunto mostramos su toString y llamamos a su método area
        for (Figura f : conjunto) {
            System.out.println(f);
            System.out.println("Su área es de " + f.area() + " uds. cuadradas.\n");
        }

        //---   A partir del conjunto creamos una lista de figuras
        List<Figura> listado = new ArrayList<>(conjunto); //--- Aquí hacemos una conversión implícita

        //---   Creamos los objetos comparable para ordenar nuestra lista
        Comparator<Figura> criterioId = (fi1, fi2) -> Integer.compare(fi1.getId(), fi2.getId());
        Comparator<Figura> criterioColor = (fi1, fi2) -> fi1.getColor().compareToIgnoreCase(fi2.getColor());

        //---   Con el sort de Collections ordenamos por color y si hubiese colores iguales esas coincidencias las ordenamos por su id
        Collections.sort(listado, criterioColor.thenComparing(criterioId));

        //---   Mostramos la lista ordenada
        listado.forEach(System.out::println);

        //---    Solicitamos el ID de la figura a buscar, solo admitirá números enteros
        int idBuscado = pedirIntConsola("\nIntroduzca el ID de la figura a buscar");

        //---
        int pos = 0; //--- Variable para sobrescribir la posición de la figura en la lista

        for (Figura f : listado) {
            //---   Como no hay varios subtipos de Figura y no podemos crear new Figura al ser abstracta usamos el instanceof para que mire las posibilidades para no tener
            //---   que indicar que tipo de figura buscamos. 
            if (f instanceof Circulo) {
                pos = Collections.binarySearch(listado, new Circulo(0, idBuscado, ""), criterioId);
            }
            if (f instanceof Rectangulo) {
                pos = Collections.binarySearch(listado, new Rectangulo(0, 0, idBuscado, ""), criterioId);
            }
            if (f instanceof Triangulo) {
                pos = Collections.binarySearch(listado, new Triangulo(0, 0, idBuscado, ""), criterioId);
            }

        }

        //---   Mostramos el resultado
        System.out.println("La figura con ID " + idBuscado + " está en la posición " + pos + ".\n");

        //---   Creamos las listas que usaremos para guardar los diferentes objetos de las Interfaces
        List<Dibujable> listaDib = new ArrayList<>();
        List<Movible> listaMov = new ArrayList<>();
        List<Comparable> listaComp = new ArrayList<>();

        //---   Por cada elemento, dependiendo del que sea, lo metemos en su lista pertinente, los rectángulos estarán en la lista de Movible y Dibujable
        for (Figura f : listado) {
            if (f instanceof Dibujable) {
                listaDib.add((Dibujable) f);//---   Aquí se realiza una conversión explícita
            }
            if (f instanceof Movible) {
                listaMov.add((Movible) f);//---   Aquí se realiza una conversión explícita
            }
            if (f instanceof Comparable) {
                listaComp.add((Comparable) f);//---   Aquí se realiza una conversión explícita
            }
            /*
            Haciendo caso a la sugerencia de NetBeans obtenemos esto,
            y no tengo claro si es una conversión implícita o explícita, creo que explicita
              if (f instanceof Comparable comparable) {
                listaComp.add(comparable);
            }
             */
        }
        //---   Mostramos las listas para comprobar su contenido
        System.out.println("\n--- Listado de Dibujables ---");
        listaDib.forEach(System.out::println);
        System.out.println("\n--- Listado de Movibles ---");
        listaMov.forEach(System.out::println);
        System.out.println("\n--- Listado de Comparables ---");
        listaComp.forEach(System.out::println);

        //---   Por cada objeto Dibujar llamámos a su método dibujar
        System.out.println("\n--- Dibujamos las figuras Dibujables ---");
        listaDib.forEach(d -> d.dibujar());

        //---   Movemos los rectángulos 2 posiciones a la derecha y los circulos 3 posiciones arriba
        //---   Y mostramos por comprobación el movimiento de los circulos por tener solo 1 punto
        for (Movible m : listaMov) {
            if (m instanceof Rectangulo) {
                m.moverDer(2);
            }
            if (m instanceof Circulo) {
                System.out.println("\nMostramos donde está el punto del circulo antes de moverlo");
                System.out.println(((Circulo) m).getP1());
                //---
                m.moverArr(3);
                //---
                System.out.println("\nMostramos donde está el punto del circulo después de moverlo");
                System.out.println(((Circulo) m).getP1());
            }
        }

    }

    //---   Copiado método de mis utilidades para evitar fallos humanos en el programa
    public static int pedirIntConsola(String mensaje) {
        int num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");
            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número por favor");
                sc.nextLine();
            }

        } while (true);
        return num;
    }
}
