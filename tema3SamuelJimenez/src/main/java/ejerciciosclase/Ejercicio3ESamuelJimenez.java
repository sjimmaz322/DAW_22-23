/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ejercicio3ESamuelJimenez {

    /*
    En un nuevo proyecto llamado Ejercicio3E+tunombre realiza las siguientes modificaciones sobre el ejercicio de la fábrica de dulces.

    El programa debe tener dos opciones, la primera es realizar los cálculos para ver la viabilidad de los productos y la segunda debe ser “terminar”.
    Para terminar el programa el usuario debe escribir la palabra Salir (ignorando mayúsculas y minúsculas). 
    En caso de escribir otra cosa, el programa volverá al menú principal.
    El programa debe filtrar los códigos de los productos. En caso de introducir un código inexistente, el programa preguntará de nuevo por el código a introducir.
    Si el usuario escribe Salir (ignorando mayúsculas y minúsculas) el programa termina.
    También se debe filtrar el precio de la materia prima. En caso de que el usuario introduzca un número fuera del rango, el programa debe solicitarlo de nuevo.
    En este ejercicio también se debe solicitar el coste de la mano de obra para ese producto (siempre entre 0.5€ y 0.9€). 
    En caso de error al introducir este dato, el programa solicitará de nuevo esta información.
    El resto de restricciones son las mismas que en el ejercicio 3B, pero intenta aplicar las posibles correcciones del ejercicio que hicimos en clase, para que tu código no sea tan repetitivo y sea más legible.
    Incluye comentarios en el código que permiten leer mejor tu programa.
     */
    public static void main(String[] args) {
        //Declaramos e inicializamos las constantes que necesitaremos para el programa
        final double MANO_OBRA_UNIDAD_MINIMO = 0.5;
        final double MANO_OBRA_UNIDAD_MAXIMO = 0.9;
        final int BENEFICIO_OBJETIVO = 2500;
        final double MINIMO_COSTE = 0.1;
        final double MAXIMO_COSTE = 1.0;
        final String CODIGO_SALIDA = "Salir";
        final String CODIGO_VIABILIDAD = "Comprobar";
        boolean correcto = true;

        //Declaramos las variables que necesitaremos durante el uso del programa
        double costeMateriaPrimaUnidad = 0;

        double costeProduccionUnidad, costeManoObra = 0;

        double precioUnidad = 0;

        int cantidadVenta;

        String resultado, codigoProducto, opcion, menu, menu2, nombreProducto = "";

        //Inicializamos el menú con un textblock.
        menu = """
               Introduza que desea hacer
               Comprobar - Para comprobar la viabilidad de los productos.
               Salir - Para salir.
               """;

        //Inicializamos el menú 2 con un textblock.
        menu2 = """
               --- --- --- Menú --- --- ---
               Introduza el código deseado.
               
               M1 para Mantecado de Limón.
               M2 para Mazapán.
               T1 para Turrón de Chocolate.
               T2 para Turrón Clásico.
               P1 para Polvorón.
               
               """;
        do {//Bucle de repetición del programa completo
            opcion = JOptionPane.showInputDialog(menu).toUpperCase();
            switch (opcion) {//Switch para mostrar el programa, un mensaje de error que devolverá a la selección de opción o un mensaje de despedida.
                case "COMPROBAR":
                    correcto = true;
                    //Solicitamos introducir el código de producto
                    codigoProducto = JOptionPane.showInputDialog(menu2).toUpperCase();

                    //Según lo introducido usamos un switch para ir a un submenú de un producto u otro
                    switch (codigoProducto) {
                        case "M1","M2","T1","T2","P1":

                            do {//Bucle para asegurarnos de que el coste de producción de una unidad se encuentra dentro de nuestros parámetros marcados
                                correcto = true;//Reinicio de variable para no entrar en bucle infinito
                                try {//Bloque ry-catch en caso de introducir un String en la variable
                                    costeMateriaPrimaUnidad = Double.parseDouble(JOptionPane.showInputDialog("Introduza el coste de la materia"
                                            + " prima para la fabricación de una unidad de producto"));//Solicitamos el precio de la materia prima y hacemos Parse de String a Double

                                    if (costeMateriaPrimaUnidad < MINIMO_COSTE || costeMateriaPrimaUnidad > MAXIMO_COSTE) {//Si el precio de la materia prima no está entre 0.1 y 1 entraría en el if
                                        JOptionPane.showMessageDialog(null, "El precio no es correcto, debe encontrarse entre " + MINIMO_COSTE + " y " + MAXIMO_COSTE);//Mensaje de error
                                        correcto = false;//actualización de variable para repetir el bucle
                                    }
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Introduzca siempre que sea posible un número.");
                                    correcto = false;
                                }
                            } while (!correcto);

                            do {//Bucle para asegurarnos de que el coste de mano de obra por unidad se encuentra dentro de nuestros parámetros marcados
                                //Repetimos la misma estructura que en el bucle anterior
                                correcto = true;
                                try {
                                    costeManoObra = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el coste de mano de obra de la fabricación de una unidad de producto"));
                                    if (costeManoObra < MANO_OBRA_UNIDAD_MINIMO || costeManoObra > MANO_OBRA_UNIDAD_MAXIMO) {
                                        correcto = false;
                                        JOptionPane.showMessageDialog(null, "El precio de mano de obra no es correcto, debe estar entre 0.5 y 0.9.");
                                    }
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Introduzca siempre que sea posible un número.");
                                    correcto = false;
                                }
                            } while (!correcto);

                            costeProduccionUnidad = costeMateriaPrimaUnidad + costeManoObra; //Calculamos el coste de producir una unidad

                            final double PRECIO_UNIDAD_M1_M2_P1 = costeProduccionUnidad + (costeProduccionUnidad / 2);
                            final double PRECIO_UNIDAD_T1_T2 = (costeProduccionUnidad + (costeProduccionUnidad * 65) / 100);

                            switch (codigoProducto) {//Dependiendo del código guardamos el nombre del producto en una variable para mostrarlo luego
                                case "M1":
                                    nombreProducto = "Mantecados de Limón";
                                    precioUnidad = PRECIO_UNIDAD_M1_M2_P1;
                                    break;
                                case "M2":
                                    nombreProducto = "Mazapán";
                                    precioUnidad = PRECIO_UNIDAD_M1_M2_P1;
                                    break;
                                case "P1":
                                    nombreProducto = "Polvorón";
                                    precioUnidad = PRECIO_UNIDAD_M1_M2_P1;
                                    break;
                                case "T1":
                                    nombreProducto = "Turrón de chocolate";
                                    precioUnidad = PRECIO_UNIDAD_T1_T2;
                                    break;
                                case "T2":
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

                        case "SALIR"://Caso para finalizar el programa
                            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa.");
                            break;

                        default://Mensaje de error para repetición de programa
                            JOptionPane.showMessageDialog(null, "El código introducido no existe, introduzca un código de la lista o introduza salir.");
                            correcto = false;

                    }
                    break;
                case "SALIR":
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Introduzca un código correcto.\nLas opciones son:\nComprobar\n o \nSalir.");
                    break;
            }

        } while (!opcion.equalsIgnoreCase(CODIGO_SALIDA));

    }
}
