package ListTwo;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1 ( oque voce quer dividir) ");
        int num1 = sc.nextInt();
        System.out.println("Digite o numero ( quantas veces voce quer dividir) ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("A divição dentre os dois numeros é exatas" + num1 / num2);
        }
        else {
            System.out.println("a divisao nao sao exetas");
        }

    }
}
