/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aplicacion;

import controladores.JugadoresJpaController;

import controladores.PersonajesJpaController;
import controladores.UsuariosJpaController;
import entidades.Jugadores;
import entidades.Personajes;
import entidades.Usuarios;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class BdProyectoSamuelJimenez {

    public static void main(String[] args) {
        //---
        UsuariosJpaController ujc = new UsuariosJpaController();
        JugadoresJpaController jjc = new JugadoresJpaController();
        PersonajesJpaController pjc = new PersonajesJpaController();
        //---
        ujc.create(new Usuarios("Nacho", 33, "Calle Perico", utilidades.Utilidades.localToDate(LocalDate.of(1933, 9, 15))));
        //---
        System.out.println("---*** USUARIOS ***---");
        List<Usuarios> listaUsuarios = ujc.findUsuariosEntities();
        listaUsuarios.forEach(System.out::println);
        //---
        System.out.println("\n---*** JUGADORES ***---");
        List<Jugadores> listaJugadores = jjc.findJugadoresEntities();
        listaJugadores.forEach(System.out::println);
        //---
        System.out.println("\n---*** PERSONAJES ***---");
        List<Personajes> listaPersonajes = pjc.findPersonajesEntities();
        listaPersonajes.forEach(System.out::println);

    }
}
