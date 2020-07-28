import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = Double.parseDouble(scan.nextLine());
        int count = 0;

        sum = sum * 100;
        sum = Math.round(sum);

        while (sum != 0) {
            if (sum - 200 >= 0) {
                sum -= 200;
                count++;
                continue;
            } else if (sum - 100 >= 0) {
                sum -= 100;
                count++;
                continue;
            } else if (sum - 50 >= 0) {
                sum -= 50;
                count++;
                continue;
            } else if (sum - 20 >= 0) {
                sum -= 20;
                count++;
                continue;
            } else if (sum - 10 >= 0) {
                sum -= 10;
                count++;
                continue;
            } else if (sum - 5 >= 0) {
                sum -= 5;
                count++;
                continue;
            } else if (sum - 2 >= 0) {
                sum -= 2;
                count++;
                continue;
            } else if (sum % 1 >= 0) {
                sum -= 1;
                count++;
                continue;
            }
        }

        System.out.println(count);
    }
}
