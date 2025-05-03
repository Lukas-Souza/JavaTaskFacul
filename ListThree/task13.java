package ListThree;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number %2 !=0 && number%3 !=0 && number %5 !=0) {
            System.out.println("Ele é um numer primo");
        } else {
            System.out.println("Ele nao e um numero primo");
        } 
    }
}
