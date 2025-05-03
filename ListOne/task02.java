import java.util.Scanner;

public class task02 {
    public static void main(String[] args){
        int numberOne, numberTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        numberOne = sc.nextInt();
        System.out.println("Escreva um segundo numero: ");
        numberTwo = sc.nextInt();
        System.out.println("A soma dos dois numeros e: " + numberOne+numberTwo);
    }
}
