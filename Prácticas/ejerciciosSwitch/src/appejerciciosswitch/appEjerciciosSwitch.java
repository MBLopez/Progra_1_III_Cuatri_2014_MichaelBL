package appejerciciosswitch;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author MG
 */
public class appEjerciciosSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Variables*/
        int opt = 0, A = 0, B = 0, C = 0, NUMERO=0;
        String letra = "";
        /*Instacia para la captura por teclado*/
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Menú, seleccione una opción"
                    + '\n' + "1: Retorna el mes"
                    + '\n' + "2: Cálculo terminaciones (2-5-8) y (4-7-9)"
                    + '\n' + "3: Retorna condición a letras de a-e"
                    + '\n' + "4: Cantidad de días del mes"
                    + '\n' + "5: Número aleatorio y Romano"
                    + '\n' + "6: Retorna fecha día anterior"
                    + '\n' + "7: Retorna día de la semana"
                    + '\n' + "8: Retorna día de semana actual"
                    + '\n' + "9: Salir");
            opt = Integer.parseInt(teclado.nextLine());

            switch (opt) {
                case 1:
                    System.out.println("Digite un número de mes");
                    A = Integer.parseInt(teclado.nextLine());
                    clsEjeSwitch Z = new clsEjeSwitch(A, letra);
                    System.out.println("El mes del número " + A + " es " + Z.retornaMes() + '\n');
                    break;
                case 2:
                    System.out.println("Digite un número");
                    A = Integer.parseInt(teclado.nextLine());
                    clsEjeSwitch Y = new clsEjeSwitch(A, letra);
                    System.out.println("Resultado= " + Y.retornaCuadrado() + '\n');
                    break;
                case 3:
                    System.out.println("Digite un una letra validas desde" + " a" + " hasta b");
                    letra = teclado.nextLine();
                    clsEjeSwitch X = new clsEjeSwitch(A, letra);
                    System.out.println(letra + "= " + X.condicion(letra) + '\n');
                    break;
                case 4:
                    System.out.println("Digite un número para el año");
                    A = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite un número para el mes");
                    B = Integer.parseInt(teclado.nextLine());
                    clsEjeSwitch W = new clsEjeSwitch(A, letra);
                    System.out.println("Los días de " + W.numDiasMes(A, B) + " para el año " + A);
                    break;
                case 5:
                    Random aleatorio = new Random();
                    A = 1 + aleatorio.nextInt(10);
                    clsEjeSwitch V = new clsEjeSwitch(A, letra);
                    System.out.println("Número aleatorio es= " + A + " su equivalente en romano es= " + V.aleatorioRomano(A));
                    break;
                case 6:
                    System.out.println("Digite el número del día");
                    A = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el número del mes");
                    B = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el número del año");
                    C = Integer.parseInt(teclado.nextLine());
                    clsEjeSwitch U = new clsEjeSwitch(A, letra);
                    System.out.println("La fecha anterior a " + A + "/" + B + "/" + C + " es " + U.fechaAnterior(A, B, C));
                    System.out.println("Número del caso 2 es " + U.NUMERO);
                    break;
                case 7:
                    System.out.println("Digite el número del día");
                    A = Integer.parseInt(teclado.nextLine());
                    clsEjeSwitch T = new clsEjeSwitch(A, letra);
                    if (A>31){
                    System.out.println("Lo sentimos! su numero no esta contemplado" + '\n' + "Intente con uno menor a: " + A);
                    } else {
                    System.out.println("El día la semana es " + T.diasemana(A)); 
                    }
                    break;
                case 8:
                    System.out.println("Qué día de la semana fue el día 1 del mes actual?" + '\n' + "Digite el nombre del día");
                    letra = teclado.nextLine();
                    System.out.println("Digite el número día actual, ejemplo: si es 06/10/2014. Debe digitar (6)");
                    A = Integer.parseInt(teclado.nextLine());
                    clsEjeSwitch R = new clsEjeSwitch(A, letra);
                    System.out.println("El día actual es " + R.diaActual(letra, A));
                    break;
                case 9:
                    System.exit(0);
                    break;

            }
        } while (opt != 9);

    }

}
