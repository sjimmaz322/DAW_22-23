/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendesfibriladoresycoros;

/**
 *
 * @author samuel
 */
public class Enunciados {
    /*
    EJ1(2,5 puntos).- Crea una clase, llamada Ej1, en el paquete ej1, con un método main y prueba los siguientes métodos. 
    (1 punto) Implementa un método en Ej1 que recibie como parámetro un array de tipo Desfibrilador y devuelve una estructura de datos, 
    sin objetos repetidos, ordenada por el atributo “id” de Desfibrilador. Llama a este método en el método main para obtener la colección de datos y muestra el resultado, 
    teniendo en cuenta los datos obtenidos a partir del método getDesfibriladores de UtilesDesfibrilador.
    (1,5 puntos) Crea un método en Ej1 que reciba como parámetro una colección de objetos únicos de tipo Desfibrilador. 
    Usando un objeto de tipo Iterator, recorre la colección y crea una estructura para guardar los datos usando pares clave valor, siendo la clave el “id” de cada objeto y el valor el propio objeto, 
    que debe ser retornada por el método. Llama a este método en el main para obtener la colección de datos y mostrar su información usando objetos de tipo Map.Entry<>.

    EJ2 (2,5 puntos).- Crea una clase, llamada MapDesfibrilador, en el paquete ej2, que encapsule un objeto Map, inmutable, que tenga los siguientes métodos:
    (0,5 puntos) El constructor de la clase recibe un array de objetos Desfibrilador y un booleano. Guarda en los valores del map los objetos Desfibrilador, siendo la key de cada entrada el “id” del objeto a guardar. 
    Si el booleano es true, entonces la estructura debe mantener orden en las keys.
    (0,5 puntos) toString, que debe devolver por cada entrada del map una línea con la siguiente información: “id” -> “nombre” -> “email”. Este método debe implementarse usando el método keySet() del map.
    Por ejemplo: 		8304 -> DEA_251 -> registro2@emasa.es
			8309 -> DEA_250 -> registro@emasa.es
			…
    (0,25 puntos) A partir de un objeto Desfibrilador que se pasa como parámetro, saber si ese objeto ya está contenido en la estructura usando la key del mismo.
    (0,25 puntos)  Obtener y devolver un objeto List<Desfibrilador> con todos los valores del map.
    (0,75 puntos) Obtener el número de desfibriladores asociados a un correo electrónico. Devolverá una nueva estructura Map con la información anterior.
    Crea la clase Prueba (0,25 puntos), en ej2, para crear un objeto MapDesfibrilador y probar los métodos anteriores.
    
    
     */
}
