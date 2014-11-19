package apptarea4;

/**
 *
 * @author MG
 */
public class ListaNumeros {

    private NodoLista raiz;
    private NodoLista1 raiz1;
    private Nodolista2 raiz2;

    public void insertar(NodoLista num) {
        NodoLista nuevo;
        nuevo = new NodoLista();
        nuevo.setNumero(num.getNumero());
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoLista auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }

    }
    // se recorre la lista y se encuentran los valores pare e impares, luego se muestran las 3 listas
    public String numeros() {
        int n = 0;
        String retorno = "", pares = "", impares = "", r="";
        NodoLista auxiliar = raiz;
        while (auxiliar != null) {
            n=auxiliar.getNumero();
            if ( n % 2 == 0) {
                pares += n + " ";
            } else {
                impares += n + " ";
            }

            auxiliar = auxiliar.getSiguiente();
            r += n + " ";
        }
        retorno += "Lista uno " + r + '\n';
        retorno += "Lista pares " + pares + '\n';
        retorno += "Lista impares " + impares +  '\n';
       
        return retorno;

    }
    // se crea a partir de la Nodolista1 
    public void insertar2(NodoLista1 num) {
        NodoLista1 nuevo;
        nuevo = new NodoLista1();
        nuevo.setNumero(num.getNumero());
        if (raiz1 == null) {
            nuevo.setSiguiente(null);
            raiz1 = nuevo;
        } else {
            NodoLista1 auxiliar = raiz1;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }

    }
    // se multiplica cada valor aleatorio por si mismo y se muestran ambas listas por pantalla
    public String aleatorio() {
        int n = 0,  r=0;
        String retorno = "", aux="", aux1="";
        NodoLista1 auxiliar1 = raiz1;
        while (auxiliar1 != null) {
            n=auxiliar1.getNumero();
            auxiliar1 = auxiliar1.getSiguiente();
            r = n*n;
            aux1+= r + " ";
            aux+= n + " ";
        }
        retorno+= "Lista aleatoria " + aux + '\n';
        retorno += "Lista al cuadrado " + aux1 +  '\n';
        
        return retorno;

    }
    // se crea a partir de Nodolista2
    public void insertar3(Nodolista2 num) {
        Nodolista2 nuevo;
        nuevo = new Nodolista2();
        nuevo.setNumero(num.getNumero());
        if (raiz2 == null) {
            nuevo.setSiguiente(null);
            raiz2 = nuevo;
        } else {
            Nodolista2 auxiliar = raiz2;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }

    }
    // cambiamos el valor(es) negativo por un 0
    public String negativo() {
        int n = 0;
        String retorno = "", r="",aux="";
        Nodolista2 auxiliar = raiz2;
        while (auxiliar != null) {
            n=auxiliar.getNumero();
            if ( n >= 0) {
                
                r += n + " ";
            } else {
                
                r += 0 + " ";
            }

            auxiliar = auxiliar.getSiguiente();
            aux += n + " ";
        }
        retorno += "Lista digitada " + aux + '\n';
        retorno += "Lista con cambio " + r + '\n';

        return retorno;

    }
}
