import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String feedback = scan.nextLine();
        double price = 0;
        double discount = 0;

        days -= 1;

        switch (roomType.toLowerCase()) {
            case "room for one person":
                price = 18;
                if (days < 10)
                    discount = 0;
                else if (days >= 10 && days <= 15)
                    discount = 0;
                else if (days > 15)
                    discount = 0;
                break;
            case "apartment":
                price = 25;
                if (days < 10)
                    discount = 0.3;
                else if (days >= 10 && days <= 15)
                    discount = 0.35;
                else if (days > 15)
                    discount = 0.5;
                break;
            case "president apartment":
                price = 35;
                if (days < 10)
                    discount = 0.1;
                else if (days >= 10 && days <= 15)
                    discount = 0.15;
                else if (days > 15)
                    discount = 0.20;
                break;
            default:
                return;
        }

        double total = days * price;
        total = total - (total * discount);

        if (feedback.toLowerCase().equals("positive")) {
            total = total + (total * 0.25);
        } else if (feedback.toLowerCase().equals("negative")) {
            total = total - (total * 0.10);
        }

        System.out.printf("%.2f", total);
    }
}
