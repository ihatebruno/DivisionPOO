import java.util.Scanner;
public class MainDivisionPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivisionPOO div = new DivisionPOO();
        
        System.out.println("Ingresa el primer numero: ");
        div.setA(sc.nextInt());

        System.out.println("Ingresa el segundo numero: ");
        div.setB(sc.nextInt());

        System.out.println(div.division());
        System.out.println(div.toString());

        div.getA();
        div.getB();
    }
}