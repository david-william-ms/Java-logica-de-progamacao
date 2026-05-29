import java.io.IOException;
import java.util.Scanner;


public class BEE1008 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number;
        int workedHours;
        double amountPerHour;

        number = sc.nextInt();
        workedHours = sc.nextInt();
        amountPerHour = sc.nextDouble();

        double salary = workedHours * amountPerHour;

        System.out.printf("NUMBER = %d%n",number);
        System.out.printf("SALARY = U$ %.2f%n",salary);

        sc.close();


    }

}