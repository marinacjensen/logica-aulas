import java.util.Scanner;

public class AlcoolGasol {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        float precoAlcool, precoGasolina, gasolina30;

        System.out.println("Informe o valor do alcool e da gasolina");
        precoAlcool = in.nextFloat();
        precoGasolina = in.nextFloat();

        gasolina30 = precoGasolina * 0.7f;

        if (precoAlcool >= gasolina30) {
            System.out.println("GASOLINA");
        } else {
            System.out.println("ALCOOL");
        }
    }
}
