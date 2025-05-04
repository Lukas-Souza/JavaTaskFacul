package ListThree;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o palidromo: ");
        String input = sc.nextLine();
        if(input.charAt(0) == input.charAt(1) && input.length() ==2){
            System.out.println("Isto e um palidromo de dois digitos");
        }
        else{
            System.out.println("Opção invalida");
        }
    }
}
