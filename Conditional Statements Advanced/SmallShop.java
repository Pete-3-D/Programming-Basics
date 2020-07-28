import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;

        switch (city) {
            case "Sofia":
                if (product.toLowerCase().equals("coffee"))
                    price = 0.50;
                else if (product.toLowerCase().equals("water"))
                    price = 0.80;
                else if (product.toLowerCase().equals("beer"))
                    price = 1.20;
                else if (product.toLowerCase().equals("sweets"))
                    price = 1.45;
                else if (product.toLowerCase().equals("peanuts"))
                    price = 1.60;
                break;
            case "Varna":
                if (product.toLowerCase().equals("coffee"))
                    price = 0.45;
                else if (product.toLowerCase().equals("water"))
                    price = 0.70;
                else if (product.toLowerCase().equals("beer"))
                    price = 1.10;
                else if (product.toLowerCase().equals("sweets"))
                    price = 1.35;
                else if (product.toLowerCase().equals("peanuts"))
                    price = 1.55;
                break;
            case "Plovdiv":
                if (product.toLowerCase().equals("coffee"))
                    price = 0.40;
                else if (product.toLowerCase().equals("water"))
                    price = 0.70;
                else if (product.toLowerCase().equals("beer"))
                    price = 1.15;
                else if (product.toLowerCase().equals("sweets"))
                    price = 1.30;
                else if (product.toLowerCase().equals("peanuts"))
                    price = 1.50;
                break;
            default:
                break;
        }

        System.out.println(price * quantity);
    }
}
