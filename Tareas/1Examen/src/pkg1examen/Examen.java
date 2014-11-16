package pkg1examen;

import java.util.Scanner;

/**
 *
 * @author MG
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables a usar 
        byte n = 0, opt = 0;
        int monto=0;
        String pal = "";

        //Instancias de la clase
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Seleccione una opción" + '\n' + "1: Encriptar palabra" + '\n' + "2: Desglosar monto en plabras" + '\n' + "3: Salir");
            opt = teclado.nextByte();
            switch (opt) {
                case 1:
                    System.out.println("Escriba una palabra");
                    pal = teclado.next();
                    System.out.println("Digite el numero de saltos");
                    n = Byte.parseByte(teclado.next());
                    System.out.println("");
                    cls1Examen A = new cls1Examen(pal, n);
                    System.out.println(A.encriptar());
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Digite una cantidad entera de billetes");
                    monto = teclado.nextInt();
                    cls1Examen B = new cls1Examen(pal, n);
                    B.pasarAletras(monto);
                    System.out.println(B.pasarAletras(monto));
                    System.out.println("");
                    break;

                case 3:
                    System.exit(0);
                    break;
            }

        } while (opt != 3);
    }

}
