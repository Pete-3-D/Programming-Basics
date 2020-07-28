import java.util.Scanner;

public class SumPrimeNotPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        int primeSum = 0;
        int nonprimeSum = 0;

        while (true) {
            input = scan.nextLine();

            if (input.equals("stop"))
                break;

            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                continue;
            } else {
                int dividers = 0;
                for (int i = currentNum; i > 0; i--) {
                    if (currentNum % i == 0)
                        dividers++;
                }
                if (dividers > 2)
                    nonprimeSum += currentNum;
                else
                    primeSum += currentNum;
            }
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonprimeSum);
    }
}
