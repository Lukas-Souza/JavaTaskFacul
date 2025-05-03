import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        int Km;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque a distancia a ser percorrida: ");
        Km = sc.nextInt();
        System.out.println("O total que você ira gatar com combustivel e"+ (Km*1/12));
    }
}