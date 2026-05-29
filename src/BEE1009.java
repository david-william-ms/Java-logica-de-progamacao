import java.io.IOException;
import java.util.Scanner;

public class BEE1009 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name;
        double salary;
        double sales;
        double receives = 0.15;


        name = sc.nextLine();
        salary = sc.nextDouble();
        sales = sc.nextDouble();

        double payment = salary + (sales * receives);


        System.out.println("TOTAL = R$ "+String.format("%.2f",payment));

        sc.close();

    }

}