import java.util.Scanner;

public class Ordenacao {
    
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe os 3 valores");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maior, meio, menor;

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        }
        else if (b > a && b > c) {
            maior = b;
            if (a > c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        }
        else {
            maior = c;
            if (a > b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }
        System.out.println("Ordenados: " + maior + ' ' + meio + ' ' + menor);
    }
}
