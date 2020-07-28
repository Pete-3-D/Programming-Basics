import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yearType = scan.nextLine();
        double p = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double weekends = 48 - h;
        weekends = weekends * 3 / 4;

        double totalDays = p * 2 / 3;

        totalDays = totalDays + weekends + h;

        if (yearType.equals("leap"))
            totalDays = totalDays + (totalDays * 0.15);

        totalDays = Math.floor(totalDays);

        System.out.printf("%.0f", totalDays);
    }
}
