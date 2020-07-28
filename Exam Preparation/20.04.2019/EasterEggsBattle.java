import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstEggs = Integer.parseInt(scan.nextLine());
        int secondEggs = Integer.parseInt(scan.nextLine());
        String input = "";

        while (true) {
            input = scan.nextLine();

            if ("End of battle".equals((input))) {
                System.out.printf("Player one has %d eggs left.\n", firstEggs);
                System.out.printf("Player two has %d eggs left.\n", secondEggs);
                break;
            }

            if ("one".equals(input)) {
                secondEggs--;
            } else if ("two".equals(input)) {
                firstEggs--;
            }

            if (firstEggs == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.\n", secondEggs);
                break;
            }

            if (secondEggs == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.\n", firstEggs);
                break;
            }
        }
    }
}
