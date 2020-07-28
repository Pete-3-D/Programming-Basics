import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double speed = Double.parseDouble(scan.nextLine());

        double extraTime = Math.floor(distance / 50) * 30;
        double total = (distance * speed) + extraTime;

        if (total < record) {
            System.out.printf("Yes! The new record is %.2f seconds.\n", total);
        } else
            System.out.printf("No! He was %.2f seconds slower.\n", total - record);
    }
}
