import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        double delta;
        double r1;
        double r2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = (b*b) - (4 * a * c);
        if(a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else{
            double sqrt = Math.sqrt(delta);
            r2 = (-b - sqrt)/(2*a);
            r1 = (-b + sqrt)/(2*a);
            System.out.printf("R1 = %.5f%n",r1);
            System.out.printf("R2 = %.5f%n",r2);
        }

        sc.close();
    }
}
