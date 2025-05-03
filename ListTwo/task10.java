package ListTwo;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para sbaer se ele e multiplo de 3 ou de 7: ");
        int num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.println("O numero " + num + " e multiplo de 3");
        }
        else if (num % 7 == 0) {
            System.out.println("O numero " + num + " e multiplo de 7");
        }
        else{
        System.out.println("O numero digitado nao e multiplo de 3 ou nem de 7");
        }
    }
}
