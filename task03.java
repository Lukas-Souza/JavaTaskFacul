import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 17;
        double salario_mensal = 2.0;
        int tempo_emprego = 6;
        boolean possui_dividas = false;
        String risco;
        if ((idade < 18 || idade > 100) || salario_mensal < 0 || tempo_emprego < 0) {
            System.out.println("Dados invalidos");
        }else if(possui_dividas == true && tempo_emprego < 12){
            System.out.println("Risco alto");
            risco = "Alto";
        } else if ((idade >= 18 && idade <= 25) && salario_mensal < 3) {
            risco = "Moderado";
            System.out.println("Risco moderado");
        } else if (idade > 60 && tempo_emprego < 24) {
            System.out.println("Risco moderado");
            risco = "moderado";
        } else if (possui_dividas == true && tempo_emprego > 36) {
            System.out.println("Moderado");
            risco = "moderado";   
        }else if(salario_mensal >=5 && tempo_emprego>=36 && possui_dividas==false){
            risco = "baixo";
            System.out.println("Risco baixo");
        } else {
            System.out.println("Risco indefinido");
        }
    }
}
