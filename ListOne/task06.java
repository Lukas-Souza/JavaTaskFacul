import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Note1, Note2, Note3;
        System.out.println("Digite a nota 1: ");
        Note1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        Note2 = sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        Note3 = sc.nextDouble();
        System.out.println("A media e"+ (Note1+ Note2+Note3)/3);
    }
}
