import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um numero real: ");
        double numberReal = sc.nextDouble();
        int number = (int) numberReal;
        System.out.println("A parte inteira do numero e"+ number);
    }
}
