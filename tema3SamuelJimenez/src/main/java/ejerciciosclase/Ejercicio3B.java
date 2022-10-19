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
        
        final double MANO_OBRA_UNIDAD_M1_T1 = 0.15;
        final double MANO_OBRA_UNIDAD_M2_T2_P1 = 0.22;
        
        double costeMateriaPrimaUnidadM1, costeMateriaPrimaUnidadM2, costeMateriaPrimaUnidadT1, costeMateriaPrimaUnidadT2, costeMateriaPrimaUnidadP1;
        
        double costeProduccionUnidadM1, costeProduccionUnidadM2, costeProduccionUnidadT1, costeProduccionUnidadT2, costeProduccionUnidadP1;
        
        double precioUnidadM1, precioUnidadM2, precioT1, precioT2, precioP1;
        
        String codigoProducto = JOptionPane.showInputDialog("Introduzca el código del producto");
        
        switch (codigoProducto) {
            case "M1":
                costeMateriaPrimaUnidadM1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de un Mantecado de Limón"));
                if (costeMateriaPrimaUnidadM1 < 0.1 || costeMateriaPrimaUnidadM1 > 1) {
                    JOptionPane.showMessageDialog(null, "El precio no es correcto");
                }
                break;
            case "M2":
                costeMateriaPrimaUnidadM2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de un Mazapán"));
                break;
            case "T1":
                costeMateriaPrimaUnidadT1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de una tableta de Turrón de Chocolate"));
                break;
            case "T2":
                costeMateriaPrimaUnidadT2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de una tableta de Turrón Clásico"));
                break;
            case "P1":
                costeMateriaPrimaUnidadP1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de un Polvorón"));
                break;
            default:
                JOptionPane.showMessageDialog(null, "El código introducido no es válido");
            
        }
        
    }
    
}
