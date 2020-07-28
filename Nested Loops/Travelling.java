import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = "";
        double totalSaved = 0;

        while (!destination.equals("End")) {
            destination = scan.nextLine();

            if (destination.equals("End"))
                return;

            double minBudget = Double.parseDouble(scan.nextLine());

            while (totalSaved < minBudget) {
                double salary = Double.parseDouble(scan.nextLine());
                totalSaved += salary;
                if (totalSaved >= minBudget) {
                    System.out.printf("Going to %s!\n", destination);
                    totalSaved = 0;
                    break;
                }
            }
        }
    }
}
