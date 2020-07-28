import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantity = Integer.parseInt(scan.nextLine());

        int currentNumber = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < quantity; i++) {
            currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber > max)
                max = currentNumber;
            if (currentNumber < min)
                min = currentNumber;
        }

        System.out.printf("Max number: %d\n", max);
        System.out.printf("Min number: %d\n", min);
    }
}
