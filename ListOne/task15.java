import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        int parcela = sc.nextInt();
        double valueParcela = value / parcela;
        System.out.println("O valor de cada parcela fica "+ parcela+" de "+ valueParcela);
    }
}
