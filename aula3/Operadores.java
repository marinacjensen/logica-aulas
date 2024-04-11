public class Operadores {
    
    public static void main (String[] args) {

        int v1, v2, res;
        float f1, f2, fres;

        v1 = 5;
        v2 = 3;

        f1 = 1.5f;
        f2 = 2.5f;

        fres = f1 + f2;
        
        //float = int + float
        fres = v1 + f2;

        res = v1 + v2;
        System.out.println("v1 + v2 = " + res);

        
    }

}
