package variables;

/**
 *
 * @author sajm
 */
public class Ej01 {

    public static void main(String[] args) {

        //Declaramos las variables.
        byte variable0;
        int variable1;
        double variable2;
        short variable3;
        long variable4;
        float variable5;
        char variable6;

        //Inicializamos las variables.
        variable0 = 1;
        variable1 = 1;
        variable2 = 1.549849846;
        variable3 = 1;
        variable4 = 42l;
        variable5 = 15.549875487f;
        variable6 = 'a';

        //Declaramos el objeto String.
        String variable7;

        //Inicializamos el objeto String.
        variable7 = "Muerte a pellizcos";

        //Declaramos las variables constantes.
        final int CONSTANTE1;
        final double CONSTANTE2;

        //Inicializamos las variables contrantes.
        CONSTANTE1 = 3;
        CONSTANTE2 = 3.14;

        //Usamos println para mostrar por consola las variables, constantes y el objeto.
        System.out.println("La variable byte es: " + variable0
                + "\nLa variable int es: " + variable1
                + "\nLa variable double es: " + variable2
                + "\nLa variable short es: " + variable3
                + "\nLa variable long es: " + variable4
                + "\nLa variable float es: " + variable5
                + "\nLa variable char es: " + variable6
                + "\nEl objeto String es: " + variable7
                + "\nLa constante int es: " + CONSTANTE1
                + "\nLa constante double es: " + CONSTANTE2);

        //Usamos printf para limitar la cantidad de decimales mostrados.
        System.out.printf("La variable double con solo dos decimales es %.2f", variable2);
        System.out.printf("\nLa variable float con solo dos decimales es %.2f", variable5);
    }
}
