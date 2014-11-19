package apptarea4;

/**
 *
 * @author MG
 */
public class NodoLista1 {
private int numero;
    private NodoLista1 siguiente;
    
    public NodoLista1() {
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
    public NodoLista1 getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLista1 siguiente) {
        this.siguiente = siguiente;
    }
    
}
