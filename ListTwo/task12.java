package ListTwo;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 != 0 || num % 3 != 0) {
            System.out.println("O numero digitado nao e multiplo nem por 2 nem por 3");
        }
        else{
            System.out.println("Ou o numero é multiplo por 2 ou por 3");
        }
    }
}
