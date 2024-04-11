import java.util.Scanner;

public class Intervalo {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o início do intervalo: ");
        int inicio = in.nextInt();

        System.out.println("Digite o fim do intervalo: ");
        int fim = in.nextInt();
        
        int x = inicio;
        while (x <= fim) {

            if ((x % 3) == 0) {
                System.out.println(x);
            }

            x++;
        }
        in.close();
    }
}