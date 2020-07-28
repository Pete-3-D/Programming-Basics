import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eggSize = scan.nextLine();
        String eggColor = scan.nextLine();
        int batches = Integer.parseInt(scan.nextLine());
        double price = 0;

        if ("Large".equals(eggSize)) {
            if ("Red".equals(eggColor)) {
                price = 16;
            } else if ("Green".equals(eggColor)) {
                price = 12;
            } else if ("Yellow".equals(eggColor)) {
                price = 9;
            }
        } else if ("Medium".equals(eggSize)) {
            if ("Red".equals(eggColor)) {
                price = 13;
            } else if ("Green".equals(eggColor)) {
                price = 9;
            } else if ("Yellow".equals(eggColor)) {
                price = 7;
            }
        } else if ("Small".equals(eggSize)) {
            if ("Red".equals(eggColor)) {
                price = 9;
            } else if ("Green".equals(eggColor)) {
                price = 8;
            } else if ("Yellow".equals(eggColor)) {
                price = 5;
            }
        }

        price = price * batches;
        price = price - (price * 0.35);

        System.out.printf("%.2f leva.\n", price);

    }
}
