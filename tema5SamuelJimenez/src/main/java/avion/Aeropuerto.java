/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avion;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Aeropuerto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avion avion1 = new Avion(25, 4);
        System.out.println(avion1);
        
        System.out.println(avion1.numeroDeFilas());
        System.out.println(avion1.asientosPorCadaFila());
        
        for (int i = 0; i < avion1.numeroDeFilas(); i++) {
            for (int j = 0; j < avion1.asientosPorCadaFila(); j++) {
                avion1.getAsientos()[i][j] = new Asiento();
            }
            
            System.out.println(avion1);
            
        }
    }

}
