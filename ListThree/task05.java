package ListThree;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero");
        int number = sc.nextInt();
        if (number > 1 && number< 100) {
            System.out.println("O numero se encontra em um intervalo de 1 a 100");
        } else {
            System.out.println("O numero nao se encontra em um intervalo de 1 a 100");
            
        }
    }
}
