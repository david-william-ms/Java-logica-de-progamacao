import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        int maior;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int maiorAb = (a+b + Math.abs(a-b))/ 2;
        maior = (maiorAb+c + Math.abs(maiorAb-c))/ 2;

        System.out.println(maior+" eh o maior");


        scanner.close();
    }
}
