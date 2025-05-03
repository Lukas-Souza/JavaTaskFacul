import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, hour, minutes, secund;
        System.out.println("Coloque uma certa quantidade de dias: ");
        day = sc.nextInt();
        System.out.println("Coloque uma certa quantidade de horas: ");
        hour = sc.nextInt();
        System.out.println("Coloque uma certa quantidade de minutos: ");
        minutes = sc.nextInt();
        System.out.println("Coloque uma certa quantidade de segundos: ");
        secund = sc.nextInt();
        int cal = (day * 86400) + (hour * 3600) + (minutes * 60) + secund;
        System.out.println("O total do numero em segundos e: "+ cal);
        

    }
}
