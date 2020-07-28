import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double priceClothes = Double.parseDouble(scan.nextLine());

        double priceTotal = 0;
        double decor = budget * 0.1;

        if (extras > 150) {
            priceClothes = priceClothes - (priceClothes * 0.1);
        }
        priceTotal = (priceClothes * extras) + decor;

        if (budget - priceTotal < 0) {
            priceTotal = Math.abs(budget - priceTotal);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", priceTotal);
        } else {
            priceTotal = budget - priceTotal;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", priceTotal);

        }
    }
}
