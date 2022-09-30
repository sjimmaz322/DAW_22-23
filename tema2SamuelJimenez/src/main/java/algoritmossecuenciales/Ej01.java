/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos el objeto tipo Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Declaramos e inicializamos las variables y constantes necesarias
        double gradosCentígrados;
        
        final double CONVERSORFARENHEIT1 = (9.0/5.0);
        final double CONVERSORFARENHEIT2 = 32;
        
        //Formula de conversión (C*(9/5)+32= F)
        
        //Solicitamos por teclado los grados que queremos convertir
        System.out.println("Introduzca los grados centígrados a convertir");
        gradosCentígrados = sc.nextDouble();
        
        //Inicializamos con la fórmula la variable gradosFarenheit
        double gradosFarenheit = (gradosCentígrados*CONVERSORFARENHEIT1)+CONVERSORFARENHEIT2;
        
        //Imprimimos por consola el resultado
        System.out.println(gradosCentígrados + "C son " + gradosFarenheit+ "F");
        
        //Hacemos el ejercicio con JOptionPane
        
        String gradosTxt;
        gradosTxt = JOptionPane.showInputDialog("Introduzca los grados centígrados");
        double gradosCelsius = Double.parseDouble(gradosTxt);
        double farenheit = (gradosCelsius*CONVERSORFARENHEIT1)+CONVERSORFARENHEIT2;
        JOptionPane.showMessageDialog(null, gradosCelsius + "C son "+ farenheit + "F.");
        
        
        
    }
    
}
