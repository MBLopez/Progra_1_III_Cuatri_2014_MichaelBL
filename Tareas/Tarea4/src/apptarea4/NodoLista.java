package apptarea4;

/**
 *
 * @author MG
 */
public class NodoLista {
    private int numero;
    private NodoLista siguiente;
    
    public NodoLista() {
        numero =0;
        siguiente = null;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the siguiente
     */
    public NodoLista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
}
