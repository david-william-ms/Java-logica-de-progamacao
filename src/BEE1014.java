import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance;
        double fuel;
        double consumption;

        distance = input.nextInt();
        fuel = input.nextDouble();

        consumption = distance/fuel;

        System.out.println(String.format("%.3f",consumption)+" km/l");

        input.close();
    }
}
