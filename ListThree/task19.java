package ListThree;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloue os sinais que voce que calcular[+,-,*,/]: ");
        String sinal = sc.nextLine();
        System.out.println("Digite o primeiro numero: ");
        Double numberOn1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        Double numberOn2 = sc.nextDouble();
        
        if (sinal == "+") {
            System.out.println("O resuldao e: " +(numberOn1+numberOn2)) ;
        }else if( sinal == "-"){
            System.out.println("O resuldao e: " +(numberOn1-numberOn2)) ;

        }else if( sinal == "*"){
            System.out.println("O resuldao e: " +numberOn1*numberOn2) ;
            
        }else if( sinal == "/"){
            System.out.println("O resuldao e: " +numberOn1/numberOn2) ;
            
        }else{
            System.out.println("Opção invalida");
        }
    }
}
