package ListTwo;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int num = sc.nextInt();
        if (num > 0 && num < 1000) {
            System.out.println("O numero é positivo e menor doque 1000");
        } else {
            System.out.println("O numero não cabe nas condiçao");
        }
    }
}
