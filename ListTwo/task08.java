package ListTwo;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Digite o numero 1: ");
        num2 = sc.nextInt();
        if (num1 % 5 == 0 || num2 % 5 == 0) {
            System.out.println("Um dos numeros digitados é multiplo de 5");
        }
        else {
            System.out.println("nenhum numero digitado é multiplo de 5");
        }
    }
}
