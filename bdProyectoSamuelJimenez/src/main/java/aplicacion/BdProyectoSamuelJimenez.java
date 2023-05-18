/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aplicacion;

import controladores.JugadoresJpaController;
import entidades.Jugadores;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class BdProyectoSamuelJimenez {

    public static void main(String[] args) {
        JugadoresJpaController jpc = new JugadoresJpaController();

        List<Jugadores> lista = jpc.findJugadoresEntities();

        lista.forEach(System.out::println);
    }
}
