import java.io.IOException;
import java.util.Scanner;


public class BEE1010 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int p1;
        int unitsP1;
        double priceP1;

        int p2;
        int unitsP2;
        double priceP2;

        double totalValue;

        p1 = sc.nextInt();
        unitsP1 = sc.nextInt();
        priceP1 = sc.nextDouble();

        p2 = sc.nextInt();
        unitsP2 = sc.nextInt();
        priceP2 = sc.nextDouble();

        totalValue = (unitsP1 * priceP1) + (unitsP2 * priceP2);

        System.out.println("VALOR A PAGAR: R$ "+String.format("%.2f",totalValue));

        sc.close();

    }

}