import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scan.nextLine());
        double priceRakia = priceWhiskey / 2;
        double priceWine = priceRakia  - (priceRakia * 0.4);
        double priceBeer = priceRakia - (priceRakia * 0.8);

        double litersOfBeer = Double.parseDouble(scan.nextLine());
        double litersOfWine = Double.parseDouble(scan.nextLine());
        double litersOfRakia = Double.parseDouble(scan.nextLine());
        double litersOfWhiskey = Double.parseDouble(scan.nextLine());

        double totalWhiskey = priceWhiskey * litersOfWhiskey;
        double totalRakia = priceRakia * litersOfRakia;
        double totalWine = priceWine * litersOfWine;
        double totalBeer = priceBeer * litersOfBeer;

        double total = totalWhiskey + totalRakia + totalWine + totalBeer;

        System.out.printf("%.2f", total);
    }
}
