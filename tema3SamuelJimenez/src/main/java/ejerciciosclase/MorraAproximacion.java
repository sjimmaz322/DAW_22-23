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
public class MorraAproximacion {

    /*
    En este programa se jugará a Morra según normas ajustadas, ganará quien cuya predicción se acerque
    más al resultado real.
     */
    public static void main(String[] args) {
        //Creamos las variables para guardar los datos necesarios y para finalizar el juego cuando corresponda
        int apuestaJugador, apuestaMaquina, totalDedos, diferenciaJugador, diferenciaMaquina;
        int victoriasJugador = 0, victoriasMaquina = 0, numRondas = 0, rondasEmpate = 0;
        boolean finJuego = true;

        do {//Bucle del código completo
            finJuego = false;
            //Introducimos cuantos dedos queremos sacar, el método controla las excepciones y el rango permitido
            int numDedosJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente("¿Cuántos dedos desea sacar?", 5, 1);

            int numDedosMaquina = dedosMaquina();//LLamamos al método que hace sacar dedos a la máquina

            totalDedos = numDedosJugador + numDedosMaquina;

            //Introducimos nuestra predicción
            apuestaJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente("¿Cuántos dedos crees que habrá en total?", 10, 2);
            //Llamamos al método que dará la predicción de la máquina.
            apuestaMaquina = prediccionMaquina(numDedosMaquina);

            //Calculamos la diferencia entre el resultado real y nuestra predicción
            diferenciaJugador = Math.abs(totalDedos - apuestaJugador);
            diferenciaMaquina = Math.abs(totalDedos - apuestaMaquina);

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
            //Mostramos el mensaje
            JOptionPane.showMessageDialog(null, resumenRonda);

            if (apuestaJugador == totalDedos && apuestaMaquina == totalDedos) {//Si jugador y máquina acertaron se suma uno a las rondas empatadas
                JOptionPane.showMessageDialog(null, "Pues nada, empate.");
                rondasEmpate++;
            } else if (diferenciaJugador > diferenciaMaquina) {//Si le diferencia de la máquina es menor a la del jugador se le suma una victoria
                JOptionPane.showMessageDialog(null, "Buuu... gana la máquina esta ronda...");
                victoriasMaquina++;
            } else {//En caso contrario al caso anterior se suma una victoria al jugador
                JOptionPane.showMessageDialog(null, "Esta Ronda la gana el jugador!!!");
                victoriasJugador++;

            }
            //Sumamos uno al contador de rondas
            numRondas++;
            //Mensaje para ver como va el marcador
            String marcador = """
                              Vamos por la ronda %d.
                              El jugador ha ganado %d rondas.
                              La máquina ha ganado %d rondas.
                              Ha habido %d rondas que fueron empate.
                              """.formatted(numRondas, victoriasJugador, victoriasMaquina, rondasEmpate);
            //Mostramos el marcador
            JOptionPane.showMessageDialog(null, marcador);

            //Si el jugador ha ganado al menos 3 rondas y lleva al menos dos victorias más que la máquina, el jugador gana
            if (victoriasJugador >= 3 && (victoriasJugador >= victoriasMaquina + 2)) {
                finJuego = true;//Actualización de variable para finalizar el juego
                String victoriaJugador = """
                                         ¡¡¡GANA EL JUGADOR!!!
                                         El jugador ha ganado la partida con:
                                         %d rondas ganadas.
                                         %d rondas perdidas.
                                         %d rondas empatadas.
                                         """.formatted(victoriasJugador, victoriasMaquina, rondasEmpate);

                JOptionPane.showMessageDialog(null, victoriaJugador);
                //Si la máquina es quien lleva 3 o más victorias y 2 o más que el jugador, gana la máquina
            } else if (victoriasMaquina >= 3 && (victoriasMaquina >= victoriasJugador + 2)) {
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
            //En el improbable caso de que nadie gane en la ronda 21, ganará quien lleve más victorias, independientemente de la diferencia
            if (numRondas == 21) {
                if (victoriasJugador > victoriasMaquina) {
                    JOptionPane.showMessageDialog(null, "Gana el jugador con una diferencia de " + victoriasJugador + " a " + victoriasMaquina);
                    finJuego = true;//Actualización de variable para finalizar el juego
                } else if (victoriasMaquina > victoriasJugador) {
                    JOptionPane.showMessageDialog(null, "Gana la máquina con una diferencia de " + victoriasMaquina + " a " + victoriasJugador);
                    finJuego = true;//Actualización de variable para finalizar el juego
                } else {
                    JOptionPane.showMessageDialog(null, "Empate técnico, nadie gana");
                    finJuego = true;
                }
            }
        } while (!finJuego);

    }

    private static int dedosMaquina() {//Método que devuelve los dedos que saca la máquina.
        int dedos = utilidadespropias.Utilidades.intRangoRandom(5, 1);
        return dedos;
    }

    private static int prediccionMaquina(int dedos) {//Método que devuelve la apuesta de la máquina
        int prediccion = utilidadespropias.Utilidades.intRangoRandom(dedos + 5, dedos + 1);
        return prediccion;
    }

}
