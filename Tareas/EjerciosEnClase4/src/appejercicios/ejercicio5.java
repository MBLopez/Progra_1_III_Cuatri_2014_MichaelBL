package appejercicios;

/**
 *
 * @author MG
 */
public class ejercicio5 {
    /*Declaración de variables*/

    int A = 0;
    /*Método constructor*/

    public ejercicio5(int N) {
        this.A = N;

    }
    /*Método para declarar si un número es par o impar por medio de un if*/

    public String parImpar() {
        String r = "";
        if (A % 2 == 0) {
            r = "El número " + A + " es par";
        } else {
            r = "El número " + A + " es impar";
        }
        return r;
    }

}
