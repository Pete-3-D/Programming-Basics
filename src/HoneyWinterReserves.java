import java.util.Scanner;

public class HoneyWinterReserves {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float honeyNeeded = Float.parseFloat(scan.nextLine());
        String input = "";

        float totalYield = 0;

        while (true) {
            float beeYield = 0;
            input = scan.nextLine();

            if ("Winter has come".equals(input)) {
                break;
            }

            String beeName = input;

            for (int i = 1; i <= 6; i++) {
                float honeyYield = Float.parseFloat(scan.nextLine());
                beeYield += honeyYield;
            }

            if (beeYield < 0) {
                System.out.printf("%s was banished for gluttony\n", beeName);
            }

            totalYield += beeYield;

            if (totalYield >= honeyNeeded) {
                break;
            }
        }

        if (honeyNeeded - totalYield <= 0) {
            System.out.printf("Well done! Honey surplus %.2f.\n", totalYield - honeyNeeded);
        } else {
            System.out.printf("Hard Winter! Honey needed %.2f.\n", honeyNeeded - totalYield);
        }
    }
}
