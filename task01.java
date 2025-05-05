import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o lado do primeiro cateto do triangulo:");
        double cateto01 = sc.nextDouble();
        System.out.println("Coloque o lado do segundo cateto do triangulo:");
        double cateto02 = sc.nextDouble();
        System.out.println("Coloque o lado do terceiro cateto do triangulo:");
        double cateto03 = sc.nextDouble();
        if (cateto01 == cateto02 && cateto02 == cateto03) {
            System.out.println("Isto e um triangulo equilatero");
        } else if (cateto01 == cateto02 || cateto02 == cateto03 || cateto03 == cateto01) {
            System.out.println("Isto e um triangulo exoceles");
        } else if (cateto01 != cateto02 && cateto02 != cateto03) {
            System.out.println("Isto e um triangulo escaleno");
        } else if (cateto01 + cateto02 < cateto03) {
            System.out.println("O triangulo não existe");
        } else {
            System.out.println("opcao invalida");
        }
        
    }
}
