package ListThree;
import java.util.*;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um numero para saber se ele e impa ou pa");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("O numemro digitado e par");
        }
        else {
            System.out.println("O numero digitado e impa");
        }

    }
}
