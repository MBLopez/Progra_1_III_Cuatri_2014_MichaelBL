package appejercicios;

import java.util.Scanner;

public class AppEjercicios {

    public static void main(String[] args) {
        /*Declaración de variables*/
        int A = 0, X = 0, Y = 0, Be = 0, Ce = 0, De = 0;
        double N = 0, M = 0;
        char C = 0;

        /*Instancia para la captura de datos por teclado*/
        Scanner teclado = new Scanner(System.in);

        System.out.println("...........Ejercicio número 1...........");
        System.out.println("Digite un número");
        A = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite otro número");
        N = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite una letra");
        C = teclado.nextLine().charAt(0);
        /*Instancia de la clase ejercicio1*/
        ejercicio1 p = new ejercicio1(A, N, C);
        System.out.println("Valores de variables: " + "A= " + A + "  N= " + N + "  C= " + C);
        System.out.println("La suma de N + A es: " + p.suma());
        System.out.println("La diferencia de A - N es: " + p.diferencia());
        System.out.println("El valor númerico de palabra es: " + p.palabra());
        System.out.println("");
        System.out.println("...........Ejercicio número 2...........");
        System.out.println("Digite un número para X");
        X = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un número para Y");
        Y = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un número para N");
        N = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite un número para M");
        M = Double.parseDouble(teclado.nextLine());
        /*Instancia de la clase ejercicio2*/
        ejercicio2 B = new ejercicio2(X, Y, N, M);
        System.out.println("Valores de variables: " + "  X=" + X + "  Y=" + Y + "  N=" + N + "  M=" + M);
        System.out.println("La suma de X + Y es: " + B.suma1());
        System.out.println("La resta de X - Y es: " + B.resta1());
        System.out.println("La multiplicación de X * Y es: " + B.mult1());
        System.out.println("La división de X / Y es: " + B.div1());
        System.out.println("La suma de N + M es: " + B.suma2());
        System.out.println("La resta de N - M es: " + B.resta2());
        System.out.println("La multiplicación de N * M es: " + B.mult2());
        System.out.println("La división de N / M es: " + B.div2());
        System.out.println("");
        System.out.println("...........Ejercicio número 3...........");
        System.out.println("Digite un número");
        Y = Integer.parseInt(teclado.nextLine());
        /*Instancia de la clase ejercicio3*/
        ejercicio3 D = new ejercicio3(Y);
        System.out.println("El valor de N es: " + D.aumentarvalor());
        System.out.println("");
        System.out.println("...........Ejercicio número 4...........");
        System.out.println("Digite un valor numerico para A");
        A = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un valor numerico para B");
        Be = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un valor numerico para C");
        Ce = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un valor numerico para D");
        De = Integer.parseInt(teclado.nextLine());
        /*Instancia de la clase ejercicio4*/
        ejercicio4 E = new ejercicio4(A, Be, Ce, De);
        System.out.println("Los valores iniciales de las variables son: " + " A=" + A + " B=" + Be + " C=" + Ce + " D=" + De);
        System.out.println("Los nuevos valores de las variables son: A=" + E.cambioA() + "  B=" + E.cambioB() + "  C=" + E.cambioC() + "  D=" + E.cambioD());
        System.out.println("");
        System.out.println("...........Ejercicio número 5...........");
        System.out.println("Digite un valor numerico");
        A = Integer.parseInt(teclado.nextLine());
        /*Instancia de la clase ejercicio5*/
        ejercicio5 F = new ejercicio5(A);
        System.out.println(F.parImpar());
        System.out.println("");
        System.out.println("...........Ejercicio número 6...........");
        System.out.println("Digite un valor numerico");
        A = Integer.parseInt(teclado.nextLine());
        /*Instancia de la clase ejercicio6*/
        ejercicio6 G = new ejercicio6(A);
        System.out.println(G.mayorMenor());
        System.out.println("...........Ejercicio número 7...........");
        System.out.println("Digite un valor numerico");
        A = Integer.parseInt(teclado.nextLine());
        /*Instancia de la clase ejercicio7*/
        ejercicio7 H = new ejercicio7(A);
        System.out.println("El número " + H.mayorMenor() + "," + H.parImpar() + "," + H.multiplo5() + "," + H.multiplo10() + "," + H.menorque());

    }

}
