import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em grua celso: ");
        int tempGrau = sc.nextInt();
        System.out.println("A temperatura na escala Fahrenheit"+ ((tempGrau*1.8)+32));
    }
}
