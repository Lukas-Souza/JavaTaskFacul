package ListTwo;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele esta em um intervalo entre 50 a 100: ");
        int num = sc.nextInt();
        if (num > 50 && num < 100) {
            System.out.println("O numero digitado esta dentro do intervalo");
        }
        else {
            System.out.println("O numero digitado nao esta dentro do intervalo");
            
        }
    }
}
