import java.io.IOException;
import java.util.Scanner;

public class BEE1006 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double wheightA = 2;
        double wheightB = 3;
        double wheightC = 5;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double media = (a * wheightA + b * wheightB + c*wheightC)/(wheightA + wheightB + wheightC);
        System.out.println("MEDIA = "+ String.format("%.1f",media));
        sc.close();

    }

}