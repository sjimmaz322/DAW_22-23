/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class EjemploExpresionesLogicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Leer por teclado nombre y apellidos, de una persona, edad, peso (kg) y estatura (cm).
        
        Guardar en variables booleanas el resultado de evaluar las siguientes expresiones:
        
        A - Si la edad está comprendida entre 25 y 35 años ambos incluidos.
        B - Si el peso es mayor de 50 kg o menor o igual de 100 kg.
        C - Si no mide 175 cm.
        D - Si la estatura está entre 100 cm y 180 cms, excluidos ambos.
        E - Si la edad más 10 años supera los 60 años.
        F - Si el nombre es igual a "Pablo", ignorando mayúsculas y minúsculas.  Usa EqualsIgnoreCase.
        G - Si el apellido contiene la letra "j".
        H - Si el apellido termina en "-dez".
        I - Si la edad no está entre los 40 y 50 años.           
         */

        //Para leer textos y números hay que limpiar el buffer después de leer números antes que poner texto.
        //Hay que hacer un sc.next(); para limpiar el buffer.
        //Declaramos las variables que vamos a utilizar.
        String nombre, apellido;
        int edad, altura;
        double peso;
        final String NOMBRECOMPARABLE = "Pablo", SUFIJO = "dez", LETRABUSCADA = "j";
        boolean edadEntre25y35, pesoMayorDe50YMenorDe100, mide175, mideEntre100Y180,
                mayorDe60, seLlamaPablo, apellidoConJ, apellidoAcabaEnDez, edadNoEntre40Y50;

        //Creamos el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Solicitamos los datos para inicializar las variables básicas
        System.out.println("Introduza el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduzca el apellido");
        apellido = sc.nextLine();
        // sc.nextLine(); Para limpiar el buffer, pero no es necesario en este caso.
        System.out.println("Introduzca la edad");
        edad = sc.nextInt();
        System.out.println("Introduzca la altura");
        altura = sc.nextInt();
        System.out.println("Introduzca el peso");
        peso = sc.nextDouble();

        //Guardamos las condiciones en la inicialización de las variables que guardarán los resultados.
        edadEntre25y35 = edad >= 25 && edad <= 35;
        pesoMayorDe50YMenorDe100 = peso > 50 || peso <= 100;
        mide175 = altura != 175;
        mideEntre100Y180 = altura > 100 && altura < 180;
        mayorDe60 = (edad + 10) < 60;
        seLlamaPablo = nombre.equalsIgnoreCase(NOMBRECOMPARABLE);
        String pablo = seLlamaPablo ? "Si" : "No";
        apellidoConJ = apellido.toLowerCase().contains(LETRABUSCADA);
        apellidoAcabaEnDez = apellido.toLowerCase().endsWith(SUFIJO);
        edadNoEntre40Y50 = edad < 40 || edad > 50;

        //Imprimimos por pantalla las soluciones
        System.out.println("""
                           ¿La edad está comprendida entre 25 y 35 años ambos incluidos?    --- %b
                           ¿El peso es mayor de 50 y menor de 100?                          --- %b
                           ¿La altura es 175 cms?                                           --- %b
                           ¿La altura está entre 100 cms y 180 cms?                         --- %b
                           ¿La edad más 10 no supera 60 años?                               --- %b
                           ¿Se llama Pablo?                                                 --- %s
                           ¿El apellido contiene la letra J?                                --- %b
                           ¿El apellido acaba en -dez?                                      --- %b
                           ¿La edad no está entre 40 y 50 años?                             --- %b
                           """.formatted(edadEntre25y35, pesoMayorDe50YMenorDe100, mide175, mideEntre100Y180, mayorDe60,
                pablo, apellidoConJ, apellidoAcabaEnDez, edadNoEntre40Y50));

        //Lectura de datos con JOptionPane
        int edad2, altura2;
        double peso2;
        String nombreTxt, apellidoTxt, edadTxt, alturaTxt, pesoTxt;

        nombreTxt = JOptionPane.showInputDialog("Introduce tu nombre");
        apellidoTxt = JOptionPane.showInputDialog("Introduce tu apellido");
        edadTxt = JOptionPane.showInputDialog("Introduce tu edad");
        edad2 = Integer.parseInt(edadTxt); //Hacemos Parse para convertir String en int si vamos a operar con el dato
        alturaTxt = JOptionPane.showInputDialog("Introduce tu altura");
        altura2 = Integer.parseInt(alturaTxt);//Hacemos Parse para convertir String en int si vamos a operar con el dato
        pesoTxt = JOptionPane.showInputDialog("Introduce tu peso");
        peso2 = Double.parseDouble(pesoTxt);//Hacemos Parse para convertir String en double si vamos a operar con el dato
        JOptionPane.showMessageDialog(null, """
                                            Mi nombre es %s.
                                            Mi apellido es %s.
                                            Mi edad es de %d años.
                                            Mi altura es de %d cms.
                                            Mi peso es de %.2f kgs.
                                            """.formatted(nombreTxt, apellidoTxt, edad2, altura2, peso2));
    }

}
