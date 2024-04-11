import java.util.Scanner;

public class MediaAritmetica {
        public static void main (String[] args) {
        
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite suas duas notas:");
        float nota1 = in.nextFloat();
        float nota2 = in.nextFloat();
        float nota3 = in.nextFloat();
        final float nota_aprovacao = 7.0f;
        
        float media = (nota1+nota2+nota3)/3;

        if (media > nota_aprovacao) {
            System.out.println("Parabens! Voce foi aprovado");
        } else{
            System.out.println("voce eh incompetente");
        }
        

        in.close();
    }
}
