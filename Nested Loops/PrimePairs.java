import java.util.Scanner;

public class PrimePairs {
    public static boolean isPrime(int n) {
        int counter = 0;

        if (n <= 1) {
            return false;
        }

        for (int i = n; i > 1; i--) {
            if (n % i == 0) {
                counter++;
            }
            if (counter == 2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPair = Integer.parseInt(scan.nextLine());
        int secondPair = Integer.parseInt(scan.nextLine());
        int firstDifference = Integer.parseInt(scan.nextLine());
        int secondDifference = Integer.parseInt(scan.nextLine());

        for (int i = firstPair; i <= firstPair + firstDifference; i++) {
            for (int j = secondPair; j <= secondPair + secondDifference; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.println(i + "" + j);
                }
            }
        }
    }
}
