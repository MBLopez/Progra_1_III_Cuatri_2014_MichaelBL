package appejercicios;

/**
 *
 * @author MG
 */
public class ejercicio4 {
    /*Declaracion de variables*/

    int A, B, C, D;
    /*Metodo constructor*/

    public ejercicio4(int a, int b, int c, int d) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }
    /*Le damos el valor inicial de C a B*/

    public int cambioB() {
        int cambioB = this.C;

        return cambioB;
    }
    /*Le damos el valor inicial de A a C*/

    public int cambioC() {
        int cambioC = this.A;

        return cambioC;
    }
    /*Le damos el valor inicial de D a A*/

    public int cambioA() {
        int cambioA = this.D;

        return cambioA;
    }
    /*Le damos el valor inicial de B a D*/

    public int cambioD() {
        int cambioD = this.B;

        return cambioD;
    }

}
