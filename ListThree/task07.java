package ListThree;

import java.util.Scanner;

public class task07 {
public static void main(String[] args) {
    System.out.println("Digite um numero: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 2 == 0) {
        System.out.println("este numero e multiplo de 2");
    }else if (number % 3 == 0) {
        System.out.println("este numero e multiplo de 3");
    } else {
        System.out.println("O numero nao e mutiplo nem de 2 nem de 3");
    }
}    
}
