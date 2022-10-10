/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraderepeticion;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej11 {

    /*
    Implementa un programa Java que permita visualizar todas las letras mayúsculas, desde la 'A' hasta la 'Z', usando un do – while.
    //Dec 'A' = 65
    //Dec 'Z' = 90
     */
    public static void main(String[] args) {
        char letra = 'A';
        do {
            System.out.println(letra);
            letra++;

        } while (letra <= 90);
    }

}
