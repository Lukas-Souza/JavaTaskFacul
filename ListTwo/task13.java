package ListTwo;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1");
        num1 = sc.nextInt();
        System.out.println("Digite o numero 2");
        num2 = sc.nextInt();
        System.out.println("Digite o numero 3");
        num3 = sc.nextInt();
        if (num1 >= 7 && num2 >= 7 && num3 >= 7) {
            System.out.println("Todos os numero digitados sao maior ou iguais a 7");
        } else {
            System.out.println("Nem todos os numeros digitados são maior ou igual a 7");
        }
    }
}
