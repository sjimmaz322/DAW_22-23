/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ej7FSamuelJimenez {

    /*
    Abre el fichero adjunto, estudia su contenido (datos de ejemplo inventados) y crea una clase Java (POJO) para guardar los registros del fichero adjunto.
    Recuerda que una clase POJO es aquella que contiene como mínimo los atributos encapsulados, getters, setters y toString, equals, hashcode.
    Estas clases no suelen implementar constructor parametrizado, aunque se puede poner.

    Crea una clase que contenga el método main() y gestione la lectura del fichero adjunto. 
    Ten en cuenta que la codificación que ha usado el sistema Séneca para exportar el fichero ha sido ISO-8859-1. 
    Puedes leer el fichero completo y después crear una lista de objetos o bien hacerlo línea a línea.

    Una vez tengas  la lista con todos los registros cargados guarda en un fichero JSON la lista de empleados que, contando a partir de hoy,
    lleven trabajando más de 10 y menos de 15 años (ten en cuenta la fecha de toma de posesión en el puesto de trabajo).

    Las lecturas y escrituras de los ficheros se realizan de forma relativa a la carpeta raíz del proyecto Java. Cuanto más modularizado esté todo mejor.

    AMPLIACIÓN DEL EJERCICIO.

    a) Sin usar API Stream

    - Contar el número de profesores de Tecnología.
    - Saber si algún profesor/a de Informática es también coordinador
     - Obtener una lista ordenada alfabéticamente con todos los apellidos de los empleados cuyo NIF contenga la letra J.
    - Verificar que ningún profesor se llama "Jonh".

    b) Repetir el apartado a) usando API Stream
     */
    public static void main(String[] args) {
        //---
        List<Profesor> profesorado = generarLista("./", "RelPerCen", "csv", ",");
        //---
        

    }

    public static List<Profesor> generarLista(String ruta, String nomFichero, String formato, String separador) {
        List<Profesor> lista = new ArrayList<>();
        //---
        String idFichero = ruta + nomFichero + "." + formato;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        //---

        //---
        Profesor p = new Profesor();
        //---
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(separador);
                // Convierte en String tokens
                /*
                p.setNombre(tokens[0]);
                p.setDni(tokens[1]);
                p.setPuesto(tokens[2]);
                if (!tokens[3].equalsIgnoreCase("")) {
                    p.setFechaTomaPasicion(LocalDate.parse(tokens[3]));
                } else {
                    p.setFechaTomaPasicion(null);
                }
                if (!tokens[4].equalsIgnoreCase("")) {
                    p.setFechaCese(LocalDate.parse(tokens[4]));
                } else {
                    p.setFechaTomaPasicion(null);
                }
                p.setTelefono(tokens[5]);
                p.setEvaluador(tokens[6].equalsIgnoreCase("Sí"));
                p.setCoordinador(tokens[7].equalsIgnoreCase("Sí"));
                */
                System.out.println(tokens[0]);
                System.out.println(tokens[1]);
                System.out.println(tokens[2]);
                System.out.println(tokens[3]);
                System.out.println(tokens[4]);
                System.out.println(tokens[5]);
                System.out.println(tokens[6]);
                System.out.println(tokens[7]);
                //--- Añadimos el Profesor a la lista
                lista.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //---

        return lista;

    }
}
