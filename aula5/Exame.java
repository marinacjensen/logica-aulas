import java.util.Scanner;

public class Exame {
        public static void main (String[] args) {
        
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite suas tres notas:");
        float nota1 = in.nextFloat();
        float nota2 = in.nextFloat();
        float nota3 = in.nextFloat();
        final float nota_aprovacao = 7.0f;
        
        float media = (nota1+nota2+nota3)/3;

        if (media > nota_aprovacao) {
            System.out.println("Parabens! Voce foi aprovado");
        } else {
            System.out.println("Voce está em exame.");
            float notaExame = (5 - media * 0.6f)/0.4f;
            System.out.printf("Voce precisa de %.2f para ser aprovado.", notaExame);
        }
        

        in.close();
    }
}
