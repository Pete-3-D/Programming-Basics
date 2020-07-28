import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceTrip = Double.parseDouble(scan.nextLine());
        int nPuzzles = Integer.parseInt(scan.nextLine());
        int nDolls = Integer.parseInt(scan.nextLine());
        int nBears = Integer.parseInt(scan.nextLine());
        int nMinions = Integer.parseInt(scan.nextLine());
        int nTrucks = Integer.parseInt(scan.nextLine());

        double pricePuzzle = 2.60;
        double priceDoll = 3;
        double priceBear = 4.10;
        double priceMinion = 8.20;
        double priceTruck = 2;

        double total = (nPuzzles * pricePuzzle)
                + (nDolls * priceDoll)
                + (nBears * priceBear)
                + (nMinions * priceMinion)
                + (nTrucks * priceTruck);

        if ( (nPuzzles + nDolls + nBears + nMinions + nTrucks) >= 50)
            total = total - (total * .25);

        total = total - (total * .10);

        if (total >= priceTrip)
            System.out.printf("Yes! %.2f lv left.", total - priceTrip);

        if (total < priceTrip)
            System.out.printf("Not enough money! %.2f lv needed.", priceTrip - total);
    }
}
