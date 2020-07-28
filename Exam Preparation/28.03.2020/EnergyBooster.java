import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String setsSize = scan.nextLine();
        double setsOrdered = Double.parseDouble(scan.nextLine());

        double price = 0;
        double setSizeNumeric = 0;

        if (setsSize.equals("small")) {
            setSizeNumeric = 2;
            switch (fruit) {
                case "Watermelon":
                    price = 56;
                    break;
                case "Mango":
                    price = 36.66;
                    break;
                case "Pineapple":
                    price = 42.10;
                    break;
                case "Raspberry":
                    price = 20;
                    break;
            }
        } else {
            setSizeNumeric = 5;
            switch (fruit) {
                case "Watermelon":
                    price = 28.7;
                    break;
                case "Mango":
                    price = 19.6;
                    break;
                case "Pineapple":
                    price = 24.8;
                    break;
                case "Raspberry":
                    price = 15.2;
                    break;
            }
        }

        double total = setsOrdered * setSizeNumeric * price;

        if (total >= 400 && total <= 1000) {
            total = total - (total * 0.15);
        } else if (total > 1000) {
            total = total - (total * 0.5);
        }

        System.out.printf("%.2f lv.", total);

    }
}
