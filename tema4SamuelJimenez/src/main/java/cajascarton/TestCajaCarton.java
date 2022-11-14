/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajascarton;

/**
 *
 * @author samuel
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       cajaGrande: ancho 250mm, alto 400mm, largo 500mm. Peso 200gr.
//       cajaChica: ancho 25mm, alto 30mm, largo 15mm. Peso 17gr.
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);

        System.out.println("Caja Grande");
        System.out.println(cajaGrande.toString());
        System.out.println(" ");
        System.out.println("Caja Chica");
        System.out.println(cajaChica.toString());
    }

}
