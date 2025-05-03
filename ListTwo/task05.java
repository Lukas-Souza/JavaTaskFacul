package ListTwo;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Coloque o primeiro numero: ");
       int numUser = sc.nextInt();
       System.out.println("Coloque o segundo numero: ");
       int numUser02 = sc.nextInt();
       if (numUser < 0) {
           System.out.println(numUser + " e negativo");
       }
       else if (numUser02<0) {
        System.out.println(numUser02+" e negativo");
    } else {
        System.out.println("Os dois numeros são positivos!");
       }
    }
}
