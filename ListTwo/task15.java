package ListTwo;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o numero 1: ");
        int num = sc.nextInt();
        System.out.println("Escreva o numero 2: ");
        int num2 = sc.nextInt();
        if (num > 0 && num2 > 0 || num < 0 && num2 < 0) {
            System.out.println("Ambos os numero tem os mesmos sinais");
        } else {
            System.out.println("Os numeros não tem os mesmo sinais");
        }
    }
}
