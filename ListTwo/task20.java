package ListTwo;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    System.out.println("Escreva um numero: ");
        int num = sc.nextInt();
        if (num !=100 && num%4 ==0) {
            System.out.println("O numero e diferente de 100 e multiplo de 4");
        } else {
            System.out.println("O numero nao e diferente de 100 e multiplo de 4");
            
        }
    }
}
