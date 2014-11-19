package apptarea4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MG
 */
public class Tarea4 {

    public static void main(String[] args) {
        int opt = 0, B=0;
        // Lista de 10 numeros, muestra pares, impares y lista digitada
        ListaNumeros A = new ListaNumeros();
        NodoLista nodoNumero;
        NodoLista1 nodoNumero1;
        Nodolista2 nodoNumero2;
        Scanner oScanner = new Scanner(System.in);
        do {
            System.out.println("Seleccione una opción" + 
                                '\n' + "1: Lista pares/impares" + 
                                '\n' + "2: Lista aleatoria/al cuadrado" + 
                                '\n' + "3: Sustituir valor de lista por 0" + 
                                '\n' + "4: Salir" + '\n');
            opt = oScanner.nextInt();
            switch (opt) {
                case 1:

                    for (int i = 0; i < 10; i++) {
                        nodoNumero = new NodoLista();
                        System.out.println("Digite un numero en pocisión " + (i + 1));
                        nodoNumero.setNumero(oScanner.nextInt());
                        A.insertar(nodoNumero);
                    }
                    System.out.println(A.numeros());
                    break;
                case 2:
                    // Se genera una lista de numeros aleatoria entre 0-10
                    for (int j = 0; j < 10; j++){
                    Random aleatorio = new Random();
                    nodoNumero1 = new NodoLista1();
                    B = 1 + aleatorio.nextInt(10);
                    nodoNumero1.setNumero(B);
                    A.insertar2(nodoNumero1);
                    }
                    System.out.println(A.aleatorio());
                    break;
                case 3:
                    // Se captura una lista de numeros entre 0-10
                    for (int i = 0; i < 10; i++) {
                        nodoNumero2 = new Nodolista2();
                        System.out.println("Digite un numero en pocisión " + (i + 1));
                        nodoNumero2.setNumero(oScanner.nextInt());
                        A.insertar3(nodoNumero2);
                    }
                    System.out.println(A.negativo());
                    break;
            }
        } while (opt != 4);
    }

}
