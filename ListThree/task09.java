package ListThree;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int input = sc.nextInt();
        if (input%2 ==0 &&input%5 ==0) {
            System.out.println("O numero é divisivel por 2 e 5");
        } else {
            System.out.println("O numero nao é divisivel por 2 e 5");
            
        }
    }
}
