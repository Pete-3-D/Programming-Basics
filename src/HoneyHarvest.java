import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flower = scan.nextLine();
        int nFlowers = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();

        double honey = 0;

        if ("Spring".equals(season)) {
            if ("Sunflower".equals(flower) || "Mint".equals(flower)) {
                honey = 10;
                if ("Mint".equals(flower)) {
                    honey = honey + (honey * 0.1);
                }
            } else if ("Daisy".equals(flower) || "Lavender".equals(flower)) {
                honey = 12;
                if ("Daisy".equals(flower)) {
                    honey = honey + (honey * 0.1);
                }
            }
        } else if ("Summer".equals(season)) {
            if ("Sunflower".equals(flower) || "Lavender".equals(flower) || ("Daisy".equals(flower))) {
                honey = 8;
            } else if ("Mint".equals(flower)) {
                honey = 12;
            }
            honey = honey + (honey * 0.1);
        } else if ("Autumn".equals(season)) {
            if ("Mint".equals(flower) || "Lavender".equals(flower) || ("Daisy".equals(flower))) {
                honey = 6;
            } else if ("Sunflower".equals(flower)) {
                honey = 12;
            }
            honey = honey - (honey * 0.05);
        }

        System.out.printf("Total honey harvested: %.2f\n", honey * nFlowers);

    }
}
