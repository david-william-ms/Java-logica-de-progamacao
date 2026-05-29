import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        double payment;

        x = sc.nextInt();
        y = sc.nextInt();

        switch (x){
            case 1:
                payment = y * 4.00;
                System.out.println("Total: R$ "+String.format("%.2f",payment));
                break;
            case 2:
                payment = y * 4.50;
                System.out.println("Total: R$ "+String.format("%.2f",payment));
                break;
            case 3:
                payment = y * 5.00;
                System.out.println("Total: R$ "+String.format("%.2f",payment));
                break;
            case 4:
                payment = y * 2.00;
                System.out.println("Total: R$ "+String.format("%.2f",payment));
                break;
            case 5:
                payment = y * 1.5;
                System.out.println("Total: R$ "+String.format("%.2f",payment));
                break;
            default:
                break;
        }


        sc.close();
    }
}
