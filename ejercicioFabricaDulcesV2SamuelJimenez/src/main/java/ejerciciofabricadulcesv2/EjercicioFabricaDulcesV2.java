/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofabricadulcesv2;

import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class EjercicioFabricaDulcesV2 {

    /*
    - Método para el menú
    - Método leer códigos
    - Método filtrar código
    - Método leer materia prima
    - Método filtrar materia prima
    - Método leer mano de obra
    - Método filtrar mano de obra
    - Método calcular coste de producción
    - Método calcular el precio de venta unitario
    - Calcular unidades para el beneficio de 2500 euros
     */
    //        Declaramos e inicializamos las constantes que necesitaremos para el programa
    private static final double MANO_OBRA_UNIDAD_MINIMO = 0.5;
    private static final double MANO_OBRA_UNIDAD_MAXIMO = 0.9;
    private static final int BENEFICIO_OBJETIVO = 2500;
    private static final double MINIMO_COSTE = 0.1;
    private static final double MAXIMO_COSTE = 1.0;
    private static final String CODIGO_COMPROBAR = "Comprobar";
    private static final String CODIGO_SALIDA = "Salir";
    private static final String MENU = """
               --- --- --- Menú --- --- ---
               Introduza el código deseado.
               
               M1 para Mantecado de Limón.
               M2 para Mazapán.
               T1 para Turrón de Chocolate.
               T2 para Turrón Clásico.
               P1 para Polvorón.
                                       
               SALIR para finalizar el programa.
               
               """;
    private static String code = "";

    public static void main(String[] args) {

        comprobaCodigoAccion(CODIGO_COMPROBAR, CODIGO_SALIDA);

    }

    private static void comprobaCodigoAccion(String cod1, String cod2) {

        String menu = """
               Introduza que desea hacer
               Comprobar - Para comprobar la viabilidad de los productos.
               Salir - Para salir.
               """;
        do {
            do {
                code = Utilidades.pedirString(menu);
            } while (!(code.equalsIgnoreCase(cod1) || code.equalsIgnoreCase(cod2)));
            if (code.equalsIgnoreCase(cod1)) {
                rutaComprobar();
            } else {
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
            }
        } while (!code.equalsIgnoreCase(CODIGO_SALIDA));
    }

    private static void rutaComprobar() {

        comprobaCodigoDulce("M1", "M2", "T1", "T2", "P1");

    }

    private static void comprobaCodigoDulce(String cod1, String cod2, String cod3, String cod4, String cod5) {

        do {
            code = Utilidades.pedirString(MENU).toUpperCase();
        } while (!(code.equalsIgnoreCase(cod1)
                || code.equalsIgnoreCase(cod2)
                || code.equalsIgnoreCase(cod3)
                || code.equalsIgnoreCase(cod4)
                || code.equalsIgnoreCase(cod5)
                || code.equalsIgnoreCase(CODIGO_SALIDA)));

        if ((code.equalsIgnoreCase(CODIGO_SALIDA))) {
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
        } else {
            calcularViabilidad(code);
        }
    }

    private static void calcularViabilidad(String code) {
        String nombre;

        double costeMateriaPrimaUnidad, costeManoObra;
        costeMateriaPrimaUnidad = Utilidades.doubleVentanaRangoIncluyente("Introduza el coste de la materia prima para la fabricación de una unidad de producto",
                MAXIMO_COSTE, MINIMO_COSTE);

        costeManoObra = Utilidades.doubleVentanaRangoIncluyente("Introduzca el coste de mano de obra de la fabricación de una unidad de producto",
                MANO_OBRA_UNIDAD_MAXIMO, MANO_OBRA_UNIDAD_MINIMO);
        double costeProduccionUnidad = calculoPrecioProduccion(costeMateriaPrimaUnidad, costeManoObra);

        double precioVentaUnidad = calculoPrecioUnidad(code, costeProduccionUnidad);

        nombre = selectorNombre(code);

        int cantidadVentaNecesaria = calculoVentaNecesariaObjetivo(precioVentaUnidad, costeProduccionUnidad);
        //Guardamos el mensaje que queremos mostrar en ventana dentro de un textblock sin olvidar que debemos mostrar 2 decimales
        String resultado = """
                            Referente al producto "%s" sabemos:
                            El coste de la materia prima es de %.2f €.
                            El precio de la mano de obra es de %.2f €.
                            El precio de fabricación de una unidad es de %.2f €.
                            Por lo tanto el precio de venta sería %.2f €.
                            
                            Y tendríamos que vender %d unidades para tener un beneficio de 2500€.
                            """.formatted(nombre, costeMateriaPrimaUnidad, costeManoObra,
                costeProduccionUnidad, precioVentaUnidad, cantidadVentaNecesaria);

        JOptionPane.showMessageDialog(null, resultado);

    }

    private static double calculoPrecioProduccion(double materiaPrima, double manoObra) {
        return materiaPrima + manoObra;
    }

    private static double calculoPrecioUnidad(String code, double coste) {
        if (code.equalsIgnoreCase("M1") || code.equalsIgnoreCase("M2") || code.equalsIgnoreCase("P1")) {
            return (coste + (coste / 2));
        } else {
            return (coste + (coste * 65) / 100);
        }
    }

    private static int calculoVentaNecesariaObjetivo(double precioVenta, double costeProduccion) {
        return ((int) Math.ceil((BENEFICIO_OBJETIVO / (precioVenta - costeProduccion))));
    }

    private static String selectorNombre(String code) {
        String nombreProducto = "";
        switch (code) {//Dependiendo del código guardamos el nombre del producto en una variable para mostrarlo luego
            case "M1" -> {
                nombreProducto = "Mantecados de Limón";
            }
            case "M2" -> {
                nombreProducto = "Mazapán";
            }
            case "P1" -> {
                nombreProducto = "Polvorón";
            }
            case "T1" -> {
                nombreProducto = "Turrón de chocolate";
            }
            case "T2" -> {
                nombreProducto = "Turrón Clásico";
            }
        }
        return nombreProducto;
    }
}
