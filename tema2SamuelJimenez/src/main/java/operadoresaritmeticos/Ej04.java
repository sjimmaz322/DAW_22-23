package operadoresaritmeticos;

/**
 *
 * @author sajm
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaramos e inicializamos las variables int requeridas.
        int a = 10, b = 20;

        //Declaramos sin inicializar las variables booleanas requeridas.
        boolean bool1, bool2, bool3, bool4;

        bool1 = a < b;
        bool2 = a > b;
        bool3 = a == b;
        bool4 = a != b;

        System.out.println("Mostrando resultados:\t"
                + "\na<b es " + bool1
                + "\na>b es " + bool2
                + "\na==b es " + bool3
                + "\na!=b es " + bool4);
    }

}
