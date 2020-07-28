import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String firstSystem = scan.nextLine();
        String secondSystem = scan.nextLine();

        if (firstSystem.toLowerCase().equals("mm")) {
           if (secondSystem.toLowerCase().equals("cm")) {
                number = number / 10;
           }

           if (secondSystem.toLowerCase().equals("m")) {
                number = number / 1000;
           }
        } else if (firstSystem.toLowerCase().equals("cm")) {
            if (secondSystem.toLowerCase().equals("mm")) {
                number = number * 10;
            }

            if (secondSystem.toLowerCase().equals("m")) {
                number = number / 100;
            }
        } else if (firstSystem.toLowerCase().equals("m")) {
            if (secondSystem.toLowerCase().equals("mm")) {
                number = number * 1000;
            }

            if (secondSystem.toLowerCase().equals("cm")) {
                number = number * 100;
            }
        }

        System.out.printf("%.3f", number);
    }
}

