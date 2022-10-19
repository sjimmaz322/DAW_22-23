/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Ejercicio3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ya se van acercando las Navidades y en muchos stands de algunos supermercados se empiezan a ver los surtidos de dulces navideños que tanto 
        gustan a unos y que otros no pueden soportar. 

        La fábrica de dulces "La Esteponera Turronera" produce algunos de estos manjares con los siguientes códigos: M1 (Mantecados de Limón), P1 (Polvorones),
        T1 (Turrón de chocolate), T2 (Turrón clásico) y M2 (Mazapanes).

        Cada especialidad tiene un coste de producción que se calcula según la materia prima gastada y la mano de obra empleada en producir una
        unidad (coste producción = materia prima + mano de obra). El coste de la mano de obra para producir unidades con código M1 y T1 supone 0.15€; para los que tienen
        código M2, T2 y P1, supone 0.22€.

        Además, cada producto tiene un precio de venta que se calcula en función del coste de producción.
        Hay que tener en cuenta lo siguiente:

        Artículos M1, M2 y P1. Precio de venta unitario = coste de producción + 50 % del coste de producción
        Resto de artículos. Precio de venta unitario = coste de producción + 65 % del coste de producción

        La fábrica necesita un programa que realice algunos cálculos para ver si es rentable vender un tipo de producto. El programa debe solicitar el código de un dulce
        (si el código no es válido, el programa termina informando de que no existe el código introducido) y el precio de la materia prima que se gasta en fabricar una unidad 
        de ese tipo (siempre entre 0.1€ y 1€, en otro caso el programa terminará indicando que el precio de la materia prima no es correcto). Se debe mostrar el coste de 
        producción unitario y precio de venta unitario. Además debe calcular y mostrar el número de unidades a producir para que haya un beneficio de al menos 2500€.

        Todas las entradas y salidas de datos deben hacerse usando JOptionPane. Limita la salida a dos decimales en los casos necesarios.
         */

        //Declaramos e inicializamos las constantes que necesitaremos para el programa
        final double MANO_OBRA_UNIDAD_M1_T1 = 0.15;
        final double MANO_OBRA_UNIDAD_M2_T2_P1 = 0.22;
        final int BENEFICIO_OBJETIVO = 2500;

        //Declaramos las variables que necesitaremos durante el uso del programa
        double costeMateriaPrimaUnidadM1, costeMateriaPrimaUnidadM2, costeMateriaPrimaUnidadT1, costeMateriaPrimaUnidadT2, costeMateriaPrimaUnidadP1;

        double costeProduccionUnidadM1, costeProduccionUnidadM2, costeProduccionUnidadT1, costeProduccionUnidadT2, costeProduccionUnidadP1;

        double precioUnidadM1, precioUnidadM2, precioUnidadT1, precioUnidadT2, precioUnidadP1;

        int cantidadVenta;

        String resultado, codigoProducto, menu;

        //Inicializamos el menú con un textblock.
        menu = """
               --- --- --- Menú --- --- ---
               Introduza el código deseado.
               
               M1 para Mantecado de Limón.
               M2 para Mazapán.
               T1 para Turrón de Chocolate.
               T2 para Turrón Clásico.
               P1 para Polvorón.
               
               """;

        //Solicitamos introducir el código de producto
        codigoProducto = JOptionPane.showInputDialog(menu);

        //Según lo introducido usamos un switch para ir a un submenú de producto u otro
        switch (codigoProducto) {
            case "M1","m1":
                costeMateriaPrimaUnidadM1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de un Mantecado de Limón"));//Solicitamos el precio de la materia prima y hacemos Parse de String a Double
                if (costeMateriaPrimaUnidadM1 < 0.1 || costeMateriaPrimaUnidadM1 > 1) {//Si el precio de la materia prima no está entre 0.1 y 1 entraría en el if
                    JOptionPane.showMessageDialog(null, "El precio no es correcto");//Mensaje de error
                    break;//Si entra en el if sale del programa
                }
                costeProduccionUnidadM1 = costeMateriaPrimaUnidadM1 + MANO_OBRA_UNIDAD_M1_T1; //Calculamos el coste de producir una unidad
                precioUnidadM1 = costeProduccionUnidadM1 + (costeProduccionUnidadM1 / 2); //Calculamos el precio de venta de una unidad

                /*
                La ecuación para averiguar la cantidad que debemos vender para tener 2500€ de beneficio sería:
                Siendo X las ventas realizadas
                X = 2500 / (precioVenta-costeProducción)               
                 */
                //Para el cálculo hacemos un Math.ceil porque no podemos vender medias unidades y guardamos el resultado en un int
                //Ya que al hacer Math.ceil nos quedará un número de decimales iguales a 0 el cual no perderá información
                //al guardarlo en un int
                cantidadVenta = (int) Math.ceil((BENEFICIO_OBJETIVO / (precioUnidadM1 - costeProduccionUnidadM1)));

                //Guardamos el mensaje que queremos mostrar en ventana dentro de un textblock sin olvidar que debemos mostrar 2 decimales
                resultado = """
                            Referente a los mantecados de limón sabemos:
                            El coste de la materia prima es de %.2f €.
                            El precio de la mano de obra es de %.2f €.
                            El precio de fabricación de una unidad es de %.2f €.
                            Por lo tanto el precio de venta sería %.2f €.
                            
                            Y tendríamos que vender %d unidades para tener un beneficio de 2500€.
                            """.formatted(costeMateriaPrimaUnidadM1, MANO_OBRA_UNIDAD_M1_T1, costeProduccionUnidadM1, precioUnidadM1, cantidadVenta);

                JOptionPane.showMessageDialog(null, resultado);
                break;

            //Repetimos el proceso para el resto de casos
            case "M2","m2":
                costeMateriaPrimaUnidadM2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de un Mazapán"));
                if (costeMateriaPrimaUnidadM2 < 0.1 || costeMateriaPrimaUnidadM2 > 1) {
                    JOptionPane.showMessageDialog(null, "El precio no es correcto");
                    break;
                }
                costeProduccionUnidadM2 = costeMateriaPrimaUnidadM2 + MANO_OBRA_UNIDAD_M2_T2_P1;
                precioUnidadM2 = costeProduccionUnidadM2 + (costeProduccionUnidadM2 / 2);

                cantidadVenta = (int) Math.ceil((BENEFICIO_OBJETIVO / (precioUnidadM2 - costeProduccionUnidadM2)));

                resultado = """
                            Referente a los mazapanes sabemos:
                            El coste de la materia prima es de %.2f €.
                            El precio de la mano de obra es de %.2f €.
                            El precio de fabricación de una unidad es de %.2f €.
                            Por lo tanto el precio de venta sería %.2f €.
                            
                            Y tendríamos que vender %d unidades para tener un beneficio de 2500€.
                            """.formatted(costeMateriaPrimaUnidadM2, MANO_OBRA_UNIDAD_M2_T2_P1, costeProduccionUnidadM2, precioUnidadM2, cantidadVenta);

                JOptionPane.showMessageDialog(null, resultado);
                break;

            case "T1","t1":
                costeMateriaPrimaUnidadT1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de una tableta de Turrón de Chocolate"));
                if (costeMateriaPrimaUnidadT1 < 0.1 || costeMateriaPrimaUnidadT1 > 1) {
                    JOptionPane.showMessageDialog(null, "El precio no es correcto");
                    break;
                }
                costeProduccionUnidadT1 = costeMateriaPrimaUnidadT1 + MANO_OBRA_UNIDAD_M1_T1;
                precioUnidadT1 = costeProduccionUnidadT1 + ((costeProduccionUnidadT1 * 65) / 100);

                cantidadVenta = (int) Math.ceil((BENEFICIO_OBJETIVO / (precioUnidadT1 - costeProduccionUnidadT1)));

                resultado = """
                            Referente al turrón de chocolate sabemos:
                            El coste de la materia prima es de %.2f €.
                            El precio de la mano de obra es de %.2f €.
                            El precio de fabricación de una unidad es de %.2f €.
                            Por lo tanto el precio de venta sería %.2f €.
                            
                            Y tendríamos que vender %d unidades para tener un beneficio de 2500€.
                            """.formatted(costeMateriaPrimaUnidadT1, MANO_OBRA_UNIDAD_M1_T1, costeProduccionUnidadT1, precioUnidadT1, cantidadVenta);

                JOptionPane.showMessageDialog(null, resultado);
                break;

            case "T2","t2":
                costeMateriaPrimaUnidadT2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de una tableta de Turrón Clásico"));
                if (costeMateriaPrimaUnidadT2 < 0.1 || costeMateriaPrimaUnidadT2 > 1) {
                    JOptionPane.showMessageDialog(null, "El precio no es correcto");
                    break;
                }
                costeProduccionUnidadT2 = costeMateriaPrimaUnidadT2 + MANO_OBRA_UNIDAD_M2_T2_P1;
                precioUnidadT2 = costeProduccionUnidadT2 + ((costeProduccionUnidadT2 * 65) / 100);

                cantidadVenta = (int) Math.ceil((BENEFICIO_OBJETIVO / (precioUnidadT2 - costeProduccionUnidadT2)));

                resultado = """
                            Referente al turrón clásico sabemos:
                            El coste de la materia prima es de %.2f €.
                            El precio de la mano de obra es de %.2f €.
                            El precio de fabricación de una unidad es de %.2f €.
                            Por lo tanto el precio de venta sería %.2f €.
                            
                            Y tendríamos que vender %d unidades para tener un beneficio de 2500€.
                            """.formatted(costeMateriaPrimaUnidadT2, MANO_OBRA_UNIDAD_M2_T2_P1, costeProduccionUnidadT2, precioUnidadT2, cantidadVenta);

                JOptionPane.showMessageDialog(null, resultado);
                break;

            case "P1","p1":
                costeMateriaPrimaUnidadP1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de un Polvorón"));
                if (costeMateriaPrimaUnidadP1 < 0.1 || costeMateriaPrimaUnidadP1 > 1) {
                    JOptionPane.showMessageDialog(null, "El precio no es correcto");
                    break;
                }
                costeProduccionUnidadP1 = costeMateriaPrimaUnidadP1 + MANO_OBRA_UNIDAD_M2_T2_P1;
                precioUnidadP1 = costeProduccionUnidadP1 + (costeProduccionUnidadP1 / 2);

                cantidadVenta = (int) Math.ceil((BENEFICIO_OBJETIVO / (precioUnidadP1 - costeProduccionUnidadP1)));

                resultado = """
                            Referente a los polvorones sabemos:
                            El coste de la materia prima es de %.2f €.
                            El precio de la mano de obra es de %.2f €.
                            El precio de fabricación de una unidad es de %.2f €.
                            Por lo tanto el precio de venta sería %.2f €.
                            
                            Y tendríamos que vender %d unidades para tener un beneficio de 2500€.
                            """.formatted(costeMateriaPrimaUnidadP1, MANO_OBRA_UNIDAD_M2_T2_P1, costeProduccionUnidadP1, precioUnidadP1, cantidadVenta);

                JOptionPane.showMessageDialog(null, resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "El código introducido no existe");

        }

    }

}
