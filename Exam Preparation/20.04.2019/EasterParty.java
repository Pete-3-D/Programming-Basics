import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        double priceGuest = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        double total = guests * priceGuest;

        if (guests >= 10 && guests <= 15) {
            total = total - (total * 0.15);
        } else if (guests >= 15 && guests <= 20) {
            total = total - (total * 0.20);
        } else if (guests > 20) {
            total = total - (total * 0.25);
        }

        double priceCake = budget * 0.10;
        total += priceCake;

        if (total <= budget) {
            System.out.printf("It is party time! %.2f leva left.\n", budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.\n", Math.abs(budget - total));
        }
    }
}
