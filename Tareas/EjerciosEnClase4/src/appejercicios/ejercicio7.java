package appejercicios;

/**
 *
 * @author MG
 */
public class ejercicio7 {
    /*Variables a usar*/

    int C;
    /*Método constructor*/

    public ejercicio7(int A) {
        this.C = A;
    }
    /*Método para saber si el número ingresado por consola es positivo
     o negativo, por medio de un if*/

    public String mayorMenor() {
        String r = "";
        if (C < 0) {
            r = " es negativo";
        } else {
            r = " es positivo";
        }
        return r;
    }
    /*Método para saber si el número ingresado por consola es par
     o impar, por medio de un if*/

    public String parImpar() {
        String r = "";
        if (C % 2 == 0) {
            r = " es par";
        } else {
            r = " es impar";
        }
        return r;
    }
    /*Método para saber si el número ingresado por consola es multiplo de 5
     por medio de un if*/

    public String multiplo5() {
        String r = "";
        if (C % 1 == 0 && C % 5 == 0) {
            r = " multiplo de 5";
        } else {
            r = " no es multiplo de 5";
        }
        return r;
    }
    /*Método para saber si el número ingresado por consola es multiplo de 10
     por medio de un if*/

    public String multiplo10() {
        String r = "";
        if (C % 1 == 0 && C % 10 == 0) {
            r = " es multiplo de 10";
        } else {
            r = " no es multiplo de 10";
        }
        return r;
    }
    /*Método para saber si el número ingresado por consola es mayor
     o menor que 100, por medio de un if*/

    public String menorque() {
        String r = "";
        if (C < 100) {
            r = " es menor que 100";
        } else {
            r = " es mayor que 100";
        }
        return r;
    }

}
