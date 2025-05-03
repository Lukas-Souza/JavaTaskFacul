package ListThree;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        String Username, Passwor;
        Username = "Lucas";
        Passwor = "123";
        System.out.println("Dite o usuario: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input == Username) {
            System.out.println("Agora digite a senha: ");
            input = sc.nextLine();
            if (input == Passwor) {
                System.out.println("Acesso liberado");
            }
            else {
                System.out.println("Voce errou a senha!!");
            }
        } else {
            System.out.println("Nao existe o nome deste usuario");
        }

    }
}
