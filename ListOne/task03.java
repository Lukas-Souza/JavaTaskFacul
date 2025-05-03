import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade: ");
        year = sc.nextInt();
        System.out.println("Você viveu o total de "+(year*365)+ " dias aqui na terra!");
    }
}
