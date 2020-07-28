import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double grade = 0;
        double average = 0;
        int i = 1;
        int expelled = 0;

        while (i <= 12) {
            grade = Double.parseDouble(scan.nextLine());

            if (grade >= 4) {
                average += grade;
                if (i == 12)
                    break;
                else
                    i++;
            } else {
                expelled++;
                if (expelled == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, i);
                    return;
                }
            }
        }

        average = average / i;

        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
