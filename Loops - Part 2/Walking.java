import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = 0;
        int totalSteps = 0;
        String input = "";

        while (true) {
            input = scan.nextLine();

            if (input.equals("Going home")) {
                steps = Integer.parseInt(scan.nextLine());
                totalSteps += steps;

                if (totalSteps >= 10000) {
                    System.out.println("Goal reached! Good job!");
                    return;
                }

                break;
            } else {
                steps = Integer.parseInt(input);
                totalSteps += steps;

                if (totalSteps >= 10000) {
                    System.out.println("Goal reached! Good job!");
                    return;
                }
            }
        }

        System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
    }
}
