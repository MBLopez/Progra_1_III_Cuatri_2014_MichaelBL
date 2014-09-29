package appejercicios;

/**
 *
 * @author MG
 */
public class ejercicio2 {
    /*Declaración de variables*/
    int X, Y;
    double N, M;
    /*Método constructor*/
    public ejercicio2(int x, int y, double n, double m){
    this.X=x;
    this.Y=y;
    this.N=n;
    this.M=m;
    
    }
    public int suma1(){
    int r=0;
    r = X+Y;
    return r;
    }
    public int resta1(){
    int r=0;
    r = X-Y;
    return r;
    }
    public int mult1(){
    int r=0;
    r = X*Y;
    return r;
    }
    public int div1(){
    int r=0;
    r = X/Y;
    return r;
    }
    public double suma2(){
    double r=0;
    r = N+M;
    return r;
    }
    public double resta2(){
    double r=0;
    r = N-M;
    return r;
    }
    public double mult2(){
    double r=0;
    r = N*M;
    return r;
    }
    public double div2(){
    double r=0;
    r = N/M;
    return r;
    }
    
}
