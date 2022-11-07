/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Morra {
    /*
    En este programa se jugará a Morra según las normas de Wikipedia.
     */

    public static void main(String[] args) {
        //Creamos las variables para guardar los datos necesarios y para finalizar el juego cuando corresponda
        int apuestaJugador, apuestaMaquina, totalDedos;
        int victoriasJugador = 0, victoriasMaquina = 0, numRondas = 0, rondasEmpate = 0, rondasNulas = 0;
        boolean finJuego = true;

        do {//Bucle del programa completo
            finJuego = false;
            //Introducimos cuantos dedos queremos sacar, el método controla las excepciones y el rango permitido
            int numDedosJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente("¿Cuántos dedos desea sacar?", 5, 1);

            int numDedosMaquina = dedosMaquina();//LLamamos al método que hace sacar dedos a la máquina

            totalDedos = numDedosJugador + numDedosMaquina;

            //Introducimos nuestra predicción
            apuestaJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente("¿Cuántos dedos crees que habrá en total?", 10, 2);
            //Llamamos al método que dará la predicción de la máquina.
            apuestaMaquina = prediccionMaquina(numDedosMaquina);

            //Mensaje para informar del resultado de la ronda
            String resumenRonda = """
                               En esta ronda...
                               El jugador sacó %d dedos.
                               La máquina sacó %d dedos.
                               
                               Por lo tanto el total de dedos es de %d dedos.
                               
                               Y las apuestas quedaron...
                               
                               El jugador apostó que habría %d dedos.
                               La máquina apostó que habría %d dedos.
                               
                               Por lo tanto...
                               """.formatted(numDedosJugador, numDedosMaquina, totalDedos, apuestaJugador, apuestaMaquina);

            JOptionPane.showMessageDialog(null, resumenRonda);
            if (apuestaJugador == totalDedos && apuestaMaquina == totalDedos) {//En caso de que máquina y jugador acierten, se suma uno a los empates
                JOptionPane.showMessageDialog(null, "Pues nada, empate.");
                rondasEmpate++;
            } else if (apuestaMaquina == totalDedos) {//Si acierta la máquina se suma una victoria a su contador
                JOptionPane.showMessageDialog(null, "Buuu... gana la máquina esta ronda...");
                victoriasMaquina++;
            } else if (apuestaJugador == totalDedos) {//Si acierta el jugador se suma uno a las victorias del jugador
                JOptionPane.showMessageDialog(null, "Esta Ronda la gana el jugador!!!");
                victoriasJugador++;
            } else {//Si nadie acierta se suma uno al contador de rondas nulas
                JOptionPane.showMessageDialog(null, "Nadie gana esta ronda");
                rondasNulas++;
            }
            numRondas++;//Cada vuelta se suma uno al contador de rondas

            //Mensaje para mostar el marcador
            String marcador = """
                              Vamos por la ronda %d.
                              El jugador ha ganado %d rondas.
                              La máquina ha ganado %d rondas.
                              Ha habido %d rondas que fueron empate.
                              Ha habido %d rondas en las que nadie ganó.
                              """.formatted(numRondas, victoriasJugador, victoriasMaquina, rondasEmpate, rondasNulas);
            //Mostramos el mensaje
            JOptionPane.showMessageDialog(null, marcador);

            //Si el jugador lleva al menos 3 victoria y dos más que la máquina, gana el jugador
            if (victoriasJugador >= 3 && victoriasJugador >= victoriasMaquina + 2) {
                finJuego = true;//Actualización de variable para finalizar el juego
                String victoriaJugador = """
                                         ¡¡¡GANA EL JUGADOR!!!
                                         El jugador ha ganado la partida con:
                                         %d rondas ganadas.
                                         %d rondas perdidas.
                                         %d rondas empatadas.
                                         """.formatted(victoriasJugador, victoriasMaquina, rondasEmpate);

                JOptionPane.showMessageDialog(null, victoriaJugador);
                //Si la máquina lleva al menos 3 victoria y dos más que el jugador, gana la máquina
            } else if (victoriasMaquina >= 3 && victoriasMaquina >= victoriasJugador + 2) {
                finJuego = true;//Actualización de variable para finalizar el juego
                String victoriaMaquina = """
                                         Pues... meh... ganó la máquina
                                         La máquina ha ganado la partida con:
                                         %d rondas ganadas.
                                         %d rondas perdidas.
                                         %d rondas empatadas.
                                         """.formatted(victoriasMaquina, victoriasJugador, rondasEmpate);
                JOptionPane.showMessageDialog(null, victoriaMaquina);
            }

            if (numRondas == 21) {//En el probable caso de que se alcancen las 21 rondas, gana quien más victorias lleve
                if (victoriasJugador > victoriasMaquina) {
                    JOptionPane.showMessageDialog(null, "Gana el jugador con una diferencia de " + victoriasJugador + " a " + victoriasMaquina);
                    finJuego = true;//Actualización de variable para finalizar el juego
                } else {
                    JOptionPane.showMessageDialog(null, "Gana la máquina con una diferencia de " + victoriasMaquina + " a " + victoriasJugador);
                    finJuego = true;//Actualización de variable para finalizar el juego
                }
            }
        } while (!finJuego);

    }

    private static int dedosMaquina() {//Método que devuelve cuantos dedos saca la máquina
        int dedos = utilidadespropias.Utilidades.intRangoRandom(5, 1);
        return dedos;
    }

    private static int prediccionMaquina(int dedos) {//Método que devuelve la apuesta de la máquina
        int prediccion = utilidadespropias.Utilidades.intRangoRandom(dedos + 5, dedos + 1);
        return prediccion;
    }

}
