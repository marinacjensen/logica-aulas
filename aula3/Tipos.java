import java.util.Scanner;

public class Tipos {

    public static void main(String[] args) {
        System.out.println("Funcionaaaaaaaaaaaaa");

        Scanner in = new Scanner(System.in);

        int numeroInteiro;
        float numeroDecimal;
        String texto;

        Integer numInteiroTbm;

        System.out.println("MAX INTEIRO " + Integer.MAX_VALUE);
        System.out.println("MIN INTEIRO " + Integer.MIN_VALUE);
        System.out.println("TAMANHO INTEIRO " + Integer.SIZE);

        long numIntGigante = Long.MAX_VALUE;
        System.out.println("NUMERO DESSE |                   | TAMANHO " + numIntGigante);

        float valorDecimal = 1.25f;

        int parteInteira = (int) valorDecimal;

        System.out.println("DECIMAL: " + valorDecimal);
        System.out.println("INTEIRO: " + parteInteira);

        int valorComParse = Integer.parseInt("12345");
    }

}