/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double segmentoA, segmentoB, segmentoC, segmentoD, subArea1, subArea2, area;
        
        System.out.println("Introduzca la longitud del segmento A");
        segmentoA = sc.nextDouble();
        System.out.println("Introduzca la longitud del segmento B");
        segmentoB = sc.nextDouble();
        System.out.println("Introduzca la longitud del segmento C");
        segmentoC = sc.nextDouble();
        
        segmentoD = segmentoA - segmentoC;
        
        subArea1 = segmentoB * segmentoC;
        
        subArea2 = (segmentoD * segmentoB) / 2;
        
        area = subArea1 + subArea2;
        
        System.out.println("El área total de la figura es de " + area + " unidades cuadradas.");

        //Hacemos la versión con JOptionPane
        String segmentoATxt = JOptionPane.showInputDialog("Introduzca la longitud del primer segmento");
        String segmentoBTxt = JOptionPane.showInputDialog("Introduzca la longitud del segundo segmento");
        String segmentoCTxt = JOptionPane.showInputDialog("Introduzca la longitud del tercer segmento");
        
        double primerSegmento = Double.parseDouble(segmentoATxt);
        double segundoSegmento = Double.parseDouble(segmentoBTxt);
        double tercerSegmento = Double.parseDouble(segmentoCTxt);
        
        double cuartoSegmento = primerSegmento - tercerSegmento;
        double areaSecundaria1 = segundoSegmento * tercerSegmento;
        double areaSecundaria2 = (cuartoSegmento * segundoSegmento) / 2;
        
        double areaTotal = areaSecundaria1 + areaSecundaria2;
        
        JOptionPane.showMessageDialog(null, "El área total es de " + areaTotal + " unidades cuadradas.");
        
    }
    
}
