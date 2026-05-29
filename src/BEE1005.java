import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double gradeA;
        double weightA = 3.50;

        double b;
        double gradeB;
        double weightB = 7.50;

        double media;

        a = sc.nextDouble();
        b = sc.nextDouble();

        if(a >= 0 && a <= 10 && b >= 0 && b <= 10 ){
            gradeA = a*weightA;
            gradeB = b*weightB;

            media = (gradeA + gradeB) / (weightA+weightB);
            System.out.println("MEDIA = "+ String.format("%.5f",media));
        }
        sc.close();
    }
}
