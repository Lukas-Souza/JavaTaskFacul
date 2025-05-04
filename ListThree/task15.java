package ListThree;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber em que intervalo ele se encontra");
        int number = sc.nextInt();
        if( number >= 0 && number <= 25){
            System.out.println("O intervalo esta no intervalo de [0, 25]");
        }else if(number >= 25 && number <= 50){
            System.out.println("O intervalo esta no intervalo de [25, 50]");

    }else if(number >= 50 && number <=75){
        System.out.println("O intervalo esta no intervalo de [50, 75]");
    }else if(number >= 75 && number <=100){
        System.out.println("O intervalo esta no intervalo de [75, 100]");
    }else{
        System.out.println("O numero nao encontrase em nemhum intervalo");
    }
    }
}
