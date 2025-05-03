package ListThree;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        int nota1, nota2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1 do aluno:");
        nota1 = sc.nextInt();
        System.out.println("Digite a nota 2 do aluno:");
        nota2 = sc.nextInt();
        if ( (nota1+ nota2)/2 < 4) {
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno aprovado");
            
        }
    }
}
