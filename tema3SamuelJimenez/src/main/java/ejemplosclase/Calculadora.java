/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el primer opernado"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el segundo opernado"));

        double resultado = 0;

        String menu = """
                      Bienvenido a nuestra calculadora:
                      Ha elegido como operando 1 el número %.2f.
                      Ha elegido como operando 2 el número %.2f.
                      
                      Introduza la operación que desea realizar.
                      1 - Suma.
                      2 - Resta.
                      3 - Multiplicación.
                      4 - División.
                      5 - Potencia.
                      6 u otro - Salir.
                      """.formatted(operando1, operando2);
        String opcion = (JOptionPane.showInputDialog(menu));
//        //Versión 1
//        if (opcion.equals("1")) {
//            resultado = operando1 + operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        }
//        if (opcion.equals("2")) {
//            resultado = operando1 - operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        }
//        if (opcion.equals("3")) {
//            resultado = operando1 * operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        }
//        if (opcion.equals("4")) {
//            resultado = operando1 / operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        }
//        if (opcion.equals("5")) {
//            resultado = Math.pow(operando1, operando2);
//            System.out.printf("El resultado es %.2f", resultado);
//        }
//
//        //Versión 2
//        if (opcion.equals("1")) {
//            resultado = operando1 + operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        } else {
//            if (opcion.equals("2")) {
//                resultado = operando1 - operando2;
//                System.out.printf("El resultado es %.2f", resultado);
//
//            } else {
//                if (opcion.equals("3")) {
//                    resultado = operando1 * operando2;
//                    System.out.printf("El resultado es %.2f", resultado);
//
//                } else {
//                    if (opcion.equals("4")) {
//                        resultado = operando1 / operando2;
//                        System.out.printf("El resultado es %.2f", resultado);
//
//                    } else {
//                        if (opcion.equals("5")) {
//                            resultado = Math.pow(operando1, operando2);
//                            System.out.printf("El resultado es %.2f", resultado);
//                        } else {
//                            JOptionPane.showMessageDialog(null, "Opción incorrecta");
//                        }
//                    }
//
//                }
//
//        //Versión 3
//        if (opcion.equals("1")) {
//            resultado = operando1 + operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        } else if (opcion.equals("2")) {
//            resultado = operando1 - operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        } else if (opcion.equals("3")) {
//            resultado = operando1 * operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        } else if (opcion.equals("4")) {
//            resultado = operando1 / operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//
//        } else if (opcion.equals("5")) {
//            resultado = Math.pow(operando1, operando2);
//            System.out.printf("El resultado es %.2f", resultado);
//        } else {
//            JOptionPane.showMessageDialog(null, "Opción Incorrecta");
//        }

        //Versión 4
        switch (opcion) {
            case "1":
                resultado = operando1 + operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "2":
                resultado = operando1 - operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "3":
                resultado = operando1 * operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "4":
                resultado = operando1 / operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "5":
                resultado = Math.pow(operando1, operando2);
                System.out.printf("El resultado es %.2f", resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                break;
        }
    }
}
