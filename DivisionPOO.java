public class DivisionPOO {
    private double a, b, resultado; // Definición de variables de instancia para los números a dividir y el resultado.

    // Método para realizar la división.
    public double division() {
        resultado = this.a / this.b; // Realiza la división y guarda el resultado en la variable de instancia resultado.
        return resultado; // Devuelve el resultado de la división.
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

    // Metodos getters y setters

    @Override
    public String toString() { // Método toString para representar el objeto DivisionPOO como una cadena de texto.
        return "DivisionPOO [Primer numero=" + a + ", Segundo numero=" + b + ", Resultado=" + resultado + "]";
        // Devuelve una cadena con los valores de a, b y resultado.
    }
}