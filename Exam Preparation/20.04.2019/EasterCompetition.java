import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nEasterBreads = Integer.parseInt(scan.nextLine());

        String chef = "";
        String input = "";

        int points = 0;
        int totalPoints = 0;

        String bestChef = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 1; i <= nEasterBreads ; i++) {
            chef = scan.nextLine();

            while (true) {
                input = scan.nextLine();

                if ("Stop".equals(input)) {
                    break;
                }

                points = Integer.parseInt(input);
                totalPoints += points;
            }

            System.out.printf("%s has %d points.\n", chef, totalPoints);

            if (totalPoints > maxPoints) {
                bestChef = chef;
                maxPoints = totalPoints;
                System.out.printf("%s is the new number 1!\n", chef);
            }

            totalPoints = 0;
        }

        System.out.printf("%s won competition with %d points!\n", bestChef, maxPoints);
    }
}
