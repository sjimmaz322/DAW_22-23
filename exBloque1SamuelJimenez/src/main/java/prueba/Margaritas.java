/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package prueba;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Margaritas {

    /*
    Implementa un programa que permita saber a Romeo si su amada Julieta lo quiere o no lo quiere,
    en función del número de hojas que tienen las margaritas del jardín y de si empieza a quitar hojas con “me quiere” o “no me quiere”.
    Para decidir si empieza a deshojar con “me quiere” o “no me quiere” utiliza un dado de seis caras. Si sale par siempre empieza con “me quiere”,
    si sale impar entonces empieza con “no me quiere”. Como el tres le da mala suerte, si saca ese valor vuelve a tirar hasta que saque otro que no sea tres.
    El programa debe solicitar cuántas margaritas quiere deshojar Romeo. Por cada margarita.
    Hay que preguntar a Romeo cuantas hojas tiene esa margarita.
    El programa muestra la tirada del dado de Romeo y también si se empieza con “me quiere” o “no me quiere”. Recuerda que con valor tres se debe volver a tirar.
    Finalmente, según el dado y el número de hojas, se debe mostrar si su amada “lo quiere” o “no lo quiere”.
     */
    private static Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Declaramos e inicializamos las variabes que vamos a utilizar.
        int numMargaritas, numPetalos, numDado;
        String preguntaMargaritas, preguntaPetalos, inicioQuiereNoQuiere, opcionMenu, resultadoQuiere = "", resultadoNoQuiere = "", numDadoEnString;
        boolean quiereNoQuiere;

        preguntaMargaritas = """
                             Romeo, oh Romeo.
                             ¿Cuántas margaritas vas a usar hoy para comprobar si Julieta te quiere?
                             """;
        preguntaPetalos = """
                          Romeo, oh Romeo.
                          ¿Cuántos pétalos tiene esta margarita?
                          """;
        do {//Bucle principal para que se repita el programa si lo deseamos

            //Guardamos el número de margaritas que usaremos gracias al método creado
            numMargaritas = pedirMargaritas(preguntaMargaritas);

            //Bucle para realizar el programa tantas veces como margaritas queramos
            for (int i = 0; i < numMargaritas; i++) {

                do {//Se repite cada vez que salga 3 porque no queremos el 3
                    numDado = tiradaDado();
                } while (numDado == 3);

                //Usamos los métodos creados para guardar los valores en sus variables
                numDadoEnString = dadoDeNumAString(numDado);
                numPetalos = pedirPetalos(preguntaPetalos);
                quiereNoQuiere = meQuiereNoMeQuiere(numDado);

                inicioQuiereNoQuiere = quiereNoQuiere ? "<<no me quiere>>" : "<<me quiere>>";

                //Mensajes para imprimir los resultados
                resultadoNoQuiere = """
                                    La margarita tiene %d hojas, Romeo sacó %s en el dado, empezó a quitar hojas con %s y el resultado final es que su amada no lo quiere.
                                    """.formatted(numPetalos, numDadoEnString, inicioQuiereNoQuiere);

                resultadoQuiere = """
                                  La margarita tiene %d hojas, Romeo sacó %s en el dado, empezó a quitar hojas con %s y el resultado final es que su amada lo quiere.
                                  """.formatted(numPetalos, numDadoEnString, inicioQuiereNoQuiere);
                //Conjunto de if-else anidados dependiendo de las opciones

                if (quiereNoQuiere) {//Si salió 1 o 5 en el dado empezamos con me quiere

                    if (numPetalos % 2 == 0) {//Si el número de pétalos es par

                        System.out.println(resultadoQuiere);
                    } else {//Si el número de pétalos es impar
                        System.out.println(resultadoNoQuiere);
                    }
                } else {//Si salió 2, 4 o 6 en el dado empezamos cn no me quiere

                    if (numPetalos % 2 == 0) {//Si el número de pétalos es par

                        System.out.println(resultadoNoQuiere);
                    } else {//Si el número de pétalos es impar

                        System.out.println(resultadoQuiere);
                    }

                }
            }
            System.out.println("¿Quieres hacerlo otra vez?");//mensaje que pide si queremos hacerlo de nuevo

            do {//bucle para repetir si no metermos si o no

                opcionMenu = sc.nextLine();// soliciamos si o no 

                if (!(opcionMenu.equalsIgnoreCase("si") || opcionMenu.equalsIgnoreCase("no"))) {
                    //Mensaje de aviso de que no hemos metido la opción correcta
                    System.out.println("Las opciones válidas son Sí o No");
                }

            } while (!(opcionMenu.equalsIgnoreCase("Si") || opcionMenu.equalsIgnoreCase("no")));

            //if-else para mostrar un mensaje de despedida o de recomienzo del programa
            if (opcionMenu.equalsIgnoreCase("si")) {
                System.out.println("Allá vamos otra vez Romeo\n");

            } else {
                System.out.println("Pues nos quedamos con el resultado");
                break;
            }

        } while (true);
    }

    private static int tiradaDado() {//Método que genera un valor entre 1 y 6
        int tirada = rd.nextInt(6) + 1;
        return tirada;
    }

    //Método que pide el número de margaritas y controla el rango y las excepciones
    private static int pedirMargaritas(String mensaje) {
        int margaritas = 0;
        do {
            try {
                System.out.println(mensaje);
                margaritas = sc.nextInt();

            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");

            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número por favor");
                sc.next();
            }
            if (margaritas < 1 || margaritas > 10) {
                System.out.println("El número de margaritas debe estar entre 1 y 10");
            }

        } while (margaritas < 1 || margaritas > 10);
        return margaritas;
    }

    //Método que pide el número de pétalos y controla las excepciones
    private static int pedirPetalos(String mensaje) {
        int petalos = 0;
        do {
            try {
                System.out.println(mensaje);
                petalos = sc.nextInt();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");

            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número por favor");
            }

        } while (true);
        return petalos;
    }

    //Método que devuelve true o false dependiendo del valor de la tirada
    private static boolean meQuiereNoMeQuiere(int tirada) {
        boolean resultado = true;
        switch (tirada) {
            case 1:
                resultado = true;
                break;
            case 2:
                resultado = false;
            case 4:
                resultado = false;
                break;
            case 5:
                resultado = true;
                break;
            case 6:
                resultado = false;
                break;

        }
        return resultado;

    }

    //Método que pasa de número a letra el valor de la tirada del dado
    private static String dadoDeNumAString(int tirada) {

        String dadoTxt = switch (tirada) {
            case 1 ->
                "uno";
            case 2 ->
                "dos";
            case 4 ->
                "cuatro";
            case 5 ->
                "cinco";
            case 6 ->
                "seis";
            default ->
                "";
        };
        return dadoTxt;
    }
}
