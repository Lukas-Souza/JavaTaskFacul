import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        int inputUser;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o numero abaixo para converter ele para Centimetro e Milimetro");
        inputUser = sc.nextInt();
        System.out.println("Centimetros: " + (inputUser * 10));
        System.out.println("Milimetros: " + (inputUser * 100));
        
    }
}
