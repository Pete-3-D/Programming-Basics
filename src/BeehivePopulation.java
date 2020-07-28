import java.util.Scanner;

public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingPopulation = Integer.parseInt(scan.nextLine());
        int years = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= years ; i++) {
            startingPopulation += (startingPopulation / 10) * 2;

            if (i % 5 == 0) {
                startingPopulation -= (startingPopulation / 50) * 5;
            }

            startingPopulation -= (startingPopulation / 20) * 2;
        }

        System.out.printf("Beehive population: %d\n", startingPopulation);
    }
}
