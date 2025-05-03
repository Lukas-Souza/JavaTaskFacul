package ListTwo;
import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2!=0 || num>100) {
            System.out.println("O numero e impar ou maior que 100");
        } else {
            System.out.println("O numero nao e impar ou maior que 100");
            
        }
    }
}
