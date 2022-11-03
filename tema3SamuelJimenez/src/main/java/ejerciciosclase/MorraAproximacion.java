/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class MorraAproximacion {

    /**
     * @param args the command line arguments
     */
    private static Random rd = new Random();

    public static void main(String[] args) {
        int apuestaJugador, apuestaMaquina, totalDedos, diferenciaJugador, diferenciaMaquina;
        int victoriasJugador = 0, victoriasMaquina = 0, numRondas = 0, rondasEmpate = 0, rondasNulas = 0;
        boolean finJuego = true;

        do {
            finJuego = false;
            int numDedosJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente("¿Cuántos dedos desea sacar?", 5, 1);

            int numDedosMaquina = dedosMaquina();

            totalDedos = numDedosJugador + numDedosMaquina;

            apuestaJugador = utilidadespropias.Utilidades.intVentanaRangoIncluyente("¿Cuántos dedos crees que habrá en total?", 10, 2);

            apuestaMaquina = prediccionMaquina(numDedosMaquina);

            diferenciaJugador = Math.abs(totalDedos - apuestaJugador);

            diferenciaMaquina = Math.abs(totalDedos - apuestaMaquina);

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
            if (apuestaJugador == totalDedos && apuestaMaquina == totalDedos) {
                JOptionPane.showMessageDialog(null, "Pues nada, empate.");
                rondasEmpate++;
            } else if (diferenciaJugador > diferenciaMaquina) {
                JOptionPane.showMessageDialog(null, "Buuu... gana la máquina esta ronda...");
                victoriasMaquina++;
            } else {
                JOptionPane.showMessageDialog(null, "Esta Ronda la gana el jugador!!!");
                victoriasJugador++;

            }
            numRondas++;
            String contador = """
                              Vamos por la ronda %d.
                              El jugador ha ganado %d rondas.
                              La máquina ha ganado %d rondas.
                              Ha habido %d rondas que fueron empate.
                              """.formatted(numRondas, victoriasJugador, victoriasMaquina, rondasEmpate);

            JOptionPane.showMessageDialog(null, contador);

            if (victoriasJugador >= 5 && victoriasJugador >= victoriasMaquina + 2) {
                finJuego = true;
                String victoriaJugador = """
                                         ¡¡¡GANA EL JUGADOR!!!
                                         El jugador ha ganado la partida con:
                                         %d rondas ganadas.
                                         %d rondas perdidas.
                                         %d rondas empatadas.
                                         """.formatted(victoriasJugador, victoriasMaquina, rondasEmpate);

                JOptionPane.showMessageDialog(null, victoriaJugador);
            } else if (victoriasMaquina >= 5 && victoriasMaquina >= victoriasJugador + 2) {
                finJuego = true;
                String victoriaMaquina = """
                                         Pues... meh... ganó la máquina
                                         La máquina ha ganado la partida con:
                                         %d rondas ganadas.
                                         %d rondas perdidas.
                                         %d rondas empatadas.
                                         """.formatted(victoriasMaquina, victoriasJugador, rondasEmpate);
                JOptionPane.showMessageDialog(null, victoriaMaquina);
            }

            if (numRondas == 21) {
                if (victoriasJugador > victoriasMaquina) {
                    JOptionPane.showMessageDialog(null, "Gana el jugador con una diferencia de " + victoriasJugador + " a " + victoriasMaquina);
                    finJuego = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Gana la máquina con una diferencia de " + victoriasMaquina + " a " + victoriasJugador);
                    finJuego = true;
                }
            }
        } while (!finJuego);

    }

    private static int dedosMaquina() {
        int dedos = utilidadespropias.Utilidades.intRangoRandom(5, 1);
        return dedos;
    }

    private static int prediccionMaquina(int dedos) {
        int prediccion = utilidadespropias.Utilidades.intRangoRandom(dedos + 5, dedos);
        return prediccion;
    }

}
