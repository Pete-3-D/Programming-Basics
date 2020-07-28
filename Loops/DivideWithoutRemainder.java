import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double noRemainder2 = 0;
        double noRemainder3 = 0;
        double noRemainder4 = 0;

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            double currentNum = Double.parseDouble(scan.nextLine());

            if (currentNum % 2 == 0)
                noRemainder2++;
            if (currentNum % 3 == 0)
                noRemainder3++;
            if (currentNum % 4 == 0)
                noRemainder4++;
        }

        p1 = noRemainder2 / n * 100;
        p2 = noRemainder3 / n * 100;
        p3 = noRemainder4 / n * 100;

        System.out.printf("%.2f", p1);
        System.out.println("%");
        System.out.printf("%.2f", p2);
        System.out.println("%");
        System.out.printf("%.2f", p3);
        System.out.println("%");

    }
}
