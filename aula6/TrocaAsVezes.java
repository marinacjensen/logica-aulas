import java.util.Scanner;

public class TrocaAsVezes {
    
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor para A e outro para B");

        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) {
            int aAntigo = a;
            a = b;
            b = aAntigo;
        }

        System.out.println("Valores: A = " + a + " B: = " + b);
    }

}
