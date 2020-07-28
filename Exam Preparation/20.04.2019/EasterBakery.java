import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceFlour = Double.parseDouble(scan.nextLine());
        double kgFlour = Double.parseDouble(scan.nextLine());
        double kgSugar = Double.parseDouble(scan.nextLine());
        int eggs = Integer.parseInt(scan.nextLine());
        int yeast = Integer.parseInt(scan.nextLine());

        double priceSugar = priceFlour - (priceFlour * 0.25);
        double priceEggs = priceFlour + (priceFlour * 0.1);
        double priceYeast = priceSugar - (priceSugar * 0.8);

        double total = priceFlour * kgFlour + priceSugar * kgSugar + priceEggs * eggs + priceYeast * yeast;

        System.out.printf("%.2f\n", total);
    }
}
