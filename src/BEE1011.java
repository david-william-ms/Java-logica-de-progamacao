import javax.print.DocFlavor;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r;
        double pi = 3.14159;
        double volume;

        r = input.nextDouble();

        volume = 4.0/3.0 * pi * (r*r*r);

        System.out.println("VOLUME = "+ String.format("%.3f",volume));
        input.close();
    }
}
