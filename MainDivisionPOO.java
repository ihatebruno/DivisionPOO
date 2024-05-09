import java.util.Scanner;

public class MainDivisionPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.
        DivisionPOO div = new DivisionPOO(); // Crear un objeto DivisionPOO.

        // Solicitar al usuario que ingrese los dos números.
        System.out.println("Ingresa el primer numero: ");
        div.setA(sc.nextDouble()); // Leer el primer número y asignarlo a 'a' mediante el método setA.

        System.out.println("Ingresa el segundo numero: ");
        div.setB(sc.nextDouble()); // Leer el segundo número y asignarlo a 'b' mediante el método setB.

        System.out.println(div.division()); // Imprimir la división de los dos números.
        System.out.println(div.toString()); // Imprimir la representación en cadena del objeto DivisionPOO.

        div.getA();
        div.getB();
    }
}
