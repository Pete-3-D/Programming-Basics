import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeFlower = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double price = 0;
        double discount = 0;

        if (typeFlower.equals("Roses")) {
            price = 5;
            if (quantity > 80)
                discount = 0.10;
        } else if (typeFlower.equals("Dahlias")) {
            price = 3.8;
            if (quantity > 90)
                discount = 0.15;
        } else if (typeFlower.equals("Tulips")) {
            price = 2.8;
            if (quantity > 80)
                discount = 0.15;
        } else if (typeFlower.equals("Narcissus")) {
            price = 3;
            if (quantity < 120)
                discount = 1.15;
        } else if (typeFlower.equals("Gladiolus")) {
            price = 2.5;
            if (quantity < 80)
                discount = 1.20;
        }

        double total = price * quantity;

        if (discount == 1.15 || discount == 1.20) {
            total = total * discount;
        } else {
            total = total - (total * discount);
        }

        if (total <= budget)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                                    quantity, typeFlower, budget - total);
        else
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
    }
}
