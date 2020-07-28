import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int i = 0;
        double payment = 0;
        double total = 0;

        while (i < n) {
            payment = Double.parseDouble(scan.nextLine());

            if (payment <= 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f\n", payment);
                total += payment;
            }

            i++;
        }

        System.out.printf("Total: %.2f", total);
    }
}
