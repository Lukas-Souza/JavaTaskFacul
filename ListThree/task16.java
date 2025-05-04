package ListThree;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String input = sc.next();
        String[] consoantes = {  "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z" };
        String[] vogais = { "a", "e", "i", "o", "u" };
        for( int i =0; i<consoantes.length; i++){
            if(input.equals(consoantes[i])){
                System.out.println("A letra digitada é uma consoante ");
                return;
            }
        }
        for( int a =0; a<vogais.length; a++){
            if( input.equals(vogais[a])){
                System.out.println("A letra digitada é uma vogal ");
                return;
            }
        }
    }
}
