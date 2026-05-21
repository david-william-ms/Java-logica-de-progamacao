import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double pi = 3.14159;

        double triangle;
        double circle;
        double trapezium;
        double square;
        double rectangle;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        triangle = (a * c)/2;
        circle = pi * (c*c);
        trapezium = ((a+b)* c)/2;
        square = b*b;
        rectangle = a * b;

        System.out.println("TRIANGULO: "+String.format("%.3f",triangle));
        System.out.println("CIRCULO: "+String.format("%.3f",circle));
        System.out.println("TRAPEZIO: "+String.format("%.3f",trapezium));
        System.out.println("QUADRADO: "+String.format("%.3f",square));
        System.out.println("RETANGULO: "+String.format("%.3f",rectangle));

        input.close();
    }
}
