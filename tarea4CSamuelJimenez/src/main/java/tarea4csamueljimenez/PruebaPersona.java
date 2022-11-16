/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4csamueljimenez;

/**
 *
 * @author samuel
 */
public class PruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Samuel", 'X', 68.8, 1.69);
        System.out.println(p1);
        p1.setSexo('G');
        System.out.println(p1);
        
    }
    
}
