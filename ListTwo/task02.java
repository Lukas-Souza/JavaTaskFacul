package ListTwo;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o numero para saber de ele esta no intervalo entre 10 e 20");
        int num = sc.nextInt();
        if (num >= 10 && num <= 20) {
            System.out.println("O numero se encontra-se no intervaloo entre 10 e 20");
        }
        else {
            System.out.println("O não numero se encontra-se no intervaloo entre 10 e 20");
            
        }
    }
}
