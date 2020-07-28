import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nEasterBreads = Integer.parseInt(scan.nextLine());

        int sugar = 0;
        int flour = 0;

        double totalSugar = 0;
        double totalFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= nEasterBreads; i++) {
            sugar = Integer.parseInt(scan.nextLine());
            totalSugar += sugar;

            if (maxSugar < sugar)
                maxSugar = sugar;

            flour = Integer.parseInt(scan.nextLine());
            totalFlour += flour;

            if (maxFlour < flour)
                maxFlour = flour;
        }

        totalSugar = totalSugar / 950.0;
        totalSugar = Math.ceil(totalSugar);

        totalFlour = totalFlour / 750.0;
        totalFlour = Math.ceil(totalFlour);

        System.out.printf("Sugar: %.0f\n", totalSugar);
        System.out.printf("Flour: %.0f\n", totalFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.\n", maxFlour, maxSugar);
    }
}
