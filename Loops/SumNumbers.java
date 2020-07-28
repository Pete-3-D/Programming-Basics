import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantity = Integer.parseInt(scan.nextLine());

        int currentNumber = 0;
        int value = 0;

        for (int i = 0; i < quantity; i++) {
            currentNumber = Integer.parseInt(scan.nextLine());
            value += currentNumber;
        }

        System.out.println(value);
    }
}
