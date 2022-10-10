/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdeseleccion;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
        }
        System.out.println(
                "Código para el departamento es " + departamento);
    }
    //El programa muestra por pantalla el mensaje "Recursos Humanos" y después en una nueva linea "Código para el departamento es B"

}
