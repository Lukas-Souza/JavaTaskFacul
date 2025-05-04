 package ListThree;

import java.util.Scanner;

class task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado01, lado02, lado03;
        System.out.println("Coloque o lado o primeiro lado do triangulo:");
        lado01 = sc.nextDouble();
        System.out.println("Digite o tamanho lado 2 do triangulo: ");
        lado02 = sc.nextDouble();
        System.out.println("Digite o lado 3 do triangulo: ");
        lado03 = sc.nextDouble();
        if(lado01 == lado02 && lado02== lado03){
            System.out.println("Isto e um triangulo equilatero");
        }else if( lado01 == lado02 && lado02 !=lado03){
            System.out.println("isto e um tringulo isoceles");
        }
        
    }
}