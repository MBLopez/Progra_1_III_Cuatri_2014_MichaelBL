package appejercicios;

/**
 *
 * @author MG
 */
public class ejercicio1 {
    /*Declaración de variables*/

    int A;
    double N;
    char C;
    /*Método constructor*/

    public ejercicio1(int A, double N, char C) {
        this.A = A;
        this.N = N;
        this.C = C;
    }

    public double suma() {
        double suma;
        suma = N + A;
        return suma;
    }

    public double diferencia() {
        double dif;

        dif = A - N;
        return dif;
    }

    public int palabra() {
        int pal;
        pal = C;
        return pal;
    }

}
