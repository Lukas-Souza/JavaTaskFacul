package ListTwo;
import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        int num3, num2, num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Coloque o numero 2");
        num2 = sc.nextInt();
        System.out.println("Coloque o numero 3: ");
        num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos os numeros digitados sao iguais");
        }
        else {
            System.out.println("O conunto de imput digitado nao sao igual uns aos outros");
        }
    }
}
