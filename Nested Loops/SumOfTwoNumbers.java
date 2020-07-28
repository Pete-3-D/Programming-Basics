import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int combinations = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, magicNumber);
                    return;
                }
            }
            if (i == end)
                System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }
    }
}
