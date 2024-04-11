import java.util.Scanner;

public class Repete {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        while (x < 5) {
            System.out.println("opa, bao?" + x);
            x++;
        }
    }
}