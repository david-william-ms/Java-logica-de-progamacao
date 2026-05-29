import java.io.IOException;
import java.util.Scanner;

public class BEE1007 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("DIFERENCA = "+ String.format("%.4s",diferenca));

        sc.close();


    }

}