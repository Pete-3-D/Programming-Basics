import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oneLvCoins = Integer.parseInt(scan.nextLine());
        int twoLvCoins = Integer.parseInt(scan.nextLine());
        int fiveLvBills = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= oneLvCoins; i++) {
            for (int j = 0; j <= twoLvCoins; j++) {
                for (int k = 0; k <= fiveLvBills; k++) {
                    if ((i * 1 + j * 2 + k * 5) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
