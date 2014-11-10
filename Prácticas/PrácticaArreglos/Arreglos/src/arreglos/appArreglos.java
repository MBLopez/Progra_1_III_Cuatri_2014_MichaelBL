package arreglos;

import java.util.Scanner;

/**
 *
 * @author MG
 */
public class appArreglos {

       public static void main(String[] args) {
        
           /*Variables a usar*/
           int opt=0;
           /*Instancia de la clase*/
           
           
           Scanner teclado = new Scanner(System.in);
           
           do{
               System.out.println("Seleccione una opción" + '\n'
               + "1: Arreglo de 8 digitos" + '\n'
               + "2: Arreglos de 4 digitos" + '\n'
               + "3: Mayor promedio, curso A y B" + '\n'
               + "4: Mostrar orden de arreglo" + '\n'
               + "5: Salir" + '\n'); 
               opt= Integer.parseInt(teclado.nextLine());
               
               switch(opt){
                   case 1:
                       int arreglo8 [] = new int [8]; 
                       for(int i=0; i<arreglo8.length;i++){  
                       System.out.println("Digite el número " + (i+1));
                       arreglo8 [i] = Integer.parseInt(teclado.nextLine());
                       
                       }
                       ejercicio8 A= new ejercicio8();
                       System.out.println(A.ejercicio1(arreglo8) + " y los que suman más de 36 y menos de 50 son " + A.menores(arreglo8));
                       System.out.println(" finalmente los que suman más de 50 son " + A.mayores(arreglo8));
                       break;
                   case 2:
                       int arreglo7 [] = new int [4];
                       int arreglo6 [] = new int [4];
                       System.out.println("En cada campo digite dos números, primero uno y luego el otro");
                       for(int i=0; i<arreglo7.length;i++){
                       System.out.println("Digite dos números en campo " + (i+1));
                       arreglo7 [i] = Integer.parseInt(teclado.nextLine());
                       arreglo6 [i] = Integer.parseInt(teclado.nextLine());
                       
                       }
                       ejercicio8 B= new ejercicio8();
                       System.out.println("La suma de valores es " + B.sumaArreglos(arreglo7, arreglo6));
                       break;
                   case 3:
                       ejercicio8 C= new ejercicio8();
                       System.out.println(C.cursos());
                       break;
                   case 4:
                       ejercicio8 D= new ejercicio8();
                       int arreglo5 [] = new int [10];
                       for(int i=0; i<arreglo5.length;i++){  
                       System.out.println("Digite el número " + (i+1));
                       arreglo5 [i] = Integer.parseInt(teclado.nextLine());
                       }
                       System.out.println("" + D.ordenArreglo(arreglo5));
                   break;
                       
                   case 5:
                   System.exit(0);
                   break;
               }
           
           }while(opt!=5);
           
    }
    
}
