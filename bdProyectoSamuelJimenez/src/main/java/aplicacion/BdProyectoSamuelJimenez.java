/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aplicacion;

import controladores.JugadoresJpaController;
import controladores.PartidasJpaController;
import controladores.PersonajesJpaController;
import entidades.Jugadores;
import entidades.Partidas;
import entidades.Personajes;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class BdProyectoSamuelJimenez {
    
    public static void main(String[] args) {
        //---
        JugadoresJpaController jjc = new JugadoresJpaController();
        PersonajesJpaController pjc = new PersonajesJpaController();
        PartidasJpaController parjc = new PartidasJpaController();
        //---
        //---
        System.out.println("---*** JUGADORES ***---");
        List<Jugadores> listaJugadores = jjc.findJugadoresEntities();
        listaJugadores.forEach(System.out::println);
        //---
        System.out.println("---*** PERSONAJES ***---");
        List<Personajes> listaPersonajes = pjc.findPersonajesEntities();
        listaPersonajes.forEach(System.out::println);
        //---
        System.out.println("---*** PARTIDAS ***---");
        List<Partidas> listaPartidas = parjc.findPartidasEntities();
        listaPartidas.forEach(System.out::println);
    }
}
