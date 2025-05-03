import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeber = sc.nextInt();
        if( numeber%3 == 0){
            System.out.println("È multiplo de 3"); 
        }
        if( numeber%5 == 0){
            System.out.println("È multiplo de 5"); 
        }else{
            System.out.println("Não é multilo por nehum outro numero");
        }
    }
}
