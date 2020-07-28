import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double grade = 0;
        double average = 0;
        int i = 0;

        while (i < 12) {
            grade = Double.parseDouble(scan.nextLine());

            if (grade >= 4) {
                average += grade;
                i++;
            }
        }

        average = average / i;

        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
