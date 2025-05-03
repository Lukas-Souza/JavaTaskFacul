 package ListThree;

import java.util.Scanner;

public class task03 {
public static void main(String[] args) {
    System.out.println("Escreva um numero para saber qual o maior deles: ");
    Scanner sc = new Scanner(System.in);
    int numberOne = sc.nextInt();
    int numTwo = sc.nextInt();
    if (numTwo > numberOne) {
        System.out.println(numTwo +"e o maior numero");
    } else {
        System.out.println(numberOne +"e o maior numero");
        
    }
}
    
}