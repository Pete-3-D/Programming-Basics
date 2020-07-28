import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int cooks = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double price_cakes = cakes * 45;
        double price_waffles = waffles * 5.80;
        double price_pancakes = pancakes * 3.20;

        double total_price = days * cooks * (price_cakes + price_waffles + price_pancakes);
        double charity = total_price - (total_price / 8);

        System.out.printf("%.2f", charity);
    }
}
