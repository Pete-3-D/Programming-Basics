import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startEggs = Integer.parseInt(scan.nextLine());
        String input = "";
        int nEggs = 0;
        int eggsSold = 0;

        while (true) {
            input = scan.nextLine();

            if ("Close".equals(input)) {
                System.out.println("Store is closed!");
                System.out.printf("%d eggs sold.\n", eggsSold);
                break;
            } else if ("Buy".equals(input)) {
                input = scan.nextLine();
                nEggs = Integer.parseInt(input);

                if (startEggs - nEggs < 0) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.\n", startEggs);
                    break;
                } else {
                    startEggs -= nEggs;
                    eggsSold += nEggs;
                }
            } else if ("Fill".equals(input)) {
                input = scan.nextLine();
                nEggs = Integer.parseInt(input);
                startEggs += nEggs;
            }
        }
    }
}
