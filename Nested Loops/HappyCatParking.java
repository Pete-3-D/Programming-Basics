import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double price = 0;
        double total = 0;
        double totalDay = 0;

        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    price = 2.5;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    price = 1.25;
                } else
                    price = 1;

                totalDay += price;
            }
            System.out.printf("Day: %d - %.2f leva\n", i, totalDay);
            total += totalDay;
            totalDay = 0;
        }

        System.out.printf("Total: %.2f leva\n", total);
    }
}
