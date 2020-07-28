import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nGroups = Integer.parseInt(scan.nextLine());
        int participants = 0;

        double totalClimbers = 0;
        double musalaClimbers = 0;
        double montblancClimbers = 0;
        double kilimanjaroClimbers = 0;
        double k2Climbers = 0;
        double everestClimbers = 0;

        for (int i = 1; i <= nGroups; i++) {
            participants = Integer.parseInt(scan.nextLine());
            totalClimbers += participants;

            if (participants <= 5) {
                musalaClimbers += participants;
            } else if (participants <= 12) {
                montblancClimbers += participants;
            } else if (participants <= 25) {
                kilimanjaroClimbers += participants;
            } else if (participants <= 40) {
                k2Climbers += participants;
            } else {
                everestClimbers += participants;
            }
        }

        System.out.printf("%.2f", musalaClimbers / totalClimbers * 100);
        System.out.println("%");
        System.out.printf("%.2f", montblancClimbers / totalClimbers * 100);
        System.out.println("%");
        System.out.printf("%.2f", kilimanjaroClimbers / totalClimbers * 100);
        System.out.println("%");
        System.out.printf("%.2f", k2Climbers / totalClimbers * 100);
        System.out.println("%");
        System.out.printf("%.2f", everestClimbers / totalClimbers * 100);
        System.out.println("%");

    }
}
