package arreglos;

/**
 *
 * @author MG
 */
public class ejercicio8 {

    int suma = 0;

    /*Método constructor*/
    public ejercicio8() {

    }
    /*Método para calcular el ejercicio 1, para calcular la suma de los campos de un arreglo*/

    public String ejercicio1(int arre[]) {
        int n = 0, r = 0;
        int vector[] = new int[15];
        String sec = "";
        for (int i = 0; i < arre.length; i++) {
            n += arre[i];

            sec = "La  sumatoria es " + n;

        }
        return sec;
    }
    /*Método del ejercicio 1 para retornar el valor de los campos que suman más de 36 y menos de 50*/

    public String menores(int arre[]) {
        String sec = "";
        int n = 1, r = 0;
        for (int i = 0; i < arre.length; i++) {
            r = arre[i] + arre[n];

            if (r >= 36 && r < 50) {
                sec += arre[i] + "," + arre[n] + ",";
            } else {
                r = 0;
                sec = sec + r + ",";
            }

            n++;
            if (n == arre.length) {
                break;
            }
        }

        return sec;
    }
    /*Método del ejercicio 1 para retornar los valores de los campos que suman más de 50*/

    public String mayores(int arre[]) {
        String sec = "";
        int n = 1, r = 0;
        for (int i = 0; i < arre.length; i++) {
            r = arre[i] + arre[n];

            if (r >= 50) {
                sec += arre[i] + "," + arre[n] + ",";
            } else {
                r = 0;
                sec = sec + r + ",";
            }

            n++;
            if (n == arre.length) {
                break;
            }
        }

        return sec;
    }

    /*Método del ejercicio 2, para sumar los valores posición a posición de dos vectores*/
    public String sumaArreglos(int arreglo7[], int arreglo6[]) {
        int r[] = new int[4];
        String sec = "";

        for (int i = 0; i < arreglo7.length; i++) {
            r[i] = arreglo7[i] + arreglo6[i];
            sec += r[i] + ",";
        }

        return sec;
    }
    /*Método del ejercicio 3, para mostrar el promedio mayor de dos cursos*/

    public String cursos() {
        String sec = "";
        double r = 0, r1 = 0;
        int cursoA[] = {1, 2, 6, 9, 5};
        int cursoB[] = {3, 5, 4, 8, 2};
        for (int i = 0; i < cursoA.length; i++) {
            r += cursoA[i];
            r1 += cursoB[i];

        }
        r = r / cursoA.length;
        r1 = r1 / cursoB.length;
        if (r > r1) {
            sec = "El curso con mayor promedio es el A";
        } else {
            sec = "El curso con mayor promedio es el B";
        }

        return sec;
    }
    /*Método del ejercicio 4, para mostrar el orden del arreglo, se debe digitar en orden los números*/

    public String ordenArreglo(int arreglo5[]) {
        String sec = "";
        int j = 1, temp1, temp2;
        for (int i = 0; i < arreglo5.length; i++) {
            temp1 = arreglo5[i];
            temp2 = arreglo5[j];
            if (temp1 > temp2) {
                sec = "El orden del arreglo es de MAYOR a menor";
            } else {
                if (temp1 < temp2) {
                    sec = "El orden del arreglo es de MENOR a mayor";
                }
            }
            j++;
            if (j <= arreglo5.length) {
                break;
            }

        }
        return sec;
    }
}
