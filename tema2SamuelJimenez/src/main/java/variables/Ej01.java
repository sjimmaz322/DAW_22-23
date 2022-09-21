package variables;

/**
 *
 * @author sajm
 */
public class Ej01 {

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables
        int variable1 = 1;
        double variable2 = 1.5445874168;
        short variable3 = 1;
        long variable4 = 42;
        float variable5 = 15.457788965f;
        char variable6 = 'a';

        //Declaramos e inicializamos el objeto String.
        String variable7 = "Muerte a pellizcos";

        //Declaramos las variables constantes
        final int CONSTANTE1 = 10;
        final double CONSTANTE2 = 3.14;

        //Usamos println para mostrar por consola las variables, constantes y el objeto.
        System.out.println("La variable int es: " + variable1
                + "\nLa variable int es: " + variable2
                + "\nLa variable double es: " + variable3
                + "\nLa variable short es: " + variable4
                + "\nLa variable long es: " + variable5
                + "\nLa variable float es: " + variable6
                + "\nLa variable char es: " + variable7
                + "\nLa constante int es: " + CONSTANTE1
                + "\nLa constante double es: " + CONSTANTE2);

        //Usamos printf para limitar la cantidad de decimales mostrados.
        System.out.printf("La variable double con solo dos decimales es %.2f", variable2);
        System.out.printf("\nLa variable float con solo dos decimales es %.2f", variable5);
    }
}
