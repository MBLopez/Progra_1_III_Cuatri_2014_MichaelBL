package appcalculadora;

import java.util.Scanner;

/**
 *
 * @author MG
 */
public class appCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Iniciación de variables*/
        int a=0, b=0, opt=0;
        /*Instancia para la captura de datos por teclado*/
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Selecciones una opción del menú," + '\n' + "de acuerdo al uso que desea darle a nuestra calculadora" 
                    +  '\n' + "1: Suma" 
                    +  '\n' + "2: Resta"
                    +  '\n' + "3: Multiplicación"
                    +  '\n' + "4: División"
                    +  '\n' + "5: Potencia de un número"
                    +  '\n' + "6: Raíz de un número"
                    +  '\n' + "7: Salir");
            opt = Integer.parseInt(teclado.nextLine());
            switch (opt){
                case 1:
                System.out.println("Digite el primer número");
                a = Integer.parseInt(teclado.nextLine());
                System.out.println("Digite el primer número");
                b = Integer.parseInt(teclado.nextLine());
                clsCalculadora A = new clsCalculadora(a, b);
                System.out.println("El resultado de sumar sus números es: " + A.suma() + '\n');
                    break;
                case 2:
                System.out.println("Digite el primer número");
                a = Integer.parseInt(teclado.nextLine());
                System.out.println("Digite el segundo número");
                b = Integer.parseInt(teclado.nextLine());
                clsCalculadora B = new clsCalculadora(a, b);
                System.out.println("El resultado de sumar sus números es: " + B.resta() + '\n');    
                    break;
                case 3:
                System.out.println("Digite el primer número");
                a = Integer.parseInt(teclado.nextLine());
                System.out.println("Digite el segundo número");
                b = Integer.parseInt(teclado.nextLine());
                clsCalculadora C = new clsCalculadora(a, b);
                System.out.println("El resultado de multiplicar sus números es: " + C.multipli() + '\n');    
                    break;
                case 4:
                System.out.println("Digite el primer número");
                a = Integer.parseInt(teclado.nextLine());
                System.out.println("Digite el segundo número");
                b = Integer.parseInt(teclado.nextLine());
                clsCalculadora D = new clsCalculadora(a, b);
                System.out.println("El resultado de dividir sus números es: " + D.division() + '\n');    
                    break;
                case 5:
                System.out.println("Digite el primer número");
                a = Integer.parseInt(teclado.nextLine());
                System.out.println("Digite el segundo número al cual se elevara el primero");
                b = Integer.parseInt(teclado.nextLine());
                clsCalculadora E = new clsCalculadora(a, b);
                System.out.println("La potencia de su número es: " + E.potencia() + '\n');    
                    break;
                case 6:
                System.out.println("Digite un número");
                a = Integer.parseInt(teclado.nextLine());
                clsCalculadora F = new clsCalculadora(a, b);
                System.out.println("La raíz cuadrada de su número es: " + F.raiz() + '\n');    
                    break;
                case 7:
                    System.exit(0);
                    break;    
            }
   
        } while (opt!=7);
        
    }
    
}
