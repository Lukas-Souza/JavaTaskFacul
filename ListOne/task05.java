import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();
        System.out.println("Dobro: "+ number * 2);
        System.out.println("Triplo: " + number * 3);
        System.out.println("Raiz quadrada:"+ Math.sqrt(number) );
        
        
    }
}
