import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double priceWashingMachine = Double.parseDouble(scan.nextLine());
        double priceToy = Double.parseDouble(scan.nextLine());

        double money = 0;
        double moneyGift = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyGift += 10;
                money += moneyGift - 1;
        }
            else
                money += priceToy;
        }

        if (money >= priceWashingMachine)
            System.out.printf("Yes! %.2f", money - priceWashingMachine);
        else
            System.out.printf("No! %.2f", Math.abs(money - priceWashingMachine));


    }
}
