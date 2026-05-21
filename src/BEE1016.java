import java.util.Locale;
import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int carx = 60;
        int cary = 90;
        int minutes = 60;

        int distance;
        int time;

        distance = scanner.nextInt();

        time =  minutes * distance / (cary-carx);

        System.out.println(time + " minutos");



        scanner.close();


    }
}
