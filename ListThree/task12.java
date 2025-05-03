package ListThree;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o numero 1");
        num1 = sc.nextInt();
        System.out.println("Digite o numero 2");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1+ " e maior que " + num2);
        }else if( num1 == num2){
            System.out.println(num1+ " e igual a " + num2);
        }else{
            System.out.println(num2 +"e maior que "+ num1);
        }
    }
}
