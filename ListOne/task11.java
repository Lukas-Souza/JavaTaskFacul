import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        double value;
        Scanner sc = new Scanner(System.in);
        value = sc.nextDouble();
        System.out.println("O valor com 5% de desconto e"+ (value-(value*5)/100));
    }
}
