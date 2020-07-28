import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int currentNumber;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n*2; i++) {
            currentNumber = Integer.parseInt(scan.nextLine());
            if (i <= n)
                sum1 += currentNumber;
            else if (i >= n)
                sum2 += currentNumber;
        }

        if (sum1 == sum2)
            System.out.printf("Yes, sum = %d", sum1);
        else
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));

    }
}
