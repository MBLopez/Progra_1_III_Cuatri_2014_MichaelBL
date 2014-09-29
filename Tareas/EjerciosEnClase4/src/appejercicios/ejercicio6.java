package appejercicios;

/**
 *
 * @author MG
 */
public class ejercicio6 {
    /*Declaración de variables*/

    int B;
    /*Método constructor*/

    public ejercicio6(int A) {
        this.B = A;
    }
    /*Método para calcular si el número ingresado por consola es positivo
     o negativo, usando un if*/

    public String mayorMenor() {
        String r = "";
        if (B < 0) {
            r = "El número " + B + " es negativo";
        } else {
            r = "El número " + B + " es positivo";
        }
        return r;
    }

}
