package ListThree;

import java.util.Scanner;

public class tas11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();
        if (number % 10 == 0) {
            System.out.println("Conten o numero terminado em zero");
        }else{
            System.out.println("Nao conten o numero terminado em zero");

        }
    }
}
