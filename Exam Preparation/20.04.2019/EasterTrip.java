import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        String dates = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double price = 0;

        if ("France".equals(destination)) {
            if ("21-23".equals(dates)) {
                price = 30;
            } else if ("24-27".equals(dates)) {
                price = 35;
            } else if ("28-31".equals(dates)) {
                price = 40;
            }
        } else if ("Italy".equals(destination)) {
            if ("21-23".equals(dates)) {
                price = 28;
            } else if ("24-27".equals(dates)) {
                price = 32;
            } else if ("28-31".equals(dates)) {
                price = 39;
            }
        } else if ("Germany".equals(destination)) {
            if ("21-23".equals(dates)) {
                price = 32;
            } else if ("24-27".equals(dates)) {
                price = 37;
            } else if ("28-31".equals(dates)) {
                price = 43;
            }
        }

        System.out.printf("Eater trip to %s : %.2f leva.\n", destination, price * nights);
    }
}
