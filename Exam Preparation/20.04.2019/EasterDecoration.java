import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int clients = Integer.parseInt(scan.nextLine());
        String input = "";
        int items = 0;
        double total = 0;
        double totalAverage = 0;

        for (int i = 0; i < clients; i++) {
            while (true) {
                input = scan.nextLine();
                if ("Finish".equals(input)) {
                    break;
                }

                switch (input) {
                    case "basket":
                        total += 1.50;
                        break;
                    case "wreath":
                        total += 3.80;
                        break;
                    case "chocolate bunny":
                        total += 7.00;
                        break;
                }

                items++;
            }

            if (items % 2 == 0) {
                total = total - (total * 0.2);
            }

            System.out.printf("You purchased %d items for %.2f leva.\n", items, total);

            totalAverage += total;
            total = 0;
            items = 0;
        }

        totalAverage = totalAverage / clients;
        System.out.printf("Average bill per client is: %.2f leva.\n", totalAverage);
    }
}
