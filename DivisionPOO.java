public class DivisionPOO {
    
    private double a,b,resultado;{
    
}
public double division(){
    resultado = this.a / this.b;
    return resultado;
}
public double getA() {
    return a;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public double getResultado() {
        return resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado = resultado;

    }

    @Override
    public String toString() {
        return "DivisionPOO [Primer numero=" + a + ", Segundo numero=" + b + ", Resultado=" + resultado + "]";
    }
}