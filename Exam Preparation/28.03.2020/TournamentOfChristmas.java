import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());

        double totalRaised = 0;
        double dayRaised = 0;
        int wins = 0;
        int losses = 0;
        int tournamentsWon = 0;

        for (int i = 0; i < days; i++) {
            while (true) {
                String input = scan.nextLine();

                if (input.equals("Finish"))
                    break;

                String result = scan.nextLine();

                if (result.equals("win")) {
                    dayRaised += 20;
                    wins++;
                } else
                    losses++;
            }

            if (wins > losses) {
                dayRaised += dayRaised * 0.1;
                tournamentsWon++;
            }

            totalRaised += dayRaised;
            dayRaised = 0;
            wins = 0;
            losses = 0;
        }

        if (tournamentsWon > (days - tournamentsWon)) {
            totalRaised += totalRaised * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalRaised);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalRaised);
        }
    }
}
