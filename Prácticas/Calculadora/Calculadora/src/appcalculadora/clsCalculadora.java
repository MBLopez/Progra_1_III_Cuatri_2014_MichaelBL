package appcalculadora;

/**
 *
 * @author MG
 */
public class clsCalculadora {
    int A, B;
    
    /*Método constructor*/
    public clsCalculadora (int a, int b){
    this.A=a;
    this.B=b;
    
    }
    public String suma(){
    String r="";
    int resultado=0;
    resultado = A + B;
    r += resultado;
    return r;    
    }
    public String resta(){
    String r="";
    int resultado=0;
    resultado = A - B;
    r += resultado;
    return r;    
    }
    public String multipli(){
    String r="";
    int resultado=0;
    resultado = A * B;
    r += resultado;
    return r;    
    }
    public String division(){
    String r="";
    int resultado=0;
    resultado = A / B;
    r += resultado;
    return r;    
    }
    public Double potencia(){
    Double r=null;
    Double resultado=null;
    resultado = Math.pow(A, B);
    r = resultado;
    return r;    
    }
    public float raiz(){
    float r=0;
    float resultado=0;
    resultado = (float) Math.sqrt(A);
    r = resultado;
    return r;    
    }
}
