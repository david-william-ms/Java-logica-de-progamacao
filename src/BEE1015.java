import java.util.Scanner;

public class BEE1015 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double x1;
        double x2;
        double y1;
        double y2;

        double distance;

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();


        distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        System.out.printf("%.4f",distance);

        scanner.close();
    }
}
