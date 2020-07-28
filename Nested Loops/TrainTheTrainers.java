import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double sum = 0;
        double totalSum = 0;
        int count = 0;

        while (true) {
            String input = scan.nextLine();

            if (input.equals("Finish")) {
                break;
            }

            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                sum += grade;
                count++;
            }

            totalSum += sum;

            System.out.printf("%s - %.2f.\n", input, sum / n);
            sum = 0;
        }
        System.out.printf("Student's final assessment is %.2f.", totalSum / count);

    }
}
