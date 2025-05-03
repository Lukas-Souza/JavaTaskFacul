package ListTwo;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        if (idade > 18 && idade < 60) {
            System.out.println("Voce tem uma idade entre 18 a 60");
        } else {
            System.out.println("Voce nao tem uma idade entre 18 a 60");
            
        }
    }
}
