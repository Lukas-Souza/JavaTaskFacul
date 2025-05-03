import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o numero 1: ");
        double numberOne = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numberTwo = sc.nextDouble();
        if (numberOne > numberTwo) {
            System.out.println(numberOne + "e o maior numero");
        }
        else {
            System.out.println(numberTwo+ "e o maior numero");
        }
    }
}
