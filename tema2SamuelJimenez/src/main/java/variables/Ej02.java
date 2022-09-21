package variables;

/**
 *
 * @author sajm
 */
public class Ej02 {

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables con los nombres y valores requeridos
        int a = 1, b = 2, c = 3;
        double d = 4.5, e = 5.7, f = 6.9;

        //Imprimimos por consola los valores en dos lineas diferentes
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        System.out.println("d=" + d + " e=" + e + " f=" + f);

        //Realizamos la sobrescritura de valores requerida
        b = c;
        c = a;
        a = b;

        //Imprimimos por consola los valores ya sobrescritos,
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        System.out.println("d=" + d + " e=" + e + " f=" + f);
    }

}
