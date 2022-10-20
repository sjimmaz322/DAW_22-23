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
        double costeMateriaPrimaUnidad;

        double costeProduccionUnidad, costeManoObra;

        double precioUnidad = 0;

        int cantidadVenta;

        String resultado, codigoProducto, menu, nombreProducto = "";

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
            case "M1","m1","M2","m2","T1","t1","T2","t2","P1","p1":

                costeMateriaPrimaUnidad = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                        + " prima para la fabricación de un Mantecado de Limón"));//Solicitamos el precio de la materia prima y hacemos Parse de String a Double
                if (costeMateriaPrimaUnidad < 0.1 || costeMateriaPrimaUnidad > 1) {//Si el precio de la materia prima no está entre 0.1 y 1 entraría en el if
                    JOptionPane.showMessageDialog(null, "El precio no es correcto");//Mensaje de error
                    break;//Si entra en el if sale del programa
                }
                if (codigoProducto.equalsIgnoreCase("M1") || codigoProducto.equalsIgnoreCase("T1")) {//Guardamos el valor de la mano de obra en una variable dependiendo del producto selecionado
                    costeManoObra = MANO_OBRA_UNIDAD_M1_T1;
                } else {
                    costeManoObra = MANO_OBRA_UNIDAD_M2_T2_P1;
                }

                costeProduccionUnidad = costeMateriaPrimaUnidad + costeManoObra; //Calculamos el coste de producir una unidad

                final double PRECIO_UNIDAD_M1_M2_P1 = costeProduccionUnidad + (costeProduccionUnidad / 2);
                final double PRECIO_UNIDAD_T1_T2 = (costeProduccionUnidad + (costeProduccionUnidad * 65) / 100);

                switch (codigoProducto) {//Dependiendo del código guardamos el nombre del producto en una variable para mostrarlo luego
                    case "M1","m1":
                        nombreProducto = "Mantecados de Limón";
                        precioUnidad = PRECIO_UNIDAD_M1_M2_P1;
                        break;
                    case "M2","m2":
                        nombreProducto = "Mazapán";
                        precioUnidad = PRECIO_UNIDAD_M1_M2_P1;
                        break;
                    case "P1","p1":
                        nombreProducto = "Polvorón";
                        precioUnidad = PRECIO_UNIDAD_M1_M2_P1;
                        break;
                    case "T1","t1":
                        nombreProducto = "Turrón de chocolate";
                        precioUnidad = PRECIO_UNIDAD_T1_T2;
                        break;
                    case "T2","t2":
                        nombreProducto = "Turrón Clásico";
                        precioUnidad = PRECIO_UNIDAD_T1_T2;
                        break;
                }

                //Para el cálculo hacemos un Math.ceil porque no podemos vender medias unidades y guardamos el resultado en un int
                //Ya que al hacer Math.ceil nos quedará un número de decimales iguales a 0 el cual no perderá información
                //al guardarlo en un int
                cantidadVenta = (int) Math.ceil((BENEFICIO_OBJETIVO / (precioUnidad - costeProduccionUnidad)));

                //Guardamos el mensaje que queremos mostrar en ventana dentro de un textblock sin olvidar que debemos mostrar 2 decimales
                resultado = """
                            Referente al producto "%s" sabemos:
                            El coste de la materia prima es de %.2f €.
                            El precio de la mano de obra es de %.2f €.
                            El precio de fabricación de una unidad es de %.2f €.
                            Por lo tanto el precio de venta sería %.2f €.
                            
                            Y tendríamos que vender %d unidades para tener un beneficio de 2500€.
                            """.formatted(nombreProducto, costeMateriaPrimaUnidad, costeManoObra,
                        costeProduccionUnidad, precioUnidad, cantidadVenta);

                JOptionPane.showMessageDialog(null, resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "El código introducido no existe");

        }

    }

}
