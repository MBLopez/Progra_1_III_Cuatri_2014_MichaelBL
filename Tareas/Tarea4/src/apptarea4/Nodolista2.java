package apptarea4;

/**
 *
 * @author MG
 */
public class Nodolista2 {
   private int numero;
   private Nodolista2 siguiente;
    
    public Nodolista2() {
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
    public Nodolista2 getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodolista2 siguiente) {
        this.siguiente = siguiente;
    }
    
}
