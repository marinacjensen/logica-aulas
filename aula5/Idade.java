import java.util.Scanner;

public class Idade {
    
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("digite sua idade");
        idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
            if (idade >= 65) {
                System.out.println("Você é idoso.");
            }
        } else {
            System.out.println("Você é menor de idade.");
        }

    }

}
