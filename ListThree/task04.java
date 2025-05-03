package ListThree;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        System.out.println("Digite a sua idade: ");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if (idade >= 12) {
            System.out.println("Criança");
        }else if (idade >= 13) {
            System.out.println("Adolescente");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        }
        else {
            System.out.println("Idade nao identificada");
        }
    }
}
