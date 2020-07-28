import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        String operator = scan.next();

        double result = 0;
        String evenOrOdd = "";

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            switch(operator) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                default:
                    return;
            }
            if (result % 2 == 0)
                evenOrOdd = "even";
            else
                evenOrOdd = "odd";
            System.out.printf("%.0f %s %.0f = %.0f - %s", n1, operator, n2, result, evenOrOdd);
        } else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", n1);
                return;
            }
            result = n1 / n2;
            System.out.printf("%.0f %s %.0f = %.2f", n1, operator, n2, result);
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", n1);
                return;
            }
            result = n1 % n2;
            System.out.printf("%.0f %s %.0f = %.0f", n1, operator, n2, result);
        }
    }
}
