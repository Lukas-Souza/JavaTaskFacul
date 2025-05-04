 package ListThree;

import java.util.Scanner;

public class task20 {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        
        if ((numero >= 10 && numero <= 99) || (numero <= -10 && numero >= -99)) {
        
            if (Math.abs(numero % 10) % 2 == 0) {
                System.out.println("O número tem dois dígitos e termina em número par.");
            } else {
                System.out.println("O número tem dois dígitos, mas termina em número ímpar.");
            }
        } else {
            System.out.println("O número não tem dois dígitos.");
        }
}
    
}