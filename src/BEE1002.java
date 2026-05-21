import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double r;
        double a;

        r = sc.nextDouble();
        a = pi * Math.pow(r,2);

        System.out.println("A="+ String.format("%.4f",a));
        sc.close();
    }
}
