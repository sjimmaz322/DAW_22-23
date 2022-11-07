/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ParesNones {

    private static final String PARES = "Pares";
    private static final String NONES = "Nones";

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables que vamos a usar
        int dedosJugador, dedosMaquina, totalDedos;
        final String MENU = "¿Quieres jugar a Pares o Nones?\nSi o No";
        final String MENU2 = "¿Quieres jugar a Pares o Nones otra vez?\nSi o No";
        final String MENSAJE = "¿Pares o Nones?";
        final String MENSAJE2 = "¿Quieres usar una mano o dos manos?\nIntoduzca 1 o 2, así, en número";
        int MAX_Victorias = 5;
        String resultado = "";
        String eleccionMenu = "", eleccionParesNones = "";
        String sacaDedos = "";

        int victoriasNecesarias = (MAX_Victorias / 2) + 1;

        int numManos;
        int rondas = 0, rondasGanadas = 0, rondasPerdidas = 0;

        do {//bucle que se repetirá hasta que escribamos no
            do {//Bucle que se repetirá mientras no elijamos una opción válida, en este caso "Si" o "No"
                if (rondas == 0) {
                    eleccionMenu = utilidadespropias.Utilidades.pedirString(MENU);
                } else {
                    eleccionMenu = utilidadespropias.Utilidades.pedirString(MENU2);
                }
            } while (!comprobarEleccion(eleccionMenu, "Si", "No"));

            if (eleccionMenu.equalsIgnoreCase("Si")) {//Si elegimos jugar al juego

                numManos = utilidadespropias.Utilidades.intVentanaRangoIncluyente(MENSAJE2, 2, 1);

                do {//Bucle que se repetirá mientras no elijamos una opción válida, en este caso "Pares" o "Nones"
                    eleccionParesNones = utilidadespropias.Utilidades.pedirString(MENSAJE).toUpperCase();
                } while (!comprobarEleccion(eleccionParesNones, PARES, NONES));
                //Mensaje para preguntar los dedos que deseamos sacar
                sacaDedos = """
                           ¿Cuantos dedos deseas sacar?
                           """;

                if (numManos == 2) {//Si hemos elegido usar las dos manos
                    //Elegimos los dedos que sacaremos, el método se ocupa de controlar rango y excepciones
                    dedosJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente(sacaDedos, 10, 1);
                    //Método que nos da un número aleatorio entre 1 y 10
                    dedosMaquina = utilidadespropias.Utilidades.intRangoRandom(10, 1);
                } else {//Si elegimos usar una
                    dedosJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente(sacaDedos, 5, 1);
                    //Método que nos da un número aleatorio entre 1 y 10
                    dedosMaquina = utilidadespropias.Utilidades.intRangoRandom(5, 1);
                }

                //Calculamos el total de dedos sacados
                totalDedos = dedosJugador + dedosMaquina;

                //Switch dependiendo si elegimos pares o nones
                switch (eleccionParesNones) {
                    case "PARES":
                        if (totalDedos % 2 == 0) {//if-else para ver si ganamos o perdimos
                            resultado = """
                                        El jugador sacó %d dedos.
                                        La máquina sacó %d dedos.
                                        El total es de %d dedos.
                                        %d es par, así que gana el jugador.
                                        """.formatted(dedosJugador, dedosMaquina, totalDedos, totalDedos);
                            JOptionPane.showMessageDialog(null, resultado);
                            rondasGanadas++;
                        } else {
                            resultado = """
                                        El jugador sacó %d dedos.
                                        La máquina sacó %d dedos.
                                        El total es de %d dedos.
                                        %d es impar, así que gana la máquina.
                                        """.formatted(dedosJugador, dedosMaquina, totalDedos, totalDedos);
                            JOptionPane.showMessageDialog(null, resultado);
                            rondasPerdidas++;
                        }
                        break;
                    case "NONES":
                        if (totalDedos % 2 != 0) {//if-else para ver si ganamos o perdimos
                            resultado = """
                                        El jugador sacó %d dedos.
                                        La máquina sacó %d dedos.
                                        El total es de %d dedos.
                                        %d es impar, así que gana el jugador.
                                        """.formatted(dedosJugador, dedosMaquina, totalDedos, totalDedos);
                            JOptionPane.showMessageDialog(null, resultado);
                            rondasGanadas++;
                        } else {
                            resultado = """
                                        El jugador sacó %d dedos.
                                        La máquina sacó %d dedos.
                                        El total es de %d dedos.
                                        %d es par, así que gana la máquina.
                                        """.formatted(dedosJugador, dedosMaquina, totalDedos, totalDedos);
                            JOptionPane.showMessageDialog(null, resultado);
                            rondasPerdidas++;
                        }
                        break;
                }
                rondas++;//Sumamos uno al número de rondas
            } else {//Mensaje de despedida
                JOptionPane.showMessageDialog(null, "Gracias por usar mi programa.");
            }
        } while (eleccionMenu.equalsIgnoreCase("Si") && ((rondasGanadas < victoriasNecesarias) || (rondasPerdidas < victoriasNecesarias)));

        if (victoriasNecesarias == rondasGanadas) {
            JOptionPane.showMessageDialog(null, "Gana el jugador");
        } else if (victoriasNecesarias == rondasPerdidas) {
            JOptionPane.showMessageDialog(null, "Gana la máquina");
        }

        //Mensaje que muestra el resumen de las rondas.
        String resumenFinal = """
                             El resultado del juego fue:
                             Se jugaron %d rondas.
                             Has ganado %d rondas.
                             Has perdido %d rondas.
                             """.formatted(rondas, rondasGanadas, rondasPerdidas);
        //Imprimimos el mensaje de resultado.
        JOptionPane.showMessageDialog(null, resumenFinal);
    }

    private static boolean comprobarEleccion(String eleccion, String op1, String op2) {
        return eleccion.equalsIgnoreCase(op1) || eleccion.equalsIgnoreCase(op2);
    }
}
