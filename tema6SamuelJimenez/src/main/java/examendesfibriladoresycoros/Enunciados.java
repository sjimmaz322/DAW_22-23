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
    
    EJ3 (5 puntos).- En un nuevo paquete llamado ej3, crea un Enum llamado Voz con seis elementos: CONTRATENOR, TENOR, BARITONO, SOPRANO, MEZZOSOPRANO y CONTRALTO. 
    Las tres primeras son voces masculinas y las tres últimas son femeninas. Consideraremos un coro de voces mixtas aquel en el que hay al menos un tipo de voz diferente, de las anteriores. 
    Crea una clase, llamada Coro, sin atributos de instancia que incluya los siguientes métodos de clase públicos. Si existen atributos de clase serán privados. 
    Si existen otros métodos, serán privados. Se pueden crear otras clases, si se estima necesario.
    (0,75 puntos) generarVoces, que recibe un número entero mayor o igual a 6, y debe devolver un objeto tipo List<Voz> con tantas voces (masculinas y femeninas) aleatorias como indique el parámetro. 
    En caso de que el parámetro sea incorrecto, se lanzará una excepción de tipo IllegalArgument.
    (2 puntos) getNumeroCorosMixtos, que recibe la lista generada por el método anterior y devuelve el número de coros mixtos que se pueden agrupar según las voces contenidas en la lista.
    (2 puntos) buscarVozMasRepetida, que recibe la lista generada por el método implementado en A y devuelve un conjunto único de voces indicando las voces que más se repiten en la lista.
    Por ejemplo, si en una lista de 20 voces hay dos voces (A y B) con 5 repeticiones cada una y son las que más se repiten, debería devolver esas dos voces (A y B).
    En una clase llamada PruebaCoro (0,25 puntos), dentro de ej3, implementa el código necesario para generar una lista de 20 voces aleatorias, mostrar por pantalla el resultado y probar los métodos B y C.

     */
}
