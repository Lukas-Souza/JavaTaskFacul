import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        double raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o raio do circulo para calcular a aréa:");
        raio = sc.nextDouble();
        System.out.println("A aréa do circulo é" + (raio*(3.14*3.14)));
    }
}
