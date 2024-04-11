import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("digite 4 valores: ");
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        boolean resultado = (a > b) && (c > d);
        System.out.println("a > b && c > d" + resultado);

        resultado = (a > b) || (c > d);
        System.out.println("a > b || c > d" + resultado);
    }

}