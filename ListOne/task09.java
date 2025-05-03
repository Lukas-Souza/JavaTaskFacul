import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        double salary;
        Scanner sc = new Scanner(System.in);
        salary = sc.nextDouble();
        System.out.println("O seu novo salario com os 10% de almento e"+ (salary+(salary*10)/100));
    }
}
