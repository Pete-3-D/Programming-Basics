import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());


        for (int i = first; i <= second; i++) {
            String current = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < current.length(); j++) {
                int temp = Integer.parseInt("" + current.charAt(j));

                if (j % 2 == 0) {
                    evenSum += temp;
                } else {
                    oddSum += temp;
                }

            }

            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
