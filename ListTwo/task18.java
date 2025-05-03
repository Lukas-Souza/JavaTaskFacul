package ListTwo;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1");
        int num1 = sc.nextInt();
        System.out.println("Digite o numero 2");
        int num2 = sc.nextInt();
        if (num1 + num2 > 50 && num1 + num2 < 100) {
            System.out.println("A soma do numero esta em um intervalo entre 50 a 100");

        } else {
            System.out.println("A soma do numero nao esta em um intervalo entre 50 a 100");
        }
    }
}
