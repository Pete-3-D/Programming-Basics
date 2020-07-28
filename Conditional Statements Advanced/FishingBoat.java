import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishers = Integer.parseInt(scan.nextLine());

        double price = 0;
        double total;

        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }

        if (fishers <= 6)
            total = price - (price * 0.1);
        else if (fishers <= 11)
            total = price - (price * 0.15);
        else
            total = price - (price * 0.25);

        if (fishers % 2 == 0 && !season.equals("Autumn"))
            total = total - (total * 0.05);

        if (budget >= total)
            System.out.printf("Yes! You have %.2f leva left.", budget - total);
        else if (budget < total)
            System.out.printf("Not enough money! You need %.2f leva.", total - budget);
    }
}
