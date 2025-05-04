package ListThree;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 12 para saber quantos dias os mes tem");
        int mes = sc.nextInt();
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("O mês tem 31 dias.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("O mês tem 30 dias.");
        } else if (mes == 2) {
            System.out.println("Fevereiro tem 28 dias ou 29 em anos bissextos.");
        } else {
            System.out.println("Número de mês inválido.");
        }
    }
}
