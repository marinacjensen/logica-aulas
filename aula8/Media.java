/* FAÇA UM PROGRAMA QUE CALCULE A MEDIA ARITMETICA SIMPLES ENTRE 5 VALORES DIGITADOS PELO USUARIO, SEM USAR
CINCO VARIAVEIS DIFERENTES

PARTE 2: USUARIO DECLARA QNTS AVALIACOES SERAO FEITAS*/

import java.util.Scanner;

public class Media {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantas avaliações serão feitas:");
        int qtdAvaliacoes = in.nextInt();

        int cont = 0;
        double soma = 0, menorNota = 10;
        double nota = 0;

        while (cont < qtdAvaliacoes) {
            System.out.println("Digite sua nota:");
            nota = in.nextDouble();
            soma += nota;

            if (nota < menorNota) {
                menorNota = nota;
            }

            cont++;
        }

        double media = (soma - menorNota)/(qtdAvaliacoes - 1);

        System.out.printf("Sua média é: %.1f", media);
    }
}