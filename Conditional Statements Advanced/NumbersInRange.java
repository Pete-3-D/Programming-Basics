import java.util.Scanner;

public class NumbersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());

        if (number >= -100 && number <= 100) {
            if (number != 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else {
            System.out.println("No");
        }
    }
}
