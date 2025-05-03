package ListThree;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua data de nascimento");
        int Idade = sc.nextInt();
        if (Idade - 2025 >= 18) {
            System.out.println("Voce e maior de idade");
        } else {
            System.out.println("Voce nao e maior de idade");
            
        }

    }
}
