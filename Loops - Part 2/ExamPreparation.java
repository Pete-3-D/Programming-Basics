import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int poor = 0;
        String problem = "";
        String lastProblem = "";
        double average = 0;
        int i = 0;

        while (true) {
            problem = scan.nextLine();

            if (problem.equals("Enough"))
                break;

            double grade = Double.parseDouble(scan.nextLine());

            if (grade <= 4) {
                poor++;
                if (poor == n) {
                    System.out.printf("You need a break, %d poor grades.", poor);
                    return;
                }
            }

            average += grade;
            lastProblem = problem;
            i++;
        }

        System.out.printf("Average score: %.2f\n", average / i);
        System.out.printf("Number of problems: %d\n", i);
        System.out.printf("Last problem: %s", lastProblem);

    }
}
