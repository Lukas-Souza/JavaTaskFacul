import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        double altura, base;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque a base do triangulo");
        base = sc.nextDouble();
        System.out.println("Coloque a altura do triangulo");
        altura = sc.nextDouble();
        System.out.println("a área do triangulo e "+ (base*altura)/2);


    }
}
