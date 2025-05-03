package ListThree;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele e positivo ou negativo");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("O numero e positivo");
        }else{
            System.out.println("O numero e negativo");
        }

    }
}
