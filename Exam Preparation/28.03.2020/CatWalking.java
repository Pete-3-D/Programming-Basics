import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesWalked = Integer.parseInt(scan.nextLine());
        int dailyWalks = Integer.parseInt(scan.nextLine());
        int calorieIntake = Integer.parseInt(scan.nextLine());

        int caloriesBurned = minutesWalked * 5 * dailyWalks;

        if (caloriesBurned >= calorieIntake / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.\n", caloriesBurned);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.\n", caloriesBurned);
        }
    }
}
