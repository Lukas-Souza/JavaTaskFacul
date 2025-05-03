import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("O numero é par");
        }
        else {
            System.out.println("O numero é Impa");
        }
    }
}
