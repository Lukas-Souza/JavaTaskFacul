package ListTwo;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digte o numero 1:");
        int number1 = sc.nextInt();
        System.out.println("Digte o numero 2:");
        int number2 = sc.nextInt();
        if (number1 / 2 == number2) {
            System.out.println(number1 + " e o dobro de " + number2);
        }
        else if (number2 / 2 == number1) {
            System.out.println(number2 + " e o dobro de " + number1);
        }
        else {
            System.out.println("Nunhum e dobro do outro");
        }
        }
}
