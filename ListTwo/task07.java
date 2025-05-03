package ListTwo;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele é par e maior de 100: ");    
        int num = sc.nextInt();
        if (num % 2 == 0 && num > 100) {
            System.out.println("O numero digitado é par e maior doque 100");
        }
        else {
            System.out.println("O numero digito não confere a condição");
        }

    }
}
