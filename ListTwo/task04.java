package ListTwo;

import java.util.Scanner;

public class task04 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escreva o primeiro numero: ");
    int number01 = sc.nextInt();
    System.out.println("Escreva o segundo numero: ");
    int number02 = sc.nextInt();
    if (number01 % 2 == 0 && number02 % 2 == 0) {
        System.out.println("Os dois numeros são pá");
    } else if(number01 % 2 == 0 || number02 % 2 == 0) {
        System.out.println("Um dos dois numeros é pa");
    } else {
        System.out.println("Todos são impa");
    }
}
}
