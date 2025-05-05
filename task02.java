import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q1, q2, q3;
        System.out.println("___________CALCULO_DE_NOTAS___________________");
        System.out.println("coloque a nota da questao 1: ");
        q1 = sc.nextInt();
        System.out.println("coloque a nota da questao 2: ");
        q2 = sc.nextInt();
        System.out.println("coloque a nota da questao 3: ");
        q3 = sc.nextInt();

        int notaFinal = q1 + q2 + q3;
        if (q1 < 0 || q1 > 25 || q2 < 0 || q2 > 25 || q3 < 0 || q3 > 25) {
            System.out.println("Invalida");
        }else if(notaFinal < 50){
            System.out.println("Reprovado");
        } 
        else if (notaFinal >= 50 && notaFinal <= 74&& q1!=0 && q2!=0 && q3!=0) {
            System.out.println("Regular");
        } else if (notaFinal >= 75 && notaFinal <= 89 && q1 == 25 || q2 == 25 || q3 == 25) {
            System.out.println("Bom");
        }else if(notaFinal>=90 && q1 >20 && q2 >20 && q3 >20  ){
            System.out.println("Exelente");
        } else {
            System.out.println("Desempenho indefinido");
        }
        
    }
}
