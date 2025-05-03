package ListTwo;

import java.util.Scanner;

public class task03232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num01, num02;
        System.out.println("Escolha o primeiro numero: ");
        num01 = sc.nextInt();
        System.out.println("Escolha o segundo numero: ");
        num02 = sc.nextInt();
        if (num01 > num02) {
            System.out.println("O primeiro numero é o maior!!");
        }
        else {
            System.out.println("O segundo numero é o maior!!");
            
        }

    }
}
