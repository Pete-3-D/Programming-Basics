import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double totalQuantity = Double.parseDouble(scan.nextLine());

        double biscuits = 0;
        double totalEaten = 0;
        double totalDog = 0;
        double totalCat = 0;

        for (int i = 1; i <= days ; i++) {
            int dailyDog = Integer.parseInt(scan.nextLine());
            int dailyCat = Integer.parseInt(scan.nextLine());

            if (i % 3 == 0) {
                biscuits += (dailyCat + dailyDog) * 0.1;
            }

            totalDog += dailyDog;
            totalCat += dailyCat;
            totalEaten += dailyDog + dailyCat;
        }

        biscuits = Math.round(biscuits);
        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);

        System.out.printf("%.2f", totalEaten / totalQuantity * 100);
        System.out.println("% of the food has been eaten.");

        System.out.printf("%.2f", totalDog / totalEaten * 100);
        System.out.println("% eaten from the dog.");

        System.out.printf("%.2f", totalCat / totalEaten * 100);
        System.out.println("% eaten from the cat.");
    }
}
